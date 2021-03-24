package apViews;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.sql.SQLException;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

public class AMain extends JFrame {
	private static JLayeredPane Tratte;
	private static JButton PulsanteAereo;
	private static JLayeredPane Main;
	private static JButton PulsanteGate;
	private static JButton PulsanteInfo;
	private static JButton ShowCompagnie;
	private static JButton ShowMappa;
	private static JLayeredPane Gate;
	private static JLayeredPane Info;
	private static JLayeredPane Mappa;
	private static JLayeredPane Compagnie;
	private static JLabel OmbraHeaderGate;
	private static JButton PulsanteHomeVolo;
	private static JPanel PannelloRimuovi;
	private static JButton PulsanteHomeGate;
	private static JLayeredPane GiorniAggiungiTratta;
	private static JLayeredPane MarzoHeader;
	private static JTextField fieldDataAggiungi;
	private static JInternalFrame Calendario;
	private static JButton selectDataAggiungi;
	private static JButton[] buttons;
	private static JCheckBox[] checkBoxesTratte;
	private static JComboBox[] boxes;
	private static JTextField[] fields;
	private static JComboBox<String> boxDestinazioneAggiungi;
	private static Controller theController;
	private static JTextField fieldPrenotazioniAggiungi;
	private static JTextField FieldDataPartenza;
	private static TextArea ListaTratte;
	private static JTextField FieldDataArrivo;
	private static JLayeredPane GiorniRicercaDataArrivo;
	private static JLayeredPane GiorniRicercaDataPartenza;
	private static JTextField fieldT1A1;
	private static JTextField codaFamiglieA1;
	private static JTextField codaDisabiliA1;
	private static JTextField codaPriorirtyA1;
	private static JTextField FieldTempoStimatoGiorno;
	private static JTextField FieldTempoEffettivoGiorno;
	private static JTextField FieldTempoStimatoSettimana;
	private static JTextField FieldTempoEffettivoSettimana;
	private static JTextField FieldTempoStimatoMese;
	private static JTextField FieldTempoEffettivoAnno;
	private static JTextField fieldT1A2;
	private static JTextField codaFamiglieA2;
	private static JTextField codaDisabiliA2;
	private static JTextField codaPriorirtyA2;
	private static JTextField fieldT1A3;
	private static JTextField codaFamiglieA3;
	private static JTextField codaDisabiliA3;
	private static JTextField codaPriorirtyA3;
	private static JTextField fieldT1A4;
	private static JTextField codaFamiglieA4;
	private static JTextField codaDisabiliA4;
	private static JTextField codaPriorirtyA4;
	private static JTextField fieldDataRimuovi;
	private static JPanel PannelloTempo;
	private static JPanel HeaderT1A1;
	private static JPanel HeaderT1A2;
	private static JPanel HeaderT1A3;
	private static JPanel HeaderT1A4;
	private static JCheckBox[] checksT1A1;
	private static JCheckBox[] checksT1A2;
	private static JCheckBox[] checksT1A3;
	private static JCheckBox[] checksT1A4;
	private static JLayeredPane GiorniRimuoviTratta;
	private static JLabel[] warnings;
	private static JTextField fieldDPartenza;
	private static JTextField fieldOPPartenza;
	private static JTextField fieldOAPartenza;
	private static JTextField fieldDPPartenza;
	private static JTextField fieldDAPartenza;
	private static JTextField fieldPPartenza;
	private static JTextField fieldCAPartenza;
	private static JTextField fieldCPartenza;
	private static JTextField fieldTPartenza;
	private static JPanel pannelloTextFVEU;
	private static JLabel durataGenA;
	private static JPanel pannelloInfoTextVETEA;
	private static JTextArea[] areaTratteCompagnie;
	private static JLayeredPane Ricerca;
	private static JTable table;
	private static JTextField[] fieldsTratte;
	private static JPanel pannelloT1A2;
	private static JTextField fieldT2A1;
	private static JTextField codaDisabiliT2A1;
	private static JTextField codaPriorityT2A1;
	private static JTextField fieldT2A2;
	private static JTextField codaDisabiliT2A2;
	private static JTextField codaPriorityT2A2;
	private static JTextField fieldT2A3;
	private static JTextField codaFamiglieT2A3;
	private static JTextField codaDisabiliT2A3;
	private static JTextField codaPriorityT2A3;
	private static JTextField fieldT2A4;
	private static JTextField codaFamiglieT2A4;
	private static JTextField codaDisabiliT2A4;
	private static JTextField codaPriorityT2A4;
	private static JTextField[] fieldsPartenza;
	private static JTextField fieldGPartenza;
	private static JTextField fieldTIpartenza;
	private static JCheckBox checkCodaFamiglieT1A1;
	private static JCheckBox checkCodaDisabiliT1A1;
	private static JCheckBox checkCodaPriorityT1A1;
	private static JCheckBox checkCodaFamiglieT1A2;
	private static JCheckBox checkCodaDisabiliT1A2;
	private static JCheckBox checkCodaPriorityT1A2;
	private static JCheckBox checkCodaFamiglieT1A3;
	private static JCheckBox checkCodaDisabiliT1A3;
	private static JCheckBox checkCodaPriorityT1A3;
	private static JCheckBox checkCodaFamiglieT1A4;
	private static JCheckBox checkCodaDisabiliT1A4;
	private static JCheckBox checkCodaPriorityT1A4;
	private static JPanel pannelloT2G3;
	private static JTextField fieldT3A1;
	private static JTextField codaFamiglieT3A1;
	private static JTextField codaDisabiliT3A1;
	private static JTextField codaPriorityT3A1;
	private static JTextField fieldT3A2;
	private static JTextField codaFamiglieT3A2;
	private static JTextField codaDisabiliT3A2;
	private static JTextField codaPriorityT3A2;
	private static JTextField fieldT3A3;
	private static JTextField codaFamiglieT3A3;
	private static JTextField codaDisabiliT3A3;
	private static JTextField codaPriorityT3A3;
	private static JTextField fieldT3A4;
	private static JTextField codaFamiglieT3A4;
	private static JTextField codaDisabiliT3A4;
	private static JTextField codaFamiglieT4A1;
	private static JTextField codaDisabiliT4A1;
	private static JTextField codaPriorityT4A1;
	private static JTextField fieldT4A2;
	private static JTextField codaFamiglieT4A2;
	private static JTextField codaDisabiliT4A2;
	private static JTextField codaPriorityT4A2;
	private static JTextField fieldT4A3;
	private static JTextField codaFamiglieT4A3;
	private static JTextField codaDisabiliT4A3;
	private static JTextField codaPriorityT4A3;
	private static JTextField fieldT4A4;
	private static JTextField codaFamiglieT4A4;
	private static JTextField codaDisabiliT4A4;
	private static JTextField codaPriorityT4A4;
	private static JCheckBox[] checksT2A1;
	private static JCheckBox[] checksT2A2;
	private static JCheckBox[] checksT2A3;
	private static JCheckBox[] checksT2A4;
	private static JCheckBox[] checksT3A1;
	private static JCheckBox[] checksT3A2;
	private static JCheckBox[] checksT3A3;
	private static JCheckBox[] checksT3A4;
	private static JCheckBox[] checksT4A1;
	private static JCheckBox[] checksT4A4;
	private static JCheckBox[] checksT4A2;
	private static JCheckBox[] checksT4A3;
	private static JCheckBox checkCodaFamiglieT2A1;
	private static JCheckBox checkCodaFamiglieT2A2;
	private static JCheckBox checkCodaFamiglieT2A3;
	private static JCheckBox checkCodaFamiglieT2A4;
	private static JTextField codaFamiglieT2A2;
	private static JCheckBox checkCodaPriorityT2A1;
	private static JCheckBox checkCodaDisabiliT2A2;
	private static JCheckBox checkCodaPriorityT2A2;
	private static JCheckBox checkCodaPriorityT2A3;
	private static JCheckBox checkCodaDisabiliT2A4;
	private static JCheckBox checkCodaPriorityT2A4;
	private static JCheckBox checkCodaFamiglieT3A1;
	private static JCheckBox checkCodaDisabiliT3A1;
	private static JCheckBox checkCodaPriorityT3A1;
	private static JCheckBox checkCodaFamiglieT3A2;
	private static JCheckBox checkCodaPriorityT3A2;
	private static JCheckBox checkCodaFamiglieT3A3;
	private static JCheckBox checkCodaPriorityT3A3;
	private static JCheckBox checkCodaFamiglieT3A4;
	private static JCheckBox checkCodaDisabiliT3A4;
	private static JCheckBox checkCodaPriorityT3A4;
	private static JCheckBox checkCodaDisabiliT2A1;
	private static JCheckBox checkCodaDisabiliT2A3;
	private static JCheckBox checkCodaDisabiliT3A3;
	private static JCheckBox checkCodaDisabiliT4A1;
	private static JCheckBox checkCodaDisabiliT4A2;
	private static JCheckBox checkCodaDisabiliT4A3;
	private static JCheckBox checkCodaDisabiliT4A4;
	private static JCheckBox checkCodaDisabiliT3A2;
	private static JCheckBox checkCodaFamiglieT4A1;
	private static JCheckBox checkCodaFamiglieT4A2;
	private static JCheckBox checkCodaFamiglieT4A3;
	private static JCheckBox checkCodaFamiglieT4A4;
	private static JCheckBox checkCodaPriorityT4A1;
	private static JCheckBox checkCodaPriorityT4A2;
	private static JCheckBox checkCodaPriorityT4A3;
	private static JCheckBox checkCodaPriorityT4A4;
	private static JTextField fieldT4A1;
	private static JTextField fieldTEPartenza;
	
	@SuppressWarnings("serial")
	public AMain(Controller c){
		setIconImage(Toolkit.getDefaultToolkit().getImage(AMain.class.getResource("/apResources/Icona_NA.png")));
		theController = c;
		JButton[] pulsantiMesiPartenza = new JButton[31];
		JButton[] pulsantiMesiArrivo = new JButton[31];
		JButton[] pulsantiMesiRimuovi = new JButton[31];
		DefaultTableModel tableRisultatiRicerca = new DefaultTableModel();
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		setTitle("Aeroporto di Napoli - Federico II");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 750);
		setResizable(false);
		getContentPane().setBackground(new Color(13, 62, 117));
		JPanel Header = new JPanel();
		Header.setBackground(new Color(13, 62, 117));
		
		JLabel ImmagineHeader = new JLabel("");
		ImmagineHeader.setIcon(new ImageIcon(AMain.class.getResource("/apResources/HeaderAeroporto.png")));
		

		Panel BodyContainer = new Panel();
		BodyContainer.setLayout(new CardLayout(0, 0));
		

