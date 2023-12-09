/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author ASUS
 */
public class Perkalianku {
    void perkalian(int a, int b) {
        System.out.println(a * b);
    }
    
    void perkalian(double a, double b) {
        System.out.println(a * b);
    }
    
    public static void main(String[] args) {
        Perkalianku objek = new Perkalianku();
        
        objek.perkalian(25, 43);
        objek.perkalian(34.56, 23.7);
    }
    //    void perkalian(int a, int b) {
//        System.out.println(a * b);
//    }
//    
//    void perkalian(int a, int b, int c) {
//        System.out.println(a * b * c);
//    }
//    
//    public static void main(String[] args) {
//        Perkalianku objek = new Perkalianku();
//        
//        objek.perkalian(25, 43);
//        objek.perkalian(34, 23, 56);
//    }
}
