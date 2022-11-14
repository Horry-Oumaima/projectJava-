/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mini_projet;

import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author MSI
 */
public class Utilisateur {
    private String nom;
    private String prenom;
    private String adresse;
    //private Date dateNaiss;
    private int numTel;
    private String login;
    private String password;

    public Utilisateur(String nom, String prenom, String adresse, int numTel, String login, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        //this.dateNaiss = dateNaiss;
        this.numTel = numTel;
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return  "nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", numTel=" + numTel + ", login=" + login + ", password=" + password ;
    }
    
    /*public Utilisateur(String password) throws PasswordException {
        if (length(password)<8 )
            throw new PasswordException;
    }*/
    
    

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getNumTel() {
        return numTel;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;}
  
    public void saisieuserpwd(){
    try{   
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez un mdp : ");
        String mdp = sc.nextLine();      
        System.out.println (mdp);
     }
        catch (Erreurpwd e){
         System.out.println(e.getMessage());    }
    
    
    }
}
     
     


