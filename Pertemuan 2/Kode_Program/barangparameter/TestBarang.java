/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barangparameter;

/**
 *
 * @author ASUS
 */
public class TestBarang {
    public static void main(String[] args) {
        Barang brg1 = new Barang();
        
        brg1.namaBrg = "Pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilBarang();
        
        //menampilkan dan mengisi argumen untuk menambahkan stok barang
        System.out.println("Stok Baru adalah " + brg1.tambahStok(20));
    }
}
