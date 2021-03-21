/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprob.gestionmagasin;

/**
 *
 * @author PC-BEJ-146
 */
public class Produit {

    private int id;
    private String name;
    private float prix;
    static int instanceCounter = 0;

    Produit() {
    }

    Produit(int id, String name, float prix) {
        if (instanceCounter < 50) {
            this.id = id;
            this.name = name;
            if (prix >= 0) {
                this.prix = prix;

            }
            instanceCounter++;
        }

    }

    public void afficher() {
        System.out.println("id: " + id + " name: " + name + " prix: " + prix);
    }
}
