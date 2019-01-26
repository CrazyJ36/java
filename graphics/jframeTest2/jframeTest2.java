import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Event;
public class jframeTest2 extends Canvas{
	private String mString = "Hello";
    public static void main(String[] args) {
		JFrame jframe = new JFrame("App"); // Window with title
        Canvas canvas = new jframeTest2(); // Put this class into Canvas Type
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
    	graphics.drawString(mString, 20, 20);
    	graphics.drawLine(20, 30, 60, 30);
    }
}
