/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author ASUS
 */
public class Plant {
    
    public void doDetroyed(Detroyable d) {
        if (d instanceof Zombie) {
            Zombie z = (Zombie) d;
            z.detroyed();
        } else if (d instanceof WalkingZombie) {
            WalkingZombie wz = (WalkingZombie) d;
            wz.detroyed();
        } else if (d instanceof JumpingZombie) {
            JumpingZombie jz = (JumpingZombie) d;
            jz.detroyed();
        } else if (d instanceof Barier) {
            Barier b = (Barier) d;
            b.detroyed();
        }
    }    
}
