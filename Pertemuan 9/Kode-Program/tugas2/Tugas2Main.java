/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author ASUS
 */
public class Tugas2Main {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        manusia.bernafas();
        manusia.makan();
        
        Dosen dosen = new Dosen();
        dosen.makan();
        dosen.lembur();
        
        Mahasiswa mhs = new Mahasiswa();
        mhs.makan();
        mhs.tidur();
    }
}
