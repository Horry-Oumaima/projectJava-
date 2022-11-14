/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mini_projet;
import com.mycompany.mini_projet.Produits;
import java.util.Objects;
import java.util.ArrayList;
import com.mycompany.mini_projet.Maladie;
/**
 *
 * @author MSI
 */
public class Medicament extends Produits {
    private String nom;
    private String prospectus;
    private ArrayList<Maladie> maladies_cible;

    public Medicament(String nom, String prospectus, int refProd, float prix) {
        super(refProd, prix);
        this.nom = nom;
        this.prospectus = prospectus;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getProspectus() {
        return prospectus;
    }

    public void setProspectus(String prospectus) {
        this.prospectus = prospectus;
    }

    public ArrayList<Maladie> getMaladies_cible() {
        return maladies_cible;
    }

    

    

    
    
    
    
    
    
    
    
    
}
