package com.exercice.formulaire;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

@RequiresApi(api = 23)
public class Formulaire extends AppCompatActivity {
    private String getGenderSelected() {
        RadioGroup gender = findViewById(R.id.genderGroupe);
        int id = gender.getCheckedRadioButtonId();

        if (id != -1) {
            RadioButton genderSelected = findViewById(id);
            return genderSelected.getText().toString();
        } else {

            return "Not selected";
        }
    }

    private String getAgeSelected() {
        RadioGroup age = findViewById(R.id.ageGroupe);
        int id = age.getCheckedRadioButtonId();

        if (id != -1) {
            RadioButton ageSelected = findViewById(id);
            return ageSelected.getText().toString();
        } else {
            return "Not selected";
        }
    }

    private String getActiviteSelected() {

        RadioGroup activite = findViewById(R.id.activitegroupe);
        int id = activite.getCheckedRadioButtonId();

        if (id != -1) {
            RadioButton activiteSelected = findViewById(id);
            return activiteSelected.getText().toString();
        } else {

            return "Not selected";
        }
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
        EditText txtDiplome = (EditText)findViewById(R.id.txtDiplome);
        TextView bjrView = (TextView) findViewById(R.id.bjrView);
        bjrView.setText(bjrView.getText() + " " + nom + " "+prenom);


        File outputFile = new File(getExternalFilesDir(null), nom + "_" + prenom + ".txt");

        btn_valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gender = getGenderSelected();
                String age = getAgeSelected();
                String activite = getActiviteSelected();
                String villeSelected = ville.getText().toString();
                String diplome = txtDiplome.getText().toString();


                try {

                    if (!outputFile.exists()) {
                        FileWriter fileWriter = new FileWriter(outputFile);
                        PrintWriter file = new PrintWriter(fileWriter);
                        file.println("Nom: " + nom + " " + prenom + "       Date : " + date + " " + time);
                        file.close();
                    }
                    PrintWriter file = new PrintWriter(new FileWriter(outputFile, true));
                    file.println(gender + ";" + age + ";" + villeSelected + ";" + activite + ";" + diplome);
                    txtDiplome.setText(gender + ";" + age + ";" + villeSelected + ";" + activite + ";" + diplome);
                    file.close();

                    String filePath = outputFile.getAbsolutePath();
                    Toast.makeText(Formulaire.this, "Fichier enregistré : " + filePath, Toast.LENGTH_SHORT).show();

                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        });

    }
}