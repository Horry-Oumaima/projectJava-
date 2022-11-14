/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mini_projet;

/**
 *
 * @author MSI
 */
public class Urgence {
    private int numUrg;
    private String nomUrg;
    private String adresse;

    public Urgence(int numUrg, String nomUrg, String adresse) {
        this.numUrg = numUrg;
        this.nomUrg = nomUrg;
        this.adresse = adresse;
    }

    public int getNumUrg() {
        return numUrg;
    }

    public void setNumUrg(int numUrg) {
        this.numUrg = numUrg;
    }

    public String getNomUrg() {
        return nomUrg;
    }

    public void setNomUrg(String nomUrg) {
        this.nomUrg = nomUrg;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    
    
    
    
}
