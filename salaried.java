/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parapegawai;

/**
 *
 * @author andreas
 */
public class salaried {
    
    String nama ;
    int NIP ;
    float upah ;

    public salaried() {
    }
    
    
    public salaried(String nama, int NIP, float upah) {
        this.nama = nama;
        this.NIP = NIP;
        this.upah = upah;
    }
    
    
    
    public void tampil (){
        System.out.println("Nama = " +nama);
        System.out.println("NIP = "+NIP);
        System.out.println("Gaji = " +upah);
    }
    
}
