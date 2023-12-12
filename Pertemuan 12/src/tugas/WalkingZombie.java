/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author ASUS
 */
public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        if (level == 1) {
            health += (health * 0.02);
        } else if (level == 2) {
            health += (health * 0.03);
        } else if (level == 3) {
            health += (health * 0.04);
        }
    }

    @Override
    public void detroyed() {
        health -= (health * 0.02);
        heal();
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data = " + "\nHealth = " + health
                + "\nLevel = " + level + "\n";
    }
}

