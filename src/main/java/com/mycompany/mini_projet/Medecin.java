/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mini_projet;

/**
 *
 * @author MSI
 */
public class Medecin extends Utilisateur {
    private String specialite;

    public Medecin(String specialite, String nom, String prenom, String adresse, int numTel, String login, String password) {
        super(nom, prenom, adresse, numTel, login, password);
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    
    
    
    
}
