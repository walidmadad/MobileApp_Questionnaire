package com.exercice.formulaire;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

@RequiresApi(api = 26)
public class Formulaire extends AppCompatActivity {
    private String getGenderSelected(){
        RadioGroup gender = (RadioGroup)findViewById(R.id.genderGroupe);
        int id = gender.getCheckedRadioButtonId();
        RadioButton genderSelected = (RadioButton) findViewById(id);
        String strGender = (String) genderSelected.getText();

        return strGender;
    }
    private String getAgeSelected(){
        RadioGroup age = (RadioGroup)findViewById(R.id.ageGroupe);
        int id = age.getCheckedRadioButtonId();
        RadioButton ageSelected = (RadioButton) findViewById(id);
        String strAge = (String) ageSelected.getText();

        return strAge;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulaire);
        String nom = getIntent().getStringExtra("nom");
        String prenom = getIntent().getStringExtra("prenom");
        String date = getIntent().getStringExtra("date");
        String time = getIntent().getStringExtra("time");

        Button btn_valider = (Button)findViewById(R.id.btn_valider);

        EditText ville = (EditText)findViewById(R.id.ville);

        TextView bjrView = (TextView) findViewById(R.id.bjrView);
        bjrView.setText(bjrView.getText() + " " + nom + " "+prenom);


        File outputFile = new File(getExternalFilesDir(null), nom + "_" + prenom + ".txt");

        btn_valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gender = getGenderSelected();
                String age = getAgeSelected();
                String villeSelected = ville.getText().toString();

                try {
                    PrintWriter file = new PrintWriter(outputFile);
                    file.println("Gender : "+ gender);
                    file.println("Age : "+ age);
                    file.println("Ville : "+ villeSelected);
                    file.close();
                    String filePath = outputFile.getAbsolutePath();
                    Toast.makeText(Formulaire.this, "Fichier enregistré : " + filePath, Toast.LENGTH_SHORT).show();
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }

            }
        });

    }
}

