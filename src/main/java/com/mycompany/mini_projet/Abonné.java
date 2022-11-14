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
public class Abonné extends Utilisateur {
    
    Date dateAbon;

    public Abonné( String nom, String prenom, String adresse, int numTel, String login, String password) {
        super(nom, prenom, adresse, numTel, login, password);
        this.dateAbon = dateAbon;
    }
    
    public void affiche() {
        System.out.println(super.toString());
        System.out.println(dateAbon);
    
}

    public Date getDateAbon() {
        return dateAbon;
    }

    public void setDateAbon(Date dateAbon) {
        this.dateAbon = dateAbon;
    }
    
    
    

}