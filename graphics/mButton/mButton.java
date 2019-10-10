import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class mButton {
	public static void main(String[] args){
        JFrame frame = new JFrame("Button App");
		frame.setSize(400,300);
        frame.setDefaultCloseOperation(3);
		Label label = new Label("Click the button.");
        Button button = new Button("OK");
        button.setSize(25, 25);
		button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                label.setText("Ok Clicked.");
                System.out.println("Button clicked on frame.");
            }
        });
        frame.add(button);
		frame.add(label);
		frame.setVisible(true);
	}

}
