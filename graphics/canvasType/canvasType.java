import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Canvas;

public class canvasType extends Canvas {

	public void paint(Graphics graphics) {
        graphics.drawString("Hello World",10,10);
	}

    public static void main(String[] args) {
	    JFrame jFrame = new JFrame("Title");
	    Canvas canvas = new canvasType();
		canvas.setSize(300,200);
		jFrame.setSize(300,200);
		jFrame.add(canvas);
		jFrame.setVisible(true);
	}

}
