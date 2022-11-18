/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mini_projet;

import java.util.Date;

/**
 *
 * @author MSI
 */
public class Patient extends Abonné {
    private int numeroSS;

    public Patient(int numeroSS) {
        super();
        this.numeroSS = numeroSS;
    }

    public int getNumeroSS() {
        return numeroSS;
    }

    public void setNumeroSS(int numeroSS) {
        this.numeroSS = numeroSS;
    }
    
    @Override
    public void affiche() {
        super.affiche();
        System.out.println(numeroSS);
        
    }
    
    

    
    
}
