/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pkg2;

/**
 *
 * @author ASUS
 */
public class tugas2Main {
    public static void main(String[] args) {
        kasirGudang kg = new kasirGudang("Veranca", "2113456", 112, "AC Panasonic", 8);
        kasirTamu kt = new kasirTamu("Dilanda", "2345667", 12778, "Frisca", 360900);
        kg.cetakKasirGudang();
        System.out.println();
        kt.cetakKasirTamu();
    }
}
