package com.exercice.formulaire;

public class authentification {
    private String nom;
    private String prenom;
    private String date;
    private String heure;
    public authentification(String unNom, String unPrenom, String uneDate, String uneHeure){
        this.nom = unNom;
        this.prenom = prenom;
        this.date = uneDate;
        this.heure = uneHeure;
    }

    public String getNom() {
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public String getDate(){
        return date;
    }
    public String getHeure(){
        return heure;
    }
}
