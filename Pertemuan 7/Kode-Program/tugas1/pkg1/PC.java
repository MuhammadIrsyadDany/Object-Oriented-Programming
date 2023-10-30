/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pkg1;

/**
 *
 * @author ASUS
 */
public class PC extends Komputer {
    
    public int ukuranMonitor;
    
    public PC(){
        
    }
    
    public PC(String merk, int kecProsesor, int sizeMemory,
            String jnsProsesor, int ukuranMonitor){
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }
    
    public void tampilPC(){
        super.tampilData();
        System.out.println("Ukuran Monitor      = " + ukuranMonitor);
    }
}
