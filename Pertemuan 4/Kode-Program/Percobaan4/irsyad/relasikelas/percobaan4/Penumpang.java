/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package irsyad.relasikelas.percobaan4;

/**
 *
 * @author ASUS
 */
public class Penumpang {
    
    private String ktp;
    private String nama;
    
    Penumpang(String ktp, String nama){
        this.ktp = ktp;
        this.nama = nama;
    }
    
    void setKtp(String ktp){
        this.ktp = ktp;
    }
    
    String getKtp(){
        return this.ktp;
    }
    
    void setNama(String nama){
        this.nama = nama;
    }
    
    String getNama(){
        return this.nama;
    }
    
    public String info(){
        String info = "";
        info += "KTP: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }
}
