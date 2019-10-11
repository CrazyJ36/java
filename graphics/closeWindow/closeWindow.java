
import java.awt.Graphics;
import java.awt.Canvas;
import javax.swing.JFrame;
import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;


public class closeWindow extends Canvas {
    // Also to close window, you can also use:
    // setDefaultCloseOperation(3); 3 meaning EXIT_ON_CLOSE or
    // System.exit(), javax.swing.WindowConstants int
    public static void main(String[] args) {
        closeWindow closeWindowVar = new closeWindow();
		JFrame jFrame = new JFrame();
		// Listen at window for event, this System.exit(), ending cmdline jre
		jFrame.addWindowListener(new WindowAdapter() {
		    public void windowClosing(WindowEvent windowEvent){ // windowClosing() is defined in api to be mapped to close button on window
                System.out.println("Close button clicked\nExiting..");
				System.exit(0);
            }
        });
        jFrame.add(closeWindowVar);
        jFrame.setSize(100,100);
        jFrame.setVisible(true);
    }
}
