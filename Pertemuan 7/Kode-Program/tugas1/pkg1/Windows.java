/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pkg1;

/**
 *
 * @author ASUS
 */
public class Windows extends Laptop {
    
    public String fitur;
    
    public Windows(){}
    
    public Windows(String merk, int kecProsesor, int sizeMemory, 
            String jnsProsesor, String jnsBaterai, String fitur){
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
        this.fitur = fitur;
    }
    
    public void tampilWindows(){
        super.tampilLaptop();
        System.out.println("Fitur               = " + fitur);
    }
}
