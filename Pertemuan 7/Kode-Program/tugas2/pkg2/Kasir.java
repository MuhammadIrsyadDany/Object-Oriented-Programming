/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pkg2;

/**
 *
 * @author ASUS
 */
public class Kasir extends Pegawai {
    
    public Kasir(){}
    
    public Kasir(String nama, String id){
        super(nama, id);
    }
    
    public void pembayaran(){
        System.out.println("===== CETAK STRUK =====");
        System.out.println("Nama KASIR          : " + nama);
        System.out.println("ID KASIR            : " + id);
    }
}
