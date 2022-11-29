/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parapegawai;

/**
 *
 * @author andreas
 */
public class ProjectPlaner {
      String nama ;
      int NIP ;
      int TotalProyek ;
      float TotalGaji ;
      float GajiPokok ;
      float komisi ;

    public ProjectPlaner() {
    }

    public ProjectPlaner(String nama, int NIP, int TotalProyek, float GajiPokok,float komisi) {
        this.nama = nama;
        this.NIP = NIP;
        this.TotalProyek = TotalProyek;
        this.GajiPokok = GajiPokok;
        this.komisi = komisi ;
    }

    public float getTotalGaji() {
        return TotalGaji;
    }
    

    public void TotalGaji(float GajiPokok, int TotalProyek,float komisi) {
        TotalGaji = (float) (GajiPokok + (komisi*TotalProyek)-(GajiPokok*0.05));
    }
    
    public void tampil () {
        System.out.println("Nama : "+nama);
        System.out.println("NIP : "+NIP);
        System.out.println("Total Proyek : "+TotalProyek);
        System.out.println("Gaji Pokok : "+GajiPokok);
        System.out.println("Total Gaji :"+TotalGaji);
    }
      
      
      
   
    
    
    
     
     
    
}
