package apViews;

import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
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

import apCommon.Gate;
import apCommon.GateDao;
import apCommon.GateDaoImpl;
import apCommon.MyListener;
import apCommon.Tratta;
import apCommon.TrattaDao;
import apCommon.TrattaDaoImpl;

public class Controller {

	AMain pagina;
	TrattaDao trattaDao = new TrattaDaoImpl();
	GateDao gateDao = new GateDaoImpl();
	
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
	
	/**Metodo che crea i pulsanti all'interno del JInternalFrame calendario
	 * @param mesi è un array di JButton che conterrà tutti i pulsanti che verranno creati per il calendario
	 * @param pannello è il JLayeredPane sul quale verranno inseriti i JButton
	 * @param data è il JTextField nel quale verrà visualizzata la data una volta cliccato il pulsante
	 * @param calendario è il JInternalFrame che contiene tutte le cose inerenenti al calendario (JButtons, JPanel, ...)
	 */
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
	
	/**Metodo che permette selezionare un'immagine in base alla città selezionata
	 * @param box è la JBomboBox dalla quale è possibile selezionare le città
	 * @param lablesCittà è un array di JLabels che contiene tutte le immagini delle città
	 */
	public void setImageBox(JComboBox box, JLabel[] labelsCittà) throws SQLException {
		int selection = box.getSelectedIndex();
		int index=0;
		for (JLabel label : labelsCittà) {
			if(index==selection)
	           label.setVisible(true);
			else label.setVisible(false);
			index++;
		}
	}
	
	public void setTerminalGate(TextArea terminal1, TextArea terminal2, TextArea terminal3, TextArea terminal4) throws SQLException {
		List<Gate> gates = new ArrayList<Gate>();
		gates = gateDao.getAllGates();
		for(int i=0;i<gates.size();i++)
		 {
		    if(gates.get(i).getTerminale().equals("T1")) {
		    	terminal1.setText(terminal1.getText()+gates.get(i).getNumeroGate()+"\n");
		    }
		 }  
      }
	
	public void newTratta(JComboBox<String> boxOrario, JComboBox<String> boxDestinazione, JTextField fieldPrenotazioni, JInternalFrame warning, JTextField fieldData) {
		Tratta tratta = new Tratta();
		if(fieldData.getText()==null) {
			warning.setVisible(true);
		}
		tratta.setOrarioPartenza(boxOrario.getSelectedItem().toString());
		tratta.setCittà(boxDestinazione.getSelectedItem().toString());
		tratta.setOrarioArrivo(boxOrario.getSelectedItem().toString(),boxDestinazione.getSelectedItem().toString());
		tratta.setDataPartenza(fieldData.getText());
		tratta.setDataArrivo(fieldData.getText(), boxOrario.getSelectedItem().toString(), tratta.getOrarioArrivo().toString());
		try {
	         Integer.parseInt(fieldPrenotazioni.getText());
	         tratta.setNumPrenotazioni(Integer.parseInt(fieldPrenotazioni.getText()));
	      } catch (NumberFormatException e) {
	    	  warning.setVisible(true);
	      }
		System.out.println(tratta.getOrarioPartenza()+"\n"+tratta.getCittà()+"\n"+tratta.getOrarioArrivo()+"\n"+tratta.getDataPartenza()+"\n"+tratta.getDataArrivo()+"\n"+tratta.getNumPrenotazioni());
	}
}