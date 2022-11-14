/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mini_projet;

/**
 *
 * @author MSI
 */
public class  Produits {
    private int refProd;
    private float prix;

    public Produits(int refProd, float prix) {
        this.refProd = refProd;
        this.prix = prix;
    }

    public int getRefProd() {
        return refProd;
    }

    public void setRefProd(int refProd) {
        this.refProd = refProd;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produits{" + "refProd=" + refProd + ", prix=" + prix + '}';
    }
    
    
}
