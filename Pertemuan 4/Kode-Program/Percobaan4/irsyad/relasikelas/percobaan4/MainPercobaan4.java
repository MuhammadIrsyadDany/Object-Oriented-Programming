/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irsyad.relasikelas.percobaan4;

/**
 *
 * @author ASUS
 */
public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang p = new Penumpang ("12346", "Mr. Crab");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());
    }
}
