/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author ASUS
 */
public class Dosen extends Pegawai{
    
    public int jumlahSKS;
    public int tarif_SKS;
    
    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
        this.tarif_SKS = 120000; 
    }
    
    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }
    
    @Override
    public int getGaji() {
        return (this.jumlahSKS * this.tarif_SKS) + super.getGaji();
    }
}
