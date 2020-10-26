import java.awt.*;
import java.applet.*;

public class Praktijksopdracht extends Applet{

    public void init() {

    }

    public void paint(Graphics g) {
        boom(g,200,100);


    }
    void boom(Graphics g, int x, int y){
        g.fillRect(100, 100,25,100);
        g.setColor(Color.green);
        g.fillOval(65,20,100,100);
        g.setColor(Color.red);
        g.fillOval(80,80,20,20);
        g.fillOval(120,60,20,20);
        g.fillOval(80,40,20,20);
    }


}
