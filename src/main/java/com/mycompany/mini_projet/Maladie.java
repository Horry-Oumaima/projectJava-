/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mini_projet;

import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class Maladie {
    private String nomMaladie;
    private ArrayList<String> symptomes;
    private int gravité;

    public Maladie( String nomMaladie, int gravité) {
        this.nomMaladie=nomMaladie;
        this.gravité = gravité;
        symptomes=new ArrayList();
    }

    public String getNomMaladie() {
        return nomMaladie;
    }

    public void setNomMaladie(String nomMaladie) {
        this.nomMaladie = nomMaladie;
    }
    
    

    public int getGravité() {
        return gravité;
    }

    public void setGravité(int gravité) {
        this.gravité = gravité;
    }

    public ArrayList<String> getSymptomes() {
        return symptomes;
    }
    
    
    public void ajouterSymp (String sym) {
        symptomes.add(sym);
    }

    @Override
    public String toString() {
        return "Maladie{" + "nomMaladie=" + nomMaladie + ", symptomes=" + symptomes + ", gravite=" + gravité + '}';
    }
    
    
    
    
    
    
}
