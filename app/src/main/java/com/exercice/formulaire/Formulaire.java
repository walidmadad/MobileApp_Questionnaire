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
    private String getInformerForum(){
        RadioGroup InformerForum = findViewById(R.id.informerForum);
        int id = InformerForum.getCheckedRadioButtonId();

        if( id != -1){
            RadioButton InformerSelected = findViewById(id);
            return InformerSelected.getText().toString();
        }
        else {
            return "";
        }
    }
    private String getOffreInteresant(){
        RadioGroup offreInteresant = findViewById(R.id.offreInteresant);
        int id = offreInteresant.getCheckedRadioButtonId();

        if( id != -1){
            RadioButton offreInteresantSelected = findViewById(id);
            return offreInteresantSelected.getText().toString();
        }
        else {
            return "";
        }
    }
    private String getDeposeCV(){
        RadioGroup deposeCV = findViewById(R.id.deposeCV);
        int id = deposeCV.getCheckedRadioButtonId();

        if( id != -1){
            RadioButton deposeCVSelected = findViewById(id);
            return deposeCVSelected.getText().toString();
        }
        else {
            return "";
        }
    }
    private String getResultatObtenu(){
        RadioGroup resultatObtenu = findViewById(R.id.resultatObtenu);
        int id = resultatObtenu.getCheckedRadioButtonId();

        if( id != -1){
            RadioButton resultatObtenuSelected = findViewById(id);
            return resultatObtenuSelected.getText().toString();
        }
        else {
            return "";
        }
    }
    private String getDeplacer(){
        RadioGroup deplacer = findViewById(R.id.deplacer);
        int id = deplacer.getCheckedRadioButtonId();

        if( id != -1){
            RadioButton deplacerSelected = findViewById(id);
            return deplacerSelected.getText().toString();
        }
        else {
            return "";
        }
    }
    private String getOu(){
        RadioGroup ou = findViewById(R.id.ou);
        int id = ou.getCheckedRadioButtonId();

        if( id != -1){
            RadioButton ouSelected = findViewById(id);
            return ouSelected.getText().toString();
        }
        else {
            return "";
        }
    }

    private String getDistance(){
        RadioGroup distance = findViewById(R.id.distance);
        int id = distance.getCheckedRadioButtonId();

        if( id != -1){
            RadioButton distanceSelected = findViewById(id);
            return distanceSelected.getText().toString();
        }
        else {
            return "";
        }
    }
    private String getInteresantFacile(){
        RadioGroup interesantFacile = findViewById(R.id.interesantFacile);
        int id = interesantFacile.getCheckedRadioButtonId();

        if( id != -1){
            RadioButton interesantFacileSelected = findViewById(id);
            return interesantFacileSelected.getText().toString();
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
    private void cleanInformer(){
        RadioGroup Informer = findViewById(R.id.informerForum);
        int id = Informer.getCheckedRadioButtonId();

        if( id != -1){
            RadioButton InformerSelected = findViewById(id);
            InformerSelected.setChecked(false);
        }
    }
    private void cleanOffreInteresant(){
        RadioGroup offreInteresant = findViewById(R.id.offreInteresant);
        int id = offreInteresant.getCheckedRadioButtonId();

        if( id != -1){
            RadioButton offreInteresantSelected = findViewById(id);
            offreInteresantSelected.setChecked(false);
        }

    }
    private void cleanDeposeCV(){
        RadioGroup deposeCV = findViewById(R.id.deposeCV);
        int id = deposeCV.getCheckedRadioButtonId();

        if( id != -1){
            RadioButton deposeCVSelected = findViewById(id);
            deposeCVSelected.setChecked(false);
        }

    }
    private void cleanResultatObtenu(){
        RadioGroup resultatObtenu = findViewById(R.id.resultatObtenu);
        int id = resultatObtenu.getCheckedRadioButtonId();

        if( id != -1){
            RadioButton resultatObtenuSelected = findViewById(id);
            resultatObtenuSelected.setChecked(false);
        }

    }
    private void cleanDeplacer(){
        RadioGroup deplacer = findViewById(R.id.deplacer);
        int id = deplacer.getCheckedRadioButtonId();

        if( id != -1){
            RadioButton deplacerSelected = findViewById(id);
            deplacerSelected.setChecked(false);
        }

    }
    private void cleanOu(){
        RadioGroup ou = findViewById(R.id.ou);
        int id = ou.getCheckedRadioButtonId();

        if( id != -1){
            RadioButton ouSelected = findViewById(id);
            ouSelected.setChecked(false);
        }
    }
    private void cleanDistance(){
        RadioGroup distance = findViewById(R.id.distance);
        int id = distance.getCheckedRadioButtonId();

        if( id != -1){
            RadioButton distanceSelected = findViewById(id);
            distanceSelected.setChecked(false);
        }
    }
    private void cleanInteresantFacile(){
        RadioGroup interesantFacile = findViewById(R.id.interesantFacile);
        int id = interesantFacile.getCheckedRadioButtonId();

        if( id != -1){
            RadioButton interesantFacileSelected = findViewById(id);
            interesantFacileSelected.setChecked(false);
        }
    }
    private void clean(){
        EditText ville = (EditText)findViewById(R.id.ville);
        EditText txtDiplome = (EditText)findViewById(R.id.txtDiplome);
        EditText txtactivite_secteur = (EditText)findViewById(R.id.activite_secteur);
        EditText txtautre_activite = (EditText)findViewById(R.id.autre_Activite);
        EditText txtautreDiplome = (EditText)findViewById(R.id.autreDiplome);
        EditText txtSiLyceen = (EditText)findViewById(R.id.SiLyceen);
        EditText txtAutreForum = (EditText)findViewById(R.id.autre_InformerForum);
        EditText txtEntreprise = (EditText)findViewById(R.id.entreprise);
        EditText txtRemarques = (EditText)findViewById(R.id.remarques);

        ville.setText("");
        txtDiplome.setText("");
        txtactivite_secteur.setText("");
        txtautre_activite.setText("");
        txtautreDiplome.setText("");
        txtSiLyceen.setText("");
        txtAutreForum.setText("");
        txtEntreprise.setText("");
        txtRemarques.setText("");
        cleanGenderSelected();
        cleanAgeSelected();
        cleanActiviteSelected();
        cleanAutreDiplome();
        cleanPermis();
        cleanVehicule();
        cleanDomaine();
        cleanInformer();
        cleanOffreInteresant();
        cleanDeposeCV();
        cleanResultatObtenu();
        cleanDeplacer();
        cleanOu();
        cleanDistance();
        cleanInteresantFacile();
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
        EditText txtautreDiplome = (EditText)findViewById(R.id.autreDiplome);
        TextView bjrView = (TextView) findViewById(R.id.bjrView);
        EditText txtactivite_secteur = (EditText)findViewById(R.id.activite_secteur);
        EditText txtautre_activite = (EditText)findViewById(R.id.autre_Activite);
        EditText txtSiLyceen = (EditText)findViewById(R.id.SiLyceen);
        EditText txtAutreForum = (EditText)findViewById(R.id.autre_InformerForum);
        EditText txtEntreprise = (EditText)findViewById(R.id.entreprise);
        EditText txtRemarques = (EditText)findViewById(R.id.remarques);

        bjrView.setText(bjrView.getText() + " " + nom + " "+prenom);


        File outputFile = new File(getExternalFilesDir(null), nom + "_" + prenom + ".csv");


        btn_valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gender = getGenderSelected();
                String age = getAgeSelected();
                String activite = getActiviteSelected();
                String villeSelected = ville.getText().toString();
                String diplome = txtDiplome.getText().toString();
                String SiLyceen = txtSiLyceen.getText().toString();
                String autreDiplome = getAutreDiplome();
                String domaine = getDomaine();
                String autre_activite = txtautre_activite.getText().toString();
                String activite_secteur = txtactivite_secteur.getText().toString();
                String permis = getPermis();
                String vehicule = getVehicule();
                String autreDiplometxt = txtautreDiplome.getText().toString();
                String forumInformer = getInformerForum();
                String autreForum = txtAutreForum.getText().toString();
                String offreInteresant = getOffreInteresant();
                String deposeCV = getDeposeCV();
                String entreprise = txtEntreprise.getText().toString();
                String resultatObtenu = getResultatObtenu();
                String deplacer = getDeplacer();
                String ou = getOu();
                String distance = getDistance();
                String interesantFacile = getInteresantFacile();
                String remarques = txtRemarques.getText().toString();

                try {

                    if (!outputFile.exists()) {
                        FileWriter fileWriter = new FileWriter(outputFile);
                        PrintWriter file = new PrintWriter(fileWriter);
                        file.println("Nom: " + nom + " " + prenom + "       Date : " + date + " " + time);
                        file.println("Genre;Age;Ville;Activité;Si Lycéen niveau;Dernier Diplôme;Autre diplôme;Quel Diplôme si oui;Comment avez-vous été informer de forum;Si autre lequel?;Domaine d’activité vous intéresse;autre secteur;secteur d’activité auriez-vous aimer découvrir;offres intéressantes;CV déposé;Si oui quell entreprise;Aves-vous obtenue?;Permis;Véhicules;Prés déplacer?;Si oui où?;Quelle Distance;Avez-vous trouvé facilement les stands qui vous intéressaient;Remarques sur Forum ou l'organisation");
                        file.close();
                    }
                    PrintWriter file = new PrintWriter(new FileWriter(outputFile, true));
                    file.println(gender + ";" + age + ";" + villeSelected + ";" + activite + ";" + diplome+";"+ SiLyceen + ";" + autreDiplome + ";" + autreDiplometxt + ";" + forumInformer + ";" + autreForum + ";" + domaine + ";" + autre_activite + ";" + activite_secteur + ";" + offreInteresant + ";" + deposeCV + ";" + entreprise + ";" + resultatObtenu + ";" + permis + ";" + vehicule + ";" + deplacer + ";" + ou + ";" + distance + ";" + interesantFacile + ";" + remarques);
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