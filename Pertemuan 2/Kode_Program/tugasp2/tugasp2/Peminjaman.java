/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasp2;

/**
 *
 * @author ASUS
 */
public class Peminjaman {
    
    private int id;
    private String namaMember;
    private String namaGame;
    private int lamaPinjam;
    private double harga;
    
    public Peminjaman(int id, String namaMember, 
            String namaGame, int lamaPinjam, int harga){
        this.id = id;
        this.namaMember = namaMember;
        this.namaGame = namaGame;
        this.lamaPinjam = lamaPinjam;
        this.harga = harga;
    }
    
    public double hitungHargaTotal(){
        return lamaPinjam * harga;
    }
    
    public void tampilData(){
        System.out.println("ID Peminjaman: " + id);
        System.out.println("Nama Member:" + namaMember);
        System.out.println("Nama Game: " + namaGame);
        System.out.println("Lama Peminjaman: " + lamaPinjam + " Hari");
        System.out.println("Harga Total: RP. " + hitungHargaTotal());
    }
}
