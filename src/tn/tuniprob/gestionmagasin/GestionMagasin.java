/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprob.gestionmagasin;

import java.util.Scanner;

/**
 *
 * @author PC-BEJ-146
 */
public class GestionMagasin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

       
        float prix;
        int choix;
        int nbreP = 0;

        Magasin m1 = new Magasin(1, "beja", 50);
        Scanner sc = new Scanner(System.in);

        do {

            do {
                System.out.println("Ajouter un produit: 1 , Afficher les details: 2 Quitter: 0 ");
                choix = sc.nextInt();
            } while ((choix < 0) || (choix > 2));

            switch (choix) {
                case 1:
                    if (nbreP < 50) {
                        System.out.println("Taper le nom du produit: ");
                        sc.nextLine();
                        String nom = sc.nextLine();

                        do {
                            System.out.println("Taper le prix: ");
                            prix = sc.nextInt();
                        } while (nbreP < 0);
                        nbreP++;
                        Produit p = new Produit(nbreP, nom, prix);
                        m1.produits.add(p);
                    } else {
                        System.out.println("Nbre de produit max atteint");
                    }
                    break;
                case 2:
                    m1.afficher();
                    break;
                            
                    

            }

        } while (choix != 0);
        
       
        
                
        

        

    }

}
