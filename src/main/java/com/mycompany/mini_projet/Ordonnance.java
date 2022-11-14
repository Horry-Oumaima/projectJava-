/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mini_projet;

import java.util.ArrayList;
import com.mycompany.mini_projet.Medicament;

/**
 *
 * @author MSI
 */
public class Ordonnance {
    private ArrayList<Medicament> medicaments;
    private String periode;

    public Ordonnance( String periode) {
        this.periode = periode;
    }
    
}
