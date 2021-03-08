package apViews;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import apCommon.MyListener;
import apCommon.TrattaDao;
import apCommon.TrattaDaoImpl;

public class Controller {

	AMain pagina;
	TrattaDao trattaDao = new TrattaDaoImpl();
	
	public static void main(String[] args) throws SQLException {
		 Controller c = new Controller();

	}
	
	public Controller() throws SQLException {
		pagina = new AMain(this);
		pagina.setVisible(true);
		
	}
	
	/**Metodo che permette di passare da un JlayerdPane all'altro 
	 * @param attivo il JlayeredPane che è momentaneamente visibile
	 * @param daAttivare il Jlayeredpane da rendere visibile
	 */
	public void switchPanel(JLayeredPane attivo, JLayeredPane daAttivare) {
		daAttivare.setVisible(true);
		attivo.setVisible(false);
	}
	
	public void creaPulsantiCalendarioMarzo(JButton[] mese, JLayeredPane pannello, JTextField textField, JInternalFrame calendario){
		int index = 0; String testo = null;
		for(int y = 0; y <= 160; y+=40) {

			if(y==160) {
				
				for(int x = 10; x <= 116; x+=53) {
					testo = String.valueOf(index+1);
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
					testo = String.valueOf(index+1);
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
	
	public void setCittàBox(JComboBox<String> box) throws SQLException {
		List<String> città = new ArrayList<String>();
		città = trattaDao.getAllCittà();
		box.setModel(new DefaultComboBoxModel<String>(città.toArray(new String[0])));		
	}
	
	public void setImageBox(JComboBox box, JLabel[] labelsCittà) throws SQLException {
		List<String> città = new ArrayList<String>();
		città = trattaDao.getAllCittà();
		int selection = box.getSelectedIndex();
		int index=0;
		for (JLabel label : labelsCittà) {
			if(index==selection)
	           label.setVisible(true);
			else label.setVisible(false);
			index++;
		}
	}
}