		Main = new JLayeredPane();
		BodyContainer.add(Main);
		
		
		PulsanteInfo = new JButton("");
		PulsanteInfo.setBounds(659, 112, 85, 90);
		PulsanteInfo.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconInfo.png")));
		PulsanteInfo.setOpaque(false);
		PulsanteInfo.setFocusable(false);
		PulsanteInfo.setContentAreaFilled(false);
		PulsanteInfo.setBorderPainted(false);
		PulsanteInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.switchPanel(Main, Info);
			}
		});
		Main.setLayout(null);
		
		JComboBox<String> boxGate = new JComboBox<String>();
		boxGate.setModel(new DefaultComboBoxModel<String>(new String[] {"T1 - A1", "T1 - A2", "T1 - A3", "T1 - A4", "T2 - A1", "T2 - A2", "T2 - A3", "T2 - A4", "T3 - A1", "T3 - A2", "T3 - A3", "T3 - A4", "T4 - A1", "T4 - A2", "T4 - A3", "T4 - A4", "Qualsiasi"}));
		boxGate.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		boxGate.setBounds(439, 291, 150, 30);
		Main.add(boxGate);
		
		JLabel labelRicercaGate = new JLabel("Gate");
		labelRicercaGate.setHorizontalAlignment(SwingConstants.CENTER);
		labelRicercaGate.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		labelRicercaGate.setBounds(439, 273, 150, 19);
		Main.add(labelRicercaGate);
		
		JLabel labelRicercaCompagnie = new JLabel("Compagnie");
		labelRicercaCompagnie.setHorizontalAlignment(SwingConstants.CENTER);
		labelRicercaCompagnie.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		labelRicercaCompagnie.setBounds(618, 273, 150, 19);
		Main.add(labelRicercaCompagnie);
		
		JComboBox<String> boxCompagnie = new JComboBox<String>();
		boxCompagnie.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		boxCompagnie.setModel(new DefaultComboBoxModel<String>(new String[] {"Ryanair", "Eurowings", "Volotea", "Easyjet", "Alitalia", "Qualsiasi"}));
		boxCompagnie.setBounds(618, 291, 150, 30);
		Main.add(boxCompagnie);
		
		JComboBox<String> boxDestinazione = new JComboBox<String>();
		boxDestinazione.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		boxDestinazione.setModel(new DefaultComboBoxModel<String>(new String[] {"Amsterdam", "Atene", "Barcellona", "Berlino", "Bruxelles", "Cagliari", "Catania", "Cracovia", "Dubai", "Genova", "Roma", "Londra", "Torino", "Trieste", "Venezia", "Milano", "Qualsiasi"}));
		boxDestinazione.setBounds(260, 291, 150, 30);
		Main.add(boxDestinazione);
		
		JLabel labelRicercaDestinazione = new JLabel("Destinazione");
		labelRicercaDestinazione.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		labelRicercaDestinazione.setHorizontalAlignment(SwingConstants.CENTER);
		labelRicercaDestinazione.setBounds(260, 273, 150, 19);
		Main.add(labelRicercaDestinazione);
		
		JLabel testoPulsanteRicerca = new JLabel("Cerca");
		testoPulsanteRicerca.setBounds(806, 283, 134, 30);
		testoPulsanteRicerca.setHorizontalAlignment(SwingConstants.CENTER);
		testoPulsanteRicerca.setFont(new Font("Lucida Bright", Font.ITALIC, 15));
		testoPulsanteRicerca.setForeground(Color.WHITE);
		Main.add(testoPulsanteRicerca);
		
		JButton pulsanteRicerca = new JButton("");
		pulsanteRicerca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
				theController.fillTable(table, tableRisultatiRicerca, boxDestinazione, boxGate, boxCompagnie);
				theController.switchPanel(Main, Ricerca);
				Main.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			}
		});
		pulsanteRicerca.setBounds(794, 271, 158, 56);
		pulsanteRicerca.setIcon(new ImageIcon(AMain.class.getResource("/apResources/BackgroundPulsante.png")));
		pulsanteRicerca.setOpaque(false);
		pulsanteRicerca.setFocusable(false);
		pulsanteRicerca.setContentAreaFilled(false);
		pulsanteRicerca.setBorderPainted(false);
		Main.add(pulsanteRicerca);
		Main.add(PulsanteInfo);
		
		
		PulsanteGate = new JButton("");
		PulsanteGate.setBounds(439, 112, 85, 90);
		PulsanteGate.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconGate.png")));
		PulsanteGate.setOpaque(false);
		PulsanteGate.setFocusable(false);
		PulsanteGate.setContentAreaFilled(false);
		PulsanteGate.setBorderPainted(false);
		PulsanteGate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.switchPanel(Main, Gate);
			}
		});
		Main.add(PulsanteGate);
		
		
		PulsanteAereo = new JButton("");
		PulsanteAereo.setBounds(543, 112, 92, 103);
		PulsanteAereo.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconAereo.png")));
		PulsanteAereo.setOpaque(false);
		PulsanteAereo.setFocusable(false);
		PulsanteAereo.setContentAreaFilled(false);
		PulsanteAereo.setBorderPainted(false);
		PulsanteAereo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.switchPanel(Main, Tratte);
			}
		});
		Main.add(PulsanteAereo);
		
		
		JLabel MainMenù = new JLabel("");
		MainMenù.setBounds(233, 65, 719, 179);
		MainMenù.setIcon(new ImageIcon(AMain.class.getResource("/apResources/Men\u00F9Sfere.png")));
		MainMenù.setHorizontalAlignment(SwingConstants.CENTER);
		Main.add(MainMenù);
		
		
		JLabel ScrittaCompagnie = new JLabel("Compagnie Aeree");
		ScrittaCompagnie.setBounds(1016, 93, 147, 19);
		ScrittaCompagnie.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 15));
		ScrittaCompagnie.setForeground(Color.DARK_GRAY);
		ScrittaCompagnie.setHorizontalAlignment(SwingConstants.CENTER);
		Main.add(ScrittaCompagnie);
		
		
		JLabel ScrittaMappa = new JLabel("Mappa");
		ScrittaMappa.setBounds(76, 93, 147, 19);
		ScrittaMappa.setForeground(Color.DARK_GRAY);
		ScrittaMappa.setHorizontalAlignment(SwingConstants.CENTER);
		ScrittaMappa.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 15));
		Main.add(ScrittaMappa);
		
		
		ShowCompagnie = new JButton("");
		ShowCompagnie.setBounds(949, 65, 227, 179);
		ShowCompagnie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.switchPanel(Main, Compagnie);
				theController.fillAreaCompagnie(areaTratteCompagnie);
			}
		});
		ShowCompagnie.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconaCompagnie.png")));
		ShowCompagnie.setOpaque(false);
		ShowCompagnie.setFocusable(false);
		ShowCompagnie.setContentAreaFilled(false);
		ShowCompagnie.setBorderPainted(false);
		Main.add(ShowCompagnie);
		
		
		ShowMappa = new JButton("");
		ShowMappa.setBounds(10, 65, 227, 179);
		ShowMappa.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconaMappa.png")));
		ShowMappa.setOpaque(false);
		ShowMappa.setFocusable(false);
		ShowMappa.setContentAreaFilled(false);
		ShowMappa.setBorderPainted(false);
		ShowMappa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.switchPanel(Main, Mappa);
			}
		});	
		Main.add(ShowMappa);
		
		
		JLabel InfoUni = new JLabel("Universit\u00E0 degli Studi di Napoli Federico II - Corso Umberto I 40 - 80138 Napoli - Centralino +39 081 2531111 contactcenter@unina.it - "
										+ "C.F. 00876220633 - PEC ateneo@pec.unina.it");
		InfoUni.setBounds(-7, 514, 1193, 21);
		InfoUni.setHorizontalAlignment(SwingConstants.CENTER);
		InfoUni.setForeground(Color.GRAY);
		InfoUni.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Main.add(InfoUni);
		
		
		JLabel ImmagineFooter = new JLabel("");
		ImmagineFooter.setBounds(-7, 338, 1200, 197);
		ImmagineFooter.setIcon(new ImageIcon(AMain.class.getResource("/apResources/Footer.png")));
		Main.add(ImmagineFooter);
		
		JLabel iconBarraRicerca = new JLabel("");
		iconBarraRicerca.setBounds(10, 255, 1166, 90);
		iconBarraRicerca.setHorizontalAlignment(SwingConstants.CENTER);
		iconBarraRicerca.setIcon(new ImageIcon(AMain.class.getResource("/apResources/BarraRicerca.png")));
		Main.add(iconBarraRicerca);
		
		Tratte = new JLayeredPane();
		BodyContainer.add(Tratte);
		
		
		JPanel PanelTratte = new JPanel();
		PanelTratte.setBackground(new Color(208, 215, 232));
		PanelTratte.setBounds(0, 0, 1193, 535);
		Tratte.add(PanelTratte);
		
		JButton pulsanteCalendarioPartenza = new JButton("");
		pulsanteCalendarioPartenza.setBounds(30, 127, 47, 40);
		pulsanteCalendarioPartenza.setEnabled(false);
		pulsanteCalendarioPartenza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.creaPulsantiCalendario(pulsantiMesiPartenza, GiorniRicercaDataPartenza, FieldDataPartenza, Calendario);
				theController.showCorrectCalendar(GiorniRicercaDataPartenza, GiorniRicercaDataArrivo, GiorniAggiungiTratta, GiorniRimuoviTratta, Calendario);
			}
		});
		PanelTratte.setLayout(null);
		
		JInternalFrame Avviso = new JInternalFrame("Avviso");
		Avviso.setBounds(366, 195, 353, 164);
		Avviso.setFrameIcon(new ImageIcon(AMain.class.getResource("/apResources/IconWarning.png")));
		PanelTratte.add(Avviso);
		Avviso.setClosable(true);
		Avviso.getContentPane().setBackground(new Color(13, 62, 117));
		
		JPanel panel = new JPanel();
		GroupLayout groupLayout_2 = new GroupLayout(Avviso.getContentPane());
		groupLayout_2.setHorizontalGroup(
			groupLayout_2.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout_2.setVerticalGroup(
			groupLayout_2.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout_2.createSequentialGroup()
					.addGap(25)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(24, Short.MAX_VALUE))
		);
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel testoValoreInvalido = new JLabel("- HAI INSERITO VALORI NON VALIDI -");
		panel.add(testoValoreInvalido, "name_77556771634200");
		testoValoreInvalido.setForeground(new Color(13, 62, 117));
		testoValoreInvalido.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 15));
		testoValoreInvalido.setHorizontalAlignment(SwingConstants.CENTER);
		testoValoreInvalido.setHorizontalTextPosition(SwingConstants.CENTER);
		
		JLabel testoOperazioneNonCompletata = new JLabel("- ERRORE NEL CARICAMENTO -");
		testoOperazioneNonCompletata.setHorizontalTextPosition(SwingConstants.CENTER);
		testoOperazioneNonCompletata.setHorizontalAlignment(SwingConstants.CENTER);
		testoOperazioneNonCompletata.setForeground(new Color(13, 62, 117));
		testoOperazioneNonCompletata.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 15));
		panel.add(testoOperazioneNonCompletata, "name_77566833727800");
		
		JLabel testoAggiuntaCompletata = new JLabel("- TRATTA AGGIUNTA CON SUCCESSO -");
		testoAggiuntaCompletata.setHorizontalTextPosition(SwingConstants.CENTER);
		testoAggiuntaCompletata.setHorizontalAlignment(SwingConstants.CENTER);
		testoAggiuntaCompletata.setForeground(new Color(13, 62, 117));
		testoAggiuntaCompletata.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 15));
		panel.add(testoAggiuntaCompletata, "name_80867763682500");
		
		JLabel testoRimozioneCompletata = new JLabel("- TRATTA RIMOSSA CON SUCCESSO -");
		testoRimozioneCompletata.setHorizontalTextPosition(SwingConstants.CENTER);
		testoRimozioneCompletata.setHorizontalAlignment(SwingConstants.CENTER);
		testoRimozioneCompletata.setForeground(new Color(13, 62, 117));
		testoRimozioneCompletata.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 15));
		panel.add(testoRimozioneCompletata, "name_424386941752700");
		Avviso.getContentPane().setLayout(groupLayout_2);
		Avviso.setVisible(false);
		
		warnings = new JLabel[] {testoValoreInvalido, testoOperazioneNonCompletata, testoAggiuntaCompletata, testoRimozioneCompletata};
		
		Calendario = new JInternalFrame("Calendario");
		Calendario.setBounds(366, 195, 393, 326);
		PanelTratte.add(Calendario);
		Calendario.setClosable(true);
		
		Panel HeaderCalendario = new Panel();
		HeaderCalendario.setBackground(new Color(13, 62, 117));
		
		JPanel BodyCalendario = new JPanel();
		
		JPanel GiorniSettimana = new JPanel();
		GroupLayout groupLayout_1 = new GroupLayout(Calendario.getContentPane());
		groupLayout_1.setHorizontalGroup(
			groupLayout_1.createParallelGroup(Alignment.LEADING)
				.addComponent(BodyCalendario, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addComponent(GiorniSettimana, GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
					.addContainerGap())
				.addComponent(HeaderCalendario, GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
		);
		groupLayout_1.setVerticalGroup(
			groupLayout_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addComponent(HeaderCalendario, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(GiorniSettimana, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(BodyCalendario, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))
		);
		
		JLabel Lunedì = new JLabel("Lu");
		Lunedì.setHorizontalAlignment(SwingConstants.CENTER);
		Lunedì.setFont(new Font("Lucida Bright", Font.BOLD, 14));
		
		JLabel Martedì = new JLabel("Ma");
		Martedì.setHorizontalAlignment(SwingConstants.CENTER);
		Martedì.setFont(new Font("Lucida Bright", Font.BOLD, 14));
		
		JLabel Mercoledì = new JLabel("Me");
		Mercoledì.setHorizontalAlignment(SwingConstants.CENTER);
		Mercoledì.setFont(new Font("Lucida Bright", Font.BOLD, 14));
		
		JLabel Giovedì = new JLabel("Gi");
		Giovedì.setHorizontalAlignment(SwingConstants.CENTER);
		Giovedì.setFont(new Font("Lucida Bright", Font.BOLD, 14));
		
		JLabel Venerdì = new JLabel("Ve");
		Venerdì.setHorizontalAlignment(SwingConstants.CENTER);
		Venerdì.setFont(new Font("Lucida Bright", Font.BOLD, 14));
		
		JLabel Sabato = new JLabel("Sa");
		Sabato.setHorizontalAlignment(SwingConstants.CENTER);
		Sabato.setFont(new Font("Lucida Bright", Font.BOLD, 14));
		
		JLabel Domenica = new JLabel("Do");
		Domenica.setHorizontalAlignment(SwingConstants.CENTER);
		Domenica.setFont(new Font("Lucida Bright", Font.BOLD, 14));
		GroupLayout gl_GiorniSettimana = new GroupLayout(GiorniSettimana);
		gl_GiorniSettimana.setHorizontalGroup(
			gl_GiorniSettimana.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_GiorniSettimana.createSequentialGroup()
					.addContainerGap()
					.addComponent(Lunedì, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(Martedì, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(Mercoledì, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(Giovedì, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(Venerdì, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(Sabato, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Domenica, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_GiorniSettimana.setVerticalGroup(
			gl_GiorniSettimana.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_GiorniSettimana.createSequentialGroup()
					.addGroup(gl_GiorniSettimana.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_GiorniSettimana.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(Giovedì, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(Lunedì, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(Alignment.LEADING, gl_GiorniSettimana.createParallelGroup(Alignment.BASELINE)
								.addComponent(Martedì, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
								.addComponent(Mercoledì, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
						.addComponent(Domenica, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(Sabato, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(Venerdì, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		GiorniSettimana.setLayout(gl_GiorniSettimana);
		HeaderCalendario.setLayout(new CardLayout(0, 0));
		
		MarzoHeader = new JLayeredPane();
		HeaderCalendario.add(MarzoHeader);
		
		JLabel LabelMarzo = new JLabel("MARZO");
		LabelMarzo.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		LabelMarzo.setForeground(Color.WHITE);
		LabelMarzo.setHorizontalAlignment(SwingConstants.CENTER);
		LabelMarzo.setBounds(0, 0, 381, 39);
		MarzoHeader.add(LabelMarzo);
		BodyCalendario.setLayout(new CardLayout(0, 0));
		
		GiorniAggiungiTratta = new JLayeredPane();
		
		BodyCalendario.add(GiorniAggiungiTratta, "name_81540142032100");
		
		GiorniRicercaDataArrivo = new JLayeredPane();
		BodyCalendario.add(GiorniRicercaDataArrivo, "name_92328917078400");
		
		GiorniRicercaDataPartenza = new JLayeredPane();
		BodyCalendario.add(GiorniRicercaDataPartenza, "name_92332512226600");
		
		GiorniRimuoviTratta = new JLayeredPane();
		BodyCalendario.add(GiorniRimuoviTratta, "name_416291370918900");
		Calendario.getContentPane().setLayout(groupLayout_1);
		pulsanteCalendarioPartenza.setOpaque(false);
		pulsanteCalendarioPartenza.setFocusable(false);
		pulsanteCalendarioPartenza.setContentAreaFilled(false);
		pulsanteCalendarioPartenza.setBorderPainted(false);
		pulsanteCalendarioPartenza.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconCalendario.png")));
		PanelTratte.add(pulsanteCalendarioPartenza);
		
		JButton PulsanteCalendarioArrivo = new JButton("");
		PulsanteCalendarioArrivo.setBounds(30, 178, 47, 40);
		PulsanteCalendarioArrivo.setEnabled(false);
		PulsanteCalendarioArrivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.creaPulsantiCalendario(pulsantiMesiArrivo, GiorniRicercaDataArrivo, FieldDataArrivo, Calendario);
				theController.showCorrectCalendar(GiorniRicercaDataArrivo, GiorniRicercaDataPartenza, GiorniAggiungiTratta, GiorniRimuoviTratta, Calendario);
			}
		});
		PulsanteCalendarioArrivo.setOpaque(false);
		PulsanteCalendarioArrivo.setFocusable(false);
		PulsanteCalendarioArrivo.setContentAreaFilled(false);
		PulsanteCalendarioArrivo.setBorderPainted(false);
		PulsanteCalendarioArrivo.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconCalendario.png")));
		PanelTratte.add(PulsanteCalendarioArrivo);
		
		JCheckBox CheckOrarioPartenza = new JCheckBox("");
		CheckOrarioPartenza.setBounds(199, 246, 21, 21);
		CheckOrarioPartenza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.attivaRicerca(checkBoxesTratte, fields, boxes, buttons);
			}
		});
		PanelTratte.add(CheckOrarioPartenza);
		
		JCheckBox CheckOrarioArrivo = new JCheckBox("");
		CheckOrarioArrivo.setBounds(199, 292, 21, 21);
		CheckOrarioArrivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.attivaRicerca(checkBoxesTratte, fields, boxes, buttons);
			}
		});
		PanelTratte.add(CheckOrarioArrivo);
		
		FieldDataPartenza = new JTextField();
		FieldDataPartenza.setBounds(79, 146, 114, 21);
		FieldDataPartenza.setEnabled(false);
		FieldDataPartenza.setHorizontalAlignment(SwingConstants.CENTER);
		FieldDataPartenza.setEditable(false);
		FieldDataPartenza.setColumns(10);
		PanelTratte.add(FieldDataPartenza);
		
		JLabel TestoDataArrivo = new JLabel("Data arrivo:");
		TestoDataArrivo.setBounds(79, 180, 114, 19);
		TestoDataArrivo.setHorizontalAlignment(SwingConstants.CENTER);
		TestoDataArrivo.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		PanelTratte.add(TestoDataArrivo);
		
		JLabel TestoDataPartenza = new JLabel("Data partenza:");
		TestoDataPartenza.setBounds(79, 129, 114, 19);
		TestoDataPartenza.setHorizontalAlignment(SwingConstants.CENTER);
		TestoDataPartenza.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		PanelTratte.add(TestoDataPartenza);
		
		FieldDataArrivo = new JTextField();
		FieldDataArrivo.setBounds(79, 195, 114, 23);
		FieldDataArrivo.setEnabled(false);
		FieldDataArrivo.setHorizontalAlignment(SwingConstants.CENTER);
		FieldDataArrivo.setEditable(false);
		FieldDataArrivo.setColumns(10);
		PanelTratte.add(FieldDataArrivo);
		
		JCheckBox CheckDataPartenza = new JCheckBox("");
		CheckDataPartenza.setBounds(199, 146, 21, 21);
		CheckDataPartenza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.attivaRicerca(checkBoxesTratte, fields, boxes, buttons);
			}
		});
		PanelTratte.add(CheckDataPartenza);
		
		JLabel TestoOrarioPartenza = new JLabel("Orario partenza:");
		TestoOrarioPartenza.setBounds(37, 229, 156, 19);
		TestoOrarioPartenza.setHorizontalAlignment(SwingConstants.CENTER);
		TestoOrarioPartenza.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		PanelTratte.add(TestoOrarioPartenza);
		
		JComboBox<String> BoxOrarioPartenza = new JComboBox<String>();
		BoxOrarioPartenza.setBounds(37, 246, 156, 21);
		BoxOrarioPartenza.setEnabled(false);
		BoxOrarioPartenza.setModel(new DefaultComboBoxModel<String>(new String[] {"00:00", "00:30", "01:00", "01:30", "02:00", "02:30",
																					"03:00", "03:30", "04:00", "04:30", "05:00", "05:30",
																					"06:00", "06:30", "07:00", "07:30", "08:00", "08:30",
																					"09:00", "09:30", "10:00", "10:30", "11:00", "11:30",
																					"12:00", "12:30", "13:00", "13:30", "14:00", "14:30",
																					"15:00", "15:30", "16:00", "16:30", "17:00", "17:30",
																					"18:00", "18:30", "19:00", "19:30", "20:00", "20:30",
																					"21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "23:59"}));
		PanelTratte.add(BoxOrarioPartenza);
		
		JLabel TestoOrarioArrivo = new JLabel("Orario arrivo:");
		TestoOrarioArrivo.setBounds(37, 272, 156, 21);
		TestoOrarioArrivo.setHorizontalAlignment(SwingConstants.CENTER);
		TestoOrarioArrivo.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		PanelTratte.add(TestoOrarioArrivo);
		
		JComboBox<String> BoxOrarioArrivo = new JComboBox<String>();
		BoxOrarioArrivo.setBounds(37, 292, 156, 21);
		BoxOrarioArrivo.setEnabled(false);
		BoxOrarioArrivo.setModel(new DefaultComboBoxModel<String>(new String[] {"00:00", "00:30", "01:00", "01:30", "02:00", "02:30",
																					"03:00", "03:30", "04:00", "04:30", "05:00", "05:30",
																					"06:00", "06:30", "07:00", "07:30", "08:00", "08:30",
																					"09:00", "09:30", "10:00", "10:30", "11:00", "11:30",
																					"12:00", "12:30", "13:00", "13:30", "14:00", "14:30",
																					"15:00", "15:30", "16:00", "16:30", "17:00", "17:30",
																					"18:00", "18:30", "19:00", "19:30", "20:00", "20:30",
																					"21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "23:59"}));
		PanelTratte.add(BoxOrarioArrivo);
		
		JCheckBox CheckCittà = new JCheckBox("");
		CheckCittà.setBounds(199, 320, 21, 21);
		CheckCittà.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.attivaRicerca(checkBoxesTratte, fields, boxes, buttons);
			}
		});
		PanelTratte.add(CheckCittà);
		
		JCheckBox CheckDataArrivo = new JCheckBox("");
		CheckDataArrivo.setBounds(199, 195, 21, 21);
		CheckDataArrivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.attivaRicerca(checkBoxesTratte, fields, boxes, buttons);
			}
		});
		PanelTratte.add(CheckDataArrivo);
		
		JPanel ImmCittà = new JPanel();
		ImmCittà.setBounds(37, 378, 183, 109);
		PanelTratte.add(ImmCittà);
		ImmCittà.setLayout(new CardLayout());
		
		JLabel ImmAmsterdam = new JLabel("");
		ImmAmsterdam.setIcon(new ImageIcon(AMain.class.getResource("/apResources/AMSTERDAM.png")));
		ImmCittà.add(ImmAmsterdam, "name_64600111307300");
		
		JLabel ImmAtene = new JLabel("");
		ImmAtene.setIcon(new ImageIcon(AMain.class.getResource("/apResources/ATENE.png")));
		ImmCittà.add(ImmAtene, "name_66678706197299");
		
		JLabel ImmBarcellona = new JLabel("");
		ImmBarcellona.setIcon(new ImageIcon(AMain.class.getResource("/apResources/BARCELLONA.png")));
		ImmCittà.add(ImmBarcellona, "name_74484523905000");
		
		JLabel ImmBerlino = new JLabel("");
		ImmBerlino.setIcon(new ImageIcon(AMain.class.getResource("/apResources/BERLINO.png")));
		ImmCittà.add(ImmBerlino, "name_75781517183700");
		
		JLabel ImmBruxelles = new JLabel("");
		ImmBruxelles.setIcon(new ImageIcon(AMain.class.getResource("/apResources/BRUXELLES.png")));
		ImmCittà.add(ImmBruxelles, "name_75801613420800");
		
		JLabel ImmCagliari = new JLabel("");
		ImmCagliari.setIcon(new ImageIcon(AMain.class.getResource("/apResources/CAGLIARI.png")));
		ImmCittà.add(ImmCagliari, "name_75842106571600");
		
		JLabel ImmCatania = new JLabel("");
		ImmCatania.setIcon(new ImageIcon(AMain.class.getResource("/apResources/CATANIA.png")));
		ImmCittà.add(ImmCatania, "name_75844892107500");
		
		JLabel ImmCracovia = new JLabel("");
		ImmCracovia.setIcon(new ImageIcon(AMain.class.getResource("/apResources/CRACOVIA.png")));
		ImmCittà.add(ImmCracovia, "name_75847747628600");
		
		JLabel ImmDubai = new JLabel("");
		ImmDubai.setIcon(new ImageIcon(AMain.class.getResource("/apResources/DUBAI.png")));
		ImmCittà.add(ImmDubai, "name_75850569204100");
		
		JLabel ImmGenova = new JLabel("");
		ImmGenova.setIcon(new ImageIcon(AMain.class.getResource("/apResources/GENOVA.png")));
		ImmCittà.add(ImmGenova, "name_75852796515600");
		
		JLabel ImmLiverpool = new JLabel("");
		ImmLiverpool.setIcon(new ImageIcon(AMain.class.getResource("/apResources/LIVERPOOL.png")));
		ImmCittà.add(ImmLiverpool, "name_76098096080700");
		
		JLabel ImmLondra = new JLabel("");
		ImmLondra.setIcon(new ImageIcon(AMain.class.getResource("/apResources/LONDRA.png")));
		ImmCittà.add(ImmLondra, "name_76102998781000");
		
		JLabel ImmTorino = new JLabel("");
		ImmTorino.setIcon(new ImageIcon(AMain.class.getResource("/apResources/TORINO.png")));
		ImmCittà.add(ImmTorino, "name_76107874176400");
		
		JLabel ImmTrieste = new JLabel("");
		ImmTrieste.setIcon(new ImageIcon(AMain.class.getResource("/apResources/TRIESTE.png")));
		ImmCittà.add(ImmTrieste, "name_76143457471200");
		
		JLabel ImmVenezia = new JLabel("");
		ImmVenezia.setIcon(new ImageIcon(AMain.class.getResource("/apResources/VENEZIA.png")));
		ImmCittà.add(ImmVenezia, "name_76189533517200");
		
		JLabel ImmVerona = new JLabel("");
		ImmVerona.setIcon(new ImageIcon(AMain.class.getResource("/apResources/VERONA.png")));
		ImmCittà.add(ImmVerona, "name_76194273968700");
		
		//Array che contiene tutte le immagini inerenti alle città
		JLabel[] labelsCittà = new JLabel[]{ImmAmsterdam, ImmAtene, ImmBarcellona, ImmBerlino, ImmBruxelles, ImmCagliari, ImmCatania, ImmCracovia,
											ImmDubai, ImmGenova, ImmLiverpool, ImmLondra, ImmTorino, ImmTrieste, ImmVenezia, ImmVerona};
		
		JComboBox<String> BoxCittà = new JComboBox<String>();
		BoxCittà.setBounds(37, 320, 156, 21);
		BoxCittà.setEnabled(false);
		BoxCittà.setModel(new DefaultComboBoxModel<String>(new String[] {"Amsterdam", "Atene", "Barcellona", "Berlino", "Bruxelles", "Cagliari", "Catania", "Cracovia", "Dubai", "Genova", "Roma", "Londra", "Torino", "Trieste", "Venezia", "Milano"}));
		BoxCittà.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		BoxCittà.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					theController.setImageBox(BoxCittà, labelsCittà);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		PanelTratte.add(BoxCittà);
		
		buttons = new JButton[] {PulsanteCalendarioArrivo, pulsanteCalendarioPartenza};
		checkBoxesTratte = new JCheckBox[]{CheckDataArrivo, CheckDataPartenza, CheckOrarioArrivo, CheckOrarioPartenza, CheckCittà};
		fields = new JTextField[] {FieldDataArrivo, FieldDataPartenza};
		boxes = new JComboBox[] {BoxOrarioArrivo, BoxOrarioPartenza, BoxCittà};
		
		JLabel OmbraHeaderVolo = new JLabel("");
		OmbraHeaderVolo.setBounds(0, 0, 1193, 34);
		OmbraHeaderVolo.setIcon(new ImageIcon(AMain.class.getResource("/apResources/OmbraHeader.png")));
		PanelTratte.add(OmbraHeaderVolo);
		
		PulsanteHomeVolo = new JButton("");
		PulsanteHomeVolo.setBounds(10, 10, 63, 51);
		PulsanteHomeVolo.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconHome.png")));
		PulsanteHomeVolo.setOpaque(false);
		PulsanteHomeVolo.setFocusable(false);
		PulsanteHomeVolo.setContentAreaFilled(false);
		PulsanteHomeVolo.setBorderPainted(false);
		PulsanteHomeVolo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.switchPanel(Tratte, Main);
				Calendario.setVisible(false);
			}
		});
		PanelTratte.add(PulsanteHomeVolo); 
		
		JTabbedPane tabbedPaneTratte = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneTratte.setBounds(366, 45, 482, 142);
		tabbedPaneTratte.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		PanelTratte.add(tabbedPaneTratte);
		
		JButton[] pulsantiMesiAggiungi = new JButton[32];
		
		fieldDataAggiungi = new JTextField();
		fieldDataAggiungi.setHorizontalAlignment(SwingConstants.CENTER);
		fieldDataAggiungi.setEditable(false);
		fieldDataAggiungi.setBounds(10, 33, 96, 19);
		fieldDataAggiungi.setColumns(10);
		
		JPanel PannelloAggiungi = new JPanel();
		tabbedPaneTratte.addTab("Aggiungi", null, PannelloAggiungi, null);
		
		JLabel labelArrivoAggiungi = new JLabel("Data e ora d'imbarco");
		labelArrivoAggiungi.setHorizontalAlignment(SwingConstants.CENTER);
		labelArrivoAggiungi.setBounds(10, 11, 195, 16);
		labelArrivoAggiungi.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		
		JComboBox<String> boxOrariAggiungi = new JComboBox<String>();
		boxOrariAggiungi.setBounds(116, 33, 89, 19);
		boxOrariAggiungi.setModel(new DefaultComboBoxModel<String>(new String[] {"00:00", "00:30", "01:00", "01:30", "02:00", "02:30",
																			"03:00", "03:30", "04:00", "04:30", "05:00", "05:30",
																			"06:00", "06:30", "07:00", "07:30", "08:00", "08:30",
																			"09:00", "09:30", "10:00", "10:30", "11:00", "11:30",
																			"12:00", "12:30", "13:00", "13:30", "14:00", "14:30",
																			"15:00", "15:30", "16:00", "16:30", "17:00", "17:30",
																			"18:00", "18:30", "19:00", "19:30", "20:00", "20:30",
																			"21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "23:59"}));
		
		selectDataAggiungi = new JButton("Sleziona Data");
		selectDataAggiungi.setBounds(10, 58, 195, 21);
		selectDataAggiungi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.creaPulsantiCalendario(pulsantiMesiAggiungi, GiorniAggiungiTratta, fieldDataAggiungi, Calendario);
				theController.showCorrectCalendar(GiorniAggiungiTratta, GiorniRicercaDataArrivo, GiorniRicercaDataPartenza, GiorniRimuoviTratta, Calendario);
			}
		});
		
					
				PannelloAggiungi.setLayout(null);
				PannelloAggiungi.add(labelArrivoAggiungi);
				PannelloAggiungi.add(selectDataAggiungi);
				PannelloAggiungi.add(fieldDataAggiungi);
				PannelloAggiungi.add(boxOrariAggiungi);
				
				JLabel labelDestinazioneAggiungi = new JLabel("Destinazione:");
				labelDestinazioneAggiungi.setHorizontalAlignment(SwingConstants.CENTER);
				labelDestinazioneAggiungi.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
				labelDestinazioneAggiungi.setBounds(230, 58, 152, 16);
				PannelloAggiungi.add(labelDestinazioneAggiungi);
				
				boxDestinazioneAggiungi = new JComboBox<String>();
				boxDestinazioneAggiungi.setModel(new DefaultComboBoxModel<String>(new String[] {"Amsterdam", "Atene", "Barcellona", "Berlino", "Bruxelles", "Cagliari", "Catania", "Cracovia", "Dubai", "Genova", "Roma", "Londra", "Torino", "Trieste", "Venezia", "Milano"}));
				boxDestinazioneAggiungi.setBounds(230, 73, 152, 26);
				PannelloAggiungi.add(boxDestinazioneAggiungi);
				
				JLabel numPrenotazioniAggiungi = new JLabel("Prenotazioni:");
				numPrenotazioniAggiungi.setHorizontalAlignment(SwingConstants.CENTER);
				numPrenotazioniAggiungi.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
				numPrenotazioniAggiungi.setBounds(230, 11, 152, 19);
				PannelloAggiungi.add(numPrenotazioniAggiungi);
				
				fieldPrenotazioniAggiungi = new JTextField();
				fieldPrenotazioniAggiungi.setBounds(230, 28, 152, 26);
				PannelloAggiungi.add(fieldPrenotazioniAggiungi);
				fieldPrenotazioniAggiungi.setColumns(10);
				
				JButton pulsanteConfermaAggiungi = new JButton("Ok");
				pulsanteConfermaAggiungi.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						theController.newTratta(boxOrariAggiungi, boxDestinazioneAggiungi, fieldPrenotazioniAggiungi, Avviso, fieldDataAggiungi, warnings);
					}
				});
				pulsanteConfermaAggiungi.setBounds(410, 66, 53, 40);
				PannelloAggiungi.add(pulsanteConfermaAggiungi);
		
		PannelloRimuovi = new JPanel();
		tabbedPaneTratte.addTab("Rimuovi", null, PannelloRimuovi, null);
		
		JLabel labelArrivoRimuovi = new JLabel("Data e ora d'imbarco");
		labelArrivoRimuovi.setHorizontalAlignment(SwingConstants.CENTER);
		labelArrivoRimuovi.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		
		fieldDataRimuovi = new JTextField();
		fieldDataRimuovi.setHorizontalAlignment(SwingConstants.CENTER);
		fieldDataRimuovi.setEditable(false);
		fieldDataRimuovi.setColumns(10);
		
		JComboBox<String> boxOrariRimuovi = new JComboBox<String>();
		boxOrariRimuovi.setModel(new DefaultComboBoxModel<String>(new String[] {"00:00", "00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "23:59"}));
		
		JButton selectDataRimuovi = new JButton("Sleziona Data");
		selectDataRimuovi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.creaPulsantiCalendario(pulsantiMesiRimuovi, GiorniRimuoviTratta, fieldDataRimuovi, Calendario);
				theController.showCorrectCalendar(GiorniRimuoviTratta, GiorniRicercaDataArrivo, GiorniRicercaDataPartenza, GiorniAggiungiTratta, Calendario);
			}
		});
		
		JLabel labelDestinazioneRimuovi = new JLabel("Destinazione:");
		labelDestinazioneRimuovi.setHorizontalAlignment(SwingConstants.CENTER);
		labelDestinazioneRimuovi.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		
		JComboBox<String> boxDestinazioneRimuovi = new JComboBox<String>();
		boxDestinazioneRimuovi.setModel(new DefaultComboBoxModel<String>(new String[] {"Amsterdam", "Atene", "Barcellona", "Berlino", "Bruxelles", "Cagliari", "Catania", "Cracovia", "Dubai", "Genova", "Roma", "Londra", "Torino", "Trieste", "Venezia", "Milano"}));
		
		JButton pulsanteConfermaRimuovi = new JButton("Ok");
		pulsanteConfermaRimuovi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.rimuoviTratta(boxOrariRimuovi, boxDestinazioneRimuovi, Avviso, fieldDataRimuovi, warnings);
			}
		});
		GroupLayout gl_PannelloRimuovi = new GroupLayout(PannelloRimuovi);
		gl_PannelloRimuovi.setHorizontalGroup(
			gl_PannelloRimuovi.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PannelloRimuovi.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_PannelloRimuovi.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PannelloRimuovi.createSequentialGroup()
							.addGroup(gl_PannelloRimuovi.createParallelGroup(Alignment.LEADING)
								.addComponent(labelArrivoRimuovi, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_PannelloRimuovi.createSequentialGroup()
									.addComponent(fieldDataRimuovi, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(boxOrariRimuovi, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)))
							.addGap(27)
							.addGroup(gl_PannelloRimuovi.createParallelGroup(Alignment.LEADING)
								.addComponent(labelDestinazioneRimuovi, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
								.addComponent(boxDestinazioneRimuovi, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
							.addGap(93))
						.addGroup(gl_PannelloRimuovi.createSequentialGroup()
							.addComponent(selectDataRimuovi, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
							.addComponent(pulsanteConfermaRimuovi, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_PannelloRimuovi.setVerticalGroup(
			gl_PannelloRimuovi.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PannelloRimuovi.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_PannelloRimuovi.createParallelGroup(Alignment.LEADING)
						.addComponent(labelDestinazioneRimuovi, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_PannelloRimuovi.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_PannelloRimuovi.createSequentialGroup()
								.addComponent(labelArrivoRimuovi, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addGroup(gl_PannelloRimuovi.createParallelGroup(Alignment.LEADING)
									.addComponent(fieldDataRimuovi, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
									.addComponent(boxOrariRimuovi, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)))
							.addGroup(gl_PannelloRimuovi.createSequentialGroup()
								.addGap(15)
								.addComponent(boxDestinazioneRimuovi, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_PannelloRimuovi.createParallelGroup(Alignment.LEADING)
						.addComponent(pulsanteConfermaRimuovi, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(selectDataRimuovi, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		PannelloRimuovi.setLayout(gl_PannelloRimuovi);
		
		Panel AreaTratte = new Panel();
		AreaTratte.setBounds(317, 215, 836, 282);
		AreaTratte.setBackground(Color.WHITE);
		PanelTratte.add(AreaTratte);
		
		JLayeredPane PannelloTratte = new JLayeredPane();
		
		ListaTratte = new TextArea();
		ListaTratte.setBounds(0, 0, 836, 282);
		PannelloTratte.add(ListaTratte);
		
		JButton PulsanteRicerca = new JButton("Effettua ricerca");
		PulsanteRicerca.setBounds(37, 498, 183, 19);
		PulsanteRicerca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.ricercaTratte(checkBoxesTratte, fields, boxes, ListaTratte);
			}
		});
		PanelTratte.add(PulsanteRicerca);
		GroupLayout gl_AreaTratte = new GroupLayout(AreaTratte);
		gl_AreaTratte.setHorizontalGroup(
			gl_AreaTratte.createParallelGroup(Alignment.LEADING)
				.addComponent(PannelloTratte, GroupLayout.PREFERRED_SIZE, 836, GroupLayout.PREFERRED_SIZE)
		);
		gl_AreaTratte.setVerticalGroup(
			gl_AreaTratte.createParallelGroup(Alignment.LEADING)
				.addComponent(PannelloTratte, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE)
		);
		AreaTratte.setLayout(gl_AreaTratte);
		
		JLabel Biglietto = new JLabel("New label");
		Biglietto.setBounds(0, 59, 274, 486);
		Biglietto.setIcon(new ImageIcon(AMain.class.getResource("/apResources/BaseBiglietto.png")));
		Biglietto.setHorizontalAlignment(SwingConstants.CENTER);
		PanelTratte.add(Biglietto);
		
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(Header, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(BodyContainer, GroupLayout.PREFERRED_SIZE, 1186, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(Header, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(BodyContainer, GroupLayout.PREFERRED_SIZE, 539, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		
		GroupLayout gl_Header = new GroupLayout(Header);
		gl_Header.setHorizontalGroup(
			gl_Header.createParallelGroup(Alignment.LEADING)
				.addComponent(ImmagineHeader, GroupLayout.PREFERRED_SIZE, 1186, GroupLayout.PREFERRED_SIZE)
		);
		gl_Header.setVerticalGroup(
			gl_Header.createParallelGroup(Alignment.LEADING)
				.addComponent(ImmagineHeader)
		);
		Header.setLayout(gl_Header);
		
		
		Gate = new JLayeredPane();
		BodyContainer.add(Gate, "name_154090056026400");
		
		JPanel PanelGate = new JPanel();
		PanelGate.setBorder(null);
		PanelGate.setBackground(new Color(208, 215, 232));
		PanelGate.setBounds(0, 0, 1193, 535);
		Gate.add(PanelGate);
		PanelGate.setLayout(null);
		
		PannelloTempo = new JPanel();
		PannelloTempo.setVisible(false);
		
		JInternalFrame intframePartenza = new JInternalFrame("");
		intframePartenza.setClosable(true);
		intframePartenza.setFrameIcon(new ImageIcon(AMain.class.getResource("/apResources/IconWarning.png")));
		intframePartenza.setBounds(340, 22, 554, 491);
		PanelGate.add(intframePartenza);
		intframePartenza.getContentPane().setLayout(null);
		
		JPanel pannelloPartenza = new JPanel();
		pannelloPartenza.setBounds(0, 0, 537, 483);
		intframePartenza.getContentPane().add(pannelloPartenza);
		
		JPanel pannelloPartenzaHeader = new JPanel();
		pannelloPartenzaHeader.setBackground(new Color(13, 62, 117));
		pannelloPartenzaHeader.setBounds(0, 0, 537, 43);
		
		JLabel labelPartenzaD = new JLabel("Destinazione: ");
		labelPartenzaD.setBounds(10, 54, 180, 17);
		labelPartenzaD.setHorizontalAlignment(SwingConstants.TRAILING);
		labelPartenzaD.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		
		JLabel labelPartenzaOP = new JLabel("Orario partenza:");
		labelPartenzaOP.setBounds(10, 89, 180, 17);
		labelPartenzaOP.setHorizontalAlignment(SwingConstants.TRAILING);
		labelPartenzaOP.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		
		JLabel labelPartenzaOA = new JLabel("Orario d'arrivo previsto: ");
		labelPartenzaOA.setBounds(10, 124, 180, 17);
		labelPartenzaOA.setHorizontalAlignment(SwingConstants.TRAILING);
		labelPartenzaOA.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		
		JLabel labelPartenzaDP = new JLabel("Data partenza:");
		labelPartenzaDP.setBounds(10, 160, 180, 17);
		labelPartenzaDP.setHorizontalAlignment(SwingConstants.TRAILING);
		labelPartenzaDP.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		
		JLabel labelPartenzaDA = new JLabel("Data d'arrivo prevista: ");
		labelPartenzaDA.setBounds(10, 195, 180, 17);
		labelPartenzaDA.setHorizontalAlignment(SwingConstants.TRAILING);
		labelPartenzaDA.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		
		JLabel labelPartenzaP = new JLabel("Prenotazioni: ");
		labelPartenzaP.setBounds(10, 230, 180, 17);
		labelPartenzaP.setHorizontalAlignment(SwingConstants.TRAILING);
		labelPartenzaP.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		
		JLabel labelPartenzaCom = new JLabel("Compagnia aerea: ");
		labelPartenzaCom.setBounds(10, 265, 180, 17);
		labelPartenzaCom.setHorizontalAlignment(SwingConstants.TRAILING);
		labelPartenzaCom.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		
		JLabel labelPartenzaCod = new JLabel("Code:");
		labelPartenzaCod.setBounds(10, 300, 180, 17);
		labelPartenzaCod.setHorizontalAlignment(SwingConstants.TRAILING);
		labelPartenzaCod.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		
		JLabel labelPartenzaT = new JLabel("Terminal:");
		labelPartenzaT.setBounds(10, 335, 180, 17);
		labelPartenzaT.setHorizontalAlignment(SwingConstants.TRAILING);
		labelPartenzaT.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		pannelloPartenzaHeader.setLayout(null);
		
		JLabel textPartenza = new JLabel("Recap delle informazioni del volo in partenza");
		textPartenza.setForeground(new Color(255, 255, 255));
		textPartenza.setHorizontalAlignment(SwingConstants.CENTER);
		textPartenza.setBounds(10, 0, 517, 43);
		textPartenza.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		pannelloPartenzaHeader.add(textPartenza);
		
		fieldDPartenza = new JTextField();
		fieldDPartenza.setEditable(false);
		fieldDPartenza.setBounds(200, 51, 239, 20);
		fieldDPartenza.setColumns(10);
		pannelloPartenza.setLayout(null);
		pannelloPartenza.add(pannelloPartenzaHeader);
		pannelloPartenza.add(labelPartenzaOA);
		pannelloPartenza.add(labelPartenzaDP);
		pannelloPartenza.add(labelPartenzaDA);
		pannelloPartenza.add(labelPartenzaP);
		pannelloPartenza.add(labelPartenzaD);
		pannelloPartenza.add(labelPartenzaOP);
		pannelloPartenza.add(fieldDPartenza);
		pannelloPartenza.add(labelPartenzaT);
		pannelloPartenza.add(labelPartenzaCod);
		pannelloPartenza.add(labelPartenzaCom);
		
		fieldOPPartenza = new JTextField();
		fieldOPPartenza.setEditable(false);
		fieldOPPartenza.setBounds(200, 86, 239, 20);
		pannelloPartenza.add(fieldOPPartenza);
		fieldOPPartenza.setColumns(10);
		
		fieldOAPartenza = new JTextField();
		fieldOAPartenza.setEditable(false);
		fieldOAPartenza.setBounds(200, 121, 239, 20);
		pannelloPartenza.add(fieldOAPartenza);
		fieldOAPartenza.setColumns(10);
		
		fieldDPPartenza = new JTextField();
		fieldDPPartenza.setEditable(false);
		fieldDPPartenza.setBounds(200, 157, 239, 20);
		pannelloPartenza.add(fieldDPPartenza);
		fieldDPPartenza.setColumns(10);
		
		fieldDAPartenza = new JTextField();
		fieldDAPartenza.setEditable(false);
		fieldDAPartenza.setBounds(200, 192, 239, 20);
		pannelloPartenza.add(fieldDAPartenza);
		fieldDAPartenza.setColumns(10);
		
		fieldPPartenza = new JTextField();
		fieldPPartenza.setEditable(false);
		fieldPPartenza.setBounds(200, 227, 239, 20);
		pannelloPartenza.add(fieldPPartenza);
		fieldPPartenza.setColumns(10);
		
		fieldCAPartenza = new JTextField();
		fieldCAPartenza.setEditable(false);
		fieldCAPartenza.setBounds(200, 262, 239, 20);
		pannelloPartenza.add(fieldCAPartenza);
		fieldCAPartenza.setColumns(10);
		
		fieldCPartenza = new JTextField();
		fieldCPartenza.setEditable(false);
		fieldCPartenza.setBounds(200, 297, 239, 20);
		pannelloPartenza.add(fieldCPartenza);
		fieldCPartenza.setColumns(10);
		
		fieldTPartenza = new JTextField();
		fieldTPartenza.setEditable(false);
		fieldTPartenza.setBounds(200, 332, 239, 20);
		pannelloPartenza.add(fieldTPartenza);
		fieldTPartenza.setColumns(10);
		
		JLabel labelPartenzaG = new JLabel("Gate:");
		labelPartenzaG.setHorizontalAlignment(SwingConstants.TRAILING);
		labelPartenzaG.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		labelPartenzaG.setBounds(10, 366, 180, 17);
		pannelloPartenza.add(labelPartenzaG);
		
		fieldGPartenza = new JTextField();
		fieldGPartenza.setEditable(false);
		fieldGPartenza.setColumns(10);
		fieldGPartenza.setBounds(200, 363, 239, 20);
		pannelloPartenza.add(fieldGPartenza);
		
		JLabel labelPartenzaTi = new JLabel("Imbarco stimato:");
		labelPartenzaTi.setHorizontalAlignment(SwingConstants.TRAILING);
		labelPartenzaTi.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		labelPartenzaTi.setBounds(10, 397, 180, 17);
		pannelloPartenza.add(labelPartenzaTi);
		
		fieldTIpartenza = new JTextField();
		fieldTIpartenza.setEditable(false);
		fieldTIpartenza.setColumns(10);
		fieldTIpartenza.setBounds(200, 394, 119, 20);
		pannelloPartenza.add(fieldTIpartenza);
		
		JLabel labelPartenzaMinTI = new JLabel(" minuti");
		labelPartenzaMinTI.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		labelPartenzaMinTI.setBounds(320, 396, 119, 17);
		pannelloPartenza.add(labelPartenzaMinTI);
		
		JButton pulsanteConfermaPartenza = new JButton("Ok");
		pulsanteConfermaPartenza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gate.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
				theController.partenza(fieldsPartenza, intframePartenza);
				Gate.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			}
		});
		pulsanteConfermaPartenza.setBounds(462, 424, 65, 25);
		pulsanteConfermaPartenza.setFont(new Font("Tahoma", Font.BOLD, 14));
		pannelloPartenza.add(pulsanteConfermaPartenza);
		
		JLabel labelmbarcoEffettivo = new JLabel("Imbarco effettivo:");
		labelmbarcoEffettivo.setHorizontalAlignment(SwingConstants.TRAILING);
		labelmbarcoEffettivo.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		labelmbarcoEffettivo.setBounds(10, 428, 180, 17);
		pannelloPartenza.add(labelmbarcoEffettivo);
		
		fieldTEPartenza = new JTextField();
		fieldTEPartenza.setColumns(10);
		fieldTEPartenza.setBounds(200, 425, 119, 20);
		pannelloPartenza.add(fieldTEPartenza);
		
		JLabel labelPartenzaMinTE = new JLabel(" minuti");
		labelPartenzaMinTE.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		labelPartenzaMinTE.setBounds(320, 427, 119, 17);
		pannelloPartenza.add(labelPartenzaMinTE);
		PannelloTempo.setBounds(365, 358, 490, 166);
		PanelGate.add(PannelloTempo);
		
		fieldsPartenza = new JTextField[] {fieldDPartenza, fieldOPPartenza, fieldOAPartenza, fieldDPPartenza, fieldDAPartenza, fieldPPartenza,
											fieldCAPartenza, fieldCPartenza, fieldTPartenza, fieldGPartenza, fieldTIpartenza, fieldTEPartenza};
		
		JPanel BodyPannelloTempo = new JPanel();
		BodyPannelloTempo.setBackground(new Color(255, 255, 255));
		
		JPanel HeadersPannelloTempo = new JPanel();
		HeadersPannelloTempo.setBackground(new Color(255, 255, 255));
		GroupLayout gl_PannelloTempo = new GroupLayout(PannelloTempo);
		gl_PannelloTempo.setHorizontalGroup(
			gl_PannelloTempo.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_PannelloTempo.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_PannelloTempo.createParallelGroup(Alignment.TRAILING)
						.addComponent(HeadersPannelloTempo, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 470, Short.MAX_VALUE)
						.addComponent(BodyPannelloTempo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_PannelloTempo.setVerticalGroup(
			gl_PannelloTempo.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_PannelloTempo.createSequentialGroup()
					.addContainerGap()
					.addComponent(HeadersPannelloTempo, GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(BodyPannelloTempo, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JLabel labelTempoStimato = new JLabel("Tempo stimato:");
		labelTempoStimato.setHorizontalAlignment(SwingConstants.TRAILING);
		labelTempoStimato.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		
		JLabel labelTempoEffettivo = new JLabel("Tempo effettivo:");
		labelTempoEffettivo.setHorizontalAlignment(SwingConstants.TRAILING);
		labelTempoEffettivo.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		
		FieldTempoStimatoGiorno = new JTextField();
		FieldTempoStimatoGiorno.setHorizontalAlignment(SwingConstants.CENTER);
		FieldTempoStimatoGiorno.setText("0");
		FieldTempoStimatoGiorno.setEditable(false);
		FieldTempoStimatoGiorno.setColumns(10);
		
		FieldTempoEffettivoGiorno = new JTextField();
		FieldTempoEffettivoGiorno.setHorizontalAlignment(SwingConstants.CENTER);
		FieldTempoEffettivoGiorno.setText("0");
		FieldTempoEffettivoGiorno.setEditable(false);
		FieldTempoEffettivoGiorno.setColumns(10);
		
		JLabel labelGiorno = new JLabel("giorno");
		labelGiorno.setHorizontalAlignment(SwingConstants.CENTER);
		labelGiorno.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		
		JLabel fieldMese = new JLabel("settimana");
		fieldMese.setHorizontalAlignment(SwingConstants.CENTER);
		fieldMese.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		
		FieldTempoStimatoSettimana = new JTextField();
		FieldTempoStimatoSettimana.setHorizontalAlignment(SwingConstants.CENTER);
		FieldTempoStimatoSettimana.setText("0");
		FieldTempoStimatoSettimana.setEditable(false);
		FieldTempoStimatoSettimana.setColumns(10);
		
		FieldTempoEffettivoSettimana = new JTextField();
		FieldTempoEffettivoSettimana.setHorizontalAlignment(SwingConstants.CENTER);
		FieldTempoEffettivoSettimana.setText("0");
		FieldTempoEffettivoSettimana.setEditable(false);
		FieldTempoEffettivoSettimana.setColumns(10);
		
		JLabel fieldAnno = new JLabel("mese");
		fieldAnno.setHorizontalAlignment(SwingConstants.CENTER);
		fieldAnno.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		
		FieldTempoStimatoMese = new JTextField();
		FieldTempoStimatoMese.setText("0");
		FieldTempoStimatoMese.setHorizontalAlignment(SwingConstants.CENTER);
		FieldTempoStimatoMese.setEditable(false);
		FieldTempoStimatoMese.setColumns(10);
		
		FieldTempoEffettivoAnno = new JTextField();
		FieldTempoEffettivoAnno.setHorizontalAlignment(SwingConstants.CENTER);
		FieldTempoEffettivoAnno.setText("0");
		FieldTempoEffettivoAnno.setEditable(false);
		FieldTempoEffettivoAnno.setColumns(10);
		GroupLayout gl_BodyPannelloTempo = new GroupLayout(BodyPannelloTempo);
		gl_BodyPannelloTempo.setHorizontalGroup(
			gl_BodyPannelloTempo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_BodyPannelloTempo.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_BodyPannelloTempo.createParallelGroup(Alignment.LEADING)
						.addComponent(labelTempoEffettivo, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_BodyPannelloTempo.createSequentialGroup()
							.addComponent(labelTempoStimato, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_BodyPannelloTempo.createParallelGroup(Alignment.LEADING, false)
								.addComponent(labelGiorno, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(FieldTempoEffettivoGiorno)
								.addComponent(FieldTempoStimatoGiorno, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))))
					.addGap(18)
					.addGroup(gl_BodyPannelloTempo.createParallelGroup(Alignment.LEADING)
						.addComponent(fieldMese, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
						.addComponent(FieldTempoStimatoSettimana, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
						.addComponent(FieldTempoEffettivoSettimana, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_BodyPannelloTempo.createParallelGroup(Alignment.LEADING)
						.addComponent(fieldAnno, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
						.addComponent(FieldTempoStimatoMese, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
						.addComponent(FieldTempoEffettivoAnno, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(39, Short.MAX_VALUE))
		);
		gl_BodyPannelloTempo.setVerticalGroup(
			gl_BodyPannelloTempo.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_BodyPannelloTempo.createSequentialGroup()
					.addContainerGap(15, Short.MAX_VALUE)
					.addGroup(gl_BodyPannelloTempo.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_BodyPannelloTempo.createSequentialGroup()
							.addComponent(fieldAnno, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(FieldTempoStimatoMese, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(FieldTempoEffettivoAnno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_BodyPannelloTempo.createSequentialGroup()
							.addComponent(fieldMese, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(FieldTempoStimatoSettimana, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(FieldTempoEffettivoSettimana, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_BodyPannelloTempo.createSequentialGroup()
							.addComponent(labelGiorno, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_BodyPannelloTempo.createParallelGroup(Alignment.BASELINE)
								.addComponent(labelTempoStimato, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
								.addComponent(FieldTempoStimatoGiorno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_BodyPannelloTempo.createParallelGroup(Alignment.BASELINE)
								.addComponent(labelTempoEffettivo, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
								.addComponent(FieldTempoEffettivoGiorno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		BodyPannelloTempo.setLayout(gl_BodyPannelloTempo);
		HeadersPannelloTempo.setLayout(new CardLayout(0, 0));
		
				HeaderT1A1 = new JPanel();
				HeaderT1A1.setBackground(new Color(255, 255, 255));
				HeadersPannelloTempo.add(HeaderT1A1, "name_72222441792300");
				
				JLabel T1A1 = new JLabel("[Terminal - T1]          [Gate - A1]");
				T1A1.setHorizontalTextPosition(SwingConstants.CENTER);
				T1A1.setHorizontalAlignment(SwingConstants.CENTER);
				T1A1.setFont(new Font("Lucida Bright", Font.BOLD, 15));
				GroupLayout gl_HeaderT1A1 = new GroupLayout(HeaderT1A1);
				gl_HeaderT1A1.setHorizontalGroup(
					gl_HeaderT1A1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_HeaderT1A1.createSequentialGroup()
							.addContainerGap()
							.addComponent(T1A1, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
							.addContainerGap())
				);
				gl_HeaderT1A1.setVerticalGroup(
					gl_HeaderT1A1.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_HeaderT1A1.createSequentialGroup()
							.addGap(5)
							.addComponent(T1A1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
				);
				HeaderT1A1.setLayout(gl_HeaderT1A1);
				
				HeaderT1A2 = new JPanel();
				HeaderT1A2.setBackground(Color.WHITE);
				HeadersPannelloTempo.add(HeaderT1A2, "name_74120775984500");
				
				JLabel T1A2 = new JLabel("[Terminal - T1]          [Gate - A2]");
				T1A2.setHorizontalTextPosition(SwingConstants.CENTER);
				T1A2.setHorizontalAlignment(SwingConstants.CENTER);
				T1A2.setFont(new Font("Lucida Bright", Font.BOLD, 15));
				GroupLayout gl_HeaderT1A2 = new GroupLayout(HeaderT1A2);
				gl_HeaderT1A2.setHorizontalGroup(
					gl_HeaderT1A2.createParallelGroup(Alignment.LEADING)
						.addGap(0, 470, Short.MAX_VALUE)
						.addGroup(gl_HeaderT1A2.createSequentialGroup()
							.addContainerGap()
							.addComponent(T1A2, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
							.addContainerGap())
				);
				gl_HeaderT1A2.setVerticalGroup(
					gl_HeaderT1A2.createParallelGroup(Alignment.TRAILING)
						.addGap(0, 33, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_HeaderT1A2.createSequentialGroup()
							.addGap(5)
							.addComponent(T1A2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
				);
				HeaderT1A2.setLayout(gl_HeaderT1A2);
				
				HeaderT1A3 = new JPanel();
				HeaderT1A3.setBackground(Color.WHITE);
				HeadersPannelloTempo.add(HeaderT1A3, "name_74133228066000");
				
				JLabel T1A3 = new JLabel("[Terminal - T1]          [Gate - A3]");
				T1A3.setHorizontalTextPosition(SwingConstants.CENTER);
				T1A3.setHorizontalAlignment(SwingConstants.CENTER);
				T1A3.setFont(new Font("Lucida Bright", Font.BOLD, 15));
				GroupLayout gl_HeaderT1A3 = new GroupLayout(HeaderT1A3);
				gl_HeaderT1A3.setHorizontalGroup(
					gl_HeaderT1A3.createParallelGroup(Alignment.LEADING)
						.addGap(0, 470, Short.MAX_VALUE)
						.addGroup(gl_HeaderT1A3.createSequentialGroup()
							.addContainerGap()
							.addComponent(T1A3, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
							.addContainerGap())
				);
				gl_HeaderT1A3.setVerticalGroup(
					gl_HeaderT1A3.createParallelGroup(Alignment.TRAILING)
						.addGap(0, 33, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_HeaderT1A3.createSequentialGroup()
							.addGap(5)
							.addComponent(T1A3, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
				);
				HeaderT1A3.setLayout(gl_HeaderT1A3);
				
				HeaderT1A4 = new JPanel();
				HeaderT1A4.setBackground(Color.WHITE);
				HeadersPannelloTempo.add(HeaderT1A4, "name_74137629217300");
				
				JLabel T1A4 = new JLabel("[Terminal - T1]          [Gate - A4]");
				T1A4.setHorizontalTextPosition(SwingConstants.CENTER);
				T1A4.setHorizontalAlignment(SwingConstants.CENTER);
				T1A4.setFont(new Font("Lucida Bright", Font.BOLD, 15));
				GroupLayout gl_HeaderT1A4 = new GroupLayout(HeaderT1A4);
				gl_HeaderT1A4.setHorizontalGroup(
					gl_HeaderT1A4.createParallelGroup(Alignment.LEADING)
						.addGap(0, 470, Short.MAX_VALUE)
						.addGroup(gl_HeaderT1A4.createSequentialGroup()
							.addContainerGap()
							.addComponent(T1A4, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
							.addContainerGap())
				);
				gl_HeaderT1A4.setVerticalGroup(
					gl_HeaderT1A4.createParallelGroup(Alignment.TRAILING)
						.addGap(0, 33, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_HeaderT1A4.createSequentialGroup()
							.addGap(5)
							.addComponent(T1A4, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
				);
				HeaderT1A4.setLayout(gl_HeaderT1A4);
				
				JPanel HeaderT2A1 = new JPanel();
				HeaderT2A1.setBackground(Color.WHITE);
				HeadersPannelloTempo.add(HeaderT2A1, "name_67107402000200");
				
				JLabel T2A1 = new JLabel("[Terminal - T2]          [Gate - A1]");
				T2A1.setHorizontalTextPosition(SwingConstants.CENTER);
				T2A1.setHorizontalAlignment(SwingConstants.CENTER);
				T2A1.setFont(new Font("Lucida Bright", Font.BOLD, 15));
				GroupLayout gl_HeaderT2A1 = new GroupLayout(HeaderT2A1);
				gl_HeaderT2A1.setHorizontalGroup(
					gl_HeaderT2A1.createParallelGroup(Alignment.LEADING)
						.addGap(0, 470, Short.MAX_VALUE)
						.addGroup(gl_HeaderT2A1.createSequentialGroup()
							.addContainerGap()
							.addComponent(T2A1, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
							.addContainerGap())
				);
				gl_HeaderT2A1.setVerticalGroup(
					gl_HeaderT2A1.createParallelGroup(Alignment.LEADING)
						.addGap(0, 33, Short.MAX_VALUE)
						.addGroup(gl_HeaderT2A1.createSequentialGroup()
							.addGap(5)
							.addComponent(T2A1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
				);
				HeaderT2A1.setLayout(gl_HeaderT2A1);
				
				JPanel HeaderT2A2 = new JPanel();
				HeaderT2A2.setBackground(Color.WHITE);
				HeadersPannelloTempo.add(HeaderT2A2, "name_67109718129899");
				
				JLabel T2A2 = new JLabel("[Terminal - T2]          [Gate - A2]");
				T2A2.setHorizontalTextPosition(SwingConstants.CENTER);
				T2A2.setHorizontalAlignment(SwingConstants.CENTER);
				T2A2.setFont(new Font("Lucida Bright", Font.BOLD, 15));
				GroupLayout gl_HeaderT2A2 = new GroupLayout(HeaderT2A2);
				gl_HeaderT2A2.setHorizontalGroup(
					gl_HeaderT2A2.createParallelGroup(Alignment.LEADING)
						.addGap(0, 470, Short.MAX_VALUE)
						.addGroup(gl_HeaderT2A2.createSequentialGroup()
							.addContainerGap()
							.addComponent(T2A2, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
							.addContainerGap())
				);
				gl_HeaderT2A2.setVerticalGroup(
					gl_HeaderT2A2.createParallelGroup(Alignment.LEADING)
						.addGap(0, 33, Short.MAX_VALUE)
						.addGroup(gl_HeaderT2A2.createSequentialGroup()
							.addGap(5)
							.addComponent(T2A2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
				);
				HeaderT2A2.setLayout(gl_HeaderT2A2);
				
				JPanel HeaderT2A3 = new JPanel();
				HeaderT2A3.setBackground(Color.WHITE);
				HeadersPannelloTempo.add(HeaderT2A3, "name_67112120943300");
				
				JLabel T2A3 = new JLabel("[Terminal - T2]          [Gate - A3]");
				T2A3.setHorizontalTextPosition(SwingConstants.CENTER);
				T2A3.setHorizontalAlignment(SwingConstants.CENTER);
				T2A3.setFont(new Font("Lucida Bright", Font.BOLD, 15));
				GroupLayout gl_HeaderT2A3 = new GroupLayout(HeaderT2A3);
				gl_HeaderT2A3.setHorizontalGroup(
					gl_HeaderT2A3.createParallelGroup(Alignment.LEADING)
						.addGap(0, 470, Short.MAX_VALUE)
						.addGroup(gl_HeaderT2A3.createSequentialGroup()
							.addContainerGap()
							.addComponent(T2A3, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
							.addContainerGap())
				);
				gl_HeaderT2A3.setVerticalGroup(
					gl_HeaderT2A3.createParallelGroup(Alignment.LEADING)
						.addGap(0, 33, Short.MAX_VALUE)
						.addGroup(gl_HeaderT2A3.createSequentialGroup()
							.addGap(5)
							.addComponent(T2A3, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
				);
				HeaderT2A3.setLayout(gl_HeaderT2A3);
				
				JPanel HeaderT2A4 = new JPanel();
				HeaderT2A4.setBackground(Color.WHITE);
				HeadersPannelloTempo.add(HeaderT2A4, "name_67114490368900");
				
				JLabel T2A4 = new JLabel("[Terminal - T2]          [Gate - A4]");
				T2A4.setHorizontalTextPosition(SwingConstants.CENTER);
				T2A4.setHorizontalAlignment(SwingConstants.CENTER);
				T2A4.setFont(new Font("Lucida Bright", Font.BOLD, 15));
				GroupLayout gl_HeaderT2A4 = new GroupLayout(HeaderT2A4);
				gl_HeaderT2A4.setHorizontalGroup(
					gl_HeaderT2A4.createParallelGroup(Alignment.LEADING)
						.addGap(0, 470, Short.MAX_VALUE)
						.addGroup(gl_HeaderT2A4.createSequentialGroup()
							.addContainerGap()
							.addComponent(T2A4, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
							.addContainerGap())
				);
				gl_HeaderT2A4.setVerticalGroup(
					gl_HeaderT2A4.createParallelGroup(Alignment.LEADING)
						.addGap(0, 33, Short.MAX_VALUE)
						.addGroup(gl_HeaderT2A4.createSequentialGroup()
							.addGap(5)
							.addComponent(T2A4, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
				);
				HeaderT2A4.setLayout(gl_HeaderT2A4);
				
				JPanel HeaderT3A1 = new JPanel();
				HeaderT3A1.setBackground(Color.WHITE);
				HeadersPannelloTempo.add(HeaderT3A1, "name_67126302548900");
				
				JLabel T3A1 = new JLabel("[Terminal - T3]          [Gate - A1]");
				T3A1.setHorizontalTextPosition(SwingConstants.CENTER);
				T3A1.setHorizontalAlignment(SwingConstants.CENTER);
				T3A1.setFont(new Font("Lucida Bright", Font.BOLD, 15));
				GroupLayout gl_HeaderT3A1 = new GroupLayout(HeaderT3A1);
				gl_HeaderT3A1.setHorizontalGroup(
					gl_HeaderT3A1.createParallelGroup(Alignment.LEADING)
						.addGap(0, 470, Short.MAX_VALUE)
						.addGroup(gl_HeaderT3A1.createSequentialGroup()
							.addContainerGap()
							.addComponent(T3A1, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
							.addContainerGap())
				);
				gl_HeaderT3A1.setVerticalGroup(
					gl_HeaderT3A1.createParallelGroup(Alignment.LEADING)
						.addGap(0, 33, Short.MAX_VALUE)
						.addGroup(gl_HeaderT3A1.createSequentialGroup()
							.addGap(5)
							.addComponent(T3A1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
				);
				HeaderT3A1.setLayout(gl_HeaderT3A1);
				
				JPanel HeaderT3A2 = new JPanel();
				HeaderT3A2.setBackground(Color.WHITE);
				HeadersPannelloTempo.add(HeaderT3A2, "name_67128838461900");
				
				JLabel T3A2 = new JLabel("[Terminal - T3]          [Gate - A2]");
				T3A2.setHorizontalTextPosition(SwingConstants.CENTER);
				T3A2.setHorizontalAlignment(SwingConstants.CENTER);
				T3A2.setFont(new Font("Lucida Bright", Font.BOLD, 15));
				GroupLayout gl_HeaderT3A2 = new GroupLayout(HeaderT3A2);
				gl_HeaderT3A2.setHorizontalGroup(
					gl_HeaderT3A2.createParallelGroup(Alignment.LEADING)
						.addGap(0, 470, Short.MAX_VALUE)
						.addGroup(gl_HeaderT3A2.createSequentialGroup()
							.addContainerGap()
							.addComponent(T3A2, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
							.addContainerGap())
				);
				gl_HeaderT3A2.setVerticalGroup(
					gl_HeaderT3A2.createParallelGroup(Alignment.LEADING)
						.addGap(0, 33, Short.MAX_VALUE)
						.addGroup(gl_HeaderT3A2.createSequentialGroup()
							.addGap(5)
							.addComponent(T3A2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
				);
				HeaderT3A2.setLayout(gl_HeaderT3A2);
				
				JPanel HeaderT3A3 = new JPanel();
				HeaderT3A3.setBackground(Color.WHITE);
				HeadersPannelloTempo.add(HeaderT3A3, "name_67131400131100");
				
				JLabel T3A3 = new JLabel("[Terminal - T3]          [Gate - A3]");
				T3A3.setHorizontalTextPosition(SwingConstants.CENTER);
				T3A3.setHorizontalAlignment(SwingConstants.CENTER);
				T3A3.setFont(new Font("Lucida Bright", Font.BOLD, 15));
				GroupLayout gl_HeaderT3A3 = new GroupLayout(HeaderT3A3);
				gl_HeaderT3A3.setHorizontalGroup(
					gl_HeaderT3A3.createParallelGroup(Alignment.LEADING)
						.addGap(0, 470, Short.MAX_VALUE)
						.addGroup(gl_HeaderT3A3.createSequentialGroup()
							.addContainerGap()
							.addComponent(T3A3, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
							.addContainerGap())
				);
				gl_HeaderT3A3.setVerticalGroup(
					gl_HeaderT3A3.createParallelGroup(Alignment.LEADING)
						.addGap(0, 33, Short.MAX_VALUE)
						.addGroup(gl_HeaderT3A3.createSequentialGroup()
							.addGap(5)
							.addComponent(T3A3, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
				);
				HeaderT3A3.setLayout(gl_HeaderT3A3);
				
				JPanel HeaderT3A4 = new JPanel();
				HeaderT3A4.setBackground(Color.WHITE);
				HeadersPannelloTempo.add(HeaderT3A4, "name_67133820592400");
				
				JLabel T3A4 = new JLabel("[Terminal - T3]          [Gate - A4]");
				T3A4.setHorizontalTextPosition(SwingConstants.CENTER);
				T3A4.setHorizontalAlignment(SwingConstants.CENTER);
				T3A4.setFont(new Font("Lucida Bright", Font.BOLD, 15));
				GroupLayout gl_HeaderT3A4 = new GroupLayout(HeaderT3A4);
				gl_HeaderT3A4.setHorizontalGroup(
					gl_HeaderT3A4.createParallelGroup(Alignment.LEADING)
						.addGap(0, 470, Short.MAX_VALUE)
						.addGroup(gl_HeaderT3A4.createSequentialGroup()
							.addContainerGap()
							.addComponent(T3A4, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
							.addContainerGap())
				);
				gl_HeaderT3A4.setVerticalGroup(
					gl_HeaderT3A4.createParallelGroup(Alignment.LEADING)
						.addGap(0, 33, Short.MAX_VALUE)
						.addGroup(gl_HeaderT3A4.createSequentialGroup()
							.addGap(5)
							.addComponent(T3A4, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
				);
				HeaderT3A4.setLayout(gl_HeaderT3A4);
				
				JPanel HeaderT4A1 = new JPanel();
				HeaderT4A1.setBackground(Color.WHITE);
				HeadersPannelloTempo.add(HeaderT4A1, "name_67145817930499");
				
				JLabel T4A1 = new JLabel("[Terminal - T4]          [Gate - A1]");
				T4A1.setHorizontalTextPosition(SwingConstants.CENTER);
				T4A1.setHorizontalAlignment(SwingConstants.CENTER);
				T4A1.setFont(new Font("Lucida Bright", Font.BOLD, 15));
				GroupLayout gl_HeaderT4A1 = new GroupLayout(HeaderT4A1);
				gl_HeaderT4A1.setHorizontalGroup(
					gl_HeaderT4A1.createParallelGroup(Alignment.LEADING)
						.addGap(0, 470, Short.MAX_VALUE)
						.addGroup(gl_HeaderT4A1.createSequentialGroup()
							.addContainerGap()
							.addComponent(T4A1, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
							.addContainerGap())
				);
				gl_HeaderT4A1.setVerticalGroup(
					gl_HeaderT4A1.createParallelGroup(Alignment.LEADING)
						.addGap(0, 33, Short.MAX_VALUE)
						.addGroup(gl_HeaderT4A1.createSequentialGroup()
							.addGap(5)
							.addComponent(T4A1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
				);
				HeaderT4A1.setLayout(gl_HeaderT4A1);
				
				JPanel HeaderT4A2 = new JPanel();
				HeaderT4A2.setBackground(Color.WHITE);
				HeadersPannelloTempo.add(HeaderT4A2, "name_67148246877100");
				
				JLabel T4A2 = new JLabel("[Terminal - T4]          [Gate - A2]");
				T4A2.setHorizontalTextPosition(SwingConstants.CENTER);
				T4A2.setHorizontalAlignment(SwingConstants.CENTER);
				T4A2.setFont(new Font("Lucida Bright", Font.BOLD, 15));
				GroupLayout gl_HeaderT4A2 = new GroupLayout(HeaderT4A2);
				gl_HeaderT4A2.setHorizontalGroup(
					gl_HeaderT4A2.createParallelGroup(Alignment.LEADING)
						.addGap(0, 470, Short.MAX_VALUE)
						.addGroup(gl_HeaderT4A2.createSequentialGroup()
							.addContainerGap()
							.addComponent(T4A2, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
							.addContainerGap())
				);
				gl_HeaderT4A2.setVerticalGroup(
					gl_HeaderT4A2.createParallelGroup(Alignment.LEADING)
						.addGap(0, 33, Short.MAX_VALUE)
						.addGroup(gl_HeaderT4A2.createSequentialGroup()
							.addGap(5)
							.addComponent(T4A2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
				);
				HeaderT4A2.setLayout(gl_HeaderT4A2);
				
				JPanel HeaderT4A3 = new JPanel();
				HeaderT4A3.setBackground(Color.WHITE);
				HeadersPannelloTempo.add(HeaderT4A3, "name_67150729033700");
				
				JLabel T4A3 = new JLabel("[Terminal - T4]          [Gate - A3]");
				T4A3.setHorizontalTextPosition(SwingConstants.CENTER);
				T4A3.setHorizontalAlignment(SwingConstants.CENTER);
				T4A3.setFont(new Font("Lucida Bright", Font.BOLD, 15));
				GroupLayout gl_HeaderT4A3 = new GroupLayout(HeaderT4A3);
				gl_HeaderT4A3.setHorizontalGroup(
					gl_HeaderT4A3.createParallelGroup(Alignment.LEADING)
						.addGap(0, 470, Short.MAX_VALUE)
						.addGroup(gl_HeaderT4A3.createSequentialGroup()
							.addContainerGap()
							.addComponent(T4A3, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
							.addContainerGap())
				);
				gl_HeaderT4A3.setVerticalGroup(
					gl_HeaderT4A3.createParallelGroup(Alignment.LEADING)
						.addGap(0, 33, Short.MAX_VALUE)
						.addGroup(gl_HeaderT4A3.createSequentialGroup()
							.addGap(5)
							.addComponent(T4A3, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
				);
				HeaderT4A3.setLayout(gl_HeaderT4A3);
				
				JPanel HeaderT4A4 = new JPanel();
				HeaderT4A4.setBackground(Color.WHITE);
				HeadersPannelloTempo.add(HeaderT4A4, "name_67153110292300");
				
				JLabel T4A4 = new JLabel("[Terminal - T4]          [Gate - A4]");
				T4A4.setHorizontalTextPosition(SwingConstants.CENTER);
				T4A4.setHorizontalAlignment(SwingConstants.CENTER);
				T4A4.setFont(new Font("Lucida Bright", Font.BOLD, 15));
				GroupLayout gl_HeaderT4A4 = new GroupLayout(HeaderT4A4);
				gl_HeaderT4A4.setHorizontalGroup(
					gl_HeaderT4A4.createParallelGroup(Alignment.LEADING)
						.addGap(0, 470, Short.MAX_VALUE)
						.addGroup(gl_HeaderT4A4.createSequentialGroup()
							.addContainerGap()
							.addComponent(T4A4, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
							.addContainerGap())
				);
				gl_HeaderT4A4.setVerticalGroup(
					gl_HeaderT4A4.createParallelGroup(Alignment.LEADING)
						.addGap(0, 33, Short.MAX_VALUE)
						.addGroup(gl_HeaderT4A4.createSequentialGroup()
							.addGap(5)
							.addComponent(T4A4, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
				);
				HeaderT4A4.setLayout(gl_HeaderT4A4);
				PannelloTempo.setLayout(gl_PannelloTempo);
		
		DefaultListModel<String> ListModelTratte = new DefaultListModel<String>();
		theController.fillJList(ListModelTratte);
		
		OmbraHeaderGate = new JLabel("");
		OmbraHeaderGate.setBounds(0, -15, 1199, 63);
		OmbraHeaderGate.setIcon(new ImageIcon(AMain.class.getResource("/apResources/OmbraHeader.png")));
		PanelGate.add(OmbraHeaderGate);
		
		PulsanteHomeGate = new JButton("");
		PulsanteHomeGate.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconHome.png")));
		PulsanteHomeGate.setOpaque(false);
		PulsanteHomeGate.setFocusable(false);
		PulsanteHomeGate.setContentAreaFilled(false);
		PulsanteHomeGate.setBorderPainted(false);
		PulsanteHomeGate.setBounds(10, 10, 63, 51);
		PulsanteHomeGate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.switchPanel(Gate, Main);
			}
		});
		PanelGate.add(PulsanteHomeGate);
		getContentPane().setLayout(groupLayout);
		

		Info = new JLayeredPane();
		BodyContainer.add(Info, "name_154090102139000");
				
				
				
		JPanel PanelInfo = new JPanel();
		PanelInfo.setFocusTraversalPolicyProvider(true);
		PanelInfo.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		PanelInfo.setBorder(null);
		PanelInfo.setBackground(new Color(208, 215, 232));
		PanelInfo.setBounds(0, 0, 1193, 535);
		Info.add(PanelInfo);
		PanelInfo.setLayout(null);
				
		JLabel OmbraHeaderInfo = new JLabel("");
		OmbraHeaderInfo.setBounds(0, -15, 1199, 63);
		OmbraHeaderInfo.setIcon(new ImageIcon(AMain.class.getResource("/apResources/OmbraHeader.png")));
		PanelGate.add(OmbraHeaderInfo);
		
		JTabbedPane TerminalPane = new JTabbedPane(JTabbedPane.TOP);
		TerminalPane.setBounds(20, 80, 1141, 267);
		PanelGate.add(TerminalPane);
		
		JPanel PanelTerminale1 = new JPanel();
		PanelTerminale1.setLayout(null);
		PanelTerminale1.setBorder(new LineBorder(Color.WHITE, 2, true));
		PanelTerminale1.setBackground(new Color(166, 201, 227));
		TerminalPane.addTab("Terminal 1", null, PanelTerminale1, null);
		
		JPanel pannelloGatesT1 = new JPanel();
		pannelloGatesT1.setToolTipText("");
		pannelloGatesT1.setBounds(10, 11, 146, 211);
		PanelTerminale1.add(pannelloGatesT1);
		
		JLabel labelGatesT1 = new JLabel("Gates");
		labelGatesT1.setBounds(0, 0, 156, 32);
		labelGatesT1.setVerticalAlignment(SwingConstants.BOTTOM);
		labelGatesT1.setHorizontalTextPosition(SwingConstants.CENTER);
		labelGatesT1.setHorizontalAlignment(SwingConstants.CENTER);
		labelGatesT1.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		
		JPanel pannelloT1G1 = new JPanel();
		pannelloT1G1.setBounds(0, 43, 156, 32);
		pannelloT1G1.setBackground(new Color(255, 255, 255));
		
		JPanel pannelloT1G2 = new JPanel();
		pannelloT1G2.setBounds(0, 86, 146, 32);
		pannelloT1G2.setBackground(Color.WHITE);
		
		JLabel labelT1A2 = new JLabel("A2");
		labelT1A2.setBounds(0, 0, 146, 31);
		labelT1A2.setHorizontalAlignment(SwingConstants.CENTER);
		labelT1A2.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		
		JPanel pannelloT1G3 = new JPanel();
		pannelloT1G3.setBounds(0, 129, 146, 32);
		pannelloT1G3.setBackground(Color.WHITE);
		
		JLabel labelT1A3 = new JLabel("A3");
		labelT1A3.setBounds(0, 0, 146, 31);
		labelT1A3.setHorizontalAlignment(SwingConstants.CENTER);
		labelT1A3.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		
		JPanel pannelloT1G4 = new JPanel();
		pannelloT1G4.setBounds(0, 172, 146, 26);
		pannelloT1G4.setBackground(Color.WHITE);
		
		JLabel labelT1A4 = new JLabel("A4");
		labelT1A4.setBounds(0, 0, 146, 26);
		labelT1A4.setHorizontalAlignment(SwingConstants.CENTER);
		labelT1A4.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		
		JLabel labelT1A1 = new JLabel("A1");
		labelT1A1.setBounds(0, 0, 146, 32);
		labelT1A1.setHorizontalAlignment(SwingConstants.CENTER);
		labelT1A1.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		pannelloGatesT1.setLayout(null);
		pannelloGatesT1.add(labelGatesT1);
		pannelloGatesT1.add(pannelloT1G1);
		pannelloT1G1.setLayout(null);
		pannelloT1G1.add(labelT1A1);
		pannelloGatesT1.add(pannelloT1G2);
		pannelloT1G2.setLayout(null);
		pannelloT1G2.add(labelT1A2);
		pannelloGatesT1.add(pannelloT1G3);
		pannelloT1G3.setLayout(null);
		pannelloT1G3.add(labelT1A3);
		pannelloGatesT1.add(pannelloT1G4);
		pannelloT1G4.setLayout(null);
		pannelloT1G4.add(labelT1A4);
		
		JPanel pannelloT1A1 = new JPanel();
		pannelloT1A1.setBackground(new Color(255, 255, 255));
		pannelloT1A1.setBounds(166, 55, 960, 31);
		PanelTerminale1.add(pannelloT1A1);
		
		fieldT1A1 = new JTextField();
		fieldT1A1.setBounds(0, 0, 288, 31);
		fieldT1A1.setEditable(false);
		fieldT1A1.setColumns(10);
		
		codaFamiglieA1 = new JTextField();
		codaFamiglieA1.setBounds(342, 0, 111, 31);
		codaFamiglieA1.setEnabled(false);
		codaFamiglieA1.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaFamiglieA1.setText("coda famiglie");
		codaFamiglieA1.setEditable(false);
		codaFamiglieA1.setColumns(10);
		
		checkCodaFamiglieT1A1 = new JCheckBox("");
		checkCodaFamiglieT1A1.setBounds(459, 0, 21, 31);
		checkCodaFamiglieT1A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.controllaChecks(checksT1A1, checkCodaFamiglieT1A1);
			}
		});
		checkCodaFamiglieT1A1.setSelected(true);
		
		codaDisabiliA1 = new JTextField();
		codaDisabiliA1.setBounds(494, 0, 111, 31);
		codaDisabiliA1.setEnabled(false);
		codaDisabiliA1.setText("coda disabili");
		codaDisabiliA1.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaDisabiliA1.setEditable(false);
		codaDisabiliA1.setColumns(10);
		
		codaPriorirtyA1 = new JTextField();
		codaPriorirtyA1.setBounds(646, 0, 111, 31);
		codaPriorirtyA1.setText("coda priority");
		codaPriorirtyA1.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaPriorirtyA1.setEnabled(false);
		codaPriorirtyA1.setEditable(false);
		codaPriorirtyA1.setColumns(10);
		
		
		
		checkCodaDisabiliT1A1 = new JCheckBox("");
		checkCodaDisabiliT1A1.setBounds(611, 0, 21, 31);
		checkCodaDisabiliT1A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.controllaChecks(checksT1A1, checkCodaDisabiliT1A1);
			}
		});
		
		checkCodaPriorityT1A1 = new JCheckBox("");
		checkCodaPriorityT1A1.setBounds(763, 0, 21, 31);
		checkCodaPriorityT1A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.controllaChecks(checksT1A1, checkCodaPriorityT1A1);
			}
		});
		
		ButtonGroup groupTempo = new ButtonGroup();
		
		JTextField[][] fieldsTempo = {{FieldTempoStimatoGiorno, FieldTempoStimatoSettimana, FieldTempoStimatoMese}, {FieldTempoEffettivoGiorno, FieldTempoEffettivoSettimana, FieldTempoEffettivoAnno}};
		
		checksT1A1 = new JCheckBox[] {checkCodaFamiglieT1A1, checkCodaDisabiliT1A1, checkCodaPriorityT1A1};
		
		JPanel[] headersTempo= {HeaderT1A1, HeaderT1A2, HeaderT1A3, HeaderT1A4, HeaderT2A1, HeaderT2A2, HeaderT2A3, HeaderT2A4,
				HeaderT3A1, HeaderT3A2, HeaderT3A3, HeaderT3A4, HeaderT4A1, HeaderT4A2, HeaderT4A3, HeaderT4A4,};
		
		JRadioButton radioButtonT1A1 = new JRadioButton("");
		radioButtonT1A1.setBounds(824, 0, 21, 31);
		radioButtonT1A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.showAndSetTempo(PannelloTempo, groupTempo, fieldT1A1, headersTempo, fieldsTempo, checksT1A1, "T1A1");
			}
		});
		groupTempo.add(radioButtonT1A1);
		
	
		JButton pulsantePartenzaT1A1 = new JButton("");
		pulsantePartenzaT1A1.setBounds(881, 0, 79, 31);
		pulsantePartenzaT1A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.initPartenza("T1A1", fieldsTratte, fieldsPartenza, checksT1A1, intframePartenza);
			}
		});
		pulsantePartenzaT1A1.setOpaque(false);
		pulsantePartenzaT1A1.setFocusable(false);
		pulsantePartenzaT1A1.setContentAreaFilled(false);
		pulsantePartenzaT1A1.setBorderPainted(false);
		pulsantePartenzaT1A1.setIcon(new ImageIcon(AMain.class.getResource("/apResources/iconPartenza.png")));
		pannelloT1A1.setLayout(null);
		pannelloT1A1.add(fieldT1A1);
		pannelloT1A1.add(codaFamiglieA1);
		pannelloT1A1.add(checkCodaFamiglieT1A1);
		pannelloT1A1.add(codaDisabiliA1);
		pannelloT1A1.add(checkCodaDisabiliT1A1);
		pannelloT1A1.add(codaPriorirtyA1);
		pannelloT1A1.add(checkCodaPriorityT1A1);
		pannelloT1A1.add(radioButtonT1A1);
		pannelloT1A1.add(pulsantePartenzaT1A1);
		
		JPanel headerT1 = new JPanel();
		headerT1.setBackground(new Color(240, 240, 240));
		headerT1.setBounds(166, 11, 960, 43);
		PanelTerminale1.add(headerT1);
		
		JLabel labelTrattaGate = new JLabel("Tratta");
		labelTrattaGate.setHorizontalAlignment(SwingConstants.CENTER);
		labelTrattaGate.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		
		JLabel labelCodaGate = new JLabel("Code");
		labelCodaGate.setHorizontalAlignment(SwingConstants.CENTER);
		labelCodaGate.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		
		JLabel labelTempoGate = new JLabel("Tempo");
		labelTempoGate.setHorizontalAlignment(SwingConstants.CENTER);
		labelTempoGate.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		
		JLabel labelPartenzaGate = new JLabel("Partenza");
		labelPartenzaGate.setHorizontalAlignment(SwingConstants.CENTER);
		labelPartenzaGate.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		GroupLayout gl_headerT1 = new GroupLayout(headerT1);
		gl_headerT1.setHorizontalGroup(
			gl_headerT1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_headerT1.createSequentialGroup()
					.addContainerGap()
					.addComponent(labelTrattaGate, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
					.addGap(55)
					.addComponent(labelCodaGate, GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(labelTempoGate, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(labelPartenzaGate, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
		);
		gl_headerT1.setVerticalGroup(
			gl_headerT1.createParallelGroup(Alignment.LEADING)
				.addComponent(labelTrattaGate, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
				.addGroup(gl_headerT1.createParallelGroup(Alignment.BASELINE)
					.addComponent(labelPartenzaGate, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
					.addComponent(labelTempoGate, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
				.addComponent(labelCodaGate, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
		);
		headerT1.setLayout(gl_headerT1);
		
		pannelloT1A2 = new JPanel();
		pannelloT1A2.setBackground(Color.WHITE);
		pannelloT1A2.setBounds(166, 97, 960, 31);
		PanelTerminale1.add(pannelloT1A2);
		
		fieldT1A2 = new JTextField();
		fieldT1A2.setEditable(false);
		fieldT1A2.setColumns(10);
		
		codaFamiglieA2 = new JTextField();
		codaFamiglieA2.setText("coda famiglie");
		codaFamiglieA2.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaFamiglieA2.setEnabled(false);
		codaFamiglieA2.setEditable(false);
		codaFamiglieA2.setColumns(10);
		
		checkCodaFamiglieT1A2 = new JCheckBox("");
		checkCodaFamiglieT1A2.setSelected(true);
		
		codaDisabiliA2 = new JTextField();
		codaDisabiliA2.setText("coda disabili");
		codaDisabiliA2.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaDisabiliA2.setEnabled(false);
		codaDisabiliA2.setEditable(false);
		codaDisabiliA2.setColumns(10);
		
		checkCodaDisabiliT1A2 = new JCheckBox("");
		checkCodaDisabiliT1A2.setSelected(true);
		
		codaPriorirtyA2 = new JTextField();
		codaPriorirtyA2.setText("coda priority");
		codaPriorirtyA2.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaPriorirtyA2.setEnabled(false);
		codaPriorirtyA2.setEditable(false);
		codaPriorirtyA2.setColumns(10);
		
		checkCodaPriorityT1A2 = new JCheckBox("");
		
		checksT1A2 = new JCheckBox[] {checkCodaFamiglieT1A2, checkCodaDisabiliT1A2, checkCodaPriorityT1A2};
		
		JRadioButton radioButtonT1A2 = new JRadioButton("");
		radioButtonT1A2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.showAndSetTempo(PannelloTempo, groupTempo, fieldT1A2, headersTempo, fieldsTempo, checksT1A2, "T1A2");
			}
		});
		groupTempo.add(radioButtonT1A2);
		
		JButton pulsantePartenzaT1A2 = new JButton("");
		pulsantePartenzaT1A2.setBorderPainted(false);pulsantePartenzaT1A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.initPartenza("T1A2", fieldsTratte, fieldsPartenza, checksT1A2, intframePartenza);
			}
		});
		pulsantePartenzaT1A2.setOpaque(false);
		pulsantePartenzaT1A2.setFocusable(false);
		pulsantePartenzaT1A2.setContentAreaFilled(false);
		pulsantePartenzaT1A2.setBorderPainted(false);
		pulsantePartenzaT1A2.setIcon(new ImageIcon(AMain.class.getResource("/apResources/iconPartenza.png")));
		GroupLayout gl_pannelloT1A2 = new GroupLayout(pannelloT1A2);
		gl_pannelloT1A2.setHorizontalGroup(
			gl_pannelloT1A2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pannelloT1A2.createSequentialGroup()
					.addComponent(fieldT1A2, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
					.addGap(54)
					.addComponent(codaFamiglieA2, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkCodaFamiglieT1A2)
					.addGap(14)
					.addComponent(codaDisabiliA2, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(checkCodaDisabiliT1A2)
					.addGap(14)
					.addComponent(codaPriorirtyA2, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(checkCodaPriorityT1A2)
					.addGap(38)
					.addComponent(radioButtonT1A2)
					.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
					.addComponent(pulsantePartenzaT1A2, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
		);
		gl_pannelloT1A2.setVerticalGroup(
			gl_pannelloT1A2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pannelloT1A2.createSequentialGroup()
					.addGroup(gl_pannelloT1A2.createParallelGroup(Alignment.LEADING)
						.addComponent(checkCodaFamiglieT1A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaDisabiliA2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkCodaDisabiliT1A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaPriorirtyA2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkCodaPriorityT1A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(radioButtonT1A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaFamiglieA2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(fieldT1A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(pulsantePartenzaT1A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		pannelloT1A2.setLayout(gl_pannelloT1A2);
		
		JPanel pannelloT1A3 = new JPanel();
		pannelloT1A3.setBackground(Color.WHITE);
		pannelloT1A3.setBounds(166, 139, 960, 31);
		PanelTerminale1.add(pannelloT1A3);
		
		fieldT1A3 = new JTextField();
		fieldT1A3.setBounds(0, 0, 289, 31);
		fieldT1A3.setEditable(false);
		fieldT1A3.setColumns(10);
		
		codaFamiglieA3 = new JTextField();
		codaFamiglieA3.setBounds(343, 0, 111, 31);
		codaFamiglieA3.setText("coda famiglie");
		codaFamiglieA3.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaFamiglieA3.setEnabled(false);
		codaFamiglieA3.setEditable(false);
		codaFamiglieA3.setColumns(10);
		
		checkCodaFamiglieT1A3 = new JCheckBox("");
		checkCodaFamiglieT1A3.setBounds(460, 0, 21, 31);
		checkCodaFamiglieT1A3.setSelected(true);
		
		codaDisabiliA3 = new JTextField();
		codaDisabiliA3.setBounds(495, 0, 111, 31);
		codaDisabiliA3.setText("coda disabili");
		codaDisabiliA3.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaDisabiliA3.setEnabled(false);
		codaDisabiliA3.setEditable(false);
		codaDisabiliA3.setColumns(10);
		
		checkCodaDisabiliT1A3 = new JCheckBox("");
		checkCodaDisabiliT1A3.setBounds(612, 0, 21, 31);
		
		codaPriorirtyA3 = new JTextField();
		codaPriorirtyA3.setBounds(647, 0, 111, 31);
		codaPriorirtyA3.setText("coda priority");
		codaPriorirtyA3.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaPriorirtyA3.setEnabled(false);
		codaPriorirtyA3.setEditable(false);
		codaPriorirtyA3.setColumns(10);
		
		checkCodaPriorityT1A3 = new JCheckBox("");
		checkCodaPriorityT1A3.setSelected(true);
		checkCodaPriorityT1A3.setBounds(764, 0, 21, 31);
		

		checksT1A3 = new JCheckBox[] {checkCodaFamiglieT1A3, checkCodaDisabiliT1A3, checkCodaPriorityT1A3};
		
		JRadioButton radioButtonT1A3 = new JRadioButton("");
		radioButtonT1A3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.showAndSetTempo(PannelloTempo, groupTempo, fieldT1A3, headersTempo, fieldsTempo, checksT1A3, "T1A3");
			}
		});
		radioButtonT1A3.setBounds(823, 0, 21, 31);
		groupTempo.add(radioButtonT1A3);
		
		JButton pulsantePartenzaT1A3 = new JButton("");
		pulsantePartenzaT1A3.setBounds(881, 0, 79, 31);
		pulsantePartenzaT1A3.setBorderPainted(false);
		pulsantePartenzaT1A3.setContentAreaFilled(false);
		pulsantePartenzaT1A3.setOpaque(false);
		pulsantePartenzaT1A3.setFocusable(false);
		pulsantePartenzaT1A3.setIcon(new ImageIcon(AMain.class.getResource("/apResources/iconPartenza.png")));
		pulsantePartenzaT1A3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.initPartenza("T1A3", fieldsTratte, fieldsPartenza, checksT1A3, intframePartenza);
			}
		});
		pannelloT1A3.setLayout(null);
		pannelloT1A3.add(fieldT1A3);
		pannelloT1A3.add(codaFamiglieA3);
		pannelloT1A3.add(checkCodaFamiglieT1A3);
		pannelloT1A3.add(codaDisabiliA3);
		pannelloT1A3.add(checkCodaDisabiliT1A3);
		pannelloT1A3.add(codaPriorirtyA3);
		pannelloT1A3.add(checkCodaPriorityT1A3);
		pannelloT1A3.add(radioButtonT1A3);
		pannelloT1A3.add(pulsantePartenzaT1A3);
		
		JPanel pannelloT1A4 = new JPanel();
		pannelloT1A4.setBackground(Color.WHITE);
		pannelloT1A4.setBounds(166, 181, 960, 31);
		PanelTerminale1.add(pannelloT1A4);
		
		fieldT1A4 = new JTextField();
		fieldT1A4.setBounds(0, 0, 289, 31);
		fieldT1A4.setEditable(false);
		fieldT1A4.setColumns(10);
		
		codaFamiglieA4 = new JTextField();
		codaFamiglieA4.setBounds(343, 0, 111, 31);
		codaFamiglieA4.setText("coda famiglie");
		codaFamiglieA4.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaFamiglieA4.setEnabled(false);
		codaFamiglieA4.setEditable(false);
		codaFamiglieA4.setColumns(10);
		
		checkCodaFamiglieT1A4 = new JCheckBox("");
		checkCodaFamiglieT1A4.setBounds(460, 0, 21, 31);
		
		codaDisabiliA4 = new JTextField();
		codaDisabiliA4.setBounds(495, 0, 111, 31);
		codaDisabiliA4.setText("coda disabili");
		codaDisabiliA4.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaDisabiliA4.setEnabled(false);
		codaDisabiliA4.setEditable(false);
		codaDisabiliA4.setColumns(10);
		
		checkCodaDisabiliT1A4 = new JCheckBox("");
		checkCodaDisabiliT1A4.setBounds(612, 0, 21, 31);
		
		codaPriorirtyA4 = new JTextField();
		codaPriorirtyA4.setBounds(647, 0, 111, 31);
		codaPriorirtyA4.setText("coda priority");
		codaPriorirtyA4.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaPriorirtyA4.setEnabled(false);
		codaPriorirtyA4.setEditable(false);
		codaPriorirtyA4.setColumns(10);
		
		checkCodaPriorityT1A4 = new JCheckBox("");
		checkCodaPriorityT1A4.setSelected(true);
		checkCodaPriorityT1A4.setBounds(764, 0, 21, 31);
		

		checksT1A4 = new JCheckBox[] {checkCodaFamiglieT1A4, checkCodaDisabiliT1A4, checkCodaPriorityT1A4};
		
		JRadioButton radioButtonT1A4 = new JRadioButton("");
		radioButtonT1A4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.showAndSetTempo(PannelloTempo, groupTempo, fieldT1A4, headersTempo, fieldsTempo, checksT1A4, "T1A4");
			}
		});
		radioButtonT1A4.setBounds(821, 0, 21, 31);
		groupTempo.add(radioButtonT1A4);
		
		JButton pulsantePartenzaT1A4 = new JButton("");
		pulsantePartenzaT1A4.setBorderPainted(false);
		pulsantePartenzaT1A4.setContentAreaFilled(false);
		pulsantePartenzaT1A4.setOpaque(false);
		pulsantePartenzaT1A4.setFocusable(false);
		pulsantePartenzaT1A4.setBounds(881, 0, 79, 31);
		pulsantePartenzaT1A4.setIcon(new ImageIcon(AMain.class.getResource("/apResources/iconPartenza.png")));
		pulsantePartenzaT1A3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.initPartenza("T1A4", fieldsTratte, fieldsPartenza, checksT1A4, intframePartenza);
			}
		});
		pannelloT1A4.setLayout(null);
		pannelloT1A4.add(fieldT1A4);
		pannelloT1A4.add(codaFamiglieA4);
		pannelloT1A4.add(checkCodaFamiglieT1A4);
		pannelloT1A4.add(codaDisabiliA4);
		pannelloT1A4.add(checkCodaDisabiliT1A4);
		pannelloT1A4.add(codaPriorirtyA4);
		pannelloT1A4.add(checkCodaPriorityT1A4);
		pannelloT1A4.add(radioButtonT1A4);
		pannelloT1A4.add(pulsantePartenzaT1A4);
		
		JPanel PanelTerminale2 = new JPanel();
		PanelTerminale2.setBorder(new LineBorder(Color.WHITE, 2, true));
		PanelTerminale2.setBackground(new Color(128, 179, 216));
		TerminalPane.addTab("Terminal 2", null, PanelTerminale2, null);
		
		JPanel pannelloGateT2 = new JPanel();
		pannelloGateT2.setToolTipText("");
		
		JLabel labelGatesT2 = new JLabel("Gates");
		labelGatesT2.setVerticalAlignment(SwingConstants.BOTTOM);
		labelGatesT2.setHorizontalTextPosition(SwingConstants.CENTER);
		labelGatesT2.setHorizontalAlignment(SwingConstants.CENTER);
		labelGatesT2.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		
		JPanel pannelloT2G1 = new JPanel();
		pannelloT2G1.setBackground(Color.WHITE);
		
		JLabel labelT2A1 = new JLabel("A1");
		labelT2A1.setHorizontalAlignment(SwingConstants.CENTER);
		labelT2A1.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		GroupLayout gl_pannelloT2G1 = new GroupLayout(pannelloT2G1);
		gl_pannelloT2G1.setHorizontalGroup(
			gl_pannelloT2G1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 156, Short.MAX_VALUE)
				.addGroup(gl_pannelloT2G1.createSequentialGroup()
					.addComponent(labelT2A1, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_pannelloT2G1.setVerticalGroup(
			gl_pannelloT2G1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 32, Short.MAX_VALUE)
				.addComponent(labelT2A1, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
		);
		pannelloT2G1.setLayout(gl_pannelloT2G1);
		
		JPanel pannelloT2G2 = new JPanel();
		pannelloT2G2.setBackground(Color.WHITE);
		
		JLabel labelT2A2 = new JLabel("A2");
		labelT2A2.setHorizontalAlignment(SwingConstants.CENTER);
		labelT2A2.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		GroupLayout gl_pannelloT2G2 = new GroupLayout(pannelloT2G2);
		gl_pannelloT2G2.setHorizontalGroup(
			gl_pannelloT2G2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 146, Short.MAX_VALUE)
				.addComponent(labelT2A2, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
		);
		gl_pannelloT2G2.setVerticalGroup(
			gl_pannelloT2G2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 32, Short.MAX_VALUE)
				.addGroup(gl_pannelloT2G2.createSequentialGroup()
					.addComponent(labelT2A2, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
					.addGap(1))
		);
		pannelloT2G2.setLayout(gl_pannelloT2G2);
		
		pannelloT2G3 = new JPanel();
		pannelloT2G3.setBackground(Color.WHITE);
		
		JLabel labelT2A3 = new JLabel("A3");
		labelT2A3.setHorizontalAlignment(SwingConstants.CENTER);
		labelT2A3.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		GroupLayout gl_pannelloT2G3 = new GroupLayout(pannelloT2G3);
		gl_pannelloT2G3.setHorizontalGroup(
			gl_pannelloT2G3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 146, Short.MAX_VALUE)
				.addComponent(labelT2A3, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
		);
		gl_pannelloT2G3.setVerticalGroup(
			gl_pannelloT2G3.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 32, Short.MAX_VALUE)
				.addGroup(gl_pannelloT2G3.createSequentialGroup()
					.addComponent(labelT2A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pannelloT2G3.setLayout(gl_pannelloT2G3);
		
		JPanel pannelloT2G4 = new JPanel();
		pannelloT2G4.setBackground(Color.WHITE);
		
		JLabel labelT2A4 = new JLabel("A4");
		labelT2A4.setHorizontalAlignment(SwingConstants.CENTER);
		labelT2A4.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		GroupLayout gl_pannelloT2G4 = new GroupLayout(pannelloT2G4);
		gl_pannelloT2G4.setHorizontalGroup(
			gl_pannelloT2G4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 146, Short.MAX_VALUE)
				.addComponent(labelT2A4, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
		);
		gl_pannelloT2G4.setVerticalGroup(
			gl_pannelloT2G4.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 26, Short.MAX_VALUE)
				.addComponent(labelT2A4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
		);
		pannelloT2G4.setLayout(gl_pannelloT2G4);
		GroupLayout gl_pannelloGateT2 = new GroupLayout(pannelloGateT2);
		gl_pannelloGateT2.setHorizontalGroup(
			gl_pannelloGateT2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 146, Short.MAX_VALUE)
				.addComponent(labelGatesT2, GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
				.addComponent(pannelloT2G1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
				.addGroup(gl_pannelloGateT2.createSequentialGroup()
					.addComponent(pannelloT2G2, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_pannelloGateT2.createSequentialGroup()
					.addComponent(pannelloT2G3, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_pannelloGateT2.createSequentialGroup()
					.addComponent(pannelloT2G4, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_pannelloGateT2.setVerticalGroup(
			gl_pannelloGateT2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 211, Short.MAX_VALUE)
				.addGroup(gl_pannelloGateT2.createSequentialGroup()
					.addComponent(labelGatesT2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(pannelloT2G1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(pannelloT2G2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(pannelloT2G3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(pannelloT2G4, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(13, Short.MAX_VALUE))
		);
		pannelloGateT2.setLayout(gl_pannelloGateT2);
		
		JPanel pannelloT2A1 = new JPanel();
		pannelloT2A1.setBackground(Color.WHITE);
		
		fieldT2A1 = new JTextField();
		fieldT2A1.setEditable(false);
		fieldT2A1.setColumns(10);
		
		JTextField codaFamiglieT2A1 = new JTextField();
		codaFamiglieT2A1.setText("coda famiglie");
		codaFamiglieT2A1.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaFamiglieT2A1.setEnabled(false);
		codaFamiglieT2A1.setEditable(false);
		codaFamiglieT2A1.setColumns(10);
		
		checkCodaFamiglieT2A1 = new JCheckBox("");
		checkCodaFamiglieT2A1.setSelected(true);
		
		codaDisabiliT2A1 = new JTextField();
		codaDisabiliT2A1.setText("coda disabili");
		codaDisabiliT2A1.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaDisabiliT2A1.setEnabled(false);
		codaDisabiliT2A1.setEditable(false);
		codaDisabiliT2A1.setColumns(10);
		
		checkCodaDisabiliT2A1 = new JCheckBox("");
		checkCodaDisabiliT2A1.setSelected(true);
		
		codaPriorityT2A1 = new JTextField();
		codaPriorityT2A1.setText("coda priority");
		codaPriorityT2A1.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaPriorityT2A1.setEnabled(false);
		codaPriorityT2A1.setEditable(false);
		codaPriorityT2A1.setColumns(10);
		
		checkCodaPriorityT2A1 = new JCheckBox("");
		
		checksT2A1 = new JCheckBox[] {checkCodaFamiglieT2A1, checkCodaDisabiliT2A1, checkCodaPriorityT2A1};
		
		JRadioButton radioButtonT2A1 = new JRadioButton("");
		radioButtonT2A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.showAndSetTempo(PannelloTempo, groupTempo, fieldT2A1, headersTempo, fieldsTempo, checksT2A1, "T2A1");
			}
		});
		groupTempo.add(radioButtonT2A1);
		
		JButton pulsantePartenzaT2A1 = new JButton("");
		pulsantePartenzaT2A1.setIcon(new ImageIcon(AMain.class.getResource("/apResources/iconPartenza.png")));
		pulsantePartenzaT2A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.initPartenza("T2A1", fieldsTratte, fieldsPartenza, checksT2A1, intframePartenza);
			}
		});
		pulsantePartenzaT2A1.setOpaque(false);
		pulsantePartenzaT2A1.setFocusable(false);
		pulsantePartenzaT2A1.setContentAreaFilled(false);
		pulsantePartenzaT2A1.setBorderPainted(false);
		GroupLayout gl_pannelloT2A1 = new GroupLayout(pannelloT2A1);
		gl_pannelloT2A1.setHorizontalGroup(
			gl_pannelloT2A1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pannelloT2A1.createSequentialGroup()
					.addComponent(fieldT2A1, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE)
					.addGap(54)
					.addComponent(codaFamiglieT2A1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkCodaFamiglieT2A1)
					.addGap(14)
					.addComponent(codaDisabiliT2A1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkCodaDisabiliT2A1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(codaPriorityT2A1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkCodaPriorityT2A1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
					.addComponent(radioButtonT2A1)
					.addGap(36)
					.addComponent(pulsantePartenzaT2A1, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
		);
		gl_pannelloT2A1.setVerticalGroup(
			gl_pannelloT2A1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pannelloT2A1.createSequentialGroup()
					.addGroup(gl_pannelloT2A1.createParallelGroup(Alignment.LEADING)
						.addComponent(fieldT2A1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(radioButtonT2A1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(checkCodaPriorityT2A1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(codaPriorityT2A1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(checkCodaDisabiliT2A1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(codaDisabiliT2A1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(checkCodaFamiglieT2A1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(codaFamiglieT2A1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(pulsantePartenzaT2A1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		pannelloT2A1.setLayout(gl_pannelloT2A1);
		
		JPanel headerT2 = new JPanel();
		headerT2.setBackground(SystemColor.menu);
		
		JLabel labelTrattaT2 = new JLabel("Tratta");
		labelTrattaT2.setHorizontalAlignment(SwingConstants.CENTER);
		labelTrattaT2.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		
		JLabel labelCodeT2 = new JLabel("Code");
		labelCodeT2.setHorizontalAlignment(SwingConstants.CENTER);
		labelCodeT2.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		
		JLabel labelTempoT2 = new JLabel("Tempo");
		labelTempoT2.setHorizontalAlignment(SwingConstants.CENTER);
		labelTempoT2.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		
		JLabel labelPartenzaT2 = new JLabel("Partenza");
		labelPartenzaT2.setHorizontalAlignment(SwingConstants.CENTER);
		labelPartenzaT2.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		GroupLayout gl_headerT2 = new GroupLayout(headerT2);
		gl_headerT2.setHorizontalGroup(
			gl_headerT2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 960, Short.MAX_VALUE)
				.addGroup(gl_headerT2.createSequentialGroup()
					.addContainerGap()
					.addComponent(labelTrattaT2, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
					.addGap(55)
					.addComponent(labelCodeT2, GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(labelTempoT2, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(labelPartenzaT2, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
		);
		gl_headerT2.setVerticalGroup(
			gl_headerT2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 43, Short.MAX_VALUE)
				.addComponent(labelTrattaT2, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
				.addGroup(gl_headerT2.createParallelGroup(Alignment.BASELINE)
					.addComponent(labelPartenzaT2, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
					.addComponent(labelTempoT2, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
				.addComponent(labelCodeT2, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
		);
		headerT2.setLayout(gl_headerT2);
		
		JPanel pannelloT2A2 = new JPanel();
		pannelloT2A2.setBackground(Color.WHITE);
		
		fieldT2A2 = new JTextField();
		fieldT2A2.setEditable(false);
		fieldT2A2.setColumns(10);
		
		codaFamiglieT2A2 = new JTextField();
		codaFamiglieT2A2.setText("coda famiglie");
		codaFamiglieT2A2.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaFamiglieT2A2.setEnabled(false);
		codaFamiglieT2A2.setEditable(false);
		codaFamiglieT2A2.setColumns(10);
		
		checkCodaFamiglieT2A2 = new JCheckBox("");
		
		codaDisabiliT2A2 = new JTextField();
		codaDisabiliT2A2.setText("coda disabili");
		codaDisabiliT2A2.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaDisabiliT2A2.setEnabled(false);
		codaDisabiliT2A2.setEditable(false);
		codaDisabiliT2A2.setColumns(10);
		
		checkCodaDisabiliT2A2 = new JCheckBox("");
		
		codaPriorityT2A2 = new JTextField();
		codaPriorityT2A2.setText("coda priority");
		codaPriorityT2A2.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaPriorityT2A2.setEnabled(false);
		codaPriorityT2A2.setEditable(false);
		codaPriorityT2A2.setColumns(10);
		
		checkCodaPriorityT2A2 = new JCheckBox("");
		checkCodaPriorityT2A2.setSelected(true);
		

		checksT2A2 = new JCheckBox[] {checkCodaFamiglieT2A2, checkCodaDisabiliT2A2, checkCodaPriorityT2A2};
		
		JRadioButton radioButtonT2A2 = new JRadioButton("");
		radioButtonT2A2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.showAndSetTempo(PannelloTempo, groupTempo, fieldT2A2, headersTempo, fieldsTempo, checksT2A2, "T2A2");
			}
		});
		groupTempo.add(radioButtonT2A2);
		
		JButton pulsantePartenzaT2A2 = new JButton("");
		pulsantePartenzaT2A2.setIcon(new ImageIcon(AMain.class.getResource("/apResources/iconPartenza.png")));
		pulsantePartenzaT2A2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.initPartenza("T2A2", fieldsTratte, fieldsPartenza, checksT2A2, intframePartenza);
			}
		});
		pulsantePartenzaT2A2.setOpaque(false);
		pulsantePartenzaT2A2.setFocusable(false);
		pulsantePartenzaT2A2.setContentAreaFilled(false);
		pulsantePartenzaT2A2.setBorderPainted(false);
		GroupLayout gl_pannelloT2A2 = new GroupLayout(pannelloT2A2);
		gl_pannelloT2A2.setHorizontalGroup(
			gl_pannelloT2A2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pannelloT2A2.createSequentialGroup()
					.addComponent(fieldT2A2, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
					.addGap(54)
					.addComponent(codaFamiglieT2A2, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkCodaFamiglieT2A2)
					.addGap(14)
					.addComponent(codaDisabiliT2A2, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(checkCodaDisabiliT2A2)
					.addGap(14)
					.addComponent(codaPriorityT2A2, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(checkCodaPriorityT2A2)
					.addGap(38)
					.addComponent(radioButtonT2A2)
					.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
					.addComponent(pulsantePartenzaT2A2, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
		);
		gl_pannelloT2A2.setVerticalGroup(
			gl_pannelloT2A2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pannelloT2A2.createSequentialGroup()
					.addGroup(gl_pannelloT2A2.createParallelGroup(Alignment.LEADING)
						.addComponent(checkCodaFamiglieT2A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaDisabiliT2A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkCodaDisabiliT2A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaPriorityT2A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkCodaPriorityT2A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(radioButtonT2A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaFamiglieT2A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(fieldT2A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(pulsantePartenzaT2A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		pannelloT2A2.setLayout(gl_pannelloT2A2);
		
		JPanel pannelloT2A3 = new JPanel();
		pannelloT2A3.setBackground(Color.WHITE);
		
		fieldT2A3 = new JTextField();
		fieldT2A3.setEditable(false);
		fieldT2A3.setColumns(10);
		
		codaFamiglieT2A3 = new JTextField();
		codaFamiglieT2A3.setText("coda famiglie");
		codaFamiglieT2A3.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaFamiglieT2A3.setEnabled(false);
		codaFamiglieT2A3.setEditable(false);
		codaFamiglieT2A3.setColumns(10);
		
		checkCodaFamiglieT2A3 = new JCheckBox("");
		
		codaDisabiliT2A3 = new JTextField();
		codaDisabiliT2A3.setText("coda disabili");
		codaDisabiliT2A3.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaDisabiliT2A3.setEnabled(false);
		codaDisabiliT2A3.setEditable(false);
		codaDisabiliT2A3.setColumns(10);
		
		checkCodaDisabiliT2A3 = new JCheckBox("");
		checkCodaDisabiliT2A3.setSelected(true);
		
		codaPriorityT2A3 = new JTextField();
		codaPriorityT2A3.setText("coda priority");
		codaPriorityT2A3.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaPriorityT2A3.setEnabled(false);
		codaPriorityT2A3.setEditable(false);
		codaPriorityT2A3.setColumns(10);
		
		checkCodaPriorityT2A3 = new JCheckBox("");
		checkCodaPriorityT2A3.setSelected(true);
		

		checksT2A3 = new JCheckBox[] {checkCodaFamiglieT2A3, checkCodaDisabiliT2A3, checkCodaPriorityT2A3};
		
		JRadioButton radioButtonT2A3 = new JRadioButton("");
		radioButtonT2A3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.showAndSetTempo(PannelloTempo, groupTempo, fieldT2A3, headersTempo, fieldsTempo, checksT2A3, "T2A3");
			}
		});
		groupTempo.add(radioButtonT2A3);
		
		JButton pulsantePartenzaT2A3 = new JButton("");
		pulsantePartenzaT2A3.setIcon(new ImageIcon(AMain.class.getResource("/apResources/iconPartenza.png")));
		pulsantePartenzaT2A3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.initPartenza("T2A2", fieldsTratte, fieldsPartenza, checksT2A2, intframePartenza);
			}
		});
		pulsantePartenzaT2A3.setOpaque(false);
		pulsantePartenzaT2A3.setFocusable(false);
		pulsantePartenzaT2A3.setContentAreaFilled(false);
		pulsantePartenzaT2A3.setBorderPainted(false);
		GroupLayout gl_pannelloT2A3 = new GroupLayout(pannelloT2A3);
		gl_pannelloT2A3.setHorizontalGroup(
			gl_pannelloT2A3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pannelloT2A3.createSequentialGroup()
					.addComponent(fieldT2A3, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
					.addGap(54)
					.addComponent(codaFamiglieT2A3, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkCodaFamiglieT2A3)
					.addGap(14)
					.addComponent(codaDisabiliT2A3, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(checkCodaDisabiliT2A3)
					.addGap(14)
					.addComponent(codaPriorityT2A3, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(checkCodaPriorityT2A3)
					.addGap(38)
					.addComponent(radioButtonT2A3)
					.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
					.addComponent(pulsantePartenzaT2A3, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
		);
		gl_pannelloT2A3.setVerticalGroup(
			gl_pannelloT2A3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pannelloT2A3.createSequentialGroup()
					.addGroup(gl_pannelloT2A3.createParallelGroup(Alignment.LEADING)
						.addComponent(checkCodaFamiglieT2A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaDisabiliT2A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkCodaDisabiliT2A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaPriorityT2A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkCodaPriorityT2A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(radioButtonT2A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaFamiglieT2A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(fieldT2A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(pulsantePartenzaT2A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		pannelloT2A3.setLayout(gl_pannelloT2A3);
		
		JPanel pannelloT2A4 = new JPanel();
		pannelloT2A4.setBackground(Color.WHITE);
		
		fieldT2A4 = new JTextField();
		fieldT2A4.setEditable(false);
		fieldT2A4.setColumns(10);
		
		codaFamiglieT2A4 = new JTextField();
		codaFamiglieT2A4.setText("coda famiglie");
		codaFamiglieT2A4.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaFamiglieT2A4.setEnabled(false);
		codaFamiglieT2A4.setEditable(false);
		codaFamiglieT2A4.setColumns(10);
		
		checkCodaFamiglieT2A4 = new JCheckBox("");
		checkCodaFamiglieT2A4.setSelected(true);
		
		codaDisabiliT2A4 = new JTextField();
		codaDisabiliT2A4.setText("coda disabili");
		codaDisabiliT2A4.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaDisabiliT2A4.setEnabled(false);
		codaDisabiliT2A4.setEditable(false);
		codaDisabiliT2A4.setColumns(10);
		
		checkCodaDisabiliT2A4 = new JCheckBox("");
		
		codaPriorityT2A4 = new JTextField();
		codaPriorityT2A4.setText("coda priority");
		codaPriorityT2A4.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaPriorityT2A4.setEnabled(false);
		codaPriorityT2A4.setEditable(false);
		codaPriorityT2A4.setColumns(10);
		
		checkCodaPriorityT2A4 = new JCheckBox("");

		checksT2A4 = new JCheckBox[] {checkCodaFamiglieT2A4, checkCodaDisabiliT2A4, checkCodaPriorityT2A4};
		
		JRadioButton radioButtonT2A4 = new JRadioButton("");
		radioButtonT2A4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.showAndSetTempo(PannelloTempo, groupTempo, fieldT2A4, headersTempo, fieldsTempo, checksT2A4, "T2A4");
			}
		});
		groupTempo.add(radioButtonT2A4);
		
		JButton pulsantePartenzaT2A4 = new JButton("");
		pulsantePartenzaT2A4.setIcon(new ImageIcon(AMain.class.getResource("/apResources/iconPartenza.png")));
		pulsantePartenzaT2A4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.initPartenza("T2A2", fieldsTratte, fieldsPartenza, checksT2A2, intframePartenza);
			}
		});
		pulsantePartenzaT2A4.setOpaque(false);
		pulsantePartenzaT2A4.setFocusable(false);
		pulsantePartenzaT2A4.setContentAreaFilled(false);
		pulsantePartenzaT2A4.setBorderPainted(false);
		GroupLayout gl_pannelloT2A4 = new GroupLayout(pannelloT2A4);
		gl_pannelloT2A4.setHorizontalGroup(
			gl_pannelloT2A4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pannelloT2A4.createSequentialGroup()
					.addComponent(fieldT2A4, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
					.addGap(54)
					.addComponent(codaFamiglieT2A4, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkCodaFamiglieT2A4)
					.addGap(14)
					.addComponent(codaDisabiliT2A4, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(checkCodaDisabiliT2A4)
					.addGap(14)
					.addComponent(codaPriorityT2A4, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(checkCodaPriorityT2A4)
					.addGap(36)
					.addComponent(radioButtonT2A4)
					.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
					.addComponent(pulsantePartenzaT2A4, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
		);
		gl_pannelloT2A4.setVerticalGroup(
			gl_pannelloT2A4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pannelloT2A4.createSequentialGroup()
					.addGroup(gl_pannelloT2A4.createParallelGroup(Alignment.LEADING)
						.addComponent(checkCodaFamiglieT2A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaDisabiliT2A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkCodaDisabiliT2A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaPriorityT2A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkCodaPriorityT2A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(radioButtonT2A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaFamiglieT2A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(fieldT2A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(pulsantePartenzaT2A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		pannelloT2A4.setLayout(gl_pannelloT2A4);
		GroupLayout gl_PanelTerminale2 = new GroupLayout(PanelTerminale2);
		gl_PanelTerminale2.setHorizontalGroup(
			gl_PanelTerminale2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PanelTerminale2.createSequentialGroup()
					.addGap(8)
					.addComponent(pannelloGateT2, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addGroup(gl_PanelTerminale2.createParallelGroup(Alignment.LEADING)
						.addComponent(headerT2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(pannelloT2A1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(pannelloT2A2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(pannelloT2A3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(pannelloT2A4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		gl_PanelTerminale2.setVerticalGroup(
			gl_PanelTerminale2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PanelTerminale2.createSequentialGroup()
					.addGap(9)
					.addGroup(gl_PanelTerminale2.createParallelGroup(Alignment.LEADING)
						.addComponent(pannelloGateT2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_PanelTerminale2.createSequentialGroup()
							.addComponent(headerT2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(1)
							.addComponent(pannelloT2A1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(pannelloT2A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(pannelloT2A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(pannelloT2A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))))
		);
		PanelTerminale2.setLayout(gl_PanelTerminale2);
		
		JPanel PanelTerminale3 = new JPanel();
		PanelTerminale3.setLayout(null);
		PanelTerminale3.setBorder(new LineBorder(Color.WHITE, 2, true));
		PanelTerminale3.setBackground(new Color(91, 155, 202));
		TerminalPane.addTab("Terminal 3", null, PanelTerminale3, null);
		
		JPanel pannelloGateT3 = new JPanel();
		pannelloGateT3.setToolTipText("");
		pannelloGateT3.setBounds(10, 11, 146, 211);
		PanelTerminale3.add(pannelloGateT3);
		
		JLabel labelGatesT3 = new JLabel("Gates");
		labelGatesT3.setVerticalAlignment(SwingConstants.BOTTOM);
		labelGatesT3.setHorizontalTextPosition(SwingConstants.CENTER);
		labelGatesT3.setHorizontalAlignment(SwingConstants.CENTER);
		labelGatesT3.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		
		JPanel pannelloT3G1 = new JPanel();
		pannelloT3G1.setBackground(Color.WHITE);
		
		JLabel labelT3A1 = new JLabel("A1");
		labelT3A1.setHorizontalAlignment(SwingConstants.CENTER);
		labelT3A1.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		GroupLayout gl_pannelloT3G1 = new GroupLayout(pannelloT3G1);
		gl_pannelloT3G1.setHorizontalGroup(
			gl_pannelloT3G1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 156, Short.MAX_VALUE)
				.addGroup(gl_pannelloT3G1.createSequentialGroup()
					.addComponent(labelT3A1, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_pannelloT3G1.setVerticalGroup(
			gl_pannelloT3G1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 32, Short.MAX_VALUE)
				.addComponent(labelT3A1, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
		);
		pannelloT3G1.setLayout(gl_pannelloT3G1);
		
		JPanel pannelloT3G2 = new JPanel();
		pannelloT3G2.setBackground(Color.WHITE);
		
		JLabel labelT3A2 = new JLabel("A2");
		labelT3A2.setHorizontalAlignment(SwingConstants.CENTER);
		labelT3A2.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		GroupLayout gl_pannelloT3G2 = new GroupLayout(pannelloT3G2);
		gl_pannelloT3G2.setHorizontalGroup(
			gl_pannelloT3G2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 146, Short.MAX_VALUE)
				.addComponent(labelT3A2, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
		);
		gl_pannelloT3G2.setVerticalGroup(
			gl_pannelloT3G2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 32, Short.MAX_VALUE)
				.addGroup(gl_pannelloT3G2.createSequentialGroup()
					.addComponent(labelT3A2, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
					.addGap(1))
		);
		pannelloT3G2.setLayout(gl_pannelloT3G2);
		
		JPanel pannelloT3G3 = new JPanel();
		pannelloT3G3.setBackground(Color.WHITE);
		
		JLabel labelT3A3 = new JLabel("A3");
		labelT3A3.setHorizontalAlignment(SwingConstants.CENTER);
		labelT3A3.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		GroupLayout gl_pannelloT3G3 = new GroupLayout(pannelloT3G3);
		gl_pannelloT3G3.setHorizontalGroup(
			gl_pannelloT3G3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 146, Short.MAX_VALUE)
				.addComponent(labelT3A3, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
		);
		gl_pannelloT3G3.setVerticalGroup(
			gl_pannelloT3G3.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 32, Short.MAX_VALUE)
				.addGroup(gl_pannelloT3G3.createSequentialGroup()
					.addComponent(labelT3A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pannelloT3G3.setLayout(gl_pannelloT3G3);
		
		JPanel pannelloT3G4 = new JPanel();
		pannelloT3G4.setBackground(Color.WHITE);
		
		JLabel labelT3A4 = new JLabel("A4");
		labelT3A4.setHorizontalAlignment(SwingConstants.CENTER);
		labelT3A4.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		GroupLayout gl_pannelloT3G4 = new GroupLayout(pannelloT3G4);
		gl_pannelloT3G4.setHorizontalGroup(
			gl_pannelloT3G4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 146, Short.MAX_VALUE)
				.addComponent(labelT3A4, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
		);
		gl_pannelloT3G4.setVerticalGroup(
			gl_pannelloT3G4.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 26, Short.MAX_VALUE)
				.addComponent(labelT3A4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
		);
		pannelloT3G4.setLayout(gl_pannelloT3G4);
		GroupLayout gl_pannelloGateT3 = new GroupLayout(pannelloGateT3);
		gl_pannelloGateT3.setHorizontalGroup(
			gl_pannelloGateT3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 146, Short.MAX_VALUE)
				.addComponent(labelGatesT3, GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
				.addComponent(pannelloT3G1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
				.addGroup(gl_pannelloGateT3.createSequentialGroup()
					.addComponent(pannelloT3G2, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_pannelloGateT3.createSequentialGroup()
					.addComponent(pannelloT3G3, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_pannelloGateT3.createSequentialGroup()
					.addComponent(pannelloT3G4, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_pannelloGateT3.setVerticalGroup(
			gl_pannelloGateT3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 211, Short.MAX_VALUE)
				.addGroup(gl_pannelloGateT3.createSequentialGroup()
					.addComponent(labelGatesT3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(pannelloT3G1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(pannelloT3G2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(pannelloT3G3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(pannelloT3G4, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(13, Short.MAX_VALUE))
		);
		pannelloGateT3.setLayout(gl_pannelloGateT3);
		
		JPanel headerT3 = new JPanel();
		headerT3.setBackground(SystemColor.menu);
		headerT3.setBounds(166, 11, 960, 43);
		PanelTerminale3.add(headerT3);
		
		JLabel labelTrattaT3 = new JLabel("Tratta");
		labelTrattaT3.setHorizontalAlignment(SwingConstants.CENTER);
		labelTrattaT3.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		
		JLabel labelCodeT3 = new JLabel("Code");
		labelCodeT3.setHorizontalAlignment(SwingConstants.CENTER);
		labelCodeT3.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		
		JLabel labelTempoT3 = new JLabel("Tempo");
		labelTempoT3.setHorizontalAlignment(SwingConstants.CENTER);
		labelTempoT3.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		
		JLabel labelPartenzaT3 = new JLabel("Partenza");
		labelPartenzaT3.setHorizontalAlignment(SwingConstants.CENTER);
		labelPartenzaT3.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		GroupLayout gl_headerT3 = new GroupLayout(headerT3);
		gl_headerT3.setHorizontalGroup(
			gl_headerT3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 960, Short.MAX_VALUE)
				.addGroup(gl_headerT3.createSequentialGroup()
					.addContainerGap()
					.addComponent(labelTrattaT3, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
					.addGap(55)
					.addComponent(labelCodeT3, GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(labelTempoT3, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(labelPartenzaT3, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
		);
		gl_headerT3.setVerticalGroup(
			gl_headerT3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 43, Short.MAX_VALUE)
				.addComponent(labelTrattaT3, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
				.addGroup(gl_headerT3.createParallelGroup(Alignment.BASELINE)
					.addComponent(labelPartenzaT3, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
					.addComponent(labelTempoT3, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
				.addComponent(labelCodeT3, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
		);
		headerT3.setLayout(gl_headerT3);
		
		JPanel pannelloT3A1 = new JPanel();
		pannelloT3A1.setBackground(Color.WHITE);
		pannelloT3A1.setBounds(166, 55, 960, 31);
		PanelTerminale3.add(pannelloT3A1);
		
		fieldT3A1 = new JTextField();
		fieldT3A1.setEditable(false);
		fieldT3A1.setColumns(10);
		
		codaFamiglieT3A1 = new JTextField();
		codaFamiglieT3A1.setText("coda famiglie");
		codaFamiglieT3A1.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaFamiglieT3A1.setEnabled(false);
		codaFamiglieT3A1.setEditable(false);
		codaFamiglieT3A1.setColumns(10);
		
		checkCodaFamiglieT3A1 = new JCheckBox("");
		checkCodaFamiglieT3A1.setSelected(true);
		
		codaDisabiliT3A1 = new JTextField();
		codaDisabiliT3A1.setText("coda disabili");
		codaDisabiliT3A1.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaDisabiliT3A1.setEnabled(false);
		codaDisabiliT3A1.setEditable(false);
		codaDisabiliT3A1.setColumns(10);
		
		checkCodaDisabiliT3A1 = new JCheckBox("");
		
		codaPriorityT3A1 = new JTextField();
		codaPriorityT3A1.setText("coda priority");
		codaPriorityT3A1.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaPriorityT3A1.setEnabled(false);
		codaPriorityT3A1.setEditable(false);
		codaPriorityT3A1.setColumns(10);
		
		checkCodaPriorityT3A1 = new JCheckBox("");
		checkCodaPriorityT3A1.setSelected(true);

		checksT3A1 = new JCheckBox[] {checkCodaFamiglieT3A1, checkCodaDisabiliT3A1, checkCodaPriorityT3A1};
		
		JRadioButton radioButtonT3A1 = new JRadioButton("");
		radioButtonT3A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.showAndSetTempo(PannelloTempo, groupTempo, fieldT3A1, headersTempo, fieldsTempo, checksT3A1, "T3A1");
			}
		});
		groupTempo.add(radioButtonT3A1);
		
		JButton pulsantePartenzaT3A1 = new JButton("");
		pulsantePartenzaT3A1.setIcon(new ImageIcon(AMain.class.getResource("/apResources/iconPartenza.png")));
		pulsantePartenzaT3A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.initPartenza("T2A2", fieldsTratte, fieldsPartenza, checksT2A2, intframePartenza);
			}
		});
		pulsantePartenzaT3A1.setOpaque(false);
		pulsantePartenzaT3A1.setFocusable(false);
		pulsantePartenzaT3A1.setContentAreaFilled(false);
		pulsantePartenzaT3A1.setBorderPainted(false);
		GroupLayout gl_pannelloT3A1 = new GroupLayout(pannelloT3A1);
		gl_pannelloT3A1.setHorizontalGroup(
			gl_pannelloT3A1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 960, Short.MAX_VALUE)
				.addGroup(gl_pannelloT3A1.createSequentialGroup()
					.addComponent(fieldT3A1, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE)
					.addGap(54)
					.addComponent(codaFamiglieT3A1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkCodaFamiglieT3A1)
					.addGap(14)
					.addComponent(codaDisabiliT3A1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkCodaDisabiliT3A1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(codaPriorityT3A1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkCodaPriorityT3A1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
					.addComponent(radioButtonT3A1)
					.addGap(36)
					.addComponent(pulsantePartenzaT3A1, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
		);
		gl_pannelloT3A1.setVerticalGroup(
			gl_pannelloT3A1.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 31, Short.MAX_VALUE)
				.addGroup(gl_pannelloT3A1.createSequentialGroup()
					.addGroup(gl_pannelloT3A1.createParallelGroup(Alignment.LEADING)
						.addComponent(fieldT3A1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(radioButtonT3A1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(checkCodaPriorityT3A1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(codaPriorityT3A1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(checkCodaDisabiliT3A1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(codaDisabiliT3A1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(checkCodaFamiglieT3A1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(codaFamiglieT3A1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(pulsantePartenzaT3A1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		pannelloT3A1.setLayout(gl_pannelloT3A1);
		
		JPanel pannelloT3A2 = new JPanel();
		pannelloT3A2.setBackground(Color.WHITE);
		pannelloT3A2.setBounds(166, 97, 960, 31);
		PanelTerminale3.add(pannelloT3A2);
		
		fieldT3A2 = new JTextField();
		fieldT3A2.setEditable(false);
		fieldT3A2.setColumns(10);
		
		codaFamiglieT3A2 = new JTextField();
		codaFamiglieT3A2.setText("coda famiglie");
		codaFamiglieT3A2.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaFamiglieT3A2.setEnabled(false);
		codaFamiglieT3A2.setEditable(false);
		codaFamiglieT3A2.setColumns(10);
		
		checkCodaFamiglieT3A2 = new JCheckBox("");
		
		codaDisabiliT3A2 = new JTextField();
		codaDisabiliT3A2.setText("coda disabili");
		codaDisabiliT3A2.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaDisabiliT3A2.setEnabled(false);
		codaDisabiliT3A2.setEditable(false);
		codaDisabiliT3A2.setColumns(10);
		
		checkCodaDisabiliT3A2 = new JCheckBox("");
		
		codaPriorityT3A2 = new JTextField();
		codaPriorityT3A2.setText("coda priority");
		codaPriorityT3A2.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaPriorityT3A2.setEnabled(false);
		codaPriorityT3A2.setEditable(false);
		codaPriorityT3A2.setColumns(10);
		
		checkCodaPriorityT3A2 = new JCheckBox("");
		checkCodaPriorityT3A2.setSelected(true);

		checksT3A2 = new JCheckBox[] {checkCodaFamiglieT3A2, checkCodaDisabiliT3A2, checkCodaPriorityT3A2};
		
		JRadioButton radioButtonT3A2 = new JRadioButton("");
		radioButtonT3A2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.showAndSetTempo(PannelloTempo, groupTempo, fieldT3A2, headersTempo, fieldsTempo, checksT3A2, "T3A2");
			}
		});
		groupTempo.add(radioButtonT3A2);
		
		JButton pulsantePartenzaT3A2 = new JButton("");
		pulsantePartenzaT3A2.setIcon(new ImageIcon(AMain.class.getResource("/apResources/iconPartenza.png")));
		pulsantePartenzaT3A2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.initPartenza("T2A2", fieldsTratte, fieldsPartenza, checksT2A2, intframePartenza);
			}
		});
		pulsantePartenzaT3A2.setOpaque(false);
		pulsantePartenzaT3A2.setFocusable(false);
		pulsantePartenzaT3A2.setContentAreaFilled(false);
		pulsantePartenzaT3A2.setBorderPainted(false);
		GroupLayout gl_pannelloT3A2 = new GroupLayout(pannelloT3A2);
		gl_pannelloT3A2.setHorizontalGroup(
			gl_pannelloT3A2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 960, Short.MAX_VALUE)
				.addGroup(gl_pannelloT3A2.createSequentialGroup()
					.addComponent(fieldT3A2, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
					.addGap(54)
					.addComponent(codaFamiglieT3A2, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkCodaFamiglieT3A2)
					.addGap(14)
					.addComponent(codaDisabiliT3A2, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(checkCodaDisabiliT3A2)
					.addGap(14)
					.addComponent(codaPriorityT3A2, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(checkCodaPriorityT3A2)
					.addGap(38)
					.addComponent(radioButtonT3A2)
					.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
					.addComponent(pulsantePartenzaT3A2, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
		);
		gl_pannelloT3A2.setVerticalGroup(
			gl_pannelloT3A2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 31, Short.MAX_VALUE)
				.addGroup(gl_pannelloT3A2.createSequentialGroup()
					.addGroup(gl_pannelloT3A2.createParallelGroup(Alignment.LEADING)
						.addComponent(checkCodaFamiglieT3A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaDisabiliT3A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkCodaDisabiliT3A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaPriorityT3A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkCodaPriorityT3A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(radioButtonT3A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaFamiglieT3A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(fieldT3A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(pulsantePartenzaT3A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		pannelloT3A2.setLayout(gl_pannelloT3A2);
		
		JPanel pannelloT3A3 = new JPanel();
		pannelloT3A3.setBackground(Color.WHITE);
		pannelloT3A3.setBounds(166, 139, 960, 31);
		PanelTerminale3.add(pannelloT3A3);
		
		fieldT3A3 = new JTextField();
		fieldT3A3.setEditable(false);
		fieldT3A3.setColumns(10);
		
		codaFamiglieT3A3 = new JTextField();
		codaFamiglieT3A3.setText("coda famiglie");
		codaFamiglieT3A3.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaFamiglieT3A3.setEnabled(false);
		codaFamiglieT3A3.setEditable(false);
		codaFamiglieT3A3.setColumns(10);
		
		checkCodaFamiglieT3A3 = new JCheckBox("");
		checkCodaFamiglieT3A3.setSelected(true);
		
		codaDisabiliT3A3 = new JTextField();
		codaDisabiliT3A3.setText("coda disabili");
		codaDisabiliT3A3.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaDisabiliT3A3.setEnabled(false);
		codaDisabiliT3A3.setEditable(false);
		codaDisabiliT3A3.setColumns(10);
		
		checkCodaDisabiliT3A3 = new JCheckBox("");
		checkCodaDisabiliT3A3.setSelected(true);
		
		codaPriorityT3A3 = new JTextField();
		codaPriorityT3A3.setText("coda priority");
		codaPriorityT3A3.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaPriorityT3A3.setEnabled(false);
		codaPriorityT3A3.setEditable(false);
		codaPriorityT3A3.setColumns(10);
		
		checkCodaPriorityT3A3 = new JCheckBox("");
		checkCodaPriorityT3A3.setSelected(true);

		checksT3A3 = new JCheckBox[] {checkCodaFamiglieT3A3, checkCodaDisabiliT3A3, checkCodaPriorityT3A3};
		
		JRadioButton radioButtonT3A3 = new JRadioButton("");
		radioButtonT3A3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.showAndSetTempo(PannelloTempo, groupTempo, fieldT3A3, headersTempo, fieldsTempo, checksT3A3, "T3A3");
			}
		});
		groupTempo.add(radioButtonT3A3);
		
		JButton pulsantePartenzaT3A3 = new JButton("");
		pulsantePartenzaT3A3.setIcon(new ImageIcon(AMain.class.getResource("/apResources/iconPartenza.png")));
		pulsantePartenzaT3A3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.initPartenza("T2A2", fieldsTratte, fieldsPartenza, checksT2A2, intframePartenza);
			}
		});
		pulsantePartenzaT3A3.setOpaque(false);
		pulsantePartenzaT3A3.setFocusable(false);
		pulsantePartenzaT3A3.setContentAreaFilled(false);
		pulsantePartenzaT3A3.setBorderPainted(false);
		GroupLayout gl_pannelloT3A3 = new GroupLayout(pannelloT3A3);
		gl_pannelloT3A3.setHorizontalGroup(
			gl_pannelloT3A3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 960, Short.MAX_VALUE)
				.addGroup(gl_pannelloT3A3.createSequentialGroup()
					.addComponent(fieldT3A3, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
					.addGap(54)
					.addComponent(codaFamiglieT3A3, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkCodaFamiglieT3A3)
					.addGap(14)
					.addComponent(codaDisabiliT3A3, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(checkCodaDisabiliT3A3)
					.addGap(14)
					.addComponent(codaPriorityT3A3, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(checkCodaPriorityT3A3)
					.addGap(38)
					.addComponent(radioButtonT3A3)
					.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
					.addComponent(pulsantePartenzaT3A3, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
		);
		gl_pannelloT3A3.setVerticalGroup(
			gl_pannelloT3A3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 31, Short.MAX_VALUE)
				.addGroup(gl_pannelloT3A3.createSequentialGroup()
					.addGroup(gl_pannelloT3A3.createParallelGroup(Alignment.LEADING)
						.addComponent(checkCodaFamiglieT3A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaDisabiliT3A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkCodaDisabiliT3A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaPriorityT3A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkCodaPriorityT3A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(radioButtonT3A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaFamiglieT3A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(fieldT3A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(pulsantePartenzaT3A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		pannelloT3A3.setLayout(gl_pannelloT3A3);
		
		JPanel pannelloT3A4 = new JPanel();
		pannelloT3A4.setBackground(Color.WHITE);
		pannelloT3A4.setBounds(166, 181, 960, 31);
		PanelTerminale3.add(pannelloT3A4);
		
		fieldT3A4 = new JTextField();
		fieldT3A4.setEditable(false);
		fieldT3A4.setColumns(10);
		
		codaFamiglieT3A4 = new JTextField();
		codaFamiglieT3A4.setText("coda famiglie");
		codaFamiglieT3A4.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaFamiglieT3A4.setEnabled(false);
		codaFamiglieT3A4.setEditable(false);
		codaFamiglieT3A4.setColumns(10);
		
		checkCodaFamiglieT3A4 = new JCheckBox("");
		checkCodaFamiglieT3A4.setSelected(true);
		
		codaDisabiliT3A4 = new JTextField();
		codaDisabiliT3A4.setText("coda disabili");
		codaDisabiliT3A4.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaDisabiliT3A4.setEnabled(false);
		codaDisabiliT3A4.setEditable(false);
		codaDisabiliT3A4.setColumns(10);
		
		checkCodaDisabiliT3A4 = new JCheckBox("");
		
		JTextField codaPriorityT3A4 = new JTextField();
		codaPriorityT3A4.setText("coda priority");
		codaPriorityT3A4.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaPriorityT3A4.setEnabled(false);
		codaPriorityT3A4.setEditable(false);
		codaPriorityT3A4.setColumns(10);
		
		checkCodaPriorityT3A4 = new JCheckBox("");
		
		checksT3A4 = new JCheckBox[] {checkCodaFamiglieT3A4, checkCodaDisabiliT3A4, checkCodaPriorityT3A4};
		
		JRadioButton radioButtonT3A4 = new JRadioButton("");
		radioButtonT3A4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.showAndSetTempo(PannelloTempo, groupTempo, fieldT3A4, headersTempo, fieldsTempo, checksT3A4, "T3A4");
			}
		});
		groupTempo.add(radioButtonT3A4);
		
		JButton pulsantePartenzaT3A4 = new JButton("");
		pulsantePartenzaT3A4.setIcon(new ImageIcon(AMain.class.getResource("/apResources/iconPartenza.png")));
		pulsantePartenzaT3A4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.initPartenza("T2A2", fieldsTratte, fieldsPartenza, checksT2A2, intframePartenza);
			}
		});
		pulsantePartenzaT3A4.setOpaque(false);
		pulsantePartenzaT3A4.setFocusable(false);
		pulsantePartenzaT3A4.setContentAreaFilled(false);
		pulsantePartenzaT3A4.setBorderPainted(false);
		GroupLayout gl_pannelloT3A4 = new GroupLayout(pannelloT3A4);
		gl_pannelloT3A4.setHorizontalGroup(
			gl_pannelloT3A4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 960, Short.MAX_VALUE)
				.addGroup(gl_pannelloT3A4.createSequentialGroup()
					.addComponent(fieldT3A4, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
					.addGap(54)
					.addComponent(codaFamiglieT3A4, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkCodaFamiglieT3A4)
					.addGap(14)
					.addComponent(codaDisabiliT3A4, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(checkCodaDisabiliT3A4)
					.addGap(14)
					.addComponent(codaPriorityT3A4, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(checkCodaPriorityT3A4)
					.addGap(36)
					.addComponent(radioButtonT3A4)
					.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
					.addComponent(pulsantePartenzaT3A4, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
		);
		gl_pannelloT3A4.setVerticalGroup(
			gl_pannelloT3A4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 31, Short.MAX_VALUE)
				.addGroup(gl_pannelloT3A4.createSequentialGroup()
					.addGroup(gl_pannelloT3A4.createParallelGroup(Alignment.LEADING)
						.addComponent(checkCodaFamiglieT3A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaDisabiliT3A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkCodaDisabiliT3A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaPriorityT3A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkCodaPriorityT3A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(radioButtonT3A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaFamiglieT3A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(fieldT3A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(pulsantePartenzaT3A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		pannelloT3A4.setLayout(gl_pannelloT3A4);
		
		JPanel PanelTerminale4 = new JPanel();
		PanelTerminale4.setLayout(null);
		PanelTerminale4.setBorder(new LineBorder(Color.WHITE, 2, true));
		PanelTerminale4.setBackground(new Color(60, 113, 154));
		TerminalPane.addTab("Terminal 4", null, PanelTerminale4, null);
		
		JPanel pannelloGateT4 = new JPanel();
		pannelloGateT4.setToolTipText("");
		pannelloGateT4.setBounds(10, 11, 146, 211);
		PanelTerminale4.add(pannelloGateT4);
		
		JLabel labelGatesT4 = new JLabel("Gates");
		labelGatesT4.setVerticalAlignment(SwingConstants.BOTTOM);
		labelGatesT4.setHorizontalTextPosition(SwingConstants.CENTER);
		labelGatesT4.setHorizontalAlignment(SwingConstants.CENTER);
		labelGatesT4.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		
		JPanel pannelloT4G1 = new JPanel();
		pannelloT4G1.setBackground(Color.WHITE);
		
		JLabel labelT4A1 = new JLabel("A1");
		labelT4A1.setHorizontalAlignment(SwingConstants.CENTER);
		labelT4A1.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		GroupLayout gl_pannelloT4G1 = new GroupLayout(pannelloT4G1);
		gl_pannelloT4G1.setHorizontalGroup(
			gl_pannelloT4G1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 156, Short.MAX_VALUE)
				.addGroup(gl_pannelloT4G1.createSequentialGroup()
					.addComponent(labelT4A1, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_pannelloT4G1.setVerticalGroup(
			gl_pannelloT4G1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 32, Short.MAX_VALUE)
				.addComponent(labelT4A1, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
		);
		pannelloT4G1.setLayout(gl_pannelloT4G1);
		
		JPanel pannelloT4G2 = new JPanel();
		pannelloT4G2.setBackground(Color.WHITE);
		
		JLabel labelT4A2 = new JLabel("A2");
		labelT4A2.setHorizontalAlignment(SwingConstants.CENTER);
		labelT4A2.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		GroupLayout gl_pannelloT4G2 = new GroupLayout(pannelloT4G2);
		gl_pannelloT4G2.setHorizontalGroup(
			gl_pannelloT4G2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 146, Short.MAX_VALUE)
				.addComponent(labelT4A2, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
		);
		gl_pannelloT4G2.setVerticalGroup(
			gl_pannelloT4G2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 32, Short.MAX_VALUE)
				.addGroup(gl_pannelloT4G2.createSequentialGroup()
					.addComponent(labelT4A2, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
					.addGap(1))
		);
		pannelloT4G2.setLayout(gl_pannelloT4G2);
		
		JPanel pannelloT4G3 = new JPanel();
		pannelloT4G3.setBackground(Color.WHITE);
		
		JLabel labelT4A3 = new JLabel("A3");
		labelT4A3.setHorizontalAlignment(SwingConstants.CENTER);
		labelT4A3.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		GroupLayout gl_pannelloT4G3 = new GroupLayout(pannelloT4G3);
		gl_pannelloT4G3.setHorizontalGroup(
			gl_pannelloT4G3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 146, Short.MAX_VALUE)
				.addComponent(labelT4A3, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
		);
		gl_pannelloT4G3.setVerticalGroup(
			gl_pannelloT4G3.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 32, Short.MAX_VALUE)
				.addGroup(gl_pannelloT4G3.createSequentialGroup()
					.addComponent(labelT4A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pannelloT4G3.setLayout(gl_pannelloT4G3);
		
		JPanel pannelloT4G4 = new JPanel();
		pannelloT4G4.setBackground(Color.WHITE);
		
		JLabel labelT4A4 = new JLabel("A4");
		labelT4A4.setHorizontalAlignment(SwingConstants.CENTER);
		labelT4A4.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		GroupLayout gl_pannelloT4G4 = new GroupLayout(pannelloT4G4);
		gl_pannelloT4G4.setHorizontalGroup(
			gl_pannelloT4G4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 146, Short.MAX_VALUE)
				.addComponent(labelT4A4, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
		);
		gl_pannelloT4G4.setVerticalGroup(
			gl_pannelloT4G4.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 26, Short.MAX_VALUE)
				.addComponent(labelT4A4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
		);
		pannelloT4G4.setLayout(gl_pannelloT4G4);
		GroupLayout gl_pannelloGateT4 = new GroupLayout(pannelloGateT4);
		gl_pannelloGateT4.setHorizontalGroup(
			gl_pannelloGateT4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 146, Short.MAX_VALUE)
				.addComponent(labelGatesT4, GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
				.addComponent(pannelloT4G1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
				.addGroup(gl_pannelloGateT4.createSequentialGroup()
					.addComponent(pannelloT4G2, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_pannelloGateT4.createSequentialGroup()
					.addComponent(pannelloT4G3, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_pannelloGateT4.createSequentialGroup()
					.addComponent(pannelloT4G4, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_pannelloGateT4.setVerticalGroup(
			gl_pannelloGateT4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 211, Short.MAX_VALUE)
				.addGroup(gl_pannelloGateT4.createSequentialGroup()
					.addComponent(labelGatesT4, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(pannelloT4G1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(pannelloT4G2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(pannelloT4G3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(pannelloT4G4, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(13, Short.MAX_VALUE))
		);
		pannelloGateT4.setLayout(gl_pannelloGateT4);
		
		JPanel headerT4 = new JPanel();
		headerT4.setBackground(SystemColor.menu);
		headerT4.setBounds(166, 11, 960, 43);
		PanelTerminale4.add(headerT4);
		
		JLabel labelTrattaT4 = new JLabel("Tratta");
		labelTrattaT4.setHorizontalAlignment(SwingConstants.CENTER);
		labelTrattaT4.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		
		JLabel labelCodeT4 = new JLabel("Code");
		labelCodeT4.setHorizontalAlignment(SwingConstants.CENTER);
		labelCodeT4.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		
		JLabel labelTempoT4 = new JLabel("Tempo");
		labelTempoT4.setHorizontalAlignment(SwingConstants.CENTER);
		labelTempoT4.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		
		JLabel labelPartenzaT4 = new JLabel("Partenza");
		labelPartenzaT4.setHorizontalAlignment(SwingConstants.CENTER);
		labelPartenzaT4.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		GroupLayout gl_headerT4 = new GroupLayout(headerT4);
		gl_headerT4.setHorizontalGroup(
			gl_headerT4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 960, Short.MAX_VALUE)
				.addGroup(gl_headerT4.createSequentialGroup()
					.addContainerGap()
					.addComponent(labelTrattaT4, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
					.addGap(55)
					.addComponent(labelCodeT4, GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(labelTempoT4, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(labelPartenzaT4, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
		);
		gl_headerT4.setVerticalGroup(
			gl_headerT4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 43, Short.MAX_VALUE)
				.addComponent(labelTrattaT4, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
				.addGroup(gl_headerT4.createParallelGroup(Alignment.BASELINE)
					.addComponent(labelPartenzaT4, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
					.addComponent(labelTempoT4, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
				.addComponent(labelCodeT4, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
		);
		headerT4.setLayout(gl_headerT4);
		
		JPanel pannelloT4A1 = new JPanel();
		pannelloT4A1.setBackground(Color.WHITE);
		pannelloT4A1.setBounds(166, 55, 960, 31);
		PanelTerminale4.add(pannelloT4A1);
		
		fieldT4A1 = new JTextField();
		fieldT4A1.setEditable(false);
		fieldT4A1.setColumns(10);
		
		codaFamiglieT4A1 = new JTextField();
		codaFamiglieT4A1.setText("coda famiglie");
		codaFamiglieT4A1.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaFamiglieT4A1.setEnabled(false);
		codaFamiglieT4A1.setEditable(false);
		codaFamiglieT4A1.setColumns(10);
		
		checkCodaFamiglieT4A1 = new JCheckBox("");
		checkCodaFamiglieT4A1.setSelected(true);
		
		codaDisabiliT4A1 = new JTextField();
		codaDisabiliT4A1.setText("coda disabili");
		codaDisabiliT4A1.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaDisabiliT4A1.setEnabled(false);
		codaDisabiliT4A1.setEditable(false);
		codaDisabiliT4A1.setColumns(10);
		
		checkCodaDisabiliT4A1 = new JCheckBox("");
		checkCodaDisabiliT4A1.setSelected(true);
		
		codaPriorityT4A1 = new JTextField();
		codaPriorityT4A1.setText("coda priority");
		codaPriorityT4A1.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaPriorityT4A1.setEnabled(false);
		codaPriorityT4A1.setEditable(false);
		codaPriorityT4A1.setColumns(10);
		
		checkCodaPriorityT4A1 = new JCheckBox("");

		checksT4A1 = new JCheckBox[] {checkCodaFamiglieT4A1, checkCodaDisabiliT4A1, checkCodaPriorityT4A1};
		
		JRadioButton radioButtonT4A1 = new JRadioButton("");
		radioButtonT4A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.showAndSetTempo(PannelloTempo, groupTempo, fieldT4A1, headersTempo, fieldsTempo, checksT4A1, "T4A1");
			}
		});
		groupTempo.add(radioButtonT4A1);
		
		JButton pulsantePartenzaT4A1 = new JButton("");
		pulsantePartenzaT4A1.setIcon(new ImageIcon(AMain.class.getResource("/apResources/iconPartenza.png")));
		pulsantePartenzaT4A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.initPartenza("T2A2", fieldsTratte, fieldsPartenza, checksT2A2, intframePartenza);
			}
		});
		pulsantePartenzaT4A1.setOpaque(false);
		pulsantePartenzaT4A1.setFocusable(false);
		pulsantePartenzaT4A1.setContentAreaFilled(false);
		pulsantePartenzaT4A1.setBorderPainted(false);
		GroupLayout gl_pannelloT4A1 = new GroupLayout(pannelloT4A1);
		gl_pannelloT4A1.setHorizontalGroup(
			gl_pannelloT4A1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 960, Short.MAX_VALUE)
				.addGroup(gl_pannelloT4A1.createSequentialGroup()
					.addComponent(fieldT4A1, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE)
					.addGap(54)
					.addComponent(codaFamiglieT4A1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkCodaFamiglieT4A1)
					.addGap(14)
					.addComponent(codaDisabiliT4A1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkCodaDisabiliT4A1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(codaPriorityT4A1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkCodaPriorityT4A1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
					.addComponent(radioButtonT4A1)
					.addGap(36)
					.addComponent(pulsantePartenzaT4A1, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
		);
		gl_pannelloT4A1.setVerticalGroup(
			gl_pannelloT4A1.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 31, Short.MAX_VALUE)
				.addGroup(gl_pannelloT4A1.createSequentialGroup()
					.addGroup(gl_pannelloT4A1.createParallelGroup(Alignment.LEADING)
						.addComponent(fieldT4A1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(radioButtonT4A1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(checkCodaPriorityT4A1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(codaPriorityT4A1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(checkCodaDisabiliT4A1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(codaDisabiliT4A1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(checkCodaFamiglieT4A1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(codaFamiglieT4A1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(pulsantePartenzaT4A1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		pannelloT4A1.setLayout(gl_pannelloT4A1);
		
		JPanel pannelloT4A2 = new JPanel();
		pannelloT4A2.setBackground(Color.WHITE);
		pannelloT4A2.setBounds(166, 97, 960, 31);
		PanelTerminale4.add(pannelloT4A2);
		
		fieldT4A2 = new JTextField();
		fieldT4A2.setEditable(false);
		fieldT4A2.setColumns(10);
		
		codaFamiglieT4A2 = new JTextField();
		codaFamiglieT4A2.setText("coda famiglie");
		codaFamiglieT4A2.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaFamiglieT4A2.setEnabled(false);
		codaFamiglieT4A2.setEditable(false);
		codaFamiglieT4A2.setColumns(10);
		
		checkCodaFamiglieT4A2 = new JCheckBox("");
		checkCodaFamiglieT4A2.setSelected(true);
		
		codaDisabiliT4A2 = new JTextField();
		codaDisabiliT4A2.setText("coda disabili");
		codaDisabiliT4A2.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaDisabiliT4A2.setEnabled(false);
		codaDisabiliT4A2.setEditable(false);
		codaDisabiliT4A2.setColumns(10);
		
		checkCodaDisabiliT4A2 = new JCheckBox("");
		
		codaPriorityT4A2 = new JTextField();
		codaPriorityT4A2.setText("coda priority");
		codaPriorityT4A2.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaPriorityT4A2.setEnabled(false);
		codaPriorityT4A2.setEditable(false);
		codaPriorityT4A2.setColumns(10);
		
		checkCodaPriorityT4A2 = new JCheckBox("");
		checkCodaPriorityT4A2.setSelected(true);
		
		checksT4A2 = new JCheckBox[] {checkCodaFamiglieT4A2, checkCodaDisabiliT4A2, checkCodaPriorityT4A2};
		
		JRadioButton radioButtonT4A2 = new JRadioButton("");
		radioButtonT4A2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.showAndSetTempo(PannelloTempo, groupTempo, fieldT4A2, headersTempo, fieldsTempo, checksT4A2, "T4A2");
			}
		});
		groupTempo.add(radioButtonT4A2);
		
		JButton pulsantePartenzaT4A2 = new JButton("");
		pulsantePartenzaT4A2.setIcon(new ImageIcon(AMain.class.getResource("/apResources/iconPartenza.png")));
		pulsantePartenzaT4A2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.initPartenza("T2A2", fieldsTratte, fieldsPartenza, checksT2A2, intframePartenza);
			}
		});
		pulsantePartenzaT4A2.setOpaque(false);
		pulsantePartenzaT4A2.setFocusable(false);
		pulsantePartenzaT4A2.setContentAreaFilled(false);
		pulsantePartenzaT4A2.setBorderPainted(false);
		GroupLayout gl_pannelloT4A2 = new GroupLayout(pannelloT4A2);
		gl_pannelloT4A2.setHorizontalGroup(
			gl_pannelloT4A2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 960, Short.MAX_VALUE)
				.addGroup(gl_pannelloT4A2.createSequentialGroup()
					.addComponent(fieldT4A2, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
					.addGap(54)
					.addComponent(codaFamiglieT4A2, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkCodaFamiglieT4A2)
					.addGap(14)
					.addComponent(codaDisabiliT4A2, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(checkCodaDisabiliT4A2)
					.addGap(14)
					.addComponent(codaPriorityT4A2, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(checkCodaPriorityT4A2)
					.addGap(38)
					.addComponent(radioButtonT4A2)
					.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
					.addComponent(pulsantePartenzaT4A2, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
		);
		gl_pannelloT4A2.setVerticalGroup(
			gl_pannelloT4A2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 31, Short.MAX_VALUE)
				.addGroup(gl_pannelloT4A2.createSequentialGroup()
					.addGroup(gl_pannelloT4A2.createParallelGroup(Alignment.LEADING)
						.addComponent(checkCodaFamiglieT4A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaDisabiliT4A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkCodaDisabiliT4A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaPriorityT4A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkCodaPriorityT4A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(radioButtonT4A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaFamiglieT4A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(fieldT4A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(pulsantePartenzaT4A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		pannelloT4A2.setLayout(gl_pannelloT4A2);
		
		JPanel pannelloT4A3 = new JPanel();
		pannelloT4A3.setBackground(Color.WHITE);
		pannelloT4A3.setBounds(166, 139, 960, 31);
		PanelTerminale4.add(pannelloT4A3);
		
		fieldT4A3 = new JTextField();
		fieldT4A3.setEditable(false);
		fieldT4A3.setColumns(10);
		
		codaFamiglieT4A3 = new JTextField();
		codaFamiglieT4A3.setText("coda famiglie");
		codaFamiglieT4A3.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaFamiglieT4A3.setEnabled(false);
		codaFamiglieT4A3.setEditable(false);
		codaFamiglieT4A3.setColumns(10);
		
		checkCodaFamiglieT4A3 = new JCheckBox("");
		checkCodaFamiglieT4A3.setSelected(true);
		
		codaDisabiliT4A3 = new JTextField();
		codaDisabiliT4A3.setText("coda disabili");
		codaDisabiliT4A3.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaDisabiliT4A3.setEnabled(false);
		codaDisabiliT4A3.setEditable(false);
		codaDisabiliT4A3.setColumns(10);
		
		checkCodaDisabiliT4A3 = new JCheckBox("");
		
		codaPriorityT4A3 = new JTextField();
		codaPriorityT4A3.setText("coda priority");
		codaPriorityT4A3.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaPriorityT4A3.setEnabled(false);
		codaPriorityT4A3.setEditable(false);
		codaPriorityT4A3.setColumns(10);
		
		checkCodaPriorityT4A3 = new JCheckBox("");
		
		checksT4A3 = new JCheckBox[] {checkCodaFamiglieT4A3, checkCodaDisabiliT4A3, checkCodaPriorityT4A3};
		
		JRadioButton radioButtonT4A3 = new JRadioButton("");
		radioButtonT4A3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.showAndSetTempo(PannelloTempo, groupTempo, fieldT4A3, headersTempo, fieldsTempo, checksT4A3, "T4A3");
			}
		});
		groupTempo.add(radioButtonT4A3);
		
		JButton pulsantePartenzaT4A3 = new JButton("");
		pulsantePartenzaT4A3.setIcon(new ImageIcon(AMain.class.getResource("/apResources/iconPartenza.png")));
		pulsantePartenzaT4A3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.initPartenza("T2A2", fieldsTratte, fieldsPartenza, checksT2A2, intframePartenza);
			}
		});
		pulsantePartenzaT4A3.setOpaque(false);
		pulsantePartenzaT4A3.setFocusable(false);
		pulsantePartenzaT4A3.setContentAreaFilled(false);
		pulsantePartenzaT4A3.setBorderPainted(false);
		GroupLayout gl_pannelloT4A3 = new GroupLayout(pannelloT4A3);
		gl_pannelloT4A3.setHorizontalGroup(
			gl_pannelloT4A3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 960, Short.MAX_VALUE)
				.addGroup(gl_pannelloT4A3.createSequentialGroup()
					.addComponent(fieldT4A3, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
					.addGap(54)
					.addComponent(codaFamiglieT4A3, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkCodaFamiglieT4A3)
					.addGap(14)
					.addComponent(codaDisabiliT4A3, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(checkCodaDisabiliT4A3)
					.addGap(14)
					.addComponent(codaPriorityT4A3, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(checkCodaPriorityT4A3)
					.addGap(38)
					.addComponent(radioButtonT4A3)
					.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
					.addComponent(pulsantePartenzaT4A3, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
		);
		gl_pannelloT4A3.setVerticalGroup(
			gl_pannelloT4A3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 31, Short.MAX_VALUE)
				.addGroup(gl_pannelloT4A3.createSequentialGroup()
					.addGroup(gl_pannelloT4A3.createParallelGroup(Alignment.LEADING)
						.addComponent(checkCodaFamiglieT4A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaDisabiliT4A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkCodaDisabiliT4A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaPriorityT4A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkCodaPriorityT4A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(radioButtonT4A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaFamiglieT4A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(fieldT4A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(pulsantePartenzaT4A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		pannelloT4A3.setLayout(gl_pannelloT4A3);
		
		JPanel pannelloT4A4 = new JPanel();
		pannelloT4A4.setBackground(Color.WHITE);
		pannelloT4A4.setBounds(166, 181, 960, 31);
		PanelTerminale4.add(pannelloT4A4);
		
		fieldT4A4 = new JTextField();
		fieldT4A4.setEditable(false);
		fieldT4A4.setColumns(10);
		
		codaFamiglieT4A4 = new JTextField();
		codaFamiglieT4A4.setText("coda famiglie");
		codaFamiglieT4A4.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaFamiglieT4A4.setEnabled(false);
		codaFamiglieT4A4.setEditable(false);
		codaFamiglieT4A4.setColumns(10);
		
		checkCodaFamiglieT4A4 = new JCheckBox("");
		checkCodaFamiglieT4A4.setSelected(true);
		
		codaDisabiliT4A4 = new JTextField();
		codaDisabiliT4A4.setText("coda disabili");
		codaDisabiliT4A4.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaDisabiliT4A4.setEnabled(false);
		codaDisabiliT4A4.setEditable(false);
		codaDisabiliT4A4.setColumns(10);
		
		checkCodaDisabiliT4A4 = new JCheckBox("");
		checkCodaDisabiliT4A4.setSelected(true);
		
		codaPriorityT4A4 = new JTextField();
		codaPriorityT4A4.setText("coda priority");
		codaPriorityT4A4.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		codaPriorityT4A4.setEnabled(false);
		codaPriorityT4A4.setEditable(false);
		codaPriorityT4A4.setColumns(10);
		
		checkCodaPriorityT4A4 = new JCheckBox("");
		checkCodaPriorityT4A4.setSelected(true);
		
		checksT4A4 = new JCheckBox[] {checkCodaFamiglieT4A4, checkCodaDisabiliT4A4, checkCodaPriorityT4A4};
		
		JRadioButton radioButtonT4A4 = new JRadioButton("");
		radioButtonT4A4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.showAndSetTempo(PannelloTempo, groupTempo, fieldT4A4, headersTempo, fieldsTempo, checksT4A4, "T4A4");
			}
		});
		groupTempo.add(radioButtonT4A4);
		
		JButton pulsantePartenzaT4A4 = new JButton("");
		pulsantePartenzaT4A4.setIcon(new ImageIcon(AMain.class.getResource("/apResources/iconPartenza.png")));
		pulsantePartenzaT4A4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.initPartenza("T2A2", fieldsTratte, fieldsPartenza, checksT2A2, intframePartenza);
			}
		});
		pulsantePartenzaT4A4.setOpaque(false);
		pulsantePartenzaT4A4.setFocusable(false);
		pulsantePartenzaT4A4.setContentAreaFilled(false);
		pulsantePartenzaT4A4.setBorderPainted(false);
		GroupLayout gl_pannelloT4A4 = new GroupLayout(pannelloT4A4);
		gl_pannelloT4A4.setHorizontalGroup(
			gl_pannelloT4A4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 960, Short.MAX_VALUE)
				.addGroup(gl_pannelloT4A4.createSequentialGroup()
					.addComponent(fieldT4A4, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
					.addGap(54)
					.addComponent(codaFamiglieT4A4, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkCodaFamiglieT4A4)
					.addGap(14)
					.addComponent(codaDisabiliT4A4, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(checkCodaDisabiliT4A4)
					.addGap(14)
					.addComponent(codaPriorityT4A4, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(checkCodaPriorityT4A4)
					.addGap(36)
					.addComponent(radioButtonT4A4)
					.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
					.addComponent(pulsantePartenzaT4A4, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
		);
		gl_pannelloT4A4.setVerticalGroup(
			gl_pannelloT4A4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 31, Short.MAX_VALUE)
				.addGroup(gl_pannelloT4A4.createSequentialGroup()
					.addGroup(gl_pannelloT4A4.createParallelGroup(Alignment.LEADING)
						.addComponent(checkCodaFamiglieT4A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaDisabiliT4A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkCodaDisabiliT4A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaPriorityT4A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkCodaPriorityT4A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(radioButtonT4A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(codaFamiglieT4A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(fieldT4A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(pulsantePartenzaT4A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		pannelloT4A4.setLayout(gl_pannelloT4A4);
		
		JButton pulsanteReload = new JButton("");
		pulsanteReload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gate.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
				theController.setGates(fieldsTratte);
				Gate.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			}
		});
		pulsanteReload.setOpaque(false);
		pulsanteReload.setFocusable(false);
		pulsanteReload.setContentAreaFilled(false);
		pulsanteReload.setBorderPainted(false);
		pulsanteReload.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconReload.png")));
		pulsanteReload.setBounds(1098, 10, 63, 51);
		PanelGate.add(pulsanteReload);
		
		fieldsTratte = new JTextField[] {fieldT1A1, fieldT1A2, fieldT1A3, fieldT1A4, fieldT2A1, fieldT2A2, fieldT2A3, fieldT2A4, fieldT3A1, fieldT3A2, fieldT3A3, fieldT3A4, fieldT4A1, fieldT4A2, fieldT4A3, fieldT4A4};
		theController.setGates(fieldsTratte);
		
		JButton PulsanteHomeInfo = new JButton("");
				

		PulsanteHomeInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.switchPanel(Info, Main);	
			}
		});
				
		PulsanteHomeInfo.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconHome.png")));
		PulsanteHomeInfo.setOpaque(false);
		PulsanteHomeInfo.setFocusable(false);
		PulsanteHomeInfo.setContentAreaFilled(false);
		PulsanteHomeInfo.setBorderPainted(false);
		PulsanteHomeInfo.setBounds(10, 10, 63, 51);
		PanelInfo.add(PulsanteHomeInfo);
				
		OmbraHeaderInfo = new JLabel("");
		OmbraHeaderInfo.setBounds(0, -15, 1199, 63);
		OmbraHeaderInfo.setIcon(new ImageIcon(AMain.class.getResource("/apResources/OmbraHeader.png")));
		PanelInfo.add(OmbraHeaderInfo);
				
		JLabel Domanda1 = new JLabel("Quali documenti occorrono per il viaggio?");
		Domanda1.setForeground(Color.DARK_GRAY);
		Domanda1.setFont(new Font("Lucida Bright", Font.ITALIC, 15));
		Domanda1.setBounds(36, 123, 384, 28);
		PanelInfo.add(Domanda1);
				
		JTextArea Risposta1 = new JTextArea();
		Risposta1.setEditable(false);
		Risposta1.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		Risposta1.setForeground(Color.DARK_GRAY);
		Risposta1.setText("Al check-in occorre presentare il biglietto cartaceo o elettronico ed un documento, passaporto o carta di identit\u00E0, in corso di validit\u00E0. E' inoltre necessario verificare eventuale visto d'ingresso o vaccinazioni particolari richieste dal Paese in cui ci si reca.");
		Risposta1.setWrapStyleWord(true);
		Risposta1.setLineWrap(true);
		Risposta1.setBounds(36, 158, 820, 41);
		Risposta1.setOpaque(false);
		Risposta1.setFocusable(false);
		PanelInfo.add(Risposta1);
				
		JLabel Domanda2 = new JLabel("Quali sono gli articoli non ammessi nel bagaglio a mano?");
		Domanda2.setFont(new Font("Lucida Bright", Font.ITALIC, 15));
		Domanda2.setForeground(Color.DARK_GRAY);
		Domanda2.setBounds(36, 210, 465, 20);
		PanelInfo.add(Domanda2);
				
		JTextArea Risposta2 = new JTextArea();
		Risposta2.setForeground(Color.DARK_GRAY);
		Risposta2.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		Risposta2.setLineWrap(true);
		Risposta2.setWrapStyleWord(true);
		Risposta2.setText("In cabina non sono ammessi armi improprie quali forbici, coltelli, oggetti appuntiti, limette etc. n\u00E9 sostanze esplosive, tossiche o corrosive, armi da sparo o da taglio.");
		Risposta2.setBounds(36, 241, 802, 39);
		Risposta2.setOpaque(false);
		Risposta2.setFocusable(false);
		PanelInfo.add(Risposta2);
				
		JLabel Domanda3 = new JLabel("Come posso richiedere un'assistenza speciale?");
		Domanda3.setForeground(Color.DARK_GRAY);
		Domanda3.setFont(new Font("Lucida Bright", Font.ITALIC, 15));
		Domanda3.setBounds(36, 291, 425, 28);
		PanelInfo.add(Domanda3);
				
		JTextArea Risposta3 = new JTextArea();
		Risposta3.setForeground(Color.DARK_GRAY);
		Risposta3.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		Risposta3.setWrapStyleWord(true);
		Risposta3.setLineWrap(true);
		Risposta3.setEditable(false);
		Risposta3.setText("All'atto della prenotazione, o almeno 48 ore prima della partenza, puoi richiedere assistenza speciale alla compagnia aerea o al tuo agente di viaggio. E' importante fornire alla compagnia aerea informazioni dettagliate in merito alle tue esigenze. L'assistenza \u00E8 gratuita e sar\u00E0 cura della compagnia aerea inoltrare la richiesta all'aeroporto ed informare tutti gli scali che verranno toccati durante il tuo viaggio.");
		Risposta3.setOpaque(false);
		Risposta3.setFocusable(false);
		Risposta3.setBounds(36, 330, 802, 68);
		PanelInfo.add(Risposta3);
				
		JLabel Domanda4 = new JLabel("Se perdo il bagaglio a chi devo rivolgermi?");
		Domanda4.setFont(new Font("Lucida Bright", Font.ITALIC, 15));
		Domanda4.setForeground(Color.DARK_GRAY);
		Domanda4.setBounds(36, 409, 425, 20);
		PanelInfo.add(Domanda4);
				
		JTextArea Risposta4 = new JTextArea();
		Risposta4.setText("In caso di smarrimento o danneggiamento del bagaglio, prima di lasciare la sala riconsegna bagagli, \u00E8 necessario compilare l'apposito modulo denominato PIR (Property Irregularity Report) presso gli uffici Lost&Found della societ\u00E0 di handling che svolge i servizi di assistenza a terra per conto della compagnia aerea con la quale hai viaggiato. Per la riconsegna del bagaglio smarrito sarai contattato direttamente dall'ufficio Lost&Found di riferimento.");
		Risposta4.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		Risposta4.setForeground(Color.DARK_GRAY);
		Risposta4.setWrapStyleWord(true);
		Risposta4.setLineWrap(true);
		Risposta4.setEditable(false);
		Risposta4.setOpaque(false);
		Risposta4.setFocusable(false);
		Risposta4.setBounds(36, 433, 802, 76);
		PanelInfo.add(Risposta4);
				
		JPanel PannelloFAQ = new JPanel();
		PannelloFAQ.setBackground(UIManager.getColor("CheckBox.light"));
		PannelloFAQ.setBounds(0, 73, 461, 28);
		PanelInfo.add(PannelloFAQ);						
		
		JLabel lblFaqFrequently = new JLabel("FAQ - Frequently Asked Questions");
		lblFaqFrequently.setForeground(Color.DARK_GRAY);
		lblFaqFrequently.setFont(new Font("Lucida Bright", Font.BOLD, 23));
		GroupLayout gl_PannelloFAQ = new GroupLayout(PannelloFAQ);
		gl_PannelloFAQ.setHorizontalGroup(
			gl_PannelloFAQ.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PannelloFAQ.createSequentialGroup()
					.addGap(46)
					.addComponent(lblFaqFrequently)
					.addContainerGap(151, Short.MAX_VALUE))
		);
		gl_PannelloFAQ.setVerticalGroup(
			gl_PannelloFAQ.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PannelloFAQ.createSequentialGroup()
					.addComponent(lblFaqFrequently, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
					.addContainerGap())
		);
		PannelloFAQ.setLayout(gl_PannelloFAQ);
				
		Mappa = new JLayeredPane();
		BodyContainer.add(Mappa, "name_154090148366700");
				
		JPanel PanelMappa = new JPanel();
		PanelMappa.setFocusTraversalPolicyProvider(true);
		PanelMappa.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		PanelMappa.setBorder(null);
		PanelMappa.setBackground(new Color(208, 215, 232));
		PanelMappa.setBounds(0, 0, 1193, 535);
		Mappa.add(PanelMappa);
		PanelMappa.setLayout(null);
			
				
		JLabel OmbraHeaderMappa = new JLabel("");
		OmbraHeaderMappa.setBounds(0, 0, 1199, 63);
		PanelMappa.add(OmbraHeaderMappa);
		OmbraHeaderMappa.setBounds(0, -15, 1199, 63);
		OmbraHeaderMappa.setIcon(new ImageIcon(AMain.class.getResource("/apResources/OmbraHeader.png")));
				
		JPanel IndicazioniMappa = new JPanel();
		IndicazioniMappa.setBackground(UIManager.getColor("CheckBox.light"));
		IndicazioniMappa.setBounds(117, 83, 316, 162);
		PanelMappa.add(IndicazioniMappa);
				
		JLabel TestoMappaAeroporto = new JLabel("Mappa Aeroporto");
		TestoMappaAeroporto.setHorizontalAlignment(SwingConstants.CENTER);
		TestoMappaAeroporto.setForeground(Color.DARK_GRAY);
		TestoMappaAeroporto.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 30));
		TestoMappaAeroporto.setBackground(Color.LIGHT_GRAY);
				
		JPanel IndicazioniTesto = new JPanel();
		GroupLayout gl_IndicazioniMappa = new GroupLayout(IndicazioniMappa);
		gl_IndicazioniMappa.setHorizontalGroup(
			gl_IndicazioniMappa.createParallelGroup(Alignment.LEADING)
				.addComponent(TestoMappaAeroporto, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
				.addGroup(gl_IndicazioniMappa.createSequentialGroup()
					.addGap(10)
					.addComponent(IndicazioniTesto, GroupLayout.PREFERRED_SIZE, 296, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_IndicazioniMappa.setVerticalGroup(
			gl_IndicazioniMappa.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_IndicazioniMappa.createSequentialGroup()
					.addComponent(TestoMappaAeroporto, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(IndicazioniTesto, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
					.addContainerGap())
		);
				
		JTextArea textAreaMappa = new JTextArea();
		textAreaMappa.setWrapStyleWord(true);
		textAreaMappa.setText("Consulta la mappa per muoverti comodamente all'interno dell'aeroporto.");
		textAreaMappa.setOpaque(false);
		textAreaMappa.setLineWrap(true);
		textAreaMappa.setForeground(Color.DARK_GRAY);
		textAreaMappa.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		textAreaMappa.setFocusable(false);
		textAreaMappa.setEditable(false);
		GroupLayout gl_IndicazioniTesto = new GroupLayout(IndicazioniTesto);
		gl_IndicazioniTesto.setHorizontalGroup(
			gl_IndicazioniTesto.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_IndicazioniTesto.createSequentialGroup()
					.addContainerGap()
					.addComponent(textAreaMappa, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_IndicazioniTesto.setVerticalGroup(
			gl_IndicazioniTesto.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_IndicazioniTesto.createSequentialGroup()
					.addContainerGap()
					.addComponent(textAreaMappa, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
		);
		IndicazioniTesto.setLayout(gl_IndicazioniTesto);
		IndicazioniMappa.setLayout(gl_IndicazioniMappa);
		
		JLabel FotoMappa = new JLabel("");
		FotoMappa.setHorizontalAlignment(SwingConstants.CENTER);
		FotoMappa.setIcon(new ImageIcon(AMain.class.getResource("/apResources/MappaUni.png")));
		FotoMappa.setBounds(443, 66, 728, 458);
		PanelMappa.add(FotoMappa);
		
		JPanel Legenda = new JPanel();
		Legenda.setBackground(UIManager.getColor("CheckBox.light"));
		Legenda.setBounds(117, 278, 316, 223);
		PanelMappa.add(Legenda);
		
		JLabel TestoLegenda = new JLabel("Legenda");
		TestoLegenda.setHorizontalAlignment(SwingConstants.CENTER);
		TestoLegenda.setForeground(Color.DARK_GRAY);
		TestoLegenda.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 30));
		TestoLegenda.setBackground(Color.LIGHT_GRAY);
		
		JPanel panelLegenda = new JPanel();
		GroupLayout gl_Legenda = new GroupLayout(Legenda);
		gl_Legenda.setHorizontalGroup(
			gl_Legenda.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_Legenda.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Legenda.createParallelGroup(Alignment.TRAILING)
						.addComponent(panelLegenda, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
						.addComponent(TestoLegenda, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_Legenda.setVerticalGroup(
			gl_Legenda.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Legenda.createSequentialGroup()
					.addComponent(TestoLegenda, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelLegenda, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JLabel IconFermataAutobus = new JLabel(" Fermata Autobus");
		IconFermataAutobus.setForeground(Color.DARK_GRAY);
		IconFermataAutobus.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		IconFermataAutobus.setIcon(new ImageIcon(AMain.class.getResource("/apResources/FermataAutobusIcona.png")));
		
		JLabel IconBar = new JLabel(" Bar");
		IconBar.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconaBar.png")));
		IconBar.setForeground(Color.DARK_GRAY);
		IconBar.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		
		JLabel IconGate = new JLabel(" Gate");
		IconGate.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconaGate.png")));
		IconGate.setForeground(Color.DARK_GRAY);
		IconGate.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		
		JLabel IconRistorante = new JLabel(" Ristorate");
		IconRistorante.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconaRistorante.png")));
		IconRistorante.setForeground(Color.DARK_GRAY);
		IconRistorante.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		
		JLabel IconParcheggio = new JLabel(" Parcheggio");
		IconParcheggio.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconaParcheggio.png")));
		IconParcheggio.setForeground(Color.DARK_GRAY);
		IconParcheggio.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		GroupLayout gl_panelLegenda = new GroupLayout(panelLegenda);
		gl_panelLegenda.setHorizontalGroup(
			gl_panelLegenda.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelLegenda.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelLegenda.createParallelGroup(Alignment.LEADING)
						.addComponent(IconFermataAutobus, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
						.addComponent(IconBar, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
						.addComponent(IconGate, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
						.addComponent(IconRistorante, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
						.addComponent(IconParcheggio, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panelLegenda.setVerticalGroup(
			gl_panelLegenda.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelLegenda.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(IconFermataAutobus)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(IconBar, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(IconGate, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(IconRistorante, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(IconParcheggio, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panelLegenda.setLayout(gl_panelLegenda);
		Legenda.setLayout(gl_Legenda);
		
		JButton PulsanteHomeMappa = new JButton("");
		
		PulsanteHomeMappa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.switchPanel(Mappa, Main);
			}
		});
		PulsanteHomeMappa.setSize(63, 51);
		PulsanteHomeMappa.setLocation(10, 10);
		PulsanteHomeMappa.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconHome.png")));
		PulsanteHomeMappa.setOpaque(false);
		PulsanteHomeMappa.setFocusable(false);
		PulsanteHomeMappa.setContentAreaFilled(false);
		PulsanteHomeMappa.setBorderPainted(false);
		PulsanteHomeMappa.setBounds(10, 10, 63, 51);;
		PanelMappa.add(PulsanteHomeMappa);
				
		Compagnie = new JLayeredPane();
		BodyContainer.add(Compagnie, "name_154090206952500");
				
				
		JPanel PanelCompagnie = new JPanel();
		PanelCompagnie.setBackground(new Color(208, 215, 232));
		PanelCompagnie.setBounds(0, 0, 1193, 535);
		Compagnie.add(PanelCompagnie);
		PanelCompagnie.setLayout(null);
				
		JButton PulsanteHomeCompagnie = new JButton("");
		PulsanteHomeCompagnie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.switchPanel(Compagnie, Main);
			}
		});
		
		PulsanteHomeCompagnie.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconHome.png")));
		PulsanteHomeCompagnie.setOpaque(false);
		PulsanteHomeCompagnie.setFocusable(false);
		PulsanteHomeCompagnie.setContentAreaFilled(false);
		PulsanteHomeCompagnie.setBorderPainted(false);
		PulsanteHomeCompagnie.setBounds(10, 10, 63, 51);
		PanelCompagnie.add(PulsanteHomeCompagnie);
		
		JLabel OmbraHeaderCompagnie = new JLabel("");
		OmbraHeaderCompagnie.setBounds(0, -15, 1199, 63);
		OmbraHeaderCompagnie.setIcon(new ImageIcon(AMain.class.getResource("/apResources/OmbraHeader.png")));
		PanelCompagnie.add(OmbraHeaderCompagnie);
		
		JTabbedPane tabbedPaneCompagnie = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneCompagnie.setBounds(42, 72, 1097, 441);
		PanelCompagnie.add(tabbedPaneCompagnie);
		
		JPanel pannelloR = new JPanel();
		tabbedPaneCompagnie.addTab("Ryanair", null, pannelloR, null);
		pannelloR.setLayout(null);
		
		JPanel pannelloDVR = new JPanel();
		pannelloDVR.setBackground(Color.WHITE);
		pannelloDVR.setBounds(240, 11, 200, 339);
		pannelloR.add(pannelloDVR);
		
		JPanel pannelloInfoDVR = new JPanel();
		pannelloInfoDVR.setBounds(0, 129, 200, 210);
		pannelloInfoDVR.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloInfoDVR.setBackground(new Color(220, 220, 220));
		
		JPanel pannelloIconTextDVR = new JPanel();
		pannelloIconTextDVR.setBounds(0, 0, 200, 123);
		pannelloIconTextDVR.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloIconTextDVR.setBackground(new Color(245, 245, 245));
		
		JPanel pannelloTextDVR = new JPanel();
		pannelloTextDVR.setBackground(new Color(13, 62, 117));
		
		JLabel testoDVR = new JLabel("Durata Voli");
		testoDVR.setHorizontalAlignment(SwingConstants.CENTER);
		testoDVR.setForeground(Color.WHITE);
		testoDVR.setFont(new Font("Lucida Bright", Font.ITALIC, 15));
		GroupLayout gl_pannelloTextDVR = new GroupLayout(pannelloTextDVR);
		gl_pannelloTextDVR.setHorizontalGroup(
			gl_pannelloTextDVR.createParallelGroup(Alignment.LEADING)
				.addGap(0, 196, Short.MAX_VALUE)
				.addGroup(gl_pannelloTextDVR.createSequentialGroup()
					.addContainerGap()
					.addComponent(testoDVR, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_pannelloTextDVR.setVerticalGroup(
			gl_pannelloTextDVR.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 54, Short.MAX_VALUE)
				.addGroup(gl_pannelloTextDVR.createSequentialGroup()
					.addGap(5)
					.addComponent(testoDVR, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
					.addContainerGap())
		);
		pannelloTextDVR.setLayout(gl_pannelloTextDVR);
		
		JLabel iconDVR = new JLabel("");
		iconDVR.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconDurata.png")));
		iconDVR.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_pannelloIconTextDVR = new GroupLayout(pannelloIconTextDVR);
		gl_pannelloIconTextDVR.setHorizontalGroup(
			gl_pannelloIconTextDVR.createParallelGroup(Alignment.LEADING)
				.addComponent(pannelloTextDVR, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
				.addGroup(gl_pannelloIconTextDVR.createSequentialGroup()
					.addGap(10)
					.addComponent(iconDVR, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addGap(10))
		);
		gl_pannelloIconTextDVR.setVerticalGroup(
			gl_pannelloIconTextDVR.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pannelloIconTextDVR.createSequentialGroup()
					.addComponent(pannelloTextDVR, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(iconDVR)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pannelloIconTextDVR.setLayout(gl_pannelloIconTextDVR);
		pannelloDVR.setLayout(null);
		pannelloInfoDVR.setLayout(null);
		
		JLabel durataAmsR = new JLabel("Ams - 2h 40m");
		durataAmsR.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		durataAmsR.setHorizontalAlignment(SwingConstants.CENTER);
		durataAmsR.setBounds(10, 22, 180, 23);
		pannelloInfoDVR.add(durataAmsR);
		
		JLabel durataBerR = new JLabel("Ber - 2h 20m");
		durataBerR.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		durataBerR.setHorizontalAlignment(SwingConstants.CENTER);
		durataBerR.setBounds(10, 69, 180, 23);
		pannelloInfoDVR.add(durataBerR);
		
		JLabel durataRomR = new JLabel("Rom - 1h");
		durataRomR.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		durataRomR.setHorizontalAlignment(SwingConstants.CENTER);
		durataRomR.setBounds(10, 117, 180, 23);
		pannelloInfoDVR.add(durataRomR);
		
		JLabel durataLonR = new JLabel("Lon - 2h 50m");
		durataLonR.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		durataLonR.setHorizontalAlignment(SwingConstants.CENTER);
		durataLonR.setBounds(10, 162, 180, 23);
		pannelloInfoDVR.add(durataLonR);
		pannelloDVR.add(pannelloInfoDVR);
		pannelloDVR.add(pannelloIconTextDVR);
		
		JPanel pannelloFVR = new JPanel();
		pannelloFVR.setBackground(Color.WHITE);
		pannelloFVR.setBounds(10, 11, 200, 272);
		pannelloR.add(pannelloFVR);
		
		JPanel pannelloInfoFVR = new JPanel();
		pannelloInfoFVR.setBounds(0, 129, 200, 143);
		pannelloInfoFVR.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloInfoFVR.setBackground(new Color(220, 220, 220));
		
		JPanel pannelloIconTextFVR = new JPanel();
		pannelloIconTextFVR.setBounds(0, 0, 200, 123);
		pannelloIconTextFVR.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloIconTextFVR.setBackground(new Color(245, 245, 245));
		
		JPanel pannelloTextFVR = new JPanel();
		pannelloTextFVR.setBackground(new Color(13, 62, 117));
		
		JLabel textFVR = new JLabel("Frequenza Voli");
		textFVR.setHorizontalAlignment(SwingConstants.CENTER);
		textFVR.setForeground(Color.WHITE);
		textFVR.setFont(new Font("Lucida Bright", Font.ITALIC, 15));
		GroupLayout gl_pannelloTextFVR = new GroupLayout(pannelloTextFVR);
		gl_pannelloTextFVR.setHorizontalGroup(
			gl_pannelloTextFVR.createParallelGroup(Alignment.LEADING)
				.addGap(0, 196, Short.MAX_VALUE)
				.addGroup(gl_pannelloTextFVR.createSequentialGroup()
					.addContainerGap()
					.addComponent(textFVR, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_pannelloTextFVR.setVerticalGroup(
			gl_pannelloTextFVR.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 54, Short.MAX_VALUE)
				.addGroup(gl_pannelloTextFVR.createSequentialGroup()
					.addGap(5)
					.addComponent(textFVR, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
					.addContainerGap())
		);
		pannelloTextFVR.setLayout(gl_pannelloTextFVR);
		
		JLabel iconFVR = new JLabel("");
		iconFVR.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconFrequenza.png")));
		iconFVR.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_pannelloIconTextFVR = new GroupLayout(pannelloIconTextFVR);
		gl_pannelloIconTextFVR.setHorizontalGroup(
			gl_pannelloIconTextFVR.createParallelGroup(Alignment.LEADING)
				.addComponent(pannelloTextFVR, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
				.addGroup(gl_pannelloIconTextFVR.createSequentialGroup()
					.addGap(10)
					.addComponent(iconFVR, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addGap(10))
		);
		gl_pannelloIconTextFVR.setVerticalGroup(
			gl_pannelloIconTextFVR.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pannelloIconTextFVR.createSequentialGroup()
					.addComponent(pannelloTextFVR, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(iconFVR, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
					.addContainerGap())
		);
		pannelloIconTextFVR.setLayout(gl_pannelloIconTextFVR);
		pannelloFVR.setLayout(null);
		pannelloInfoFVR.setLayout(null);
		
		JLabel infoTextFVR1 = new JLabel("Settimana completa");
		infoTextFVR1.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		infoTextFVR1.setBounds(10, 40, 180, 23);
		infoTextFVR1.setHorizontalAlignment(SwingConstants.CENTER);
		pannelloInfoFVR.add(infoTextFVR1);
		
		JLabel infoTextFVR2 = new JLabel("(in base ai voli)");
		infoTextFVR2.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		infoTextFVR2.setBounds(10, 74, 180, 23);
		infoTextFVR2.setHorizontalAlignment(SwingConstants.CENTER);
		pannelloInfoFVR.add(infoTextFVR2);
		pannelloFVR.add(pannelloInfoFVR);
		pannelloFVR.add(pannelloIconTextFVR);
		
		JPanel pannelloVETR = new JPanel();
		pannelloVETR.setBackground(Color.WHITE);
		pannelloVETR.setBounds(470, 11, 612, 396);
		pannelloR.add(pannelloVETR);
		
		JPanel pannelloIconTextVETR = new JPanel();
		pannelloIconTextVETR.setBounds(0, 0, 616, 122);
		pannelloIconTextVETR.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloIconTextVETR.setBackground(new Color(245, 245, 245));
		
		JPanel pannelloTextVETR = new JPanel();
		pannelloTextVETR.setBackground(new Color(13, 62, 117));
		
		JLabel textVETR = new JLabel("Voli & Tratte");
		textVETR.setHorizontalAlignment(SwingConstants.CENTER);
		textVETR.setForeground(Color.WHITE);
		textVETR.setFont(new Font("Lucida Bright", Font.ITALIC, 15));
		GroupLayout gl_pannelloTextVETR = new GroupLayout(pannelloTextVETR);
		gl_pannelloTextVETR.setHorizontalGroup(
			gl_pannelloTextVETR.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pannelloTextVETR.createSequentialGroup()
					.addContainerGap()
					.addComponent(textVETR, GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_pannelloTextVETR.setVerticalGroup(
			gl_pannelloTextVETR.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_pannelloTextVETR.createSequentialGroup()
					.addGap(5)
					.addComponent(textVETR, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
					.addContainerGap())
		);
		pannelloTextVETR.setLayout(gl_pannelloTextVETR);
		
		JLabel iconVETR = new JLabel("");
		iconVETR.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconVoliETratte.png")));
		iconVETR.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_pannelloIconTextVETR = new GroupLayout(pannelloIconTextVETR);
		gl_pannelloIconTextVETR.setHorizontalGroup(
			gl_pannelloIconTextVETR.createParallelGroup(Alignment.LEADING)
				.addComponent(pannelloTextVETR, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
				.addGroup(gl_pannelloIconTextVETR.createSequentialGroup()
					.addGap(10)
					.addComponent(iconVETR, GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_pannelloIconTextVETR.setVerticalGroup(
			gl_pannelloIconTextVETR.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pannelloIconTextVETR.createSequentialGroup()
					.addComponent(pannelloTextVETR, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(iconVETR, GroupLayout.PREFERRED_SIZE, 42, Short.MAX_VALUE)
					.addContainerGap())
		);
		pannelloIconTextVETR.setLayout(gl_pannelloIconTextVETR);
		pannelloVETR.setLayout(null);
		pannelloVETR.add(pannelloIconTextVETR);
		
		JPanel pannelloInfoVETR = new JPanel();
		pannelloInfoVETR.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloInfoVETR.setBackground(new Color(220, 220, 220));
		pannelloInfoVETR.setBounds(0, 130, 612, 266);
		pannelloVETR.add(pannelloInfoVETR);
		pannelloInfoVETR.setLayout(null);
		
		JScrollPane scrollPaneVETR = new JScrollPane();
		scrollPaneVETR.setBounds(10, 11, 592, 244);
		pannelloInfoVETR.add(scrollPaneVETR);
		
		JTextArea textAreaVETR = new JTextArea();
		textAreaVETR.setEditable(false);
		textAreaVETR.setDropMode(DropMode.INSERT);
		scrollPaneVETR.setViewportView(textAreaVETR);
		
		
		JPanel pannelloEU = new JPanel();
		pannelloEU.setLayout(null);
		tabbedPaneCompagnie.addTab("Eurowings", null, pannelloEU, null);
		
		JPanel pannelloDVEU = new JPanel();
		pannelloDVEU.setBackground(Color.WHITE);
		pannelloDVEU.setBounds(240, 11, 200, 339);
		pannelloEU.add(pannelloDVEU);
		
		JPanel pannelloInfoDVEU = new JPanel();
		pannelloInfoDVEU.setLayout(null);
		pannelloInfoDVEU.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloInfoDVEU.setBackground(new Color(220, 220, 220));
		
		JLabel durataBruEU = new JLabel("Bru - 2h 25m");
		durataBruEU.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		durataBruEU.setHorizontalAlignment(SwingConstants.CENTER);
		durataBruEU.setBounds(10, 66, 180, 23);
		pannelloInfoDVEU.add(durataBruEU);
		
		JLabel durataAteEU = new JLabel("Ate - 1h 40m");
		durataAteEU.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		durataAteEU.setHorizontalAlignment(SwingConstants.CENTER);
		durataAteEU.setBounds(10, 113, 180, 23);
		pannelloInfoDVEU.add(durataAteEU);
		
		JPanel pannelloIconTextDVEU = new JPanel();
		pannelloIconTextDVEU.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloIconTextDVEU.setBackground(new Color(245, 245, 245));
		
		JPanel pannelloTextDVEU = new JPanel();
		pannelloTextDVEU.setBackground(new Color(13, 62, 117));
		
		JLabel textDVEU = new JLabel("Durata Voli");
		textDVEU.setHorizontalAlignment(SwingConstants.CENTER);
		textDVEU.setForeground(Color.WHITE);
		textDVEU.setFont(new Font("Lucida Bright", Font.ITALIC, 15));
		GroupLayout gl_pannelloTextDVEU = new GroupLayout(pannelloTextDVEU);
		gl_pannelloTextDVEU.setHorizontalGroup(
			gl_pannelloTextDVEU.createParallelGroup(Alignment.LEADING)
				.addGap(0, 196, Short.MAX_VALUE)
				.addGroup(gl_pannelloTextDVEU.createSequentialGroup()
					.addContainerGap()
					.addComponent(textDVEU, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_pannelloTextDVEU.setVerticalGroup(
			gl_pannelloTextDVEU.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 54, Short.MAX_VALUE)
				.addGroup(gl_pannelloTextDVEU.createSequentialGroup()
					.addGap(5)
					.addComponent(textDVEU, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
					.addContainerGap())
		);
		pannelloTextDVEU.setLayout(gl_pannelloTextDVEU);
		
		JLabel iconDVEU = new JLabel("");
		iconDVEU.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconDurata.png")));
		iconDVEU.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_pannelloIconTextDVEU = new GroupLayout(pannelloIconTextDVEU);
		gl_pannelloIconTextDVEU.setHorizontalGroup(
			gl_pannelloIconTextDVEU.createParallelGroup(Alignment.LEADING)
				.addGap(0, 200, Short.MAX_VALUE)
				.addComponent(pannelloTextDVEU, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
				.addGroup(gl_pannelloIconTextDVEU.createSequentialGroup()
					.addGap(10)
					.addComponent(iconDVEU, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addGap(10))
		);
		gl_pannelloIconTextDVEU.setVerticalGroup(
			gl_pannelloIconTextDVEU.createParallelGroup(Alignment.LEADING)
				.addGap(0, 123, Short.MAX_VALUE)
				.addGroup(gl_pannelloIconTextDVEU.createSequentialGroup()
					.addComponent(pannelloTextDVEU, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(iconDVEU)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pannelloIconTextDVEU.setLayout(gl_pannelloIconTextDVEU);
		GroupLayout gl_pannelloDVEU = new GroupLayout(pannelloDVEU);
		gl_pannelloDVEU.setHorizontalGroup(
			gl_pannelloDVEU.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pannelloDVEU.createSequentialGroup()
					.addGroup(gl_pannelloDVEU.createParallelGroup(Alignment.TRAILING)
						.addComponent(pannelloInfoDVEU, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
						.addComponent(pannelloIconTextDVEU, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_pannelloDVEU.setVerticalGroup(
			gl_pannelloDVEU.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pannelloDVEU.createSequentialGroup()
					.addComponent(pannelloIconTextDVEU, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pannelloInfoDVEU, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		pannelloDVEU.setLayout(gl_pannelloDVEU);
		
		JPanel pannelloFVEU = new JPanel();
		pannelloFVEU.setBackground(Color.WHITE);
		pannelloFVEU.setBounds(10, 11, 200, 272);
		pannelloEU.add(pannelloFVEU);
		
		JPanel pannelloInfoFVEU = new JPanel();
		pannelloInfoFVEU.setBounds(0, 129, 200, 143);
		pannelloInfoFVEU.setLayout(null);
		pannelloInfoFVEU.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloInfoFVEU.setBackground(new Color(220, 220, 220));
		
		JLabel infoTextFVEU1 = new JLabel("Marted\u00EC");
		infoTextFVEU1.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		infoTextFVEU1.setHorizontalAlignment(SwingConstants.CENTER);
		infoTextFVEU1.setBounds(10, 42, 180, 23);
		pannelloInfoFVEU.add(infoTextFVEU1);
		
		JLabel infoTextFVEU2 = new JLabel("Mercoled\u00EC");
		infoTextFVEU2.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		infoTextFVEU2.setHorizontalAlignment(SwingConstants.CENTER);
		infoTextFVEU2.setBounds(10, 76, 180, 23);
		pannelloInfoFVEU.add(infoTextFVEU2);
		
		JPanel pannelloIconTextFVEU = new JPanel();
		pannelloIconTextFVEU.setBounds(0, 0, 200, 123);
		pannelloIconTextFVEU.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloIconTextFVEU.setBackground(new Color(245, 245, 245));
		
		pannelloTextFVEU = new JPanel();
		pannelloTextFVEU.setBackground(new Color(13, 62, 117));
		
		JLabel textFVEU = new JLabel("Frequenza Voli");
		textFVEU.setHorizontalAlignment(SwingConstants.CENTER);
		textFVEU.setForeground(Color.WHITE);
		textFVEU.setFont(new Font("Lucida Bright", Font.ITALIC, 15));
		GroupLayout gl_pannelloTextFVEU = new GroupLayout(pannelloTextFVEU);
		gl_pannelloTextFVEU.setHorizontalGroup(
			gl_pannelloTextFVEU.createParallelGroup(Alignment.LEADING)
				.addGap(0, 196, Short.MAX_VALUE)
				.addGroup(gl_pannelloTextFVEU.createSequentialGroup()
					.addContainerGap()
					.addComponent(textFVEU, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_pannelloTextFVEU.setVerticalGroup(
			gl_pannelloTextFVEU.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 54, Short.MAX_VALUE)
				.addGroup(gl_pannelloTextFVEU.createSequentialGroup()
					.addGap(5)
					.addComponent(textFVEU, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
					.addContainerGap())
		);
		pannelloTextFVEU.setLayout(gl_pannelloTextFVEU);
		
		JLabel iconFVEU = new JLabel("");
		iconFVEU.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconFrequenza.png")));
		iconFVEU.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_pannelloIconTextFVEU = new GroupLayout(pannelloIconTextFVEU);
		gl_pannelloIconTextFVEU.setHorizontalGroup(
			gl_pannelloIconTextFVEU.createParallelGroup(Alignment.LEADING)
				.addGap(0, 200, Short.MAX_VALUE)
				.addComponent(pannelloTextFVEU, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
				.addGroup(gl_pannelloIconTextFVEU.createSequentialGroup()
					.addGap(10)
					.addComponent(iconFVEU, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addGap(10))
		);
		gl_pannelloIconTextFVEU.setVerticalGroup(
			gl_pannelloIconTextFVEU.createParallelGroup(Alignment.LEADING)
				.addGap(0, 123, Short.MAX_VALUE)
				.addGroup(gl_pannelloIconTextFVEU.createSequentialGroup()
					.addComponent(pannelloTextFVEU, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(iconFVEU, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
					.addContainerGap())
		);
		pannelloIconTextFVEU.setLayout(gl_pannelloIconTextFVEU);
		pannelloFVEU.setLayout(null);
		pannelloFVEU.add(pannelloInfoFVEU);
		pannelloFVEU.add(pannelloIconTextFVEU);
		
		JPanel pannelloVETEU = new JPanel();
		pannelloVETEU.setBackground(Color.WHITE);
		pannelloVETEU.setBounds(470, 11, 612, 396);
		pannelloEU.add(pannelloVETEU);
		
		JPanel pannelloInfoVETEU = new JPanel();
		pannelloInfoVETEU.setLayout(null);
		pannelloInfoVETEU.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloInfoVETEU.setBackground(new Color(220, 220, 220));
		
		JPanel pannelloIconTextVETEU = new JPanel();
		pannelloIconTextVETEU.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloIconTextVETEU.setBackground(new Color(245, 245, 245));
		
		JPanel pannelloTextVETEU = new JPanel();
		pannelloTextVETEU.setBackground(new Color(13, 62, 117));
		
		JLabel textVETE = new JLabel("Voli & Tratte");
		textVETE.setHorizontalAlignment(SwingConstants.CENTER);
		textVETE.setForeground(Color.WHITE);
		textVETE.setFont(new Font("Lucida Bright", Font.ITALIC, 15));
		GroupLayout gl_pannelloTextVETEU = new GroupLayout(pannelloTextVETEU);
		gl_pannelloTextVETEU.setHorizontalGroup(
			gl_pannelloTextVETEU.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pannelloTextVETEU.createSequentialGroup()
					.addContainerGap()
					.addComponent(textVETE, GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_pannelloTextVETEU.setVerticalGroup(
			gl_pannelloTextVETEU.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_pannelloTextVETEU.createSequentialGroup()
					.addGap(5)
					.addComponent(textVETE, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
					.addContainerGap())
		);
		pannelloTextVETEU.setLayout(gl_pannelloTextVETEU);
		GroupLayout gl_pannelloIconTextVETEU = new GroupLayout(pannelloIconTextVETEU);
		gl_pannelloIconTextVETEU.setHorizontalGroup(
			gl_pannelloIconTextVETEU.createParallelGroup(Alignment.LEADING)
				.addComponent(pannelloTextVETEU, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
		);
		gl_pannelloIconTextVETEU.setVerticalGroup(
			gl_pannelloIconTextVETEU.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pannelloIconTextVETEU.createSequentialGroup()
					.addComponent(pannelloTextVETEU, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(62, Short.MAX_VALUE))
		);
		pannelloIconTextVETEU.setLayout(gl_pannelloIconTextVETEU);
		GroupLayout gl_pannelloVETEU = new GroupLayout(pannelloVETEU);
		gl_pannelloVETEU.setHorizontalGroup(
			gl_pannelloVETEU.createParallelGroup(Alignment.LEADING)
				.addComponent(pannelloIconTextVETEU, GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
				.addComponent(pannelloInfoVETEU, GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
		);
		gl_pannelloVETEU.setVerticalGroup(
			gl_pannelloVETEU.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pannelloVETEU.createSequentialGroup()
					.addComponent(pannelloIconTextVETEU, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pannelloInfoVETEU, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
		);
		
		JScrollPane scrollPaneVETEU = new JScrollPane();
		scrollPaneVETEU.setBounds(10, 11, 592, 248);
		pannelloInfoVETEU.add(scrollPaneVETEU);
		
		JTextArea textAreaVETEU = new JTextArea();
		textAreaVETEU.setEditable(false);
		textAreaVETEU.setDropMode(DropMode.INSERT);
		scrollPaneVETEU.setViewportView(textAreaVETEU);
		pannelloVETEU.setLayout(gl_pannelloVETEU);
		
		JPanel pannelloV = new JPanel();
		pannelloV.setLayout(null);
		tabbedPaneCompagnie.addTab("Volotea", null, pannelloV, null);
		
		JPanel pannelloDVV = new JPanel();
		pannelloDVV.setBackground(Color.WHITE);
		pannelloDVV.setBounds(240, 11, 200, 339);
		pannelloV.add(pannelloDVV);
		
		JPanel pannelloInfoDVV = new JPanel();
		pannelloInfoDVV.setBounds(0, 129, 200, 210);
		pannelloInfoDVV.setLayout(null);
		pannelloInfoDVV.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloInfoDVV.setBackground(new Color(220, 220, 220));
		
		JLabel durataBarV = new JLabel("Bar - 2h 5");
		durataBarV.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		durataBarV.setHorizontalAlignment(SwingConstants.CENTER);
		durataBarV.setBounds(10, 50, 180, 23);
		pannelloInfoDVV.add(durataBarV);
		
		JLabel durataCagV = new JLabel("Cag - 1h 10m");
		durataCagV.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		durataCagV.setHorizontalAlignment(SwingConstants.CENTER);
		durataCagV.setBounds(10, 98, 180, 23);
		pannelloInfoDVV.add(durataCagV);
		
		JLabel durataCatV = new JLabel("Cat - 1h");
		durataCatV.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		durataCatV.setHorizontalAlignment(SwingConstants.CENTER);
		durataCatV.setBounds(10, 143, 180, 23);
		pannelloInfoDVV.add(durataCatV);
		
		JPanel pannelloIconTextDVV = new JPanel();
		pannelloIconTextDVV.setBounds(0, 0, 200, 123);
		pannelloIconTextDVV.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloIconTextDVV.setBackground(new Color(245, 245, 245));
		
		JPanel pannelloTextDVV = new JPanel();
		pannelloTextDVV.setBackground(new Color(13, 62, 117));
		
		JLabel textDVV = new JLabel("Durata Voli");
		textDVV.setHorizontalAlignment(SwingConstants.CENTER);
		textDVV.setForeground(Color.WHITE);
		textDVV.setFont(new Font("Lucida Bright", Font.ITALIC, 15));
		GroupLayout gl_pannelloTextDVV = new GroupLayout(pannelloTextDVV);
		gl_pannelloTextDVV.setHorizontalGroup(
			gl_pannelloTextDVV.createParallelGroup(Alignment.LEADING)
				.addGap(0, 196, Short.MAX_VALUE)
				.addGroup(gl_pannelloTextDVV.createSequentialGroup()
					.addContainerGap()
					.addComponent(textDVV, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_pannelloTextDVV.setVerticalGroup(
			gl_pannelloTextDVV.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 54, Short.MAX_VALUE)
				.addGroup(gl_pannelloTextDVV.createSequentialGroup()
					.addGap(5)
					.addComponent(textDVV, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
					.addContainerGap())
		);
		pannelloTextDVV.setLayout(gl_pannelloTextDVV);
		
		JLabel IconDVV = new JLabel("");
		IconDVV.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconDurata.png")));
		IconDVV.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_pannelloIconTextDVV = new GroupLayout(pannelloIconTextDVV);
		gl_pannelloIconTextDVV.setHorizontalGroup(
			gl_pannelloIconTextDVV.createParallelGroup(Alignment.LEADING)
				.addGap(0, 200, Short.MAX_VALUE)
				.addComponent(pannelloTextDVV, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
				.addGroup(gl_pannelloIconTextDVV.createSequentialGroup()
					.addGap(10)
					.addComponent(IconDVV, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addGap(10))
		);
		gl_pannelloIconTextDVV.setVerticalGroup(
			gl_pannelloIconTextDVV.createParallelGroup(Alignment.LEADING)
				.addGap(0, 123, Short.MAX_VALUE)
				.addGroup(gl_pannelloIconTextDVV.createSequentialGroup()
					.addComponent(pannelloTextDVV, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(IconDVV)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pannelloIconTextDVV.setLayout(gl_pannelloIconTextDVV);
		pannelloDVV.setLayout(null);
		pannelloDVV.add(pannelloInfoDVV);
		pannelloDVV.add(pannelloIconTextDVV);
		
		JPanel pannelloFVV = new JPanel();
		pannelloFVV.setBackground(Color.WHITE);
		pannelloFVV.setBounds(10, 11, 200, 272);
		pannelloV.add(pannelloFVV);
		
		JPanel pannelloInfoFVV = new JPanel();
		pannelloInfoFVV.setBounds(0, 129, 200, 143);
		pannelloInfoFVV.setLayout(null);
		pannelloInfoFVV.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloInfoFVV.setBackground(new Color(220, 220, 220));
		
		JLabel infoTextFVV2 = new JLabel("Venerd\u00EC");
		infoTextFVV2.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		infoTextFVV2.setHorizontalAlignment(SwingConstants.CENTER);
		infoTextFVV2.setBounds(10, 55, 180, 23);
		pannelloInfoFVV.add(infoTextFVV2);
		
		JLabel infoTextFVV3 = new JLabel("Domenica");
		infoTextFVV3.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		infoTextFVV3.setHorizontalAlignment(SwingConstants.CENTER);
		infoTextFVV3.setBounds(10, 90, 180, 23);
		pannelloInfoFVV.add(infoTextFVV3);
		
		JPanel pannelloIconTextFVV = new JPanel();
		pannelloIconTextFVV.setBounds(0, 0, 200, 123);
		pannelloIconTextFVV.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloIconTextFVV.setBackground(new Color(245, 245, 245));
		
		JPanel pannelloTextFVV = new JPanel();
		pannelloTextFVV.setBackground(new Color(13, 62, 117));
		
		JLabel textFVV = new JLabel("Frequenza Voli");
		textFVV.setHorizontalAlignment(SwingConstants.CENTER);
		textFVV.setForeground(Color.WHITE);
		textFVV.setFont(new Font("Lucida Bright", Font.ITALIC, 15));
		GroupLayout gl_pannelloTextFVV = new GroupLayout(pannelloTextFVV);
		gl_pannelloTextFVV.setHorizontalGroup(
			gl_pannelloTextFVV.createParallelGroup(Alignment.LEADING)
				.addGap(0, 196, Short.MAX_VALUE)
				.addGroup(gl_pannelloTextFVV.createSequentialGroup()
					.addContainerGap()
					.addComponent(textFVV, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_pannelloTextFVV.setVerticalGroup(
			gl_pannelloTextFVV.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 54, Short.MAX_VALUE)
				.addGroup(gl_pannelloTextFVV.createSequentialGroup()
					.addGap(5)
					.addComponent(textFVV, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
					.addContainerGap())
		);
		pannelloTextFVV.setLayout(gl_pannelloTextFVV);
		
		JLabel iconFVV = new JLabel("");
		iconFVV.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconFrequenza.png")));
		iconFVV.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_pannelloIconTextFVV = new GroupLayout(pannelloIconTextFVV);
		gl_pannelloIconTextFVV.setHorizontalGroup(
			gl_pannelloIconTextFVV.createParallelGroup(Alignment.LEADING)
				.addGap(0, 200, Short.MAX_VALUE)
				.addComponent(pannelloTextFVV, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
				.addGroup(gl_pannelloIconTextFVV.createSequentialGroup()
					.addGap(10)
					.addComponent(iconFVV, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addGap(10))
		);
		gl_pannelloIconTextFVV.setVerticalGroup(
			gl_pannelloIconTextFVV.createParallelGroup(Alignment.LEADING)
				.addGap(0, 123, Short.MAX_VALUE)
				.addGroup(gl_pannelloIconTextFVV.createSequentialGroup()
					.addComponent(pannelloTextFVV, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(iconFVV, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
					.addContainerGap())
		);
		pannelloIconTextFVV.setLayout(gl_pannelloIconTextFVV);
		pannelloFVV.setLayout(null);
		
		JLabel infoTextFVV1 = new JLabel("Mercoled\u00EC");
		infoTextFVV1.setHorizontalAlignment(SwingConstants.CENTER);
		infoTextFVV1.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		infoTextFVV1.setBounds(10, 21, 180, 23);
		pannelloInfoFVV.add(infoTextFVV1);
		pannelloFVV.add(pannelloInfoFVV);
		pannelloFVV.add(pannelloIconTextFVV);
		
		JPanel pannelloVETV = new JPanel();
		pannelloVETV.setBackground(Color.WHITE);
		pannelloVETV.setBounds(470, 11, 612, 396);
		pannelloV.add(pannelloVETV);
		
		JPanel pannelloInfoVETV = new JPanel();
		pannelloInfoVETV.setBounds(0, 126, 612, 270);
		pannelloInfoVETV.setLayout(null);
		pannelloInfoVETV.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloInfoVETV.setBackground(new Color(220, 220, 220));
		
		JPanel pannelloIconTextVETV = new JPanel();
		pannelloIconTextVETV.setBounds(0, 0, 612, 120);
		pannelloIconTextVETV.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloIconTextVETV.setBackground(new Color(245, 245, 245));
		
		JPanel pannelloTextVETV = new JPanel();
		pannelloTextVETV.setBackground(new Color(13, 62, 117));
		
		JLabel textVETV = new JLabel("Voli & Tratte");
		textVETV.setHorizontalAlignment(SwingConstants.CENTER);
		textVETV.setForeground(Color.WHITE);
		textVETV.setFont(new Font("Lucida Bright", Font.ITALIC, 15));
		GroupLayout gl_pannelloTextVETV = new GroupLayout(pannelloTextVETV);
		gl_pannelloTextVETV.setHorizontalGroup(
			gl_pannelloTextVETV.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pannelloTextVETV.createSequentialGroup()
					.addContainerGap()
					.addComponent(textVETV, GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_pannelloTextVETV.setVerticalGroup(
			gl_pannelloTextVETV.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_pannelloTextVETV.createSequentialGroup()
					.addGap(5)
					.addComponent(textVETV, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
					.addContainerGap())
		);
		pannelloTextVETV.setLayout(gl_pannelloTextVETV);
		
		JLabel iconVETV = new JLabel("");
		iconVETV.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconVoliETratte.png")));
		iconVETV.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_pannelloIconTextVETV = new GroupLayout(pannelloIconTextVETV);
		gl_pannelloIconTextVETV.setHorizontalGroup(
			gl_pannelloIconTextVETV.createParallelGroup(Alignment.LEADING)
				.addComponent(pannelloTextVETV, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
				.addGroup(gl_pannelloIconTextVETV.createSequentialGroup()
					.addGap(10)
					.addComponent(iconVETV, GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_pannelloIconTextVETV.setVerticalGroup(
			gl_pannelloIconTextVETV.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pannelloIconTextVETV.createSequentialGroup()
					.addComponent(pannelloTextVETV, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(iconVETV, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(8))
		);
		pannelloIconTextVETV.setLayout(gl_pannelloIconTextVETV);
		pannelloVETV.setLayout(null);
		pannelloVETV.add(pannelloInfoVETV);
		
		JScrollPane scrollPaneVETV = new JScrollPane();
		scrollPaneVETV.setBounds(10, 11, 592, 248);
		pannelloInfoVETV.add(scrollPaneVETV);
		
		JTextArea textAreaVETV = new JTextArea();
		scrollPaneVETV.setViewportView(textAreaVETV);
		pannelloVETV.add(pannelloIconTextVETV);
		
		JPanel pannelloA = new JPanel();
		pannelloA.setLayout(null);
		tabbedPaneCompagnie.addTab("Alitalia", null, pannelloA, null);
		
		JPanel pannelloDVA = new JPanel();
		pannelloDVA.setBackground(Color.WHITE);
		pannelloDVA.setBounds(240, 11, 200, 339);
		pannelloA.add(pannelloDVA);
		
		JPanel pannelloInfoDVA = new JPanel();
		pannelloInfoDVA.setBounds(0, 129, 200, 210);
		pannelloInfoDVA.setLayout(null);
		pannelloInfoDVA.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloInfoDVA.setBackground(new Color(220, 220, 220));
		
		JLabel durataDubA = new JLabel("Dub - 5h 50m");
		durataDubA.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		durataDubA.setHorizontalAlignment(SwingConstants.CENTER);
		durataDubA.setBounds(10, 35, 180, 23);
		pannelloInfoDVA.add(durataDubA);
		
		durataGenA = new JLabel("Gen - 1h 25m");
		durataGenA.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		durataGenA.setHorizontalAlignment(SwingConstants.CENTER);
		durataGenA.setBounds(10, 72, 180, 23);
		pannelloInfoDVA.add(durataGenA);
		
		JPanel pannelloIconTextDVA = new JPanel();
		pannelloIconTextDVA.setBounds(0, 0, 200, 123);
		pannelloIconTextDVA.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloIconTextDVA.setBackground(new Color(245, 245, 245));
		
		JPanel pannelloTextDVA = new JPanel();
		pannelloTextDVA.setBackground(new Color(13, 62, 117));
		
		JLabel textDVA = new JLabel("Durata Voli");
		textDVA.setHorizontalAlignment(SwingConstants.CENTER);
		textDVA.setForeground(Color.WHITE);
		textDVA.setFont(new Font("Lucida Bright", Font.ITALIC, 15));
		GroupLayout gl_pannelloTextDVA = new GroupLayout(pannelloTextDVA);
		gl_pannelloTextDVA.setHorizontalGroup(
			gl_pannelloTextDVA.createParallelGroup(Alignment.LEADING)
				.addGap(0, 196, Short.MAX_VALUE)
				.addGroup(gl_pannelloTextDVA.createSequentialGroup()
					.addContainerGap()
					.addComponent(textDVA, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_pannelloTextDVA.setVerticalGroup(
			gl_pannelloTextDVA.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 54, Short.MAX_VALUE)
				.addGroup(gl_pannelloTextDVA.createSequentialGroup()
					.addGap(5)
					.addComponent(textDVA, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
					.addContainerGap())
		);
		pannelloTextDVA.setLayout(gl_pannelloTextDVA);
		
		JLabel iconDVA = new JLabel("");
		iconDVA.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconDurata.png")));
		iconDVA.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_pannelloIconTextDVA = new GroupLayout(pannelloIconTextDVA);
		gl_pannelloIconTextDVA.setHorizontalGroup(
			gl_pannelloIconTextDVA.createParallelGroup(Alignment.LEADING)
				.addGap(0, 200, Short.MAX_VALUE)
				.addComponent(pannelloTextDVA, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
				.addGroup(gl_pannelloIconTextDVA.createSequentialGroup()
					.addGap(10)
					.addComponent(iconDVA, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addGap(10))
		);
		gl_pannelloIconTextDVA.setVerticalGroup(
			gl_pannelloIconTextDVA.createParallelGroup(Alignment.LEADING)
				.addGap(0, 123, Short.MAX_VALUE)
				.addGroup(gl_pannelloIconTextDVA.createSequentialGroup()
					.addComponent(pannelloTextDVA, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(iconDVA)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pannelloIconTextDVA.setLayout(gl_pannelloIconTextDVA);
		pannelloDVA.setLayout(null);
		
		JLabel durataTriA = new JLabel("Tri - 1h 15m");
		durataTriA.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		durataTriA.setHorizontalAlignment(SwingConstants.CENTER);
		durataTriA.setBounds(10, 114, 180, 23);
		pannelloInfoDVA.add(durataTriA);
		
		JLabel durataVenA = new JLabel("Ven - 1h 15m");
		durataVenA.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		durataVenA.setHorizontalAlignment(SwingConstants.CENTER);
		durataVenA.setBounds(10, 148, 180, 23);
		pannelloInfoDVA.add(durataVenA);
		pannelloDVA.add(pannelloInfoDVA);
		pannelloDVA.add(pannelloIconTextDVA);
		
		JPanel pannelloFVA = new JPanel();
		pannelloFVA.setBackground(Color.WHITE);
		pannelloFVA.setBounds(10, 11, 200, 272);
		pannelloA.add(pannelloFVA);
		
		JPanel pannelloInfoFVA = new JPanel();
		pannelloInfoFVA.setBounds(0, 129, 200, 143);
		pannelloInfoFVA.setLayout(null);
		pannelloInfoFVA.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloInfoFVA.setBackground(new Color(220, 220, 220));
		
		JLabel infoTextFVA1 = new JLabel("Gioved\u00EC");
		infoTextFVA1.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		infoTextFVA1.setHorizontalAlignment(SwingConstants.CENTER);
		infoTextFVA1.setBounds(10, 25, 180, 23);
		pannelloInfoFVA.add(infoTextFVA1);
		
		JLabel infoTextFVA2 = new JLabel("Venerd\u00EC");
		infoTextFVA2.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		infoTextFVA2.setHorizontalAlignment(SwingConstants.CENTER);
		infoTextFVA2.setBounds(10, 60, 180, 23);
		pannelloInfoFVA.add(infoTextFVA2);
		
		JLabel infoTextFVA3 = new JLabel("Sabato");
		infoTextFVA3.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		infoTextFVA3.setHorizontalAlignment(SwingConstants.CENTER);
		infoTextFVA3.setBounds(10, 94, 180, 23);
		pannelloInfoFVA.add(infoTextFVA3);
		
		JPanel pannelloIconTextFVA = new JPanel();
		pannelloIconTextFVA.setBounds(0, 0, 200, 123);
		pannelloIconTextFVA.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloIconTextFVA.setBackground(new Color(245, 245, 245));
		
		JPanel pannelloTextFVA = new JPanel();
		pannelloTextFVA.setBackground(new Color(13, 62, 117));
		
		JLabel textFVA = new JLabel("Frequenza Voli");
		textFVA.setHorizontalAlignment(SwingConstants.CENTER);
		textFVA.setForeground(Color.WHITE);
		textFVA.setFont(new Font("Lucida Bright", Font.ITALIC, 15));
		GroupLayout gl_pannelloTextFVA = new GroupLayout(pannelloTextFVA);
		gl_pannelloTextFVA.setHorizontalGroup(
			gl_pannelloTextFVA.createParallelGroup(Alignment.LEADING)
				.addGap(0, 196, Short.MAX_VALUE)
				.addGroup(gl_pannelloTextFVA.createSequentialGroup()
					.addContainerGap()
					.addComponent(textFVA, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_pannelloTextFVA.setVerticalGroup(
			gl_pannelloTextFVA.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 54, Short.MAX_VALUE)
				.addGroup(gl_pannelloTextFVA.createSequentialGroup()
					.addGap(5)
					.addComponent(textFVA, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
					.addContainerGap())
		);
		pannelloTextFVA.setLayout(gl_pannelloTextFVA);
		
		JLabel iconFVA = new JLabel("");
		iconFVA.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconFrequenza.png")));
		iconFVA.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_pannelloIconTextFVA = new GroupLayout(pannelloIconTextFVA);
		gl_pannelloIconTextFVA.setHorizontalGroup(
			gl_pannelloIconTextFVA.createParallelGroup(Alignment.LEADING)
				.addGap(0, 200, Short.MAX_VALUE)
				.addComponent(pannelloTextFVA, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
				.addGroup(gl_pannelloIconTextFVA.createSequentialGroup()
					.addGap(10)
					.addComponent(iconFVA, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addGap(10))
		);
		gl_pannelloIconTextFVA.setVerticalGroup(
			gl_pannelloIconTextFVA.createParallelGroup(Alignment.LEADING)
				.addGap(0, 123, Short.MAX_VALUE)
				.addGroup(gl_pannelloIconTextFVA.createSequentialGroup()
					.addComponent(pannelloTextFVA, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(iconFVA, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
					.addContainerGap())
		);
		pannelloIconTextFVA.setLayout(gl_pannelloIconTextFVA);
		pannelloFVA.setLayout(null);
		pannelloFVA.add(pannelloInfoFVA);
		pannelloFVA.add(pannelloIconTextFVA);
		
		JPanel pannelloVETA = new JPanel();
		pannelloVETA.setBackground(Color.WHITE);
		pannelloVETA.setBounds(470, 11, 612, 396);
		pannelloA.add(pannelloVETA);
		
		JPanel pannelloInfoVETA = new JPanel();
		pannelloInfoVETA.setBounds(0, 126, 612, 270);
		pannelloInfoVETA.setLayout(null);
		pannelloInfoVETA.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloInfoVETA.setBackground(new Color(220, 220, 220));
		
		JPanel pannelloIconTextVETA = new JPanel();
		pannelloIconTextVETA.setBounds(0, 0, 612, 120);
		pannelloIconTextVETA.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloIconTextVETA.setBackground(new Color(245, 245, 245));
		
		JPanel pannelloTextVETA = new JPanel();
		pannelloTextVETA.setBackground(new Color(13, 62, 117));
		
		JLabel textVETA = new JLabel("Voli & Tratte");
		textVETA.setHorizontalAlignment(SwingConstants.CENTER);
		textVETA.setForeground(Color.WHITE);
		textVETA.setFont(new Font("Lucida Bright", Font.ITALIC, 15));
		GroupLayout gl_pannelloTextVETA = new GroupLayout(pannelloTextVETA);
		gl_pannelloTextVETA.setHorizontalGroup(
			gl_pannelloTextVETA.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pannelloTextVETA.createSequentialGroup()
					.addContainerGap()
					.addComponent(textVETA, GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_pannelloTextVETA.setVerticalGroup(
			gl_pannelloTextVETA.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_pannelloTextVETA.createSequentialGroup()
					.addGap(5)
					.addComponent(textVETA, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
					.addContainerGap())
		);
		pannelloTextVETA.setLayout(gl_pannelloTextVETA);
		
		JLabel icomVETA = new JLabel("");
		icomVETA.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconVoliETratte.png")));
		icomVETA.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_pannelloIconTextVETA = new GroupLayout(pannelloIconTextVETA);
		gl_pannelloIconTextVETA.setHorizontalGroup(
			gl_pannelloIconTextVETA.createParallelGroup(Alignment.LEADING)
				.addComponent(pannelloTextVETA, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
				.addGroup(gl_pannelloIconTextVETA.createSequentialGroup()
					.addGap(10)
					.addComponent(icomVETA, GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_pannelloIconTextVETA.setVerticalGroup(
			gl_pannelloIconTextVETA.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pannelloIconTextVETA.createSequentialGroup()
					.addComponent(pannelloTextVETA, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(icomVETA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(8))
		);
		pannelloIconTextVETA.setLayout(gl_pannelloIconTextVETA);
		pannelloVETA.setLayout(null);
		pannelloVETA.add(pannelloInfoVETA);
		
		JScrollPane scrollPaneVETA = new JScrollPane();
		scrollPaneVETA.setBounds(10, 11, 592, 248);
		pannelloInfoVETA.add(scrollPaneVETA);
		
		JTextArea textAreaVETA = new JTextArea();
		scrollPaneVETA.setViewportView(textAreaVETA);
		pannelloVETA.add(pannelloIconTextVETA);
		
		JPanel pannelloEA = new JPanel();
		pannelloEA.setLayout(null);
		tabbedPaneCompagnie.addTab("EasyJet", null, pannelloEA, null);
		
		JPanel pannelloDVEA = new JPanel();
		pannelloDVEA.setBackground(Color.WHITE);
		pannelloDVEA.setBounds(240, 11, 200, 339);
		pannelloEA.add(pannelloDVEA);
		
		JPanel pannelloInfoDVEA = new JPanel();
		pannelloInfoDVEA.setBounds(0, 129, 200, 210);
		pannelloInfoDVEA.setLayout(null);
		pannelloInfoDVEA.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloInfoDVEA.setBackground(new Color(220, 220, 220));
		
		JLabel durataCraEA = new JLabel("Cra - 2h");
		durataCraEA.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		durataCraEA.setHorizontalAlignment(SwingConstants.CENTER);
		durataCraEA.setBounds(10, 42, 180, 23);
		pannelloInfoDVEA.add(durataCraEA);
		
		JLabel durataTorEA = new JLabel("Tor - 1h 30m");
		durataTorEA.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		durataTorEA.setHorizontalAlignment(SwingConstants.CENTER);
		durataTorEA.setBounds(10, 90, 180, 23);
		pannelloInfoDVEA.add(durataTorEA);
		
		JLabel durataMilEA = new JLabel("Mil - 1h 20m");
		durataMilEA.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		durataMilEA.setHorizontalAlignment(SwingConstants.CENTER);
		durataMilEA.setBounds(10, 135, 180, 23);
		pannelloInfoDVEA.add(durataMilEA);
		
		JPanel pannelloIconTextDVEA = new JPanel();
		pannelloIconTextDVEA.setBounds(0, 0, 200, 123);
		pannelloIconTextDVEA.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloIconTextDVEA.setBackground(new Color(245, 245, 245));
		
		JPanel pannelloTextDVEA = new JPanel();
		pannelloTextDVEA.setBackground(new Color(13, 62, 117));
		
		JLabel textDVEA = new JLabel("Durata Voli");
		textDVEA.setHorizontalAlignment(SwingConstants.CENTER);
		textDVEA.setForeground(Color.WHITE);
		textDVEA.setFont(new Font("Lucida Bright", Font.ITALIC, 15));
		GroupLayout gl_pannelloTextDVEA = new GroupLayout(pannelloTextDVEA);
		gl_pannelloTextDVEA.setHorizontalGroup(
			gl_pannelloTextDVEA.createParallelGroup(Alignment.LEADING)
				.addGap(0, 196, Short.MAX_VALUE)
				.addGroup(gl_pannelloTextDVEA.createSequentialGroup()
					.addContainerGap()
					.addComponent(textDVEA, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_pannelloTextDVEA.setVerticalGroup(
			gl_pannelloTextDVEA.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 54, Short.MAX_VALUE)
				.addGroup(gl_pannelloTextDVEA.createSequentialGroup()
					.addGap(5)
					.addComponent(textDVEA, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
					.addContainerGap())
		);
		pannelloTextDVEA.setLayout(gl_pannelloTextDVEA);
		
		JLabel iconDVEA = new JLabel("");
		iconDVEA.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconDurata.png")));
		iconDVEA.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_pannelloIconTextDVEA = new GroupLayout(pannelloIconTextDVEA);
		gl_pannelloIconTextDVEA.setHorizontalGroup(
			gl_pannelloIconTextDVEA.createParallelGroup(Alignment.LEADING)
				.addGap(0, 200, Short.MAX_VALUE)
				.addComponent(pannelloTextDVEA, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
				.addGroup(gl_pannelloIconTextDVEA.createSequentialGroup()
					.addGap(10)
					.addComponent(iconDVEA, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addGap(10))
		);
		gl_pannelloIconTextDVEA.setVerticalGroup(
			gl_pannelloIconTextDVEA.createParallelGroup(Alignment.LEADING)
				.addGap(0, 123, Short.MAX_VALUE)
				.addGroup(gl_pannelloIconTextDVEA.createSequentialGroup()
					.addComponent(pannelloTextDVEA, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(iconDVEA)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pannelloIconTextDVEA.setLayout(gl_pannelloIconTextDVEA);
		pannelloDVEA.setLayout(null);
		pannelloDVEA.add(pannelloInfoDVEA);
		pannelloDVEA.add(pannelloIconTextDVEA);
		
		JPanel pannelloFVEA = new JPanel();
		pannelloFVEA.setBackground(Color.WHITE);
		pannelloFVEA.setBounds(10, 11, 200, 272);
		pannelloEA.add(pannelloFVEA);
		
		JPanel pannelloInfoFVEA = new JPanel();
		pannelloInfoFVEA.setBounds(0, 129, 200, 143);
		pannelloInfoFVEA.setLayout(null);
		pannelloInfoFVEA.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloInfoFVEA.setBackground(new Color(220, 220, 220));
		
		JLabel infoTextFVEA2 = new JLabel("Mercoled\u00EC");
		infoTextFVEA2.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		infoTextFVEA2.setHorizontalAlignment(SwingConstants.CENTER);
		infoTextFVEA2.setBounds(10, 57, 180, 23);
		pannelloInfoFVEA.add(infoTextFVEA2);
		
		JLabel infoTextFVEA3 = new JLabel("Sabato");
		infoTextFVEA3.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		infoTextFVEA3.setHorizontalAlignment(SwingConstants.CENTER);
		infoTextFVEA3.setBounds(10, 92, 180, 23);
		pannelloInfoFVEA.add(infoTextFVEA3);
		
		JPanel pannelloIconTextFVEA = new JPanel();
		pannelloIconTextFVEA.setBounds(0, 0, 200, 123);
		pannelloIconTextFVEA.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloIconTextFVEA.setBackground(new Color(245, 245, 245));
		
		JPanel pannelloTextFVEA = new JPanel();
		pannelloTextFVEA.setBackground(new Color(13, 62, 117));
		
		JLabel textFVEA = new JLabel("Frequenza Voli");
		textFVEA.setHorizontalAlignment(SwingConstants.CENTER);
		textFVEA.setForeground(Color.WHITE);
		textFVEA.setFont(new Font("Lucida Bright", Font.ITALIC, 15));
		GroupLayout gl_pannelloTextFVEA = new GroupLayout(pannelloTextFVEA);
		gl_pannelloTextFVEA.setHorizontalGroup(
			gl_pannelloTextFVEA.createParallelGroup(Alignment.LEADING)
				.addGap(0, 196, Short.MAX_VALUE)
				.addGroup(gl_pannelloTextFVEA.createSequentialGroup()
					.addContainerGap()
					.addComponent(textFVEA, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_pannelloTextFVEA.setVerticalGroup(
			gl_pannelloTextFVEA.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 54, Short.MAX_VALUE)
				.addGroup(gl_pannelloTextFVEA.createSequentialGroup()
					.addGap(5)
					.addComponent(textFVEA, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
					.addContainerGap())
		);
		pannelloTextFVEA.setLayout(gl_pannelloTextFVEA);
		
		JLabel iconFVEA = new JLabel("");
		iconFVEA.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconFrequenza.png")));
		iconFVEA.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_pannelloIconTextFVEA = new GroupLayout(pannelloIconTextFVEA);
		gl_pannelloIconTextFVEA.setHorizontalGroup(
			gl_pannelloIconTextFVEA.createParallelGroup(Alignment.LEADING)
				.addGap(0, 200, Short.MAX_VALUE)
				.addComponent(pannelloTextFVEA, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
				.addGroup(gl_pannelloIconTextFVEA.createSequentialGroup()
					.addGap(10)
					.addComponent(iconFVEA, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addGap(10))
		);
		gl_pannelloIconTextFVEA.setVerticalGroup(
			gl_pannelloIconTextFVEA.createParallelGroup(Alignment.LEADING)
				.addGap(0, 123, Short.MAX_VALUE)
				.addGroup(gl_pannelloIconTextFVEA.createSequentialGroup()
					.addComponent(pannelloTextFVEA, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(iconFVEA, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
					.addContainerGap())
		);
		pannelloIconTextFVEA.setLayout(gl_pannelloIconTextFVEA);
		pannelloFVEA.setLayout(null);
		
		JLabel infoTextFVEA1 = new JLabel("Luned\u00EC");
		infoTextFVEA1.setHorizontalAlignment(SwingConstants.CENTER);
		infoTextFVEA1.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		infoTextFVEA1.setBounds(10, 23, 180, 23);
		pannelloInfoFVEA.add(infoTextFVEA1);
		pannelloFVEA.add(pannelloInfoFVEA);
		pannelloFVEA.add(pannelloIconTextFVEA);
		
		JPanel pannelloVETEA = new JPanel();
		pannelloVETEA.setBackground(Color.WHITE);
		pannelloVETEA.setBounds(470, 11, 612, 396);
		pannelloEA.add(pannelloVETEA);
		
		JPanel pannelloInfoVETEA = new JPanel();
		pannelloInfoVETEA.setBounds(0, 126, 612, 270);
		pannelloInfoVETEA.setLayout(null);
		pannelloInfoVETEA.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloInfoVETEA.setBackground(new Color(220, 220, 220));
		
		pannelloInfoTextVETEA = new JPanel();
		pannelloInfoTextVETEA.setBounds(0, 0, 612, 120);
		pannelloInfoTextVETEA.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pannelloInfoTextVETEA.setBackground(new Color(245, 245, 245));
		
		JPanel pannelloTextVETEA = new JPanel();
		pannelloTextVETEA.setBackground(new Color(13, 62, 117));
		
		JLabel textVETEA = new JLabel("Voli & Tratte");
		textVETEA.setHorizontalAlignment(SwingConstants.CENTER);
		textVETEA.setForeground(Color.WHITE);
		textVETEA.setFont(new Font("Lucida Bright", Font.ITALIC, 15));
		GroupLayout gl_pannelloTextVETEA = new GroupLayout(pannelloTextVETEA);
		gl_pannelloTextVETEA.setHorizontalGroup(
			gl_pannelloTextVETEA.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pannelloTextVETEA.createSequentialGroup()
					.addContainerGap()
					.addComponent(textVETEA, GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_pannelloTextVETEA.setVerticalGroup(
			gl_pannelloTextVETEA.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_pannelloTextVETEA.createSequentialGroup()
					.addGap(5)
					.addComponent(textVETEA, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
					.addContainerGap())
		);
		pannelloTextVETEA.setLayout(gl_pannelloTextVETEA);
		
		JLabel iconVETEA = new JLabel("");
		iconVETEA.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconVoliETratte.png")));
		iconVETEA.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_pannelloInfoTextVETEA = new GroupLayout(pannelloInfoTextVETEA);
		gl_pannelloInfoTextVETEA.setHorizontalGroup(
			gl_pannelloInfoTextVETEA.createParallelGroup(Alignment.LEADING)
				.addComponent(pannelloTextVETEA, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
				.addGroup(gl_pannelloInfoTextVETEA.createSequentialGroup()
					.addGap(10)
					.addComponent(iconVETEA, GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_pannelloInfoTextVETEA.setVerticalGroup(
			gl_pannelloInfoTextVETEA.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pannelloInfoTextVETEA.createSequentialGroup()
					.addComponent(pannelloTextVETEA, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(iconVETEA, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addContainerGap())
		);
		pannelloInfoTextVETEA.setLayout(gl_pannelloInfoTextVETEA);
		pannelloVETEA.setLayout(null);
		pannelloVETEA.add(pannelloInfoVETEA);
		
		JScrollPane scrollPaneVETEA = new JScrollPane();
		scrollPaneVETEA.setBounds(10, 11, 592, 248);
		pannelloInfoVETEA.add(scrollPaneVETEA);
		
		JTextArea textAreaVETEA = new JTextArea();
		scrollPaneVETEA.setViewportView(textAreaVETEA);
		pannelloVETEA.add(pannelloInfoTextVETEA);
		
		Ricerca = new JLayeredPane();
		BodyContainer.add(Ricerca, "name_676683593389700");
		
		JPanel pannelloRicerca = new JPanel();
		pannelloRicerca.setLayout(null);
		pannelloRicerca.setFocusTraversalPolicyProvider(true);
		pannelloRicerca.setBorder(null);
		pannelloRicerca.setBackground(new Color(208, 215, 232));
		pannelloRicerca.setBounds(0, 0, 1193, 535);
		Ricerca.add(pannelloRicerca);
		
		JButton pulsanteHomeRicerca = new JButton("");
		pulsanteHomeRicerca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.switchPanel(Ricerca, Main);
			}
		});
		pulsanteHomeRicerca.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconHome.png")));
		pulsanteHomeRicerca.setOpaque(false);
		pulsanteHomeRicerca.setFocusable(false);
		pulsanteHomeRicerca.setContentAreaFilled(false);
		pulsanteHomeRicerca.setBorderPainted(false);
		pulsanteHomeRicerca.setBounds(10, 10, 63, 51);
		pannelloRicerca.add(pulsanteHomeRicerca);
		
		JLabel ombraHeaderInfo_1 = new JLabel("");
		ombraHeaderInfo_1.setIcon(new ImageIcon(AMain.class.getResource("/apResources/OmbraHeader.png")));
		ombraHeaderInfo_1.setBounds(0, -15, 1199, 63);
		pannelloRicerca.add(ombraHeaderInfo_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 72, 1138, 452);
		pannelloRicerca.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setEnabled(false);
		panel_1.add(scrollPane_1);
		
		table = new JTable(tableRisultatiRicerca);
		table.getTableHeader().setReorderingAllowed(false);
		tableRisultatiRicerca.addColumn("Destinazione");
		tableRisultatiRicerca.addColumn("Prenotazioni");
		tableRisultatiRicerca.addColumn("Orario partenza");
		tableRisultatiRicerca.addColumn("Orario arrivo");
		tableRisultatiRicerca.addColumn("Data Partenza");
		tableRisultatiRicerca.addColumn("Data Arrivo");
		tableRisultatiRicerca.addColumn("Terminal");
		tableRisultatiRicerca.addColumn("Gate");
		tableRisultatiRicerca.addColumn("Compagnia");
		tableRisultatiRicerca.addColumn("Ritardo");
		tableRisultatiRicerca.addColumn("Stato");
		table.setEnabled(false);
		table.setRowSelectionAllowed(false);
		scrollPane_1.setViewportView(table);
		
		
		getContentPane().setLayout(groupLayout);
		
		areaTratteCompagnie = new JTextArea[] {textAreaVETR, textAreaVETEU, textAreaVETV, textAreaVETA, textAreaVETEA};
		
	}
}