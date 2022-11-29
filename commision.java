/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parapegawai;

/**
 *
 * @author andreas
 */
public class commision {
     String nama ;
    int NIP ;
    float komisi ;
     float TotalJual ;
     float GajiPokok ;
     float Gaji ;
 
    public commision(String nama, int NIP, float komisi, float TotalJual ,float GajiPokok) {
        this.nama = nama;
        this.NIP = NIP;
        this.komisi = komisi;
        this.TotalJual = TotalJual;
        this.GajiPokok = GajiPokok ;
    }

    public float getGaji() {
        return Gaji;
    }

    public void setGaji(float GajiPokok ,float TotalJual,float komisi) {
        Gaji = GajiPokok + (komisi * TotalJual) ;
    }
    
    public void tampil (){
        System.out.println("Nama : " +nama);
        System.out.println("NIP : " +NIP );
        System.out.println("Komisi : " +komisi);
        System.out.println("Gaji Pokok : " +GajiPokok);
        System.out.println("Total Penjualan : " +TotalJual);
        System.out.println("Gaji Total : " +Gaji);
    }
}
