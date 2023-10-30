/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pkg1;

/**
 *
 * @author ASUS
 */
public class Tugas1Main {
    public static void main(String[] args) {
        Mac mc = new Mac("MacBook Pro", 4, 512, "Intel Core i5",
        "Lithium-polymer. 58,2 watt-jam", "macOs");
        mc.tampilMac();
        
        Windows wd = new Windows("DELL Latitude E7440", 3, 512,
        "Intel Core i7", "Lithium-polymer. 58,2 watt-jam", "Windows");
        wd.tampilWindows();
        
        PC pc = new PC("iMac 24inch", 3, 256, "Intel Core i5", 24);
        pc.tampilPC();
    }
}
