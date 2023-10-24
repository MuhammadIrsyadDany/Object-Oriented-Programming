/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author ASUS
 */
public class MainTugas {
    public static void main(String[] args) {
        Pegawai pgw = new Pegawai("978837748", "Bryan", "Tulungagung");
        Dosen dsn = new Dosen("928130729", "Annas", "Maluku");
        dsn.setSKS(8);
        DaftarGaji daftar = new DaftarGaji(2); daftar.addPegawai(pgw); daftar.addPegawai(dsn);
        daftar.printSemuaGaji();
    }
}
