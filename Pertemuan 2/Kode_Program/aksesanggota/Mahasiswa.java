/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aksesanggota;

/**
 *
 * @author ASUS
 */
public class Mahasiswa {
    
    public int nim;
    public String nama;
    public String alamat;
    public String kelas;
    
    public void tampilBiodata(){
        System.out.println("Nim     : " + nim);
        System.out.println("Nama    : " +  nama);
        System.out.println("Alamat  : " + alamat);
        System.out.println("Kelas   : " + kelas);
    }
}
