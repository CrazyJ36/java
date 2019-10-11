import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;
import java.awt.Button;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.util.Scanner;

public class basicSwing {
    static JFrame frame;

    public static void setupHelloUi() {
        frame = new JFrame("Hello App");
        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(3); // dispose_on_close(2) causes exit() if no other windows are active
        Label label = new Label("Hello World");
        frame.add(label);
    }

    public static void setupBtnUi() {
        frame = new JFrame("Button App");
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
    }

    public static void showUi() {
        frame.setVisible(true);
    }

	public static void main(String[] args) {
        System.out.println("Enter 'hello', or 'button': ");
	    Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if (choice.equals("hello")) {
            setupHelloUi();
            showUi();
        } else if (choice.equals("button")) {
            setupBtnUi();
            showUi();
        } else {
            System.out.println("Got Neither.");
            System.exit(0);
        }
	}

}
