/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author ASUS
 */
public class DaftarGaji {
    
    public Pegawai[] listPegawai;
    private int jumPegawai = 0;
    
    public DaftarGaji(int n) {
        listPegawai = new Pegawai[n];
    }
    
    public void addPegawai(Pegawai pegawai) { 
        listPegawai[jumPegawai] = pegawai; jumPegawai++;
    }
    
    public void printSemuaGaji() {
        for(int i = 0; i < jumPegawai; i++) {
            String nama = listPegawai[i].getNama();
            int gaji = listPegawai[i].getGaji();
            System.out.println(nama + " mendapatkan gaji sebesar Rp" + gaji);
        }
    }
}
