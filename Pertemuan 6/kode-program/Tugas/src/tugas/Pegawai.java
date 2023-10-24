/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas;

/**
 *
 * @author ASUS
 */
public class Pegawai {
    
    public String nip; 
    public String nama; 
    public String alamat;
    
    public Pegawai(String nip, String nama, String alamat) {
        this.nip = nip; 
        this.nama = nama; 
        this.alamat = alamat;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public int getGaji() {
        return 15000000;
    }
}
