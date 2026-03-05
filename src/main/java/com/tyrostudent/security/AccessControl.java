package com.tyrostudent.security;

public class AccessControl {

    public static void main(String[] args){

        int age = 20;
        boolean hasBadge = true;


        if (age >= 18){
            System.out.println("Vérification de l'âge : OK");
        }
        else{
            System.out.println("Accès refusé : mineur");
            return;
        }


        if (hasBadge == true) {
            System.out.println("Accès autorisé : Bienvenue dans les locaux");
        }
        else{
            System.out.println("Accès refusé : Badge manquant");
        }
    }
}
