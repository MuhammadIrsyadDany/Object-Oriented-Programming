/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author ASUS
 */
public abstract class Zombie implements Detroyable {

    protected int health;
    protected int level;

    public abstract void heal();

    @Override
    public void detroyed() {
        health -= 0;
    }

    public String getZombieInfo() {
        return "Zombie Data = \nHealth = " + health +"\nLevel = " + level + "\n";
    }
}
