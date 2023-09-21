/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irsyad.relasikelas.percobaan3;

/**
 *
 * @author ASUS
 */
public class KeretaApi {
    
    private String nama;
    private String kelas;
    public Pegawai masisnis;
    public Pegawai asisten;
    
    KeretaApi(String nama, String kelas, Pegawai masinis){
        this.nama = nama;
        this.kelas = kelas;
        this.masisnis = masinis;
    }
    
    KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten){
        this.nama = nama;
        this.kelas = kelas;
        this.masisnis = masinis;
        this.asisten = asisten;
    }
    
    void setNama(String nama){
        this.nama = nama;
    }
    
    String getNama(){
        return this.nama;
    }
    
    void setKelas(String kelas){
        this.kelas = kelas;
    }
    
    String getKelas(){
        return this.kelas;
    }
    
    void setMasinis(Pegawai masinis){
        this.masisnis = masinis;
    }
    
    Pegawai getMasinis(){
        return this.masisnis;
    }
    
    void setAsisten(Pegawai asisten){
        this.asisten = asisten;
    }
    
    Pegawai getAsisten(){
        return this.asisten;
    }
    
    public String info(){
        String info = "";
        if(asisten != null){
            info += "Asisten: " + this.asisten.info() + "\n";
        }
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masisnis.info() + "\n";
        return info;
    }
}
