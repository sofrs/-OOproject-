package apViews;

import java.awt.Font;
import java.awt.TextArea;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import apCommon.GateDao;
import apCommon.GateDaoImpl;
import apCommon.MyListener;
import apCommon.Tratta;
import apCommon.TrattaDao;
import apCommon.TrattaDaoImpl;

public class Controller {

	//Attributi
	AMain pagina;
	TrattaDao trattaDao = new TrattaDaoImpl();
	GateDao gateDao = new GateDaoImpl();
	
	
	/** 
	 * MAIN
	 * @param args
	 * @throws SQLException
	 */
	public static void main(String[] args) throws SQLException {
		 Controller c = new Controller();
	}
	
	
	/**
	 * Costruttore che avvia la GUI
	 * @throws SQLException
	 */
	public Controller() throws SQLException {
		pagina = new AMain(this);
		pagina.setVisible(true);
	}
	
	
	/**Metodo che permette di passare da un JLabel all'altro 
	 * 
	 * @param attivo il JLabel che è momentaneamente visibile
	 * @param daAttivare il JLabel da rendere visibile
	 */
	public void switchPanel(JLabel attivo, JLabel daAttivare) {
		daAttivare.setVisible(true);
		attivo.setVisible(false);
	}
	
	
	/**Metodo che permette di passare da un JlayerdPane all'altro 
	 * 
	 * @param attivo il JlayeredPane che è momentaneamente visibile
	 * @param daAttivare il Jlayeredpane da rendere visibile
	 */
	public void switchPanel(JLayeredPane attivo, JLayeredPane daAttivare) {
		daAttivare.setVisible(true);
		attivo.setVisible(false);
	}

