/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.pkg2;

/**
 *
 * @author ASUS
 */
public class Pegawai {
    
    protected String id;
    protected String nama;
    
    public Pegawai(){}
    
    public Pegawai(String nama, String id){
        this.nama = nama;
        this.id = id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return this.nama;
    }
}
