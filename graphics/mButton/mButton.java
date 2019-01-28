import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class mButton {
    JFrame jFrame = new JFrame("myButton");
    private Label statusLabel;
    private Panel controlPanel;
    
	public mButton(){
        prepareGUI();
	}

	public static void main(String[] args){
		mButton  mButtonVar = new mButton();
		mButtonVar.showEventDemo();
	}

	private void prepareGUI(){
		jFrame.setSize(400,400);
		statusLabel = new Label();       
		statusLabel.setSize(100,80);
		controlPanel = new Panel();
		controlPanel.setLayout(new FlowLayout());
		jFrame.add(statusLabel);
		jFrame.add(controlPanel);
		jFrame.setVisible(true);  
	}

	private void showEventDemo(){
		Button okButton = new Button("OK");
		okButton.setSize(50,50);
		okButton.setActionCommand("OK");
		okButton.addActionListener(new ButtonClickListener()); 
		controlPanel.add(okButton);
		jFrame.setVisible(true);
	}

	private class ButtonClickListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();  
			if( command.equals( "OK" ))  {
				statusLabel.setText("Ok Button clicked.");
			}	
		}		
	}
}