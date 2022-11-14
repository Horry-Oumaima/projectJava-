/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mini_projet;
import com.mycompany.mini_projet.Utilisateur;
/**
 *
 * @author MSI
 */
public class Administrateur extends Utilisateur {
    private int idAdmin;

    public Administrateur(int idAdmin, String nom, String prenom, String adresse, int numTel, String login, String password) {
        super(nom, prenom, adresse, numTel, login, password);
        this.idAdmin = idAdmin;
    }

    public void affiche() {
        System.out.println(super.toString());
        System.out.println(idAdmin);
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }
    
    
    
}
