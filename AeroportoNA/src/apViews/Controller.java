package apViews;

import java.awt.Font;
import java.awt.TextArea;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.sql.SQLException;
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

	//Attributi
	AMain pagina;
	TrattaDao trattaDao = new TrattaDaoImpl();
	GateDao gateDao = new GateDaoImpl();
	
	
	/** 
	 * MAIN
	 * @param args
	 */
	public static void main(String[] args){
		 Controller c = new Controller();
	}
	
	
	/**
	 * Costruttore che avvia la GUI
	 */
	public Controller(){
		pagina = new AMain(this);
		pagina.setVisible(true);
	}
	
	
	/**
	 * Metodo che permette di passare da un JlayerdPane all'altro 
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
	
	
	/**
	 * Metodo che crea i pulsanti all'interno del JInternalFrame calendario
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
	
	
	/**
	 * Metodo che permette selezionare un'immagine in base alla città selezionata
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
	
	/**
	 * Metodo che permette di aggiungere una nuova tratta
	 * @param boxOrario è la JComboBox che permette di selezionare un orario
	 * @param boxDestinazione è la JComboBox che permette di seeìlezionare una destinazione
	 * @param fieldPrenotazioni è il field in cui viene inserito il numero delle prenotazioni
	 * @param warning è il JInternalFrame che illustra l'errore nel caso in cui ce ne sia bisogno
	 * @param fieldData è il field in cui compare la data selezionata attraverso il calendario
	 * @param warnings sono i JLabels che possono comparire nel warning - {testoValoreInvalido, testoOperazioneNonCompletata, testoAggiuntaCompletata, testoRimozioneCompletata};
	 */
	public void newTratta(JComboBox<String> boxOrario, JComboBox<String> boxDestinazione, JTextField fieldPrenotazioni, JInternalFrame warning, JTextField fieldData, JLabel[] warnings) {
		boolean result = false;
		Tratta tratta = new Tratta();
		String compagnia = null;
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
		switch(tratta.getCittà().toString()) {
		case "Amsterdam":
			compagnia="Ryanair";
			break;
		case "Atene":
			compagnia="Eurowings";
			break;
		case "Barcellona":
			compagnia="Volotea";
			break;
		case "Berlino":
			compagnia="Ryanair";
			break;
		case "Bruxelles":
			compagnia="Eurowings";
			break;
		case "Cagliari":
			compagnia="Volotea";
			break;
		case "Catania":
			compagnia="Volotea";
			break;
		case "Cracovia":
			compagnia="Easyjet";
			break;
		case "Dubai":
			compagnia="Alitalia";
			break;
		case "Genova":
			compagnia="Alitalia";
			break;
		case "Roma":
			compagnia="Ryanair";
			break;
		case "Londra":
			compagnia="Ryanair";
			break;
		case "Torino":
			compagnia="Easyjet";
			break;
		case "Trieste":
			compagnia="Alitalia";
			break;
		case "Venezia":
			compagnia="Alitalia";
			break;
		case "Milano":
			compagnia="EasyJet";
			break;
	}
		result = trattaDao.insertTratta(tratta, compagnia);
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
	
	
	/** 
	 * Metodo che permette di attivare una ricerca mista in base alle check boxes selezionate
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

	/** 
	 * Metodo che effettua una ricerca mista
	 * @param checkBoxes {CheckDataArrivo, CheckDataPartenza, CheckOrarioArrivo, CheckOrarioPartenza, CheckCittà};
	 * @param fields {FieldDataArrivo, FieldDataPartenza};
	 * @param boxes {BoxOrarioArrivo, BoxOrarioPartenza, BoxCittà};
	 * @param listaTratte il text area dove verranno mostrate tutte le tratte
	 */
	public void ricercaTratte(JCheckBox[] checkBoxes, JTextField[] fields, JComboBox[] boxes, TextArea listaTratte) {	
		List<Tratta> tratte = new ArrayList<Tratta>();
		listaTratte.setText("");
		tratte = trattaDao.getTratte();
		
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

	
	/**
	 * Metodo che riempie una JList con le tratte
	 * @param lista da riempire
	 */
	public void fillJList(DefaultListModel<String> lista) {
		List<Tratta> tratte = new ArrayList<Tratta>();
		
		tratte = trattaDao.getTratte();
		
		for(int i=0; i<tratte.size(); i++) {
			lista.addElement(tratte.get(i).getCittà().toString()+"["+tratte.get(i).getNumPrenotazioni()+"] - ["+tratte.get(i).getOrarioPartenza().toString()+" - "
								+tratte.get(i).getOrarioArrivo().toString()+"] - ["+tratte.get(i).getDataPartenza().toString()+" - "+tratte.get(i).getDataArrivo().toString()+"]");
		}
		
	}
	
	/**
	 * Metodo che riempie le JTextArea nella pagina delle compagnie mostrando tutti i voli
	 * @param areaTratteCompagnie
	 */
	public void fillAreaCompagnie(JTextArea[] areaTratteCompagnie) {
		List<Tratta> tratte = new ArrayList<Tratta>();
		
		tratte = trattaDao.getTratte();
		
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
	
	/**
	 * Metodo che controlla che almeno una delle check boxes siano spuntate
	 * @param allBoxes JCheckBox[] {checkCodaFamiglieT1A1, checkCodaDisabiliT1A1, checkCodaPriorityT1A1}
	 * @param box
	 */
	public void controllaChecks(JCheckBox[] boxes, JCheckBox box) {
		boolean result = false;
		for(int index = 0; index<boxes.length; index++) {
			if(boxes[index].isSelected())
				result = true;
		}
		if(result==false)
			box.setSelected(true);
	}
	
	/**
	 * Metodo che riempie i fields dei gate in base alle tratte dispoinibili
	 * @param fieldsTratte {fieldT1A1, fieldT1A2, fieldT1A3, fieldT1A4, fieldT2A1, fieldT2A2, fieldT2A3, fieldT2A4, fieldT3A1, fieldT3A2, fieldT3A3, fieldT3A4, fieldT4A1, fieldT4A2, fieldT4A3, fieldT4A4};	
	 */
	public void setGates(JTextField[] fieldsTratte) {
		Gate gate = new Gate();
		List<Tratta> tratte = new ArrayList<Tratta>();
		
		tratte = trattaDao.getTratteAttesa();
		
		for(int indexGate = 0; indexGate < fieldsTratte.length; indexGate++) {
			switch(indexGate) {
				case 0:
					gate.setTerminale("T1");
					gate.setNumeroGate("A1");
					for(int indexTratte = 0; indexTratte < tratte.size(); indexTratte++) {
						if(tratte.get(indexTratte).getCittà().equals("Amsterdam")) {
						fieldsTratte[indexGate].setText(tratte.get(indexTratte).getCittà().toString()+"["+tratte.get(indexTratte).getNumPrenotazioni()+"] - ["+tratte.get(indexTratte).getOrarioPartenza().toString()+" - "
														+tratte.get(indexTratte).getOrarioArrivo().toString()+"] - ["+tratte.get(indexTratte).getDataPartenza().toString()+" - "+tratte.get(indexTratte).getDataArrivo().toString()+"]");
						trattaDao.updateTratta(tratte.get(indexTratte), "gate");
						gateDao.updateGate(gate, tratte.get(indexTratte));
						break;  
						}
					}
					break;
				case 1:
					gate.setTerminale("T1");
					gate.setNumeroGate("A2");
					for(int indexTratte = 0; indexTratte < tratte.size(); indexTratte++) {
						if(tratte.get(indexTratte).getCittà().equals("Atene")) {
							fieldsTratte[indexGate].setText(tratte.get(indexTratte).getCittà().toString()+"["+tratte.get(indexTratte).getNumPrenotazioni()+"] - ["+tratte.get(indexTratte).getOrarioPartenza().toString()+" - "
									+tratte.get(indexTratte).getOrarioArrivo().toString()+"] - ["+tratte.get(indexTratte).getDataPartenza().toString()+" - "+tratte.get(indexTratte).getDataArrivo().toString()+"]");
						trattaDao.updateTratta(tratte.get(indexTratte), "gate");
						gateDao.updateGate(gate, tratte.get(indexTratte));
						break;  
						}
					}
					break;
				case 2:
					gate.setTerminale("T1");
					gate.setNumeroGate("A3");
					for(int indexTratte = 0; indexTratte < tratte.size(); indexTratte++) {
						if(tratte.get(indexTratte).getCittà().equals("Barcellona")) {
							fieldsTratte[indexGate].setText(tratte.get(indexTratte).getCittà().toString()+"["+tratte.get(indexTratte).getNumPrenotazioni()+"] - ["+tratte.get(indexTratte).getOrarioPartenza().toString()+" - "
									+tratte.get(indexTratte).getOrarioArrivo().toString()+"] - ["+tratte.get(indexTratte).getDataPartenza().toString()+" - "+tratte.get(indexTratte).getDataArrivo().toString()+"]");
						trattaDao.updateTratta(tratte.get(indexTratte), "gate");
						gateDao.updateGate(gate, tratte.get(indexTratte));
						break;  
						}
					}
					break;
				case 3:
					gate.setTerminale("T1");
					gate.setNumeroGate("A4");
					for(int indexTratte = 0; indexTratte < tratte.size(); indexTratte++) {
						if(tratte.get(indexTratte).getCittà().equals("Berlino")) {
							fieldsTratte[indexGate].setText(tratte.get(indexTratte).getCittà().toString()+"["+tratte.get(indexTratte).getNumPrenotazioni()+"] - ["+tratte.get(indexTratte).getOrarioPartenza().toString()+" - "
									+tratte.get(indexTratte).getOrarioArrivo().toString()+"] - ["+tratte.get(indexTratte).getDataPartenza().toString()+" - "+tratte.get(indexTratte).getDataArrivo().toString()+"]");
						trattaDao.updateTratta(tratte.get(indexTratte), "gate");
						gateDao.updateGate(gate, tratte.get(indexTratte));
						break;  
						}
					}
					break;
				case 4:
					gate.setTerminale("T2");
					gate.setNumeroGate("A1");
					for(int indexTratte = 0; indexTratte < tratte.size(); indexTratte++) {
						if(tratte.get(indexTratte).getCittà().equals("Bruxelles")) {
							fieldsTratte[indexGate].setText(tratte.get(indexTratte).getCittà().toString()+"["+tratte.get(indexTratte).getNumPrenotazioni()+"] - ["+tratte.get(indexTratte).getOrarioPartenza().toString()+" - "
									+tratte.get(indexTratte).getOrarioArrivo().toString()+"] - ["+tratte.get(indexTratte).getDataPartenza().toString()+" - "+tratte.get(indexTratte).getDataArrivo().toString()+"]");
						trattaDao.updateTratta(tratte.get(indexTratte), "gate");
						gateDao.updateGate(gate, tratte.get(indexTratte));
						break;  
						}
					}
					break;
				case 5:
					gate.setTerminale("T2");
					gate.setNumeroGate("A2");
					for(int indexTratte = 0; indexTratte < tratte.size(); indexTratte++) {
						if(tratte.get(indexTratte).getCittà().equals("Cagliari")) {
							fieldsTratte[indexGate].setText(tratte.get(indexTratte).getCittà().toString()+"["+tratte.get(indexTratte).getNumPrenotazioni()+"] - ["+tratte.get(indexTratte).getOrarioPartenza().toString()+" - "
									+tratte.get(indexTratte).getOrarioArrivo().toString()+"] - ["+tratte.get(indexTratte).getDataPartenza().toString()+" - "+tratte.get(indexTratte).getDataArrivo().toString()+"]");
						trattaDao.updateTratta(tratte.get(indexTratte), "gate");
						gateDao.updateGate(gate, tratte.get(indexTratte));
						break;  
						}
					}
					break;
				case 6:
					gate.setTerminale("T2");
					gate.setNumeroGate("A3");
					for(int indexTratte = 0; indexTratte < tratte.size(); indexTratte++) {
						if(tratte.get(indexTratte).getCittà().equals("Catania")) {
							fieldsTratte[indexGate].setText(tratte.get(indexTratte).getCittà().toString()+"["+tratte.get(indexTratte).getNumPrenotazioni()+"] - ["+tratte.get(indexTratte).getOrarioPartenza().toString()+" - "
									+tratte.get(indexTratte).getOrarioArrivo().toString()+"] - ["+tratte.get(indexTratte).getDataPartenza().toString()+" - "+tratte.get(indexTratte).getDataArrivo().toString()+"]");
						trattaDao.updateTratta(tratte.get(indexTratte), "gate");
						gateDao.updateGate(gate, tratte.get(indexTratte));
						break;  
						}
					}
					break;
				case 7:
					gate.setTerminale("T2");
					gate.setNumeroGate("A4");
					for(int indexTratte = 0; indexTratte < tratte.size(); indexTratte++) {
						if(tratte.get(indexTratte).getCittà().equals("Cracovia")) {
							fieldsTratte[indexGate].setText(tratte.get(indexTratte).getCittà().toString()+"["+tratte.get(indexTratte).getNumPrenotazioni()+"] - ["+tratte.get(indexTratte).getOrarioPartenza().toString()+" - "
									+tratte.get(indexTratte).getOrarioArrivo().toString()+"] - ["+tratte.get(indexTratte).getDataPartenza().toString()+" - "+tratte.get(indexTratte).getDataArrivo().toString()+"]");
						trattaDao.updateTratta(tratte.get(indexTratte), "gate");
						gateDao.updateGate(gate, tratte.get(indexTratte));
						break;  
						}
					}
					break;
				case 8:
					gate.setTerminale("T3");
					gate.setNumeroGate("A1");
					for(int indexTratte = 0; indexTratte < tratte.size(); indexTratte++) {
						if(tratte.get(indexTratte).getCittà().equals("Dubai")) {
							fieldsTratte[indexGate].setText(tratte.get(indexTratte).getCittà().toString()+"["+tratte.get(indexTratte).getNumPrenotazioni()+"] - ["+tratte.get(indexTratte).getOrarioPartenza().toString()+" - "
									+tratte.get(indexTratte).getOrarioArrivo().toString()+"] - ["+tratte.get(indexTratte).getDataPartenza().toString()+" - "+tratte.get(indexTratte).getDataArrivo().toString()+"]");
						trattaDao.updateTratta(tratte.get(indexTratte), "gate");
						gateDao.updateGate(gate, tratte.get(indexTratte));
						break;  
						}
					}
					break;
				case 9:
					gate.setTerminale("T3");
					gate.setNumeroGate("A2");
					for(int indexTratte = 0; indexTratte < tratte.size(); indexTratte++) {
						if(tratte.get(indexTratte).getCittà().equals("Genova")) {
							fieldsTratte[indexGate].setText(tratte.get(indexTratte).getCittà().toString()+"["+tratte.get(indexTratte).getNumPrenotazioni()+"] - ["+tratte.get(indexTratte).getOrarioPartenza().toString()+" - "
									+tratte.get(indexTratte).getOrarioArrivo().toString()+"] - ["+tratte.get(indexTratte).getDataPartenza().toString()+" - "+tratte.get(indexTratte).getDataArrivo().toString()+"]");
						trattaDao.updateTratta(tratte.get(indexTratte), "gate");
						gateDao.updateGate(gate, tratte.get(indexTratte));
						break;  
						}
					}
					break;
				case 10:
					gate.setTerminale("T3");
					gate.setNumeroGate("A3");
					for(int indexTratte = 0; indexTratte < fieldsTratte.length; indexTratte++) {
						if(tratte.get(indexTratte).getCittà().equals("Roma")) {
							fieldsTratte[indexGate].setText(tratte.get(indexTratte).getCittà().toString()+"["+tratte.get(indexTratte).getNumPrenotazioni()+"] - ["+tratte.get(indexTratte).getOrarioPartenza().toString()+" - "
									+tratte.get(indexTratte).getOrarioArrivo().toString()+"] - ["+tratte.get(indexTratte).getDataPartenza().toString()+" - "+tratte.get(indexTratte).getDataArrivo().toString()+"]");
						trattaDao.updateTratta(tratte.get(indexTratte), "gate");
						gateDao.updateGate(gate, tratte.get(indexTratte));
						break;  
						}
					}
					break;
				case 11:
					gate.setTerminale("T3");
					gate.setNumeroGate("A4");
					for(int indexTratte = 0; indexTratte < tratte.size(); indexTratte++) {
						if(tratte.get(indexTratte).getCittà().equals("Londra")) {
							fieldsTratte[indexGate].setText(tratte.get(indexTratte).getCittà().toString()+"["+tratte.get(indexTratte).getNumPrenotazioni()+"] - ["+tratte.get(indexTratte).getOrarioPartenza().toString()+" - "
									+tratte.get(indexTratte).getOrarioArrivo().toString()+"] - ["+tratte.get(indexTratte).getDataPartenza().toString()+" - "+tratte.get(indexTratte).getDataArrivo().toString()+"]");
						trattaDao.updateTratta(tratte.get(indexTratte), "gate");
						gateDao.updateGate(gate, tratte.get(indexTratte));
						break;  
						}
					}
					break;
				case 12:
					gate.setTerminale("T4");
					gate.setNumeroGate("A1");
					for(int indexTratte = 0; indexTratte < tratte.size(); indexTratte++) {
						if(tratte.get(indexTratte).getCittà().equals("Torino")) {
							fieldsTratte[indexGate].setText(tratte.get(indexTratte).getCittà().toString()+"["+tratte.get(indexTratte).getNumPrenotazioni()+"] - ["+tratte.get(indexTratte).getOrarioPartenza().toString()+" - "
									+tratte.get(indexTratte).getOrarioArrivo().toString()+"] - ["+tratte.get(indexTratte).getDataPartenza().toString()+" - "+tratte.get(indexTratte).getDataArrivo().toString()+"]");
						trattaDao.updateTratta(tratte.get(indexTratte), "gate");
						gateDao.updateGate(gate, tratte.get(indexTratte));
						break;  
						}
					}
					break;
				case 13:
					gate.setTerminale("T4");
					gate.setNumeroGate("A2");
					for(int indexTratte = 0; indexTratte < tratte.size(); indexTratte++) {
						if(tratte.get(indexTratte).getCittà().equals("Trieste")) {
							fieldsTratte[indexGate].setText(tratte.get(indexTratte).getCittà().toString()+"["+tratte.get(indexTratte).getNumPrenotazioni()+"] - ["+tratte.get(indexTratte).getOrarioPartenza().toString()+" - "
									+tratte.get(indexTratte).getOrarioArrivo().toString()+"] - ["+tratte.get(indexTratte).getDataPartenza().toString()+" - "+tratte.get(indexTratte).getDataArrivo().toString()+"]");
						trattaDao.updateTratta(tratte.get(indexTratte), "gate");
						gateDao.updateGate(gate, tratte.get(indexTratte));
						break;  
						}
					}
					break;
				case 14:
					gate.setTerminale("T4");
					gate.setNumeroGate("A3");
					for(int indexTratte = 0; indexTratte < tratte.size(); indexTratte++) {
						if(tratte.get(indexTratte).getCittà().equals("Venezia")) {
							fieldsTratte[indexGate].setText(tratte.get(indexTratte).getCittà().toString()+"["+tratte.get(indexTratte).getNumPrenotazioni()+"] - ["+tratte.get(indexTratte).getOrarioPartenza().toString()+" - "
									+tratte.get(indexTratte).getOrarioArrivo().toString()+"] - ["+tratte.get(indexTratte).getDataPartenza().toString()+" - "+tratte.get(indexTratte).getDataArrivo().toString()+"]");
						trattaDao.updateTratta(tratte.get(indexTratte), "gate");
						gateDao.updateGate(gate, tratte.get(indexTratte));
						break;  
						}
					}
					break;
				case 15:
					gate.setTerminale("T4");
					gate.setNumeroGate("A4");
					for(int indexTratte = 0; indexTratte < tratte.size(); indexTratte++) {
						if(tratte.get(indexTratte).getCittà().equals("Milano")) {
							fieldsTratte[indexGate].setText(tratte.get(indexTratte).getCittà().toString()+"["+tratte.get(indexTratte).getNumPrenotazioni()+"] - ["+tratte.get(indexTratte).getOrarioPartenza().toString()+" - "
									+tratte.get(indexTratte).getOrarioArrivo().toString()+"] - ["+tratte.get(indexTratte).getDataPartenza().toString()+" - "+tratte.get(indexTratte).getDataArrivo().toString()+"]");
						trattaDao.updateTratta(tratte.get(indexTratte), "gate");
						gateDao.updateGate(gate, tratte.get(indexTratte));
						break;  
						}
					}
					break;
					
			}
		}
	}
	
	/**
	 * Metodo che inizializza l'internal JFrame con i dati del volo da far patire
	 * @param terminalGate il gate in cui si trova la tratta
	 * @param fieldsTratte tutte le tratte disponibili - {fieldT1A1, fieldT1A2, fieldT1A3, fieldT1A4, fieldT2A1, fieldT2A2, fieldT2A3, fieldT2A4, fieldT3A1, fieldT3A2, fieldT3A3, fieldT3A4, fieldT4A1, fieldT4A2, fieldT4A3, fieldT4A4};
	 * @param fieldsPartenza tutti i fields da riempire con le informazioni della tratta - {fieldDPartenza, fieldOPPartenza, fieldOAPartenza, fieldDPPartenza, fieldDAPartenza, fieldPPartenza, fieldCAPartenza, fieldCPartenza, fieldTPartenza, fieldGPartenza, fieldTIpartenza};
	 * @param code le checkbox delle code utilizzate per visualizzare quali sono attive
	 * @param schermataPartenza l'internal JFrame che contiene tutti i dati
	 */
	public void initPartenza(String terminalGate, JTextField[] fieldsTratte, JTextField[] fieldsPartenza, JCheckBox[] code, JInternalFrame schermataPartenza) {
		Tratta tratta = new Tratta();
		char[] fieldTrattaChar = null;
		String trattaChar = null;
		int index = 0;
		int tempoStimato = 0;
		fieldsPartenza[7].setText("");

		
		
		switch(terminalGate) {
			case "T1A1":
				fieldTrattaChar = fieldsTratte[0].getText().toCharArray();
				fieldsPartenza[8].setText("T1");
				fieldsPartenza[9].setText("A1");
				break;
			case "T1A2":
				fieldTrattaChar = fieldsTratte[1].getText().toCharArray();
				fieldsPartenza[8].setText("T1");
				fieldsPartenza[9].setText("A2");
				break;
			case "T1A3":
				fieldTrattaChar = fieldsTratte[2].getText().toCharArray();
				fieldsPartenza[8].setText("T1");
				fieldsPartenza[9].setText("A3");
				break;
			case "T1A4":
				fieldTrattaChar = fieldsTratte[3].getText().toCharArray();
				fieldsPartenza[8].setText("T1");
				fieldsPartenza[9].setText("A4");
				break;
			case "T2A1":
				fieldTrattaChar = fieldsTratte[4].getText().toCharArray();
				fieldsPartenza[8].setText("T2");
				fieldsPartenza[9].setText("A1");
				break;
			case "T2A2":
				fieldTrattaChar = fieldsTratte[5].getText().toCharArray();
				fieldsPartenza[8].setText("T2");
				fieldsPartenza[9].setText("A2");
				break;
			case "T2A3":
				fieldTrattaChar = fieldsTratte[6].getText().toCharArray();
				fieldsPartenza[8].setText("T2");
				fieldsPartenza[9].setText("A3");
				break;
			case "T2A4":
				fieldTrattaChar = fieldsTratte[7].getText().toCharArray();
				fieldsPartenza[8].setText("T2");
				fieldsPartenza[9].setText("A4");
				break;
			case "T3A1":
				fieldTrattaChar = fieldsTratte[8].getText().toCharArray();
				fieldsPartenza[8].setText("T3");
				fieldsPartenza[9].setText("A1");
				break;
			case "T3A2":
				fieldTrattaChar = fieldsTratte[9].getText().toCharArray();
				fieldsPartenza[8].setText("T3");
				fieldsPartenza[9].setText("A2");
				break;
			case "T3A3":
				fieldTrattaChar = fieldsTratte[10].getText().toCharArray();
				fieldsPartenza[8].setText("T3");
				fieldsPartenza[9].setText("A3");
				break;
			case "T3A4":
				fieldTrattaChar = fieldsTratte[11].getText().toCharArray();
				fieldsPartenza[8].setText("T3");
				fieldsPartenza[9].setText("A4");
				break;
			case "T4A1":
				fieldTrattaChar = fieldsTratte[12].getText().toCharArray();
				fieldsPartenza[8].setText("T4");
				fieldsPartenza[9].setText("A1");
				break;
			case "T4A2":
				fieldTrattaChar = fieldsTratte[13].getText().toCharArray();
				fieldsPartenza[8].setText("T4");
				fieldsPartenza[9].setText("A2");
				break;
			case "T4A3":
				fieldTrattaChar = fieldsTratte[14].getText().toCharArray();
				fieldsPartenza[8].setText("T4");
				fieldsPartenza[9].setText("A3");
				break;
			case "T4A4":
				fieldTrattaChar = fieldsTratte[15].getText().toCharArray();
				fieldsPartenza[8].setText("T4");
				fieldsPartenza[9].setText("A4");
				break;
		}
		
		for(; fieldTrattaChar[index] != '['; index++) {
			if(trattaChar==null) {
				trattaChar = Character.toString(fieldTrattaChar[index]);	
			} else 
			trattaChar += fieldTrattaChar[index];
		}
		tratta.setCittà(trattaChar);
		fieldsPartenza[0].setText(trattaChar);
		
		switch(trattaChar) {
			case "Amsterdam":
				fieldsPartenza[6].setText("Ryanair");
				break;
			case "Atene":
				fieldsPartenza[6].setText("Eurowings");
				break;
			case "Barcellona":
				fieldsPartenza[6].setText("Volotea");
				break;
			case "Berlino":
				fieldsPartenza[6].setText("Ryanair");
				break;
			case "Bruxelles":
				fieldsPartenza[6].setText("Eurowings");
				break;
			case "Cagliari":
				fieldsPartenza[6].setText("Volotea");
				break;
			case "Catania":
				fieldsPartenza[6].setText("Volotea");
				break;
			case "Cracovia":
				fieldsPartenza[6].setText("Easyjet");
				break;
			case "Dubai":
				fieldsPartenza[6].setText("Alitalia");
				break;
			case "Genova":
				fieldsPartenza[6].setText("Alitalia");
				break;
			case "Roma":
				fieldsPartenza[6].setText("Ryanair");
				break;
			case "Londra":
				fieldsPartenza[6].setText("Ryanair");
				break;
			case "Torino":
				fieldsPartenza[6].setText("Easyjet");
				break;
			case "Trieste":
				fieldsPartenza[6].setText("Alitalia");
				break;
			case "Venezia":
				fieldsPartenza[6].setText("Alitalia");
				break;
			case "Milano":
				fieldsPartenza[6].setText("EasyJet");
				break;
		}
		
		index++;
		for(trattaChar=null; fieldTrattaChar[index] != ']'; index++) {
			if(trattaChar==null) {
				trattaChar = Character.toString(fieldTrattaChar[index]);	
			} else 
			trattaChar += fieldTrattaChar[index];
		}
		tratta.setNumPrenotazioni(Integer.parseInt(trattaChar));
		fieldsPartenza[5].setText(trattaChar);
		
		index +=5;
		for(trattaChar=null; fieldTrattaChar[index] != ' '; index++) {
			if(trattaChar==null) {
				trattaChar = Character.toString(fieldTrattaChar[index]);	
			} else 
			trattaChar += fieldTrattaChar[index];
		}
		tratta.setOrarioPartenza(trattaChar);
		fieldsPartenza[1].setText(trattaChar);
		
		
		index += 3;
		for(trattaChar=null; fieldTrattaChar[index] != ']'; index++) {
			if(trattaChar==null) {
				trattaChar = Character.toString(fieldTrattaChar[index]);	
			} else 
			trattaChar += fieldTrattaChar[index];
		}
		tratta.setOrarioArrivo(trattaChar);
		fieldsPartenza[2].setText(trattaChar);
		
		
		index += 5;
		for(trattaChar=null; fieldTrattaChar[index] != ' '; index++) {
			if(trattaChar==null) {
				trattaChar = Character.toString(fieldTrattaChar[index]);	
			} else 
			trattaChar += fieldTrattaChar[index];
		}
		tratta.setDataPartenza(trattaChar);
		fieldsPartenza[3].setText(trattaChar);
	
		index += 3;
		for(trattaChar=null; fieldTrattaChar[index] != ']'; index++) {
			if(trattaChar==null) {
				trattaChar = Character.toString(fieldTrattaChar[index]);	
			} else 
			trattaChar += fieldTrattaChar[index];
		}
		tratta.setDataArrivo(trattaChar);
		fieldsPartenza[4].setText(trattaChar);
		
		for(int indexCode=0; indexCode < code.length; indexCode++) {
			if (code[indexCode].isSelected()) {
				switch(indexCode) {
					case 0:
						if(tratta.getNumPrenotazioni() > 200)
							tempoStimato+=120;
						
						if(tratta.getNumPrenotazioni() >= 150 && tratta.getNumPrenotazioni() < 200)
							tempoStimato+=90;
						
						if(tratta.getNumPrenotazioni() <150)
							tempoStimato+=60;
						
						fieldsPartenza[7].setText(fieldsPartenza[7].getText()+"famiglia ");
						break;
						
					case 1:
						if(tratta.getNumPrenotazioni() > 200)
							tempoStimato+=40;
						
						if(tratta.getNumPrenotazioni() >= 150 && tratta.getNumPrenotazioni() < 200)
							tempoStimato+=25;
						
						if(tratta.getNumPrenotazioni() <150)
							tempoStimato+=20;
						
						fieldsPartenza[7].setText(fieldsPartenza[7].getText()+"disabili ");
						break;
						
					case 2:
						if(tratta.getNumPrenotazioni() > 200)
							tempoStimato+=45;
						
						if(tratta.getNumPrenotazioni() >= 150 && tratta.getNumPrenotazioni() < 200)
							tempoStimato+=30;
						
						if(tratta.getNumPrenotazioni() <150)
							tempoStimato+=20;
						
						fieldsPartenza[7].setText(fieldsPartenza[7].getText()+"priority ");
						break;
				}
			}
		}
		fieldsPartenza[10].setText(Integer.toString(tempoStimato));
		
		schermataPartenza.setVisible(true);
	}
	

	/**
	 * Metodo che permette di settare e mostrare lo slot per il tempo effettivo e stimato
	 * @param pannelloTempo il pannello che contiene tutto
	 * @param groupTempo il gruppo di pulsanti che rendono visibile il pannello e attivano questa funziome
	 * @param fieldTratta 
	 * @param headersTempo
	 * @param fieldsTempo
	 * @param checksCode
	 */
	public void showAndSetTempo(JPanel pannelloTempo, ButtonGroup groupTempo, JTextField fieldTratta, JPanel[] headersTempo, JTextField[][] fieldsTempo, JCheckBox[] checksCode, String terminalGate) {
		int indexButtons = 0;
		int numPrenotazioni = 0;
		int tempoStimatoGiornalieroH = 0;
		int tempoStimatoGiornalieroM = 0;
		int tempoStimatoSettimanaleH = 0;
		int tempoStimatoSettimanaleM = 0;
		int tempoStimatoMensileH = 0;
		int tempoStimatoMensileM = 0;
		int tempoEffettivoGiornalieroH = 0;
		int tempoEffettivoGiornalieroM = 0;
		int tempoEffettivoSettimanaleH = 0;
		int tempoEffettivoSettimanaleM = 0;
		int tempoEffettivoMensileH = 0;
		int tempoEffettivoMensileM = 0;
		int ritardo = 0;
		String prenotazioniChar = null;
		char[] fieldTrattaChar = fieldTratta.getText().toCharArray();
		List<Tratta> tratte = new ArrayList<Tratta>();
		List<Tratta> trattePartite = new ArrayList<Tratta>();
		tratte = trattaDao.getTratte();
		trattePartite = trattaDao.getTrattePartite();
		
		try {
			for(; fieldTrattaChar[indexButtons] != '['; indexButtons++);
			for(indexButtons+=1; fieldTrattaChar[indexButtons] != ']'; indexButtons++) {
				if(prenotazioniChar==null) {
					prenotazioniChar = Character.toString(fieldTrattaChar[indexButtons]);	
				} else 
					prenotazioniChar += fieldTrattaChar[indexButtons];
			}
			numPrenotazioni = Integer.parseInt(prenotazioniChar);
		} catch (ArrayIndexOutOfBoundsException e) {
			return;
		}

		for(int indexCode=0; indexCode < checksCode.length; indexCode++) {
			if (checksCode[indexCode].isSelected()) {
				switch(indexCode) {
					case 0:
						if(numPrenotazioni > 200)
							tempoStimatoGiornalieroM+=120;
						
						if(numPrenotazioni >= 150 && numPrenotazioni < 200)
							tempoStimatoGiornalieroM+=90;
						
						if(numPrenotazioni <150)
							tempoStimatoGiornalieroM+=60;
						
						break;
						
					case 1:
						if(numPrenotazioni > 200)
							tempoStimatoGiornalieroM+=40;
						
						if(numPrenotazioni >= 150 && numPrenotazioni < 200)
							tempoStimatoGiornalieroM+=25;
						
						if(numPrenotazioni <150)
							tempoStimatoGiornalieroM+=20;
						
						break;
						
					case 2:
						if(numPrenotazioni > 200)
							tempoStimatoGiornalieroM+=45;
						
						if(numPrenotazioni >= 150 && numPrenotazioni < 200)
							tempoStimatoGiornalieroM+=30;
						
						if(numPrenotazioni <150)
							tempoStimatoGiornalieroM+=20;
						
						break;
				}
			}
		}
		
		switch(terminalGate) {
		case "T1A1":
			for(int index = 0; index<headersTempo.length; index++) {
				  if(index!=0)
					  headersTempo[index].setVisible(false);
				  else headersTempo[index].setVisible(true);
			  }
			for(int index =0; index<tratte.size(); index++) {
				if(tratte.get(index).getCittà().equals("Amsterdam")) {
					if(tratte.get(index).getDataPartenza().equals("01/03/21")||tratte.get(index).getDataPartenza().equals("02/03/21")||tratte.get(index).getDataPartenza().equals("03/03/21")||
							tratte.get(index).getDataPartenza().equals("04/03/21")||tratte.get(index).getDataPartenza().equals("05/03/21")||tratte.get(index).getDataPartenza().equals("06/03/21")||
							tratte.get(index).getDataPartenza().equals("07/03/21"))
						tempoStimatoSettimanaleM++;
				}
				tempoStimatoMensileM++;
			}
			tempoStimatoSettimanaleM*=tempoStimatoGiornalieroM;
			tempoStimatoMensileM*=tempoStimatoGiornalieroM;
			for(int index=0; index<trattePartite.size(); index++) {
				if(trattePartite.get(index).getCittà().equals("Amsterdam")) {
					ritardo += Integer.parseInt(trattaDao.getRitardo(trattePartite.get(index)));
				}
			}
			break;
		case "T1A2":
			for(int index = 0; index<headersTempo.length; index++) {
				  if(index!=1)
					  headersTempo[index].setVisible(false);
				  else headersTempo[index].setVisible(true);
			  }
			for(int index = 0; index<tratte.size(); index++) {
				if(tratte.get(index).getCittà().equals("Atene")) {
					if(tratte.get(index).getDataPartenza().equals("01/03/21")||tratte.get(index).getDataPartenza().equals("02/03/21")||tratte.get(index).getDataPartenza().equals("03/03/21")||
							tratte.get(index).getDataPartenza().equals("04/03/21")||tratte.get(index).getDataPartenza().equals("05/03/21")||tratte.get(index).getDataPartenza().equals("06/03/21")||
							tratte.get(index).getDataPartenza().equals("07/03/21"))
						tempoStimatoSettimanaleM++;
				}
				tempoStimatoMensileM++;
			}
			tempoStimatoSettimanaleM*=tempoStimatoGiornalieroM;
			tempoStimatoMensileM*=tempoStimatoGiornalieroM;
			for(int index=0; index<trattePartite.size(); index++) {
				if(tratte.get(index).getCittà().equals("Atene")) {
					ritardo += Integer.parseInt(trattaDao.getRitardo(trattePartite.get(index)));
				}
			}
			break;
		case "T1A3":
			for(int index = 0; index<headersTempo.length; index++) {
				  if(index!=2)
					  headersTempo[index].setVisible(false);
				  else headersTempo[index].setVisible(true);
			  }
			for(int index =0; index<tratte.size(); index++) {
				if(tratte.get(index).getCittà().equals("Barcellona")) {
					if(tratte.get(index).getDataPartenza().equals("01/03/21")||tratte.get(index).getDataPartenza().equals("02/03/21")||tratte.get(index).getDataPartenza().equals("03/03/21")||
							tratte.get(index).getDataPartenza().equals("04/03/21")||tratte.get(index).getDataPartenza().equals("05/03/21")||tratte.get(index).getDataPartenza().equals("06/03/21")||
							tratte.get(index).getDataPartenza().equals("07/03/21"))
						tempoStimatoSettimanaleM++;
				}
				tempoStimatoMensileM++;
			}
			tempoStimatoSettimanaleM*=tempoStimatoGiornalieroM;
			tempoStimatoMensileM*=tempoStimatoGiornalieroM;
			for(int index=0; index<trattePartite.size(); index++) {
				if(tratte.get(index).getCittà().equals("Barcellona")) {
					ritardo += Integer.parseInt(trattaDao.getRitardo(trattePartite.get(index)));
				}
			}
			break;
		case "T1A4":
			for(int index = 0; index<headersTempo.length; index++) {
				  if(index!=3)
					  headersTempo[index].setVisible(false);
				  else headersTempo[index].setVisible(true);
			  }
			for(int index =0; index<tratte.size(); index++) {
				if(tratte.get(index).getCittà().equals("Berlino")) {
					if(tratte.get(index).getDataPartenza().equals("01/03/21")||tratte.get(index).getDataPartenza().equals("02/03/21")||tratte.get(index).getDataPartenza().equals("03/03/21")||
							tratte.get(index).getDataPartenza().equals("04/03/21")||tratte.get(index).getDataPartenza().equals("05/03/21")||tratte.get(index).getDataPartenza().equals("06/03/21")||
							tratte.get(index).getDataPartenza().equals("07/03/21"))
						tempoStimatoSettimanaleM++;
				}
				tempoStimatoMensileM++;
			}
			tempoStimatoSettimanaleM*=tempoStimatoGiornalieroM;
			tempoStimatoMensileM*=tempoStimatoGiornalieroM;
			for(int index=0; index<trattePartite.size(); index++) {
				if(tratte.get(index).getCittà().equals("Berlino")) {
					ritardo += Integer.parseInt(trattaDao.getRitardo(trattePartite.get(index)));
				}
			}
			break;
		case "T2A1":
			for(int index = 0; index<headersTempo.length; index++) {
				  if(index!=4)
					  headersTempo[index].setVisible(false);
				  else headersTempo[index].setVisible(true);
			  }
			for(int index =0; index<tratte.size(); index++) {
				if(tratte.get(index).getCittà().equals("Bruxelles")) {
					if(tratte.get(index).getDataPartenza().equals("01/03/21")||tratte.get(index).getDataPartenza().equals("02/03/21")||tratte.get(index).getDataPartenza().equals("03/03/21")||
							tratte.get(index).getDataPartenza().equals("04/03/21")||tratte.get(index).getDataPartenza().equals("05/03/21")||tratte.get(index).getDataPartenza().equals("06/03/21")||
							tratte.get(index).getDataPartenza().equals("07/03/21"))
						tempoStimatoSettimanaleM++;
				}
				tempoStimatoMensileM++;
			}
			tempoStimatoSettimanaleM*=tempoStimatoGiornalieroM;
			tempoStimatoMensileM*=tempoStimatoGiornalieroM;
			for(int index=0; index<trattePartite.size(); index++) {
				if(tratte.get(index).getCittà().equals("Bruxelles")) {
					ritardo += Integer.parseInt(trattaDao.getRitardo(trattePartite.get(index)));
				}
			}
			break;
		case "T2A2":
			for(int index = 0; index<headersTempo.length; index++) {
				  if(index!=5)
					  headersTempo[index].setVisible(false);
				  else headersTempo[index].setVisible(true);
			  }
			for(int index =0; index<tratte.size(); index++) {
				if(tratte.get(index).getCittà().equals("Cagliari")) {
					if(tratte.get(index).getDataPartenza().equals("01/03/21")||tratte.get(index).getDataPartenza().equals("02/03/21")||tratte.get(index).getDataPartenza().equals("03/03/21")||
							tratte.get(index).getDataPartenza().equals("04/03/21")||tratte.get(index).getDataPartenza().equals("05/03/21")||tratte.get(index).getDataPartenza().equals("06/03/21")||
							tratte.get(index).getDataPartenza().equals("07/03/21"))
						tempoStimatoSettimanaleM++;
				}
				tempoStimatoMensileM++;
			}
			tempoStimatoSettimanaleM*=tempoStimatoGiornalieroM;
			tempoStimatoMensileM*=tempoStimatoGiornalieroM;
			for(int index=0; index<trattePartite.size(); index++) {
				if(tratte.get(index).getCittà().equals("Cagliari")) {
					ritardo += Integer.parseInt(trattaDao.getRitardo(trattePartite.get(index)));
				}
			}
			break;
		case "T2A3":
			for(int index = 0; index<headersTempo.length; index++) {
				  if(index!=6)
					  headersTempo[index].setVisible(false);
				  else headersTempo[index].setVisible(true);
			  }
			for(int index =0; index<tratte.size(); index++) {
				if(tratte.get(index).getCittà().equals("Catania")) {
					if(tratte.get(index).getDataPartenza().equals("01/03/21")||tratte.get(index).getDataPartenza().equals("02/03/21")||tratte.get(index).getDataPartenza().equals("03/03/21")||
							tratte.get(index).getDataPartenza().equals("04/03/21")||tratte.get(index).getDataPartenza().equals("05/03/21")||tratte.get(index).getDataPartenza().equals("06/03/21")||
							tratte.get(index).getDataPartenza().equals("07/03/21"))
						tempoStimatoSettimanaleM++;
				}
				tempoStimatoMensileM++;
			}
			tempoStimatoSettimanaleM*=tempoStimatoGiornalieroM;
			tempoStimatoMensileM*=tempoStimatoGiornalieroM;
			for(int index=0; index<trattePartite.size(); index++) {
				if(tratte.get(index).getCittà().equals("Catania")) {
					ritardo += Integer.parseInt(trattaDao.getRitardo(trattePartite.get(index)));
				}
			}
			break;
		case "T2A4":
			for(int index = 0; index<headersTempo.length; index++) {
				  if(index!=7)
					  headersTempo[index].setVisible(false);
				  else headersTempo[index].setVisible(true);
			  }
			for(int index =0; index<tratte.size(); index++) {
				if(tratte.get(index).getCittà().equals("Cracovia")) {
					if(tratte.get(index).getDataPartenza().equals("01/03/21")||tratte.get(index).getDataPartenza().equals("02/03/21")||tratte.get(index).getDataPartenza().equals("03/03/21")||
							tratte.get(index).getDataPartenza().equals("04/03/21")||tratte.get(index).getDataPartenza().equals("05/03/21")||tratte.get(index).getDataPartenza().equals("06/03/21")||
							tratte.get(index).getDataPartenza().equals("07/03/21"))
						tempoStimatoSettimanaleM++;
				}
				tempoStimatoMensileM++;
			}
			tempoStimatoSettimanaleM*=tempoStimatoGiornalieroM;
			tempoStimatoMensileM*=tempoStimatoGiornalieroM;
			for(int index=0; index<trattePartite.size(); index++) {
				if(tratte.get(index).getCittà().equals("Cracovia")) {
					ritardo += Integer.parseInt(trattaDao.getRitardo(trattePartite.get(index)));
				}
			}
			break;
		case "T3A1":
			for(int index = 0; index<headersTempo.length; index++) {
				  if(index!=8)
					  headersTempo[index].setVisible(false);
				  else headersTempo[index].setVisible(true);
			  }
			for(int index =0; index<tratte.size(); index++) {
				if(tratte.get(index).getCittà().equals("Dubai")) {
					if(tratte.get(index).getDataPartenza().equals("01/03/21")||tratte.get(index).getDataPartenza().equals("02/03/21")||tratte.get(index).getDataPartenza().equals("03/03/21")||
							tratte.get(index).getDataPartenza().equals("04/03/21")||tratte.get(index).getDataPartenza().equals("05/03/21")||tratte.get(index).getDataPartenza().equals("06/03/21")||
							tratte.get(index).getDataPartenza().equals("07/03/21"))
						tempoStimatoSettimanaleM++;
				}
				tempoStimatoMensileM++;
			}
			tempoStimatoSettimanaleM*=tempoStimatoGiornalieroM;
			tempoStimatoMensileM*=tempoStimatoGiornalieroM;
			for(int index=0; index<trattePartite.size(); index++) {
				if(tratte.get(index).getCittà().equals("Dubai")) {
					ritardo += Integer.parseInt(trattaDao.getRitardo(trattePartite.get(index)));
				}
			}
			break;
		case "T3A2":
			for(int index = 0; index<headersTempo.length; index++) {
				  if(index!=9)
					  headersTempo[index].setVisible(false);
				  else headersTempo[index].setVisible(true);
			  }
			for(int index =0; index<tratte.size(); index++) {
				if(tratte.get(index).getCittà().equals("Genova")) {
					if(tratte.get(index).getDataPartenza().equals("01/03/21")||tratte.get(index).getDataPartenza().equals("02/03/21")||tratte.get(index).getDataPartenza().equals("03/03/21")||
							tratte.get(index).getDataPartenza().equals("04/03/21")||tratte.get(index).getDataPartenza().equals("05/03/21")||tratte.get(index).getDataPartenza().equals("06/03/21")||
							tratte.get(index).getDataPartenza().equals("07/03/21"))
						tempoStimatoSettimanaleM++;
				}
				tempoStimatoMensileM++;
			}
			tempoStimatoSettimanaleM*=tempoStimatoGiornalieroM;
			tempoStimatoMensileM*=tempoStimatoGiornalieroM;
			for(int index=0; index<trattePartite.size(); index++) {
				if(tratte.get(index).getCittà().equals("Genova")) {
					ritardo += Integer.parseInt(trattaDao.getRitardo(trattePartite.get(index)));
				}
			}
			break;
		case "T3A3":
			for(int index = 0; index<headersTempo.length; index++) {
				  if(index!=10)
					  headersTempo[index].setVisible(false);
				  else headersTempo[index].setVisible(true);
			  }
			for(int index =0; index<tratte.size(); index++) {
				if(tratte.get(index).getCittà().equals("Roma")) {
					if(tratte.get(index).getDataPartenza().equals("01/03/21")||tratte.get(index).getDataPartenza().equals("02/03/21")||tratte.get(index).getDataPartenza().equals("03/03/21")||
							tratte.get(index).getDataPartenza().equals("04/03/21")||tratte.get(index).getDataPartenza().equals("05/03/21")||tratte.get(index).getDataPartenza().equals("06/03/21")||
							tratte.get(index).getDataPartenza().equals("07/03/21"))
						tempoStimatoSettimanaleM++;
				}
				tempoStimatoMensileM++;
			}
			tempoStimatoSettimanaleM*=tempoStimatoGiornalieroM;
			tempoStimatoMensileM*=tempoStimatoGiornalieroM;
			for(int index=0; index<trattePartite.size(); index++) {
				if(tratte.get(index).getCittà().equals("Roma")) {
					ritardo += Integer.parseInt(trattaDao.getRitardo(trattePartite.get(index)));
				}
			}
			break;
		case "T3A4":
			for(int index = 0; index<headersTempo.length; index++) {
				  if(index!=11)
					  headersTempo[index].setVisible(false);
				  else headersTempo[index].setVisible(true);
			  }
			for(int index =0; index<tratte.size(); index++) {
				if(tratte.get(index).getCittà().equals("Londra")) {
					if(tratte.get(index).getDataPartenza().equals("01/03/21")||tratte.get(index).getDataPartenza().equals("02/03/21")||tratte.get(index).getDataPartenza().equals("03/03/21")||
							tratte.get(index).getDataPartenza().equals("04/03/21")||tratte.get(index).getDataPartenza().equals("05/03/21")||tratte.get(index).getDataPartenza().equals("06/03/21")||
							tratte.get(index).getDataPartenza().equals("07/03/21"))
						tempoStimatoSettimanaleM++;
				}
				tempoStimatoMensileM++;
			}
			tempoStimatoSettimanaleM*=tempoStimatoGiornalieroM;
			tempoStimatoMensileM*=tempoStimatoGiornalieroM;
			for(int index=0; index<trattePartite.size(); index++) {
				if(tratte.get(index).getCittà().equals("Londra")) {
					ritardo += Integer.parseInt(trattaDao.getRitardo(trattePartite.get(index)));
				}
			}
			break;
		case "T4A1":
			for(int index = 0; index<headersTempo.length; index++) {
				  if(index!=12)
					  headersTempo[index].setVisible(false);
				  else headersTempo[index].setVisible(true);
			  }
			for(int index =0; index<tratte.size(); index++) {
				if(tratte.get(index).getCittà().equals("Torino")) {
					if(tratte.get(index).getDataPartenza().equals("01/03/21")||tratte.get(index).getDataPartenza().equals("02/03/21")||tratte.get(index).getDataPartenza().equals("03/03/21")||
							tratte.get(index).getDataPartenza().equals("04/03/21")||tratte.get(index).getDataPartenza().equals("05/03/21")||tratte.get(index).getDataPartenza().equals("06/03/21")||
							tratte.get(index).getDataPartenza().equals("07/03/21"))
						tempoStimatoSettimanaleM++;
				}
				tempoStimatoMensileM++;
			}
			tempoStimatoSettimanaleM*=tempoStimatoGiornalieroM;
			tempoStimatoMensileM*=tempoStimatoGiornalieroM;
			for(int index=0; index<trattePartite.size(); index++) {
				if(tratte.get(index).getCittà().equals("Torino")) {
					ritardo += Integer.parseInt(trattaDao.getRitardo(trattePartite.get(index)));
				}
			}
			break;
		case "T4A2":
			for(int index = 0; index<headersTempo.length; index++) {
				  if(index!=13)
					  headersTempo[index].setVisible(false);
				  else headersTempo[index].setVisible(true);
			  }
			for(int index =0; index<tratte.size(); index++) {
				if(tratte.get(index).getCittà().equals("Trieste")) {
					if(tratte.get(index).getDataPartenza().equals("01/03/21")||tratte.get(index).getDataPartenza().equals("02/03/21")||tratte.get(index).getDataPartenza().equals("03/03/21")||
							tratte.get(index).getDataPartenza().equals("04/03/21")||tratte.get(index).getDataPartenza().equals("05/03/21")||tratte.get(index).getDataPartenza().equals("06/03/21")||
							tratte.get(index).getDataPartenza().equals("07/03/21"))
						tempoStimatoSettimanaleM++;
				}
				tempoStimatoMensileM++;
			}
			tempoStimatoSettimanaleM*=tempoStimatoGiornalieroM;
			tempoStimatoMensileM*=tempoStimatoGiornalieroM;
			for(int index=0; index<trattePartite.size(); index++) {
				if(tratte.get(index).getCittà().equals("Trieste")) {
					ritardo += Integer.parseInt(trattaDao.getRitardo(trattePartite.get(index)));
				}
			}
			break;
		case "T4A3":
			for(int index = 0; index<headersTempo.length; index++) {
				  if(index!=14)
					  headersTempo[index].setVisible(false);
				  else headersTempo[index].setVisible(true);
			  }
			for(int index =0; index<tratte.size(); index++) {
				if(tratte.get(index).getCittà().equals("Venezia")) {
					if(tratte.get(index).getDataPartenza().equals("01/03/21")||tratte.get(index).getDataPartenza().equals("02/03/21")||tratte.get(index).getDataPartenza().equals("03/03/21")||
							tratte.get(index).getDataPartenza().equals("04/03/21")||tratte.get(index).getDataPartenza().equals("05/03/21")||tratte.get(index).getDataPartenza().equals("06/03/21")||
							tratte.get(index).getDataPartenza().equals("07/03/21"))
						tempoStimatoSettimanaleM++;
					
				}
				tempoStimatoMensileM++;
			}
			tempoStimatoSettimanaleM*=tempoStimatoGiornalieroM;
			tempoStimatoMensileM*=tempoStimatoGiornalieroM;
			for(int index=0; index<trattePartite.size(); index++) {
				if(tratte.get(index).getCittà().equals("Venezia")) {
					ritardo += Integer.parseInt(trattaDao.getRitardo(trattePartite.get(index)));
				}
			}
			break;
		case "T4A4":
			for(int index = 0; index<headersTempo.length; index++) {
				  if(index!=15)
					  headersTempo[index].setVisible(false);
				  else headersTempo[index].setVisible(true);
			  }
			for(int index =0; index<tratte.size(); index++) {
				if(tratte.get(index).getCittà().equals("Milano")) {
					if(tratte.get(index).getDataPartenza().equals("01/03/21")||tratte.get(index).getDataPartenza().equals("02/03/21")||tratte.get(index).getDataPartenza().equals("03/03/21")||
							tratte.get(index).getDataPartenza().equals("04/03/21")||tratte.get(index).getDataPartenza().equals("05/03/21")||tratte.get(index).getDataPartenza().equals("06/03/21")||
							tratte.get(index).getDataPartenza().equals("07/03/21"))
						tempoStimatoSettimanaleM++;
				}
				tempoStimatoMensileM++;
			}
			tempoStimatoSettimanaleM*=tempoStimatoGiornalieroM;
			tempoStimatoMensileM*=tempoStimatoGiornalieroM;
			for(int index=0; index<trattePartite.size(); index++) {
				if(tratte.get(index).getCittà().equals("Milano")) {
					ritardo += Integer.parseInt(trattaDao.getRitardo(trattePartite.get(index)));
				}
			}
			break;
	}
		System.out.println(ritardo);
		
		tempoEffettivoGiornalieroM= ritardo + tempoStimatoGiornalieroM;
		tempoEffettivoSettimanaleM= ritardo + tempoStimatoSettimanaleM;
		tempoEffettivoMensileM= ritardo + tempoStimatoMensileM;
		
		tempoStimatoGiornalieroH=tempoStimatoGiornalieroM/ 60;
		tempoStimatoGiornalieroM=tempoStimatoGiornalieroM % 60;
		
		tempoStimatoSettimanaleH=tempoStimatoSettimanaleM/ 60;
		tempoStimatoSettimanaleM=tempoStimatoSettimanaleM % 60;
		
		tempoStimatoMensileH=tempoStimatoMensileM/ 60;
		tempoStimatoMensileM=tempoStimatoMensileM % 60;
		
		tempoEffettivoGiornalieroH=tempoEffettivoGiornalieroM/ 60;
		tempoEffettivoGiornalieroM=tempoEffettivoGiornalieroM % 60;
		
		tempoEffettivoSettimanaleH=tempoEffettivoSettimanaleM/ 60;
		tempoEffettivoSettimanaleM=tempoEffettivoSettimanaleM % 60;
		
		tempoEffettivoMensileH=tempoEffettivoMensileM/ 60;
		tempoEffettivoMensileM=tempoEffettivoMensileM % 60;
		
		fieldsTempo[0][0].setText(tempoStimatoGiornalieroH+"h "+tempoStimatoGiornalieroM+"m");
		fieldsTempo[0][1].setText(tempoStimatoSettimanaleH+"h "+tempoStimatoSettimanaleM+"m");
		fieldsTempo[0][2].setText(tempoStimatoMensileH+"h "+tempoStimatoMensileM+"m");
			
		fieldsTempo[1][0].setText(tempoEffettivoGiornalieroH+"h "+tempoEffettivoGiornalieroM+"m");
		fieldsTempo[1][1].setText(tempoEffettivoSettimanaleH+"h "+tempoEffettivoSettimanaleM+"m");
		fieldsTempo[1][2].setText(tempoEffettivoMensileH+"h "+tempoEffettivoMensileM+"m");
		
		if(!pannelloTempo.isVisible()) {
			pannelloTempo.setVisible(true);
		}
	}
	
	/**
	 * Metodo per far partire un volo 
	 * @param fieldsTratte i fields da cui prendere i dati della tratta
	 * @param schermataPartenza la schermata che mostra i dati e che va chiusa
	 */
	public void partenza(JTextField[] fieldsTratte, JInternalFrame schermataPartenza) {
		int ritardo;
		Tratta tratta = new Tratta();
		Gate gate = new Gate();
		
		tratta.setCittà(fieldsTratte[0].getText());
		
		tratta.setNumPrenotazioni(Integer.parseInt(fieldsTratte[5].getText()));
		
		tratta.setOrarioPartenza(fieldsTratte[1].getText());
		
		tratta.setOrarioArrivo(fieldsTratte[2].getText());
		
		tratta.setDataPartenza(fieldsTratte[3].getText());
	
		tratta.setDataArrivo(fieldsTratte[4].getText());
		
		gate.setTerminale(fieldsTratte[8].getText());
		
		gate.setNumeroGate(fieldsTratte[9].getText());
		
		gateDao.updateGate(gate, null);
		
		try {
			if(!fieldsTratte[11].getText().equals(null)) {
				ritardo= Integer.parseInt(fieldsTratte[11].getText())-Integer.parseInt(fieldsTratte[10].getText());
				trattaDao.updateRitardo(tratta, String.valueOf(ritardo));
			}else {
				trattaDao.updateRitardo(tratta, "no");
			}
		}catch(NumberFormatException e){
			return;
		}
		
		trattaDao.updateTratta(tratta, "partito");
		schermataPartenza.setVisible(false);
	}
	
	/**
	 * Metodo che riempie la JTable
	 * @param tableRicerca la JTable da riempire
	 * @param tableDatiRicerca la defaultTableModel che riempie la JTable
	 * @param boxDestinazione la ComboBox in cui si seleziona la destinazione
	 * @param boxGate la ComboBox in cui si seleziona il gate
	 * @param boxCompagnie la ComboBox in cui si selezionano le compagnie
	 */
	public void fillTable(JTable tableRicerca, DefaultTableModel tableDatiRicerca, JComboBox<String> boxDestinazione, JComboBox<String> boxGate, JComboBox<String> boxCompagnie) {
		tableDatiRicerca.setRowCount(0);
		List<String[]> listaTratte = new ArrayList<String[]>();
		String città = null;
		String compagnia = null;
		String gateString = null;
		String terminaleString = null;
		
		
		switch(boxDestinazione.getSelectedItem().toString()) {
		case "Amsterdam":
			città = "Amsterdam";
			break;
		case "Atene":
			città = "Atene";
			break;
		case "Barcellona":
			città = "Barcellona";
			break;
		case "Berlino":
			città = "Berlino";
			break;
		case "Bruxelles":
			città = "Bruxelles";
			break;
		case "Cagliari":
			città = "Cagliari";
			break;
		case "Catania":
			città = "Catania";
			break;
		case "Cracovia":
			città = "Cracovia";
			break;
		case "Dubai":
			città = "Dubai";
			break;
		case "Genova":
			città = "Genova";
			break;
		case "Roma":
			città = "Roma";
			break;
		case "Londra":
			città = "Londra";
			break;
		case "Torino":
			città = "Torino";
			break;
		case "Trieste":
			città = "Trieste";
			break;
		case "Venezia":
			città = "Venezia";
			break;
		case "Milano":
			città = "Milano";
			break;
		
		}
		
		switch(boxGate.getSelectedItem().toString()) {
			case "T1 - A1":
				terminaleString = "T1";
				gateString = "A1";
				break;
			case "T1 - A2":
				terminaleString = "T1";
				gateString = "A2";
				break;
			case "T1 - A3":
				terminaleString = "T1";
				gateString = "A3";
				break;
			case "T1 - A4":
				terminaleString = "T1";
				gateString = "A4";
				break;
			case "T2 - A1":
				terminaleString = "T2";
				gateString = "A1";
				break;
			case "T2 - A2":
				terminaleString = "T2";
				gateString = "A2";
				break;
			case "T2 - A3":
				terminaleString = "T2";
				gateString = "A3";
				break;
			case "T2 - A4":
				terminaleString = "T2";
				gateString = "A4";
				break;
			case "T3 - A1":
				terminaleString = "T3";
				gateString = "A1";
				break;
			case "T3 - A2":
				terminaleString = "T3";
				gateString = "A2";
				break;
			case "T3 - A3":
				terminaleString = "T3";
				gateString = "A3";
				break;
			case "T3 - A4":
				terminaleString = "T3";
				gateString = "A4";
				break;
			case "T4 - A1":
				terminaleString = "T4";
				gateString = "A1";
				break;
			case "T4 - A2":
				terminaleString = "T4";
				gateString = "A2";
				break;
			case "T4 - A3":
				terminaleString = "T4";
				gateString = "A3";
				break;
			case "T4 - A4":
				terminaleString = "T4";
				gateString = "A4";
				break;
		}
		
		switch(boxCompagnie.getSelectedItem().toString()) {
		case "Ryanair":
			compagnia = "Ryanair";
			break;
		case "Eurowings":
			compagnia = "Eurowings";
			break;
		case "Volotea":
			compagnia = "Volotea";
			break;
		case "Alitalia":
			compagnia = "AlitaliaA";
			break;
		case "EasyJet":
			compagnia = "EasyJet";
			break;
		}
		
		System.out.println(città);
		System.out.println(terminaleString);
		System.out.println(gateString);
		System.out.println(compagnia);
		listaTratte = trattaDao.ricerca(città, terminaleString, gateString, compagnia);
		
		for(int indexTratte=0; indexTratte<listaTratte.size(); indexTratte++) {
			 String[] strings = listaTratte.get(indexTratte);
				tableDatiRicerca.insertRow(tableDatiRicerca.getRowCount(), new Object[] {strings[0].toString(), strings[1].toString(),strings[2].toString(),strings[3].toString(),strings[4].toString(),
						strings[5].toString(),strings[6].toString(),strings[7].toString(),strings[8].toString(),strings[9].toString(),strings[10].toString()});
		}
	}
	
}