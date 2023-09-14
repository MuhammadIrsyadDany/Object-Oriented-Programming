/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class TestLingkaran {
    public static void main(String[] args) {
        Scanner Irsyad = new Scanner(System.in);
        
        Lingkaran lngkrn = new Lingkaran();
        
        double jariJari;
        int pilihan;
        
        do {
            System.out.print("\nMasukkan jari-jari lingkaran: ");
            jariJari = Irsyad.nextDouble();
            
            double luas = lngkrn.hitungLuas(jariJari);
            double keliling = lngkrn.hitungKeliling(jariJari);
            
            System.out.println("\nLingkaran");
            System.out.println("Jari-jari: " + jariJari);
            System.out.println("1. Hitung Luas");
            System.out.println("2. Hitung Keliling");
            System.out.println("3. Keluar");
            System.out.print("Pilih operasi (1/2/3): ");
            pilihan = Irsyad.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.println("Luas        : " + luas);
                    break;
                case 2:
                    System.out.println("Keliling    : " + keliling);
                    break;
                case 3:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            } while (pilihan != 3);
        Irsyad.close();
    }
}
