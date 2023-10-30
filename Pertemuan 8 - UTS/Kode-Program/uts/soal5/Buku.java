/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.soal5;

/**
 *
 * @author ASUS
 */
public class Buku {
    
    private String ISBN;
    private String judul;
    private Penulis penulis;
    private int harga;

    public Buku(String ISBN, String judul, Penulis penulis, int harga) {
        this.ISBN = ISBN;
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public Penulis getPenulis() {
        return penulis;
    }

    public void setPenulis(Penulis penulis) {
        this.penulis = penulis;
    }
}
