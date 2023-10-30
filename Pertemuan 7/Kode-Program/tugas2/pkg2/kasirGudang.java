/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pkg2;

/**
 *
 * @author ASUS
 */
public class kasirGudang extends Kasir{
    
    int noGudang;
    String namaBarang;
    int totalBarangMasuk;
    
    public kasirGudang(String nama, String id, int noGudang,
            String namaBarang, int totalBarangMasuk){
        super(nama, id);
        this.noGudang = noGudang;
        this.namaBarang = namaBarang;
        this.totalBarangMasuk = totalBarangMasuk;
    }
    
    public void cetakKasirGudang() { 
        super.pembayaran();
        System.out.println("No Gudang           : " + noGudang);
        System.out.println("Nama Barang         : " + namaBarang);
        System.out.println("Total Barang Masuk  : " + totalBarangMasuk);
    }
}
