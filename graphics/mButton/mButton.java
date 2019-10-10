import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class mButton {

	public static void main(String[] args){
        JFrame frame = new JFrame("Button App");
		frame.setSize(400,300);
		Label label = new Label();
		label.setSize(20,40);
        label.setText("Click button");
        Button button = new Button("OK");
        button.setSize(50, 25);
		button.setActionCommand("OK");
		button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if (actionEvent.getActionCommand().equals("OK")) {
                    label.setText("Ok Clicked.");
                    System.out.println("Ok clicked in frame.");
                }
            }
        });
        frame.add(button);
		frame.add(label);
		frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){ // windowClosing() in api mapped to close button.
                System.out.println("Close");
                System.exit(0);
            }
        });

	}

}
