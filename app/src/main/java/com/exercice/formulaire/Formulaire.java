package com.exercice.formulaire;


import android.content.Intent;
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

            return "";
        }
    }

    private String getAgeSelected() {
        RadioGroup age = findViewById(R.id.ageGroupe);
        int id = age.getCheckedRadioButtonId();

        if (id != -1) {
            RadioButton ageSelected = findViewById(id);
            return ageSelected.getText().toString();
        } else {
            return "";
        }
    }

    private String getActiviteSelected() {

        RadioGroup activite = findViewById(R.id.activitegroupe);
        int id = activite.getCheckedRadioButtonId();

        if (id != -1) {
            RadioButton activiteSelected = findViewById(id);
            return activiteSelected.getText().toString();
        } else {

            return "";
        }
    }
    private String getAutreDiplome(){
        RadioGroup autreDiplome = findViewById(R.id.autre_diplome);
        int id = autreDiplome.getCheckedRadioButtonId();

        if( id != -1){
            RadioButton AutreDiplomeSelected = findViewById(id);
            return AutreDiplomeSelected.getText().toString();
        }
        else {
            return "";
        }
    }
    private String getDomaine(){
        RadioGroup domaine = findViewById(R.id.domaine);
        int id = domaine.getCheckedRadioButtonId();

        if( id != -1){
            RadioButton domaineSelected = findViewById(id);
            return domaineSelected.getText().toString();
        }
        else {
            return "";
        }
    }
    private String getPermis(){
        RadioGroup permis = findViewById(R.id.permis);
        int id = permis.getCheckedRadioButtonId();

        if( id != -1){
            RadioButton permisSelected = findViewById(id);
            return permisSelected.getText().toString();
        }
        else {
            return "";
        }
    }
    private String getVehicule(){
        RadioGroup vehicule = findViewById(R.id.vehicule);
        int id = vehicule.getCheckedRadioButtonId();

        if( id != -1){
            RadioButton vehiculeSelected = findViewById(id);
            return vehiculeSelected.getText().toString();
        }
        else {
            return "";
        }
    }
    private void cleanGenderSelected() {
        RadioGroup gender = findViewById(R.id.genderGroupe);
        int id = gender.getCheckedRadioButtonId();

        if (id != -1) {
            RadioButton genderSelected = findViewById(id);
            genderSelected.setChecked(false);
        }
    }

    private void cleanAgeSelected() {
        RadioGroup age = findViewById(R.id.ageGroupe);
        int id = age.getCheckedRadioButtonId();

        if (id != -1) {
            RadioButton ageSelected = findViewById(id);
            ageSelected.setChecked(false);
        }
    }

    private void cleanActiviteSelected() {

        RadioGroup activite = findViewById(R.id.activitegroupe);
        int id = activite.getCheckedRadioButtonId();

        if (id != -1) {
            RadioButton activiteSelected = findViewById(id);
            activiteSelected.setChecked(false);
        }
    }
    private void cleanAutreDiplome(){
        RadioGroup autreDiplome = findViewById(R.id.autre_diplome);
        int id = autreDiplome.getCheckedRadioButtonId();

        if( id != -1){
            RadioButton AutreDiplomeSelected = findViewById(id);
            AutreDiplomeSelected.setChecked(false);
        }

    }
    private void cleanDomaine(){
        RadioGroup domaine = findViewById(R.id.domaine);
        int id = domaine.getCheckedRadioButtonId();

        if( id != -1){
            RadioButton domaineSelected = findViewById(id);
            domaineSelected.setChecked(false);
        }

    }
    private void cleanPermis(){
        RadioGroup permis = findViewById(R.id.permis);
        int id = permis.getCheckedRadioButtonId();

        if( id != -1){
            RadioButton permisSelected = findViewById(id);
            permisSelected.setChecked(false);
        }

    }
    private void cleanVehicule(){
        RadioGroup vehicule = findViewById(R.id.vehicule);
        int id = vehicule.getCheckedRadioButtonId();

        if( id != -1){
            RadioButton vehiculeSelected = findViewById(id);
            vehiculeSelected.setChecked(false);
        }

    }
    private void clean(){
        EditText ville = (EditText)findViewById(R.id.ville);
        EditText txtDiplome = (EditText)findViewById(R.id.txtDiplome);
        EditText txtactivite_secteur = (EditText)findViewById(R.id.activite_secteur);
        EditText txtautre_activite = (EditText)findViewById(R.id.autre_Activite);


        ville.setText("");
        txtDiplome.setText("");
        txtactivite_secteur.setText("");
        txtautre_activite.setText("");
        cleanGenderSelected();
        cleanAgeSelected();
        cleanActiviteSelected();
        cleanAutreDiplome();
        cleanPermis();
        cleanVehicule();
        cleanDomaine();


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
        EditText txtactivite_secteur = (EditText)findViewById(R.id.activite_secteur);
        EditText txtautre_activite = (EditText)findViewById(R.id.autre_Activite);
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
                String autreDiplome = getAutreDiplome();
                String domaine = getDomaine();
                String autre_activite = txtautre_activite.getText().toString();
                String activite_secteur = txtactivite_secteur.getText().toString();
                String permis = getPermis();
                String vehicule = getVehicule();
                try {

                    if (!outputFile.exists()) {
                        FileWriter fileWriter = new FileWriter(outputFile);
                        PrintWriter file = new PrintWriter(fileWriter);
                        file.println("Nom: " + nom + " " + prenom + "       Date : " + date + " " + time);
                        file.close();
                    }
                    PrintWriter file = new PrintWriter(new FileWriter(outputFile, true));
                    file.println(gender + ";" + age + ";" + villeSelected + ";" + activite + ";" + diplome + ";" + autreDiplome + ";" + domaine + ";" + autre_activite + ";" + activite_secteur + ";" + permis + ";" + vehicule);
                    file.close();

                    String filePath = outputFile.getAbsolutePath();
                    Toast.makeText(Formulaire.this, "Fichier enregistré : " + filePath, Toast.LENGTH_SHORT).show();

                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                clean();
            }
        });
        Button btn_changer = (Button) findViewById(R.id.changer);
        btn_changer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentUser = new Intent(Formulaire.this, MainActivity.class);
                startActivity(intentUser);
            }
        });
    }
}