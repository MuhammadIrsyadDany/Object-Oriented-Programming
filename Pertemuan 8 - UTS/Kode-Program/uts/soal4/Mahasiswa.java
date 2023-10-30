/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.soal4;

/**
 *
 * @author ASUS
 */
public class Mahasiswa {
    
    String nim, nama, alamat;
    char jenisKelamin;
    
    public Mahasiswa(String nim, String nama, String alamat, char jenisKelamin) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }
    
    public void tampilDataMahasiswa() {
        System.out.println("NIM            = " + nim);
        System.out.println("Nama           = " + nama);
        System.out.println("Alamat         = " + alamat);
        System.out.println("Jenis Kelamin  = " + jenisKelamin);
    }
}
