/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author ASUS
 */
public class SegitigaMain {
    public static void main(String[] args) {
        Segitiga segitiga1 = new Segitiga();
        System.out.println("Total Sudut 1\t: " + segitiga1.totalSudut(90));
        System.out.println("Total Sudut 2\t: " + segitiga1.totalSudut(90, 45));
        System.out.println("Keliling 1\t: " + segitiga1.keliling(45, 78, 26));
        System.out.println("Keliling 2\t: " + segitiga1.keliling(45, 78));
    }
}
