/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irsyad.relasikelas.percobaan2;

/**
 *
 * @author ASUS
 */
public class Sopir {
    
    private String nama;
    private int biaya;
    
    Sopir(){
        
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
    
    int hitungBiayaSopir(int hari){
        return hari * biaya;
    }
}
