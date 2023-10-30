/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.soal5;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {

        Penulis penulis = new Penulis("Irsyad", "Jl. Benowo");
        Buku buku = new Buku("1234-239490", "Belajar PBO untuk Pemula", penulis, 80000);

        System.out.println("=========== INFORMASI BUKU ===========");
        System.out.println("ISBN            = " + buku.getISBN());
        System.out.println("Judul           = " + buku.getJudul());
        System.out.println("Harga           = Rp. " + buku.getHarga());
        System.out.println("Penulis         = " + buku.getPenulis().getNama());
        System.out.println("Alamat Penulis  = " + buku.getPenulis().getAlamat());
    }
}
