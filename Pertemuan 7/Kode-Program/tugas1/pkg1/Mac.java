/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pkg1;

/**
 *
 * @author ASUS
 */
public class Mac extends Laptop{
    
    public String security;
    
    public Mac(){
        
    }
    
    public Mac(String merk, int kecProsesor, int sizeMemory, 
            String jnsProsesor, String jnsBaterai, String security){
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
        this.security = security;
    }
    
    public void tampilMac(){
        super.tampilLaptop();
        System.out.println("Security            = " + security);
    }
}
