/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package irsyad.relasikelas.percobaan3;

/**
 *
 * @author ASUS
 */
public class Pegawai {
    
    private String nip;
    private String nama;
    
    Pegawai(String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }
    
    void setNip(String nip){
        this.nip = nip;
    }
    
    void setNama(String nama){
        this.nama = nama;
    }
    
    String getNip(){
        return this.nip;
    }
    
    String getNama(){
        return this.nama;
    }
    
    public String info(){
        String info = "";
        info += "Nip : " + this.nip + "\n";
        info += "Nama : " + this.nama + "\n";
        return info;
    }
}
