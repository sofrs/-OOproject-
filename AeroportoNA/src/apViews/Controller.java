package apViews;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import apCommon.MyListener;

public class Controller {

	AMain pagina;
	
	public static void main(String[] args) {
		 Controller c = new Controller();

	}
	
	public Controller() {
		
		pagina = new AMain(this);
		pagina.setVisible(true);
		
	}
	
	/**Metodo che permette di passare da un JlayerdPane all'altro 
	 * @param attivo il JlayeredPane che è momentaneamente visibile
	 * @param daAttivare il Lajeredpane da rendere visibile
	 */
	public void switchPanel(JLayeredPane attivo, JLayeredPane daAttivare) {
		daAttivare.setVisible(true);
		attivo.setVisible(false);
	}
	
	public void creaPulsantiCalendarioMarzo(JButton[] mese, JLayeredPane pannello, JTextField textField, JInternalFrame calendario){
		int index = 1; String testo = null;
		for(int y = 0; y <= 160; y+=40) {

			if(y==160) {
				
				for(int x = 10; x <= 116; x+=53) {
					testo = String.valueOf(index);
					mese[index] = new JButton(testo);
					mese[index].setFont(new Font("Tahoma", Font.PLAIN, 10));;
					mese[index].setBounds(x, y, 43, 30);
					mese[index].addActionListener(new MyListener(index, textField, calendario));
					pannello.add(mese[index]);
					index++;
					
				}
				
			}
			
			else {
				
				for(int x = 10; x <= 380; x+=53) {
					testo = String.valueOf(index);
					mese[index] = new JButton(testo);
					mese[index].setFont(new Font("Tahoma", Font.PLAIN, 10));;
					mese[index].setBounds(x, y, 43, 30);
					mese[index].addActionListener(new MyListener(index, textField, calendario));
					pannello.add(mese[index]);
					index++;
				}
				
			}
			
		}
		
	}
	
}