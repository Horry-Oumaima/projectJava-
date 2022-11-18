/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mini_projet;
import java.util.*;

/**
 *
 * @author MSI
 */
public class ServiceMedical {
    private Map<String , Maladie> maladies;
    private Map<String,Medicament> medicaments;
    private ArrayList<Produit_Paramedical> prodparamedicaux;
    private ArrayList<Produit_cosmetique> prodcosmetique;
    
    
    public void ajouterPramedicaux (Produit_Paramedical p){
        prodparamedicaux.add(p);
    }
    public void supprimerPramedicaux (Produit_Paramedical p){
        prodparamedicaux.remove(p);
    }
    
    //parcourir les elements de la list
    public void afficherProdPramedical() {
    for (Produit_Paramedical pp : prodparamedicaux) {
    System.out.println(pp); }
}
    
    public void ajouterProdcosmetique (Produit_cosmetique p){
        prodcosmetique.add(p);
    }
    public void supprimerProdcosmetique (Produit_cosmetique p){
        prodcosmetique.remove(p);
    }
    
    //parcourir les elements de la list
    public void afficherProdcosmetique() {
    for (Produit_cosmetique pp : prodcosmetique) {
    System.out.println(pp); }
}
    
    public void ajouterMaladie(String nom ,Maladie m) {
        maladies.put(nom, m);
    }
    
    public void afficherMaladie() {
        System.out.println("la maladie:"+maladies.keySet());
        Iterator iterator = maladies.entrySet().iterator();
    while (iterator.hasNext()) {
    Map.Entry mapentry = (Map.Entry) iterator.next();
    System.out.println("clé: "+mapentry.getKey()
    + " | valeur: " + mapentry.getValue());
 } 
 }
    public Maladie chercherMaladie (String nom) {
        return maladies.get(nom);
    } //+exception
    
    public void ajouterMedicament(String nom ,Medicament m) {
        medicaments.put(nom, m);
    }
    
    public void afficherMedicament() {
        System.out.println("le medicament:"+medicaments.keySet());
        Iterator iterator = medicaments.entrySet().iterator();
    while (iterator.hasNext()) {
    Map.Entry mapentry = (Map.Entry) iterator.next();
    System.out.println("clé: "+mapentry.getKey()
    + " | valeur: " + mapentry.getValue());
 } 
 }
    public Medicament chercherMedicament (String nom) {
        return medicaments.get(nom);
    } //+exception
    
    
    
    
    
    
    
    
}
