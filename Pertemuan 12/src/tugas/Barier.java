/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author ASUS
 */
public class Barier implements Detroyable {

    private int strength;

    public Barier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public void detroyed() {
        strength -= (strength * 0.1);
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + strength + "\n";
    }
}
