/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author ASUS
 */
public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        if (level == 1) {
            health += (health * 0.03);
        } else if (level == 2) {
            health += (health * 0.04);
        } else if (level == 3) {
            health += (health * 0.05);
        }
    }

    @Override
    public void detroyed() {
        health -= (health * 0.01);
        heal();
    }

    public String getZombieInfo() {
        return "Jumping Zombie Data = " + "\nHealth = " + health
                + "\nLevel = " + level + "\n";
    }
}
