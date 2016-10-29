package com.company;

/**
 * Created by vaio on 29/10/2016.
 */
public class EmployTempsPartiel extends Employe {

private double heure;

    public EmployTempsPartiel(String nom, String fonction, double salaire,double heure) {
        super(nom, fonction, salaire);
        this.heure=heure;

    }

    public double getHeure() {
        return heure;
    }

    public double getSalaire (){
        return salaire*heure;
    }
}