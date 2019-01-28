import javax.swing.JFrame;
//import java.awt.Canvas;
import java.awt.Graphics;

public class line extends Canvas{

    public static void main(String[] args) {
		JFrame jframe = new JFrame("App"); // Window with "App" as title
		line canvas = new line();
		// Canvas canvas = new line(); // class into Canvas Type, to put things onto
        canvas.setSize(300, 200);
        jframe.add(canvas);
        jframe.pack(); // Auto pack frame
        jframe.setVisible(true);
		
    }
    /* A paint method is required by canvas,
     * is always running in Canvas
     
     * Drawing uses javas coordinates:
     * x is top horizontal line,
     * y is left vertical line.
     * x=0, y=0 is top left.
     * Multiple points are often used [start(x,y); end(x,y)]
     */
    public void paint(Graphics graphics) {
    	graphics.drawLine(20, 30, 60, 30);
    }
}
