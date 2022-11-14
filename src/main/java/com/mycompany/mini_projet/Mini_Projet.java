/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mini_projet;
import java.util.Date;
/**
 *
 * @author MSI
 */
public class Mini_Projet {

    public static void main(String[] args) {
        //Utilisateur u =new Utilisateur("aa","bb","cc",44,"aaa","bbb");
        Administrateur a =new Administrateur(123,"aa","bb","cc",44,"aaa","bbb");
        a.affiche();
       Maladie m = new Maladie("grippe", 1);
       m.ajouterSymp("fièvre");
       System.out.println(m.toString());
    }
}