	public void showCorrectCalendar(JLayeredPane attiva, JLayeredPane disattiva1, JLayeredPane disattiva2, JLayeredPane disattiva3, JInternalFrame calendario) {
		attiva.setVisible(true);
		disattiva1.setVisible(false);
		disattiva2.setVisible(false);
		disattiva3.setVisible(false);
		calendario.setVisible(true);
	}
	
	
	/**Metodo che crea i pulsanti all'interno del JInternalFrame calendario
	 * 
	 * @param mesi è un array di JButton che conterrà tutti i pulsanti che verranno creati per il calendario
	 * @param pannello è il JLayeredPane sul quale verranno inseriti i JButton
	 * @param data è il JTextField nel quale verrà visualizzata la data una volta cliccato il pulsante
	 * @param calendario è il JInternalFrame che contiene tutte le cose inerenenti al calendario (JButtons, JPanel, ...)
	 */
	public void creaPulsantiCalendario(JButton[] pulsantiMesi, JLayeredPane pannello, JTextField textField, JInternalFrame calendario){
		pannello.moveToFront(pannello);
		int index = 0; String testo = null;
		for(int y = 0; y <= 160; y+=40) {
			
			if(y==160) {
				
				for(int x = 10; x <= 116; x+=53) {
					testo = String.valueOf(index+1);
					pulsantiMesi[index] = new JButton(testo);
					pulsantiMesi[index].setFont(new Font("Tahoma", Font.PLAIN, 10));;
					pulsantiMesi[index].setBounds(x, y, 43, 30);
					pulsantiMesi[index].addActionListener(new MyListener(index, textField, calendario));
					pannello.add(pulsantiMesi[index]);
					index++;
					
				}
				
			}
			
			else {
				
				for(int x = 10; x <= 380; x+=53) {
					testo = String.valueOf(index+1);
					pulsantiMesi[index] = new JButton(testo);
					pulsantiMesi[index].setFont(new Font("Tahoma", Font.PLAIN, 10));;
					pulsantiMesi[index].setBounds(x, y, 43, 30);
					pulsantiMesi[index].addActionListener(new MyListener(index, textField, calendario));
					pannello.add(pulsantiMesi[index]);
					index++;
				}
				
			}
			
		}
		
	}
	
	
	/**Metodo che permette selezionare un'immagine in base alla città selezionata
	 * 
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
	
	/**Metodo che
	 * 
	 * @param boxOrario
	 * @param boxDestinazione
	 * @param fieldPrenotazioni
	 * @param warning
	 * @param fieldData
	 * @param warnings {testoValoreInvalido, testoOperazioneNonCompletata, testoAggiuntaCompletata, testoRimozioneCompletata};
	 */
	public void newTratta(JComboBox<String> boxOrario, JComboBox<String> boxDestinazione, JTextField fieldPrenotazioni, JInternalFrame warning, JTextField fieldData, JLabel[] warnings) {
		boolean result = false;
		Tratta tratta = new Tratta();
		if(fieldData.getText().equals("")) {
			for(int index = 0; index<warnings.length; index++) {
				  if(index!=0)
					  warnings[index].setVisible(false);
				  else warnings[index].setVisible(true);
			  }
	    	  warning.setVisible(true);
	    	  return;
		}
		try {
	         Integer.parseInt(fieldPrenotazioni.getText());
	         tratta.setNumPrenotazioni(Integer.parseInt(fieldPrenotazioni.getText()));
	      } catch (NumberFormatException e) {
	    	  for(int index = 0; index<warnings.length; index++) {
				  if(index!=0)
					  warnings[index].setVisible(false);
				  else warnings[index].setVisible(true);
			  }
	    	  warning.setVisible(true);
	    	  return;
	      }
		tratta.setOrarioPartenza(boxOrario.getSelectedItem().toString());
		tratta.setCittà(boxDestinazione.getSelectedItem().toString());
		tratta.setOrarioArrivo(boxOrario.getSelectedItem().toString(),boxDestinazione.getSelectedItem().toString());
		tratta.setDataPartenza(fieldData.getText());
		tratta.setDataArrivo(fieldData.getText(), boxOrario.getSelectedItem().toString(), tratta.getOrarioArrivo());
		result = trattaDao.insertTratta(tratta);
		if (result==false) {
			for(int index = 0; index<warnings.length; index++) {
				  if(index!=1)
					  warnings[index].setVisible(false);
				  else warnings[index].setVisible(true);
			  }
	    	  warning.setVisible(true);
		} else {
			for(int index =0; index<warnings.length; index++) {
				  if(index!=2)
					  warnings[index].setVisible(false);
				  else warnings[index].setVisible(true);
			  }
	    	  warning.setVisible(true);
		}
	}

	
	public void rimuoviTratta(JComboBox<String> boxOrario, JComboBox<String> boxDestinazione, JInternalFrame warning, JTextField fieldData, JLabel[] warnings) {
		boolean result = false;
		Tratta tratta = new Tratta();
		if(fieldData.getText()==null) {
			for(int index = 0; index<warnings.length; index++) {
				  if(index!=0)
					  warnings[index].setVisible(false);
				  else warnings[index].setVisible(true);
			  }
	    	  warning.setVisible(true);
		}
		tratta.setOrarioPartenza(boxOrario.getSelectedItem().toString());
		tratta.setCittà(boxDestinazione.getSelectedItem().toString());
		tratta.setDataPartenza(fieldData.getText());
		result = trattaDao.deleteTratta(tratta);
		if (result==false) {
			for(int index = 0; index<warnings.length; index++) {
				  if(index!=1)
					  warnings[index].setVisible(false);
				  else warnings[index].setVisible(true);
			  }
	    	  warning.setVisible(true);
		} else {
			for(int index = 0; index<warnings.length; index++) {
				  if(index!=3)
					  warnings[index].setVisible(false);
				  else warnings[index].setVisible(true);
			  }
	    	  warning.setVisible(true);
		}
	}
	
	
	/** Metodo che permette di attivare una ricerca dettagliata in base alle check boxes selezionate
	 * 
	 * @param checkBoxes {CheckDataArrivo, CheckDataPartenza, CheckOrarioArrivo, CheckOrarioPartenza, CheckCittà};
	 * @param fields {FieldDataArrivo, FieldDataPartenza};
	 * @param boxes {BoxOrarioArrivo, BoxOrarioPartenza, BoxCittà};
	 * @param buttons {PulsanteCalendarioArrivo, PulsanteCalendarioPartenza};
	 */
	public void attivaRicerca(JCheckBox[] checkBoxes, JTextField[] fields, JComboBox[] boxes, JButton[] buttons) {
		
		  if (checkBoxes[0].isSelected()) {
			  fields[0].setEnabled(true);
			  buttons[0].setEnabled(true);
		  } else {
			  fields[0].setEnabled(false);
			  buttons[0].setEnabled(false);
		  }
		  
		  if(checkBoxes[1].isSelected()) {
			  fields[1].setEnabled(true);
			  buttons[1].setEnabled(true);
		  } else { 
			  fields[1].setEnabled(false);
			  buttons[1].setEnabled(false);
		  }
		  
		  if(checkBoxes[2].isSelected())
			  boxes[0].setEnabled(true);
		  else
			  boxes[0].setEnabled(false);

		  
		  if(checkBoxes[3].isSelected())
			  boxes[1].setEnabled(true);
		  else
			  boxes[1].setEnabled(false);
		  
		  if(checkBoxes[4].isSelected())
			  boxes[2].setEnabled(true);
		  else
			  boxes[2].setEnabled(false);
	}

