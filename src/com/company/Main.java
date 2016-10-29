package com.company;

public class Main {

    public static void main(String[] args) {


        Employe E[] = new Employe[3];
        E[0] = new Employe("Salim", "PDG", 100000);
        E[1] = new EmplyerPleinTemps("Halima", "Secretaire", 3750, 5000);
        E[2] = new EmployTempsPartiel("Abdelhalim", "Agent de securite", 625,24);

        for (int i = 0; i <3; i++) {

                E[i].AfficheChPaine();


            }


        }
    }
