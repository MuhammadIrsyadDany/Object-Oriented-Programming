/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pkg2;

/**
 *
 * @author ASUS
 */
public class kasirTamu extends Kasir {
    
    int noTransaksi;
    String namaPelanggan;
    int biaya;
    
    public kasirTamu(String nama, String id, int noTransaksi, 
            String namaPelanggan, int biaya){
        super(nama, id);
        this.noTransaksi = noTransaksi;
        this.namaPelanggan = namaPelanggan;
        this.biaya = biaya;
    }
    
    public void cetakKasirTamu(){
        super.pembayaran();
        System.out.println("No Transaksi        : " + noTransaksi);
        System.out.println("Nama Pelanggan      : " + namaPelanggan);
        System.out.println("Biaya               : " + biaya);
    }
}
