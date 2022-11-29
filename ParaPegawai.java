/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.parapegawai;

/**
 *
 * @author andreas
 */
public class ParaPegawai {

public static void main(String []args)
{
   commision a = new commision ("dani" , 211003, 300000,12,600000);
   ProjectPlaner d = new ProjectPlaner ("desu",203040 ,10,10000000,2500000) ;
   salaried t  = new salaried ("bagong" ,21104 ,5000000) ;
   
    System.out.println("---- KARYAWAN KOMISI :");
    a.getGaji() ;
    a.setGaji(600000, 12,  300000);
    a.tampil();
    
    System.out.println("-----KARYAWAN PROJECT PLANER :");
    d.getTotalGaji();
    d.TotalGaji(1000000, 10, 02500000);
    d.tampil();
    
    System.out.println("------ Karyawan Salaried :");
    t.tampil();
 }
}
   
    


