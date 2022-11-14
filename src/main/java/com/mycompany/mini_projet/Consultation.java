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
public class Consultation {
    private int numeroCons;
    private Date dateConsultaion;

    public Consultation(int numeroCons, Date dateConsultaion) {
        this.numeroCons = numeroCons;
        this.dateConsultaion = dateConsultaion;
    }

    public int getNumeroCons() {
        return numeroCons;
    }

    public void setNumeroCons(int numeroCons) {
        this.numeroCons = numeroCons;
    }

    public Date getDateConsultaion() {
        return dateConsultaion;
    }

    public void setDateConsultaion(Date dateConsultaion) {
        this.dateConsultaion = dateConsultaion;
    }
    
    
    
    
}
