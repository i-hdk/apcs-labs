 

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde {

    private List<Alien> aliens;

    public AlienHorde(int size) {
        int y = 0;
        aliens = new ArrayList<Alien>();
        for (int j = 0; j < 3; j++) {
            int x = 0;

            for (int i = 0; i < size; i++) {
                aliens.add(new Alien(x, y, 30, 30, 1));
                x += 40;
            }
            y += 30;
        }
    }

    public void add(Alien al) {
        getAliens().add(al);
    }

    public void drawEmAll(Graphics window) {
        for (Alien a : getAliens()) {
            a.draw(window);
        }
    }

    public void moveEmAll() {
        for (Alien a : getAliens()) {
            a.move("RIGHT");
            if (a.getX() > 740) {
                a.setX(0);
                a.setY(a.getY() + 60);
            }
        }
    }

    public void removeDeadOnes(List<Ammo> shots) {
        //int j =0;
        for (Ammo b : shots) {
            int i = 0;
            for (Alien d : aliens) {
                if (Math.abs(b.getX() - d.getX()) < 10 && Math.abs(b.getY() - d.getY()) < 10) {
                   aliens.remove(i);
                   b.setX(-10);
                   b.setY(-10);
                   i--;
                   break;
                }
                i++; 
            }
            //j++;
        }
    }

    public String toString() {
        return "";
    }

    /**
     * @return the aliens
     */
    public List<Alien> getAliens() {
        return aliens;
    }

    /**
     * @param aliens the aliens to set
     */
    public void setAliens(List<Alien> aliens) {
        this.aliens = aliens;
    }

}