/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mini_projet;

/**
 *
 * @author MSI
 */
public class Produit_Paramedical extends Produits{
    String designation;

    public Produit_Paramedical(String designation, int refProd, float prix) {
        super(refProd, prix);
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    
    
    
    
}
