package com.tyrostudent.inventory;

public class InventoryManager {

    public static void main(String[] args) {

        for (int i = 3; i > 0; i--) {
            System.out.println("Ouverture de la boutique dans " + i + " seconde");
        }
        System.out.println("Boutique Ouverte !");

        String[] articles = {"epee", "bouclier", "potion soin"};

        for(String art : articles){
            System.out.println("Articles en rayon : " + art);
        }



    }
}
