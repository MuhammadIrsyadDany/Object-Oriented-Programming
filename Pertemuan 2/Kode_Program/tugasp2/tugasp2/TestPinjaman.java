/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasp2;

/**
 *
 * @author ASUS
 */
public class TestPinjaman {
    public static void main(String[] args) {
        Peminjaman pnj1 = new Peminjaman(1, "Arjuna", "FreeFire", 2, 50000);
        Peminjaman pnj2 = new Peminjaman(2, "Juki", "PowerBlank", 4, 100000);
        
        System.out.println("Data Peminjaman kode-1: ");
        pnj1.tampilData();
        
        System.out.println("\nData Peminjaman kode-2: ");
        pnj2.tampilData();
    }
}
