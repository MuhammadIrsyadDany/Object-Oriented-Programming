/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package irsyad.relasikelas.percobaan2;

/**
 *
 * @author ASUS
 */
public class Mobil {
    
    private String nama;
    int biaya;
    
    Mobil(){
        
    }
    
    void setNama(String nama){
        this.nama = nama;
    }
    
    String getNama(){
        return this.nama;
    }
    
    void setBiaya(int biaya){
        this.biaya = biaya;
    }
    
    int getBiaya(){
        return this.biaya;
    }
    
    int hitungBiayaMobil(int hari){
        return biaya * hari;
    }
}
