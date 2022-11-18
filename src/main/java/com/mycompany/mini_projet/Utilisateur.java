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

    public Utilisateur() {
        //this.nom = nom;
         System.out.println("Quel est votre nom ");
	    Scanner sc = new Scanner (System.in);
		String str1 = sc.nextLine();
		 nom=str1;
        //this.prenom = prenom;
         System.out.println("Quel est votre prenom?");
		String str2 = sc.nextLine();
		 prenom=str2;
        //this.adresse = adresse;
         System.out.println("Quel est votre adresse");
		String str3 = sc.nextLine();
		 adresse=str3;
        //this.dateNaiss = dateNaiss;
        //this.numTel = numTel;
        System.out.println("Quel est votre tel");
		int t = sc.nextInt();
		 numTel=t;
        
                 
        //this.login = login;
        System.out.println("Quel est votre login");
		String str4 = sc.next();
		 login=str4;
                 
        //this.password = password;
        System.out.println("Quel est votre password");
		String str5 = sc.next();
		 password=str5;
    }
    
    
    
    public  void  authentifier() {
        
        Scanner input =new Scanner(System.in);
        String ch1,ch2;
        System.out.println("saisir votre login");
        ch1= input.next();
        System.out.println("donner votre mot de passe");
        ch2= input.next();
    };

    @Override
    public String toString() {
        return  "nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", numTel=" + numTel + ", login=" + login + ", password=" + password ;
    }
   

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
  
    }
     
     


