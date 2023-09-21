/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irsyad.relasiclass.percobaan1;

/**
 *
 * @author ASUS
 */
public class Laptop {
    
    private String merk;
    private Processor proc;
    
    public Laptop(){
        
    }
    
    public Laptop(String merk, Processor proc){
        this.merk = merk;
        this.proc = proc;
    }
    
    void info(){
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
    
    void setMerk(String merk){
        this.merk = merk;
    }
    
    void setProc(Processor proc){
        this.proc = proc;
    }
}