	/** Metodo che permette di 
	 * 
	 * @param checkBoxes {CheckDataArrivo, CheckDataPartenza, CheckOrarioArrivo, CheckOrarioPartenza, CheckCittà};
	 * @param fields {FieldDataArrivo, FieldDataPartenza};
	 * @param boxes {BoxOrarioArrivo, BoxOrarioPartenza, BoxCittà};
	 * @param listaTratte
	 */
	public void ricercaTratte(JCheckBox[] checkBoxes, JTextField[] fields, JComboBox[] boxes, TextArea listaTratte) {	
		List<Tratta> tratte = new ArrayList<Tratta>();
		listaTratte.setText("");
		try {
			tratte = trattaDao.getTratte();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
        for(int i=0;i<tratte.size();i++)
        {
       
        	if (checkBoxes[0].isSelected()) {

  			  if((fields[0].getText().toString()).equals(tratte.get(i).getDataArrivo().toString())) {
  				  listaTratte.setText(listaTratte.getText()+"Città: "+tratte.get(i).getCittà().toString()+" - Data partenza: "+tratte.get(i).getDataPartenza().toString()+
  						  				" - Data Arrivo: "+tratte.get(i).getDataArrivo().toString()+" - Orario partenza: "+tratte.get(i).getOrarioPartenza().toString()+
  						  				" - Orario arrivo: "+tratte.get(i).getOrarioArrivo().toString()+ " - Prenotazioni: "+tratte.get(i).getNumPrenotazioni()+"\n");
  				  i++;
  			  }
  			 
        	} 
        	
        	
        	if (checkBoxes[1].isSelected()) {

    			  if((fields[1].getText().toString()).equals(tratte.get(i).getDataPartenza().toString())) {
    				  listaTratte.setText(listaTratte.getText()+"Città: "+tratte.get(i).getCittà().toString()+" - Data partenza: "+tratte.get(i).getDataPartenza().toString()+
    						  				" - Data Arrivo: "+tratte.get(i).getDataArrivo().toString()+" - Orario partenza: "+tratte.get(i).getOrarioPartenza().toString()+
    						  				" - Orario arrivo: "+tratte.get(i).getOrarioArrivo().toString()+ " - Prenotazioni: "+tratte.get(i).getNumPrenotazioni()+"\n");
    				 i++;
    			  }
        	}
        	
        	
        	if (checkBoxes[2].isSelected()) {

  			  if((boxes[0].getSelectedItem().toString()).equals(tratte.get(i).getOrarioArrivo().toString())) {
  				  listaTratte.setText(listaTratte.getText()+"Città: "+tratte.get(i).getCittà().toString()+" - Data partenza: "+tratte.get(i).getDataPartenza().toString()+
  						  				" - Data Arrivo: "+tratte.get(i).getDataArrivo().toString()+" - Orario partenza: "+tratte.get(i).getOrarioPartenza().toString()+
  						  				" - Orario arrivo: "+tratte.get(i).getOrarioArrivo().toString()+ " - Prenotazioni: "+tratte.get(i).getNumPrenotazioni()+"\n");
  				 i++;
  			  }
        	}
        	
        	
        	if (checkBoxes[3].isSelected()) {

    			  if((boxes[1].getSelectedItem().toString()).equals(tratte.get(i).getOrarioPartenza().toString())) {
    				  listaTratte.setText(listaTratte.getText()+"Città: "+tratte.get(i).getCittà().toString()+" - Data partenza: "+tratte.get(i).getDataPartenza().toString()+
    						  				" - Data Arrivo: "+tratte.get(i).getDataArrivo().toString()+" - Orario partenza: "+tratte.get(i).getOrarioPartenza().toString()+
    						  				" - Orario arrivo: "+tratte.get(i).getOrarioArrivo().toString()+ " - Prenotazioni: "+tratte.get(i).getNumPrenotazioni()+"\n");
    				 i++;
    			  }
          	}
          	
        	
        	if (checkBoxes[4].isSelected()) {

    			  if((boxes[2].getSelectedItem().toString()).equals(tratte.get(i).getCittà().toString())) {
    				  listaTratte.setText(listaTratte.getText()+"Città: "+tratte.get(i).getCittà().toString()+" - Data partenza: "+tratte.get(i).getDataPartenza().toString()+
    						  				" - Data Arrivo: "+tratte.get(i).getDataArrivo().toString()+" - Orario partenza: "+tratte.get(i).getOrarioPartenza().toString()+
    						  				" - Orario arrivo: "+tratte.get(i).getOrarioArrivo().toString()+ " - Prenotazioni: "+tratte.get(i).getNumPrenotazioni()+"\n");
    				 i++;
    			  }
          	}
          	
        	
         }
	}

	
	/**Metodo
	 * 
	 * @param lista
	 */
	public void fillJList(DefaultListModel<String> lista) {
		List<Tratta> tratte = new ArrayList<Tratta>();
		
		try {
			tratte = trattaDao.getTratte();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		for(int i=0; i<tratte.size(); i++) {
			lista.addElement(tratte.get(i).getCittà().toString()+"["+tratte.get(i).getNumPrenotazioni()+"] - ["+tratte.get(i).getOrarioPartenza().toString()+" - "
								+tratte.get(i).getOrarioArrivo().toString()+"] - ["+tratte.get(i).getDataPartenza().toString()+" - "+tratte.get(i).getDataArrivo().toString()+"]");
		}
		
	}
	
	/**Metodo
	 * 
	 * @param list
	 * @param field
	 * @param internalFrame
	 */
	public void selectJList(JList<String> list, JTextField field, JInternalFrame internalFrame) {
		internalFrame.setVisible(false);
		field.setText(list.getSelectedValue());
	}
	
	/**Metodo
	 * 
	 * @param pannelloTempo
	 * @param groupTempo
	 * @param fieldTratta
	 * @param headersTempo
	 * @param fieldsTempo
	 * @param checksCode
	 */
	public void showAndSetTempo(JPanel pannelloTempo, ButtonGroup groupTempo, JTextField fieldTratta, JPanel[] headersTempo, JTextField[][] fieldsTempo, JCheckBox[][] checksCode) {
		int indexButtons = 0;
		int numPrenotazioni = 0;
		int tempoStimatoGiornaliero = 0;
		int tempoEffettivoGiornaliero = 0;
		int tempoStimatoMensile = 0;
		int tempoEffettivoMensile = 0;
		int tempoStimatoAnnuale = 0;
		int tempoEggettivoAnnuale = 0;
		String prenotazioniChar = null;
		char[] fieldTrattaChar = fieldTratta.getText().toCharArray();
		
		if(!pannelloTempo.isVisible()) {
			pannelloTempo.setVisible(true);
		}
		
		try {
			for(int index = 0; fieldTrattaChar[index] != '['; index++) {
				if(prenotazioniChar==null) {
					prenotazioniChar = Character.toString(fieldTrattaChar[index]);	
				} else 
					prenotazioniChar += fieldTrattaChar[index];
			}
			numPrenotazioni = Integer.parseInt(prenotazioniChar);
		} catch (ArrayIndexOutOfBoundsException e) {
			return;
		}

		 for (Enumeration<AbstractButton> buttons = groupTempo.getElements(); buttons.hasMoreElements(); indexButtons++) {
	            AbstractButton button = buttons.nextElement();
	            if (button.isSelected()) {
	            	headersTempo[indexButtons].setVisible(true);
	            		if(checksCode[0][0].isSelected()||checksCode[1][0].isSelected()||checksCode[2][0].isSelected()) {
	            			if(numPrenotazioni > 200)
	            				tempoStimatoGiornaliero += 120;
	            			if(numPrenotazioni >= 150 && numPrenotazioni <200)
	            				tempoStimatoGiornaliero += 90;
	            			if(numPrenotazioni < 150)
	            				tempoStimatoGiornaliero += 60;
	            		}
	            		if(checksCode[0][1].isSelected()||checksCode[1][1].isSelected()||checksCode[2][1].isSelected()) {
	            			if(numPrenotazioni > 200)
	            				tempoStimatoGiornaliero += 40;
	            			if(numPrenotazioni >= 150 && numPrenotazioni <200)
	            				tempoStimatoGiornaliero += 25;
	            			if(numPrenotazioni < 150)
	            				tempoStimatoGiornaliero += 20;
	            		}
	            		if(checksCode[0][2].isSelected()||checksCode[1][2].isSelected()||checksCode[2][2].isSelected()) {
	            			if(numPrenotazioni > 200)
	            				tempoStimatoGiornaliero += 45;
	            			if(numPrenotazioni >= 150 && numPrenotazioni <200)
	            				tempoStimatoGiornaliero += 30;
	            			if(numPrenotazioni < 150)
	            				tempoStimatoGiornaliero += 20;
	            		}
	            }
	        }

		
	}
	
	public void fillAreaCompagnie(JTextArea[] areaTratteCompagnie) {
		List<Tratta> tratte = new ArrayList<Tratta>();
		try {
			tratte = trattaDao.getTratte();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		for(int index=0; index<tratte.size(); index++) {
			for(int indexArea = 0; indexArea<areaTratteCompagnie.length; indexArea++) {
				switch (indexArea) {
				case 0:
						if(tratte.get(index).getCittà().toString().equals("Amsterdam")||tratte.get(index).getCittà().toString().equals("Berlino")
							||tratte.get(index).getCittà().toString().equals("Roma")||tratte.get(index).getCittà().toString().equals("Londra")) {
							areaTratteCompagnie[indexArea].setText(areaTratteCompagnie[indexArea].getText()+tratte.get(index).getCittà().toString()+"["+tratte.get(index).getNumPrenotazioni()+"] - ["
																	+tratte.get(index).getOrarioPartenza().toString()+" - " +tratte.get(index).getOrarioArrivo().toString()+"] - ["
																	+tratte.get(index).getDataPartenza().toString()+" - "+tratte.get(index).getDataArrivo().toString()+"]"+"\n");
						}
				break;
					
				case 1:
					if(tratte.get(index).getCittà().toString().equals("Atene")||tratte.get(index).getCittà().toString().equals("Bruxelles")) {
						areaTratteCompagnie[indexArea].setText(areaTratteCompagnie[indexArea].getText()+tratte.get(index).getCittà().toString()+"["+tratte.get(index).getNumPrenotazioni()+"] - ["
																+tratte.get(index).getOrarioPartenza().toString()+" - " +tratte.get(index).getOrarioArrivo().toString()+"] - ["
																+tratte.get(index).getDataPartenza().toString()+" - "+tratte.get(index).getDataArrivo().toString()+"]"+"\n");
					}
				break;	
				
				case 2:
					if(tratte.get(index).getCittà().toString().equals("Barcellona")||tratte.get(index).getCittà().toString().equals("Cagliari")||tratte.get(index).getCittà().toString().equals("Catania")) {
						areaTratteCompagnie[indexArea].setText(areaTratteCompagnie[indexArea].getText()+tratte.get(index).getCittà().toString()+"["+tratte.get(index).getNumPrenotazioni()+"] - ["
								+tratte.get(index).getOrarioPartenza().toString()+" - " +tratte.get(index).getOrarioArrivo().toString()+"] - ["
								+tratte.get(index).getDataPartenza().toString()+" - "+tratte.get(index).getDataArrivo().toString()+"]"+"\n");
					}
				break;
				
				case 3:
					if(tratte.get(index).getCittà().toString().equals("Dubai")||tratte.get(index).getCittà().toString().equals("Genova")
						||tratte.get(index).getCittà().toString().equals("Trieste")||tratte.get(index).getCittà().toString().equals("Venzia")) {
						areaTratteCompagnie[indexArea].setText(areaTratteCompagnie[indexArea].getText()+tratte.get(index).getCittà().toString()+"["+tratte.get(index).getNumPrenotazioni()+"] - ["
								+tratte.get(index).getOrarioPartenza().toString()+" - " +tratte.get(index).getOrarioArrivo().toString()+"] - ["
								+tratte.get(index).getDataPartenza().toString()+" - "+tratte.get(index).getDataArrivo().toString()+"]"+"\n");
					}
				break;
				
				case 4:
					if(tratte.get(index).getCittà().toString().equals("Cracovia")||tratte.get(index).getCittà().toString().equals("Milano")) {
						areaTratteCompagnie[indexArea].setText(areaTratteCompagnie[indexArea].getText()+tratte.get(index).getCittà().toString()+"["+tratte.get(index).getNumPrenotazioni()+"] - ["
								+tratte.get(index).getOrarioPartenza().toString()+" - " +tratte.get(index).getOrarioArrivo().toString()+"] - ["
								+tratte.get(index).getDataPartenza().toString()+" - "+tratte.get(index).getDataArrivo().toString()+"]"+"\n");
					}
				break;
				
				}
			}
		}
	}
	
	
	public void fillTable(JTable tableRicerca) {
		
	}
	
}