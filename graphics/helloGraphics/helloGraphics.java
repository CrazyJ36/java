// imports methods like java.awt.Graphics and javax.swing.JFrame
import java.awt.*;
import javax.swing.JFrame;

/* using paint() to define the actual graphics and properties.
There are several properties available.*/
public class helloGraphics extends Canvas {

    public void paint(Graphics graphics) {
        graphics.drawString("Hello World",10,10);
/* In 10,10 ("text",10,10), this states pixels from top
left the text should start.*/
    }

// in main, setup the frame
    public static void main(String[] args) {
        helloGraphics helloGraphics = new helloGraphics();
        JFrame jFrame = new JFrame();
        jFrame.add(helloGraphics);
        jFrame.setSize(200,200);
        jFrame.setVisible(true);
    }
}
