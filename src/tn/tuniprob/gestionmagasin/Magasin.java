/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprob.gestionmagasin;

import static tn.tuniprob.gestionmagasin.Produit.instanceCounter;
import java.util.ArrayList;

/**
 *
 * @author PC-BEJ-146
 */
public class Magasin {

    int id;
    String adress;
    int capacite = 50;
    Produit P = new Produit();

    ArrayList<Object> produits = new ArrayList<Object>();

    Magasin() {
    }

    ;
    
    Magasin(int id, String adress, int capacite) {
        this.id = id;
        this.adress = adress;
        this.capacite = capacite;
        this.produits = produits;

    }

    ;
    
    public void afficher() {
        

        System.out.println("id: " + id + " adresse: " + adress + " Capacitee: " + capacite + " Nbre produit: " + P.instanceCounter + " Produits:");
        

        int i;

        for (i = 0; i < produits.size(); i++) {
            P = (Produit) produits.get(i);
            P.afficher();
        }
    }

}
