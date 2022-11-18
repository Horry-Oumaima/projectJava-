/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mini_projet;

import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Medecin extends Utilisateur {
    private String specialite;

    public Medecin(String specialite) {
        super();
        //this.specialite = specialite;
        Scanner sc = new Scanner (System.in);
        System.out.println("Quel est votre login");
		String str = sc.next();
		 specialite=str;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    
    
    
    
}
