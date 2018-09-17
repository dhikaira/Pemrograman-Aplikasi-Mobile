/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author dhika
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int umur = 20;
        String paras="Cantik";
        String otak="Gak Pintar Gak Masalah";
        
        if ( paras=="Cantik" && otak=="Pintar" && (umur >=20 && umur <=23)){
            System.out.println("Paras \t\t= "+paras+"");
            System.out.println("Kemampuan \t= "+otak+"");
            System.out.println("Umur \t\t= "+umur+"");
            System.out.println("Pasti Saya Mau");
        }
        else if (otak=="Gak Pintar Gak Masalah" && paras=="Cantik" && (umur >=20 && umur <=23)){
            System.out.println("Paras \t\t= "+paras+"");
            System.out.println("Kemampuan \t= "+otak+"");
            System.out.println("Umur \t\t= "+umur+"");
            System.out.println("Oke lah");
        }
        else if(umur > 23 && paras=="Cantik"  ){
            System.out.println("Paras \t\t= "+paras+"");
            System.out.println("Kemampuan \t= "+otak+"");
            System.out.println("Umur \t\t= "+umur+"");
            System.out.println("Saya Pikir Dulu");
        }
        else{
            System.out.println("Paras \t\t= "+paras+"");
            System.out.println("Kemampuan \t= "+otak+"");
            System.out.println("Umur \t\t= "+umur+"");
            System.out.println("Tidak mau!!!!!!!!!");
        }
    }
    
    
}
