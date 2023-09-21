/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irsyad.relasikelas.percobaan4;

/**
 *
 * @author ASUS
 */
public class Kursi {
    
    private String nomor;
    private Penumpang penumpang;
    
    Kursi(String nomor){
        this.nomor = nomor;
    }
    
    void setNomor(String nomor){
        this.nomor = nomor;
    }
    
    String getNomor(){
        return this.nomor;
    }
    
    void setPenumpang(Penumpang penumpang){
        this.penumpang = penumpang;
    }
    
    Penumpang getPenumpang(){
        return this.penumpang;
    }
    
    public String info(){
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if(this.penumpang != null){
            info += "Penumpang: " + penumpang.info() + "\n";
        }
        return info;
    }
}
