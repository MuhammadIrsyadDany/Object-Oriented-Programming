/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irsyad.relasikelas.percobaan3;

/**
 *
 * @author ASUS
 */
public class MainPercobaan3 {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Spongebob Squerpents");
        Pegawai asisten = new Pegawai("4567", "Patrick Starr");
        
        KeretaApi ka = new KeretaApi("Gaya Baru", "Bisnis", masinis, asisten);
        
        System.out.println(ka.info());
    }
}
