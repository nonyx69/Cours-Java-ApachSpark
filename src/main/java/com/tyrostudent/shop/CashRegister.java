package com.tyrostudent.shop;

public class CashRegister {
    public static String nom_produit = "02";
    public static double prix = 2.00;


    public static void main(String[] args){

        double prixfinal = calculer(prix);
        afficherTicket(CashRegister.nom_produit, prixfinal);

    }

    public static double calculer(double prixHT){

        double prixTTC = prixHT * 1.2;

        return prixTTC;
    }

    public static void afficherTicket(String product_name, double prixf){

        System.out.println("Produit : " + product_name + " a payer : " + prixf + " euros");

    }
}
