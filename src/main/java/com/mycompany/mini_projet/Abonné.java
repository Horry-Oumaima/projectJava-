/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mini_projet;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Abonné extends Utilisateur {
    
    Date dateAbon;

    public Abonné() {
        super();
        this.dateAbon = new Date();
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
    
    
    public void SuivieNormale()
    {
        float taille, poids, IMC ; 
        int pmax , pmin; 
        
        Scanner sc = new Scanner(System.in) ; 
        System.out.println(" La taille : ");
        taille=sc.nextFloat();
        System.out.println(" Le Poids : ");
        poids=sc.nextFloat();
        System.out.println(" La Tension : ");
        System.out.println(" 1er chiffre : ");
        pmax=sc.nextInt();
        System.out.println(" 2eme chiffre  : ");
        pmin=sc.nextInt();
        
        
        IMC=poids/(taille*taille); 
         System.out.println(" IMC ="+ IMC);
        if(IMC<18.5){
             System.out.println(" Sous Poids ");
        }
        else if(IMC<24.9 && IMC>18.5 ){
             System.out.println(" Normal ");
        }    
        else if( IMC>25 && IMC<29.9){
             System.out.println(" Sur poids ");             

        } else if( IMC>30 && IMC<34.9){
             System.out.println(" Obésité ");       
        }
        else
             System.out.println(" Obésité severe "); 
        
        if (pmax<100 && pmin<60) {
            System.out.println(" votre tension est faible ! ");
            }
            else if (pmax<120 && pmin<80) {
                    System.out.println("votre tension est optimale ");
                    }
            else if (pmax <130 && pmin<85) {
                System.out.println("votre tension est normale ");
            }
            else if (pmax>140 && pmax<159 && pmin>90 && pmin<99) {
                System.out.println("Degré 1 : hypertension légère");
            }
            else if (pmax>160 && pmax<179 && pmin>100 && pmin<109) {
                System.out.println("Degré 2 : hypertension modérée ");
            }
            else if (pmax>180 && pmin >110) {
                System.out.println("Degré 3 : hypertension sévère !!!!! ");
            }
        
        }
    
    
    
    public void achatProduit( Map<String,Medicament> medicaments, ArrayList<Produit_Paramedical> prodparamedicaux,ArrayList<Produit_cosmetique> prodcosmetique) {
     
        int choix;
        float montant;
        Scanner sc = new Scanner(System.in) ;
        choix=sc.nextInt();
        if (choix==1) {
            System.out.println("Saisir le nom du médicament");
            String nommedic=sc.next();
            
            
            
        }
    }
            
        
        
   
        
    
    
    

}