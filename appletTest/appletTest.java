import java.applet.Applet;
import java.awt.Graphics;

public class appletTest extends Applet {
    // Override paint as paint here is not used in the same context as normal (frame)
    @Override
    public void paint(Graphics graphics) {
        graphics.drawString("Hello Applet", 20, 20);
    }
}
