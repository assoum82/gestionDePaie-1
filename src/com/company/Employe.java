package com.company;

/**
 * Created by vaio on 29/10/2016.
 */
public class Employe {
    protected String nom;
    protected String fonction;
    protected double salaire;

    public Employe (String nom,String fonction,double salaire){

        this.nom= nom;
        this.fonction= fonction;
        this.salaire= salaire;

    }

    public double getSalaire() {
        return salaire;
    }

    public String getFonction() {
        return fonction;
    }

    public String getNom() {
        return nom;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    public void AfficheChPaine(){
        System.out.println("\n Payer a l'ordre de  :"+getNom()+ "("+getFonction()+")"+ "*** "+getSalaire()+"DA");
    }

}
