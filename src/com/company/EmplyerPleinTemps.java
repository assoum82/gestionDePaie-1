package com.company;

/**
 * Created by vaio on 29/10/2016.
 */
public class EmplyerPleinTemps extends Employe {
    private double prime;

    public EmplyerPleinTemps(String nom, String fonction, double salaire,double prime) {
        super(nom, fonction, salaire );
        this.prime=prime;
    }





    public double getPrime() {
        return prime;
    }
     public double getSalaire (){
        return salaire*4+prime;

    }


}


