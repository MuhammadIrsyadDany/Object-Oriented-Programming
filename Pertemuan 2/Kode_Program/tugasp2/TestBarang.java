/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class TestBarang {
    public static void main(String[] args) {
        Barang brg1 = new Barang("A01", "Komputer", 10000000, 10);
        Barang brg2 = new Barang("B02", "Televisi", 4000000, 5);
        
        System.out.println("=== Data Barang 1 ===");
        brg1.tampilData();
        
        System.out.println("\n=== Data Barang 2 ===");
        brg2.tampilData();
    }
}
