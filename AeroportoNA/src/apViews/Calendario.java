package apViews;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class Calendario extends JInternalFrame {

	//Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calendario frame = new Calendario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Create the frame.
	public Calendario() {
		setBounds(100, 100, 450, 300);

	}

}
