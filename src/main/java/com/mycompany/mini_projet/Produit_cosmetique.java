/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mini_projet;

/**
 *
 * @author MSI
 */
public class Produit_cosmetique extends Produits{
    private String marque;
    private String designation;

    public Produit_cosmetique(String marque, String designation, int refProd, float prix) {
        super(refProd, prix);
        this.marque = marque;
        this.designation = designation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    
    
    
}
