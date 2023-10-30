/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.soal4;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("22345", "Irsyad", 
                "Jl. Benowo", 'L');
        mahasiswa1.tampilDataMahasiswa();
        
        System.out.println("");
        
        Mahasiswa mahasiswa2 = new Mahasiswa("55432", "Hasna", 
                "Jl. BLKI", 'P');
        mahasiswa2.tampilDataMahasiswa();
    }
}
