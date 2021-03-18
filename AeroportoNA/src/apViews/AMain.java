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
import javax.swing.border.MatteBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;

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
	private static JTextField FieldAggiungiData;
	private static JInternalFrame Calendario;
	private static JButton SelectData;
	private static JButton[] buttons;
	private static JCheckBox[] checkBoxes;
	private static JComboBox[] boxes;
	private static JTextField[] fields;
	private static JComboBox<String> BoxDestinazione;
	private static Controller theController;
	private static JTextField FieldPrenotazioni;
	private static JTextField FieldDataPartenza;
	private static TextArea ListaTratte;
	private static JTextField FieldDataArrivo;
	private static JLayeredPane GiorniRicercaDataArrivo;
	private static JLayeredPane GiorniRicercaDataPartenza;
	private static JTextField FieldT1A1;
	private static JTextField CodaFamiglieA1;
	private static JTextField CodaDisabiliA1;
	private static JTextField CodaPriorirtyA1;
	private static JTextField FieldTempoStimatoGiorno;
	private static JTextField FieldTempoEffettivoGiorno;
	private static JTextField FieldTempoStimatoMese;
	private static JTextField FieldTempoEffettivoMese;
	private static JTextField FieldTempoStimatoAnno;
	private static JTextField FieldTempoEffettivoAnno;
	private static JTextField FieldT1A2;
	private static JTextField CodaFamiglieA2;
	private static JTextField CodaDisabiliA2;
	private static JTextField CodaPriorirtyA2;
	private static JTextField FieldT1A3;
	private static JTextField CodaFamiglieA3;
	private static JTextField CodaDisabiliA3;
	private static JTextField CodaPriorirtyA3;
	private static JTextField FieldT1A4;
	private static JTextField CodaFamiglieA4;
	private static JTextField CodaDisabiliA4;
	private static JTextField CodaPriorirtyA4;
	private static JTextField textField_19;
	private static JPanel PannelloTempo;
	private static JPanel HeaderT1A1;
	private static JPanel HeaderT1A2;
	private static JPanel HeaderT1A3;
	private static JPanel HeaderT1A4;
	private JCheckBox[][] checksCode;
	private JLayeredPane GiorniRimuoviTratta;
	private static JLabel[] warnings;
	
	public AMain(Controller c) throws SQLException {
		theController = c;
		JButton[] pulsantiMesiPartenza = new JButton[31];
		JButton[] pulsantiMesiArrivo = new JButton[31];
		JButton[] pulsantiMesiRimuovi = new JButton[31];
		
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
		PulsanteInfo.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconInfo.png")));
		PulsanteInfo.setBounds(659, 176, 85, 90);
		PulsanteInfo.setOpaque(false);
		PulsanteInfo.setFocusable(false);
		PulsanteInfo.setContentAreaFilled(false);
		PulsanteInfo.setBorderPainted(false);
		PulsanteInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.switchPanel(Main, Info);
			}
		});
		Main.add(PulsanteInfo);
		
		
		PulsanteGate = new JButton("");
		PulsanteGate.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconGate.png")));
		PulsanteGate.setBounds(439, 176, 85, 90);
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
		PulsanteAereo.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconAereo.png")));
		PulsanteAereo.setOpaque(false);
		PulsanteAereo.setFocusable(false);
		PulsanteAereo.setContentAreaFilled(false);
		PulsanteAereo.setBorderPainted(false);
		PulsanteAereo.setBounds(543, 176, 92, 103);
		PulsanteAereo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.switchPanel(Main, Tratte);
			}
		});
		Main.add(PulsanteAereo);
		
		
		JLabel MainMenù = new JLabel("");
		MainMenù.setIcon(new ImageIcon(AMain.class.getResource("/apResources/Men\u00F9Sfere.png")));
		MainMenù.setHorizontalAlignment(SwingConstants.CENTER);
		MainMenù.setBounds(233, 129, 719, 179);
		Main.add(MainMenù);
		
		
		JLabel ScrittaCompagnie = new JLabel("Compagnie Aeree");
		ScrittaCompagnie.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 15));
		ScrittaCompagnie.setForeground(Color.DARK_GRAY);
		ScrittaCompagnie.setHorizontalAlignment(SwingConstants.CENTER);
		ScrittaCompagnie.setBounds(1016, 157, 147, 19);
		Main.add(ScrittaCompagnie);
		
		
		JLabel ScrittaMappa = new JLabel("Mappa");
		ScrittaMappa.setForeground(Color.DARK_GRAY);
		ScrittaMappa.setHorizontalAlignment(SwingConstants.CENTER);
		ScrittaMappa.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 15));
		ScrittaMappa.setBounds(76, 157, 147, 19);
		Main.add(ScrittaMappa);
		
		
		ShowCompagnie = new JButton("");
		ShowCompagnie.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconaCompagnie.png")));
		ShowCompagnie.setBounds(949, 129, 227, 179);
		ShowCompagnie.setOpaque(false);
		ShowCompagnie.setFocusable(false);
		ShowCompagnie.setContentAreaFilled(false);
		ShowCompagnie.setBorderPainted(false);
		Main.add(ShowCompagnie);
		
		
		ShowMappa = new JButton("");
		ShowMappa.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconaMappa.png")));
		ShowMappa.setBounds(10, 129, 227, 179);
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
		InfoUni.setHorizontalAlignment(SwingConstants.CENTER);
		InfoUni.setForeground(Color.GRAY);
		InfoUni.setFont(new Font("Tahoma", Font.PLAIN, 12));
		InfoUni.setBounds(-7, 514, 1193, 21);
		Main.add(InfoUni);
		
		
		JLabel ImmagineFooter = new JLabel("");
		ImmagineFooter.setBounds(-7, 338, 1200, 197);
		ImmagineFooter.setIcon(new ImageIcon(AMain.class.getResource("/apResources/Footer.png")));
		Main.add(ImmagineFooter);
		
		Tratte = new JLayeredPane();
		BodyContainer.add(Tratte);
		
		
		JPanel PanelTratte = new JPanel();
		PanelTratte.setBackground(new Color(208, 215, 232));
		PanelTratte.setBounds(0, 0, 1193, 535);
		Tratte.add(PanelTratte);
		PanelTratte.setLayout(null);
		
		JButton pulsanteCalendarioPartenza = new JButton("");
		pulsanteCalendarioPartenza.setEnabled(false);
		pulsanteCalendarioPartenza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.creaPulsantiCalendario(pulsantiMesiPartenza, GiorniRicercaDataPartenza, FieldDataPartenza, Calendario);
				theController.showCorrectCalendar(GiorniRicercaDataPartenza, GiorniRicercaDataArrivo, GiorniAggiungiTratta, GiorniRimuoviTratta, Calendario);
			}
		});
		
		JInternalFrame Avviso = new JInternalFrame("Avviso");
		Avviso.setFrameIcon(new ImageIcon(AMain.class.getResource("/apResources/IconWarning.png")));
		Avviso.setBounds(366, 195, 353, 164);
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
		pulsanteCalendarioPartenza.setBounds(30, 127, 47, 40);
		PanelTratte.add(pulsanteCalendarioPartenza);
		
		JButton PulsanteCalendarioArrivo = new JButton("");
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
		PulsanteCalendarioArrivo.setBounds(30, 178, 47, 40);
		PanelTratte.add(PulsanteCalendarioArrivo);
		
		JCheckBox CheckOrarioPartenza = new JCheckBox("");
		CheckOrarioPartenza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.attivaRicerca(checkBoxes, fields, boxes, buttons);
			}
		});
		CheckOrarioPartenza.setBounds(199, 246, 21, 21);
		PanelTratte.add(CheckOrarioPartenza);
		
		JCheckBox CheckOrarioArrivo = new JCheckBox("");
		CheckOrarioArrivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.attivaRicerca(checkBoxes, fields, boxes, buttons);
			}
		});
		CheckOrarioArrivo.setBounds(199, 292, 21, 21);
		PanelTratte.add(CheckOrarioArrivo);
		
		FieldDataPartenza = new JTextField();
		FieldDataPartenza.setEnabled(false);
		FieldDataPartenza.setHorizontalAlignment(SwingConstants.CENTER);
		FieldDataPartenza.setEditable(false);
		FieldDataPartenza.setColumns(10);
		FieldDataPartenza.setBounds(79, 146, 114, 21);
		PanelTratte.add(FieldDataPartenza);
		
		JLabel TestoDataArrivo = new JLabel("Data arrivo:");
		TestoDataArrivo.setHorizontalAlignment(SwingConstants.CENTER);
		TestoDataArrivo.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		TestoDataArrivo.setBounds(79, 180, 114, 19);
		PanelTratte.add(TestoDataArrivo);
		
		JLabel TestoDataPartenza = new JLabel("Data partenza:");
		TestoDataPartenza.setHorizontalAlignment(SwingConstants.CENTER);
		TestoDataPartenza.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		TestoDataPartenza.setBounds(79, 129, 114, 19);
		PanelTratte.add(TestoDataPartenza);
		
		FieldDataArrivo = new JTextField();
		FieldDataArrivo.setEnabled(false);
		FieldDataArrivo.setHorizontalAlignment(SwingConstants.CENTER);
		FieldDataArrivo.setEditable(false);
		FieldDataArrivo.setColumns(10);
		FieldDataArrivo.setBounds(79, 195, 114, 23);
		PanelTratte.add(FieldDataArrivo);
		
		JCheckBox CheckDataPartenza = new JCheckBox("");
		CheckDataPartenza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.attivaRicerca(checkBoxes, fields, boxes, buttons);
			}
		});
		CheckDataPartenza.setBounds(199, 146, 21, 21);
		PanelTratte.add(CheckDataPartenza);
		
		JLabel TestoOrarioPartenza = new JLabel("Orario partenza:");
		TestoOrarioPartenza.setHorizontalAlignment(SwingConstants.CENTER);
		TestoOrarioPartenza.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		TestoOrarioPartenza.setBounds(37, 229, 156, 19);
		PanelTratte.add(TestoOrarioPartenza);
		
		JComboBox<String> BoxOrarioPartenza = new JComboBox<String>();
		BoxOrarioPartenza.setEnabled(false);
		BoxOrarioPartenza.setModel(new DefaultComboBoxModel<String>(new String[] {"00:00", "00:30", "01:00", "01:30", "02:00", "02:30",
																					"03:00", "03:30", "04:00", "04:30", "05:00", "05:30",
																					"06:00", "06:30", "07:00", "07:30", "08:00", "08:30",
																					"09:00", "09:30", "10:00", "10:30", "11:00", "11:30",
																					"12:00", "12:30", "13:00", "13:30", "14:00", "14:30",
																					"15:00", "15:30", "16:00", "16:30", "17:00", "17:30",
																					"18:00", "18:30", "19:00", "19:30", "20:00", "20:30",
																					"21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "23:59"}));
		BoxOrarioPartenza.setBounds(37, 246, 156, 21);
		PanelTratte.add(BoxOrarioPartenza);
		
		JLabel TestoOrarioArrivo = new JLabel("Orario arrivo:");
		TestoOrarioArrivo.setHorizontalAlignment(SwingConstants.CENTER);
		TestoOrarioArrivo.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		TestoOrarioArrivo.setBounds(37, 272, 156, 21);
		PanelTratte.add(TestoOrarioArrivo);
		
		JComboBox<String> BoxOrarioArrivo = new JComboBox<String>();
		BoxOrarioArrivo.setEnabled(false);
		BoxOrarioArrivo.setModel(new DefaultComboBoxModel<String>(new String[] {"00:00", "00:30", "01:00", "01:30", "02:00", "02:30",
																					"03:00", "03:30", "04:00", "04:30", "05:00", "05:30",
																					"06:00", "06:30", "07:00", "07:30", "08:00", "08:30",
																					"09:00", "09:30", "10:00", "10:30", "11:00", "11:30",
																					"12:00", "12:30", "13:00", "13:30", "14:00", "14:30",
																					"15:00", "15:30", "16:00", "16:30", "17:00", "17:30",
																					"18:00", "18:30", "19:00", "19:30", "20:00", "20:30",
																					"21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "23:59"}));
		BoxOrarioArrivo.setBounds(37, 292, 156, 21);
		PanelTratte.add(BoxOrarioArrivo);
		
		JCheckBox CheckCittà = new JCheckBox("");
		CheckCittà.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.attivaRicerca(checkBoxes, fields, boxes, buttons);
			}
		});
		CheckCittà.setBounds(199, 320, 21, 21);
		PanelTratte.add(CheckCittà);
		
		JCheckBox CheckDataArrivo = new JCheckBox("");
		CheckDataArrivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.attivaRicerca(checkBoxes, fields, boxes, buttons);
			}
		});
		CheckDataArrivo.setBounds(199, 195, 21, 21);
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
		BoxCittà.setEnabled(false);
		BoxCittà.setModel(new DefaultComboBoxModel<String>(new String[] {"Amsterdam", "Atene", "Barcellona", "Berlino", "Bruxelles", "Cagliari", "Catania", "Cracovia", "Dubai", "Genova", "Roma", "Londra", "Torino", "Trieste", "Venezia", "Milano"}));
		BoxCittà.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		BoxCittà.setBounds(37, 320, 156, 21);
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
		checkBoxes = new JCheckBox[]{CheckDataArrivo, CheckDataPartenza, CheckOrarioArrivo, CheckOrarioPartenza, CheckCittà};
		fields = new JTextField[] {FieldDataArrivo, FieldDataPartenza};
		boxes = new JComboBox[] {BoxOrarioArrivo, BoxOrarioPartenza, BoxCittà};
		
		JLabel OmbraHeaderVolo = new JLabel("");
		OmbraHeaderVolo.setIcon(new ImageIcon(AMain.class.getResource("/apResources/OmbraHeader.png")));
		OmbraHeaderVolo.setBounds(0, 0, 1193, 34);
		PanelTratte.add(OmbraHeaderVolo);
		
		PulsanteHomeVolo = new JButton("");
		PulsanteHomeVolo.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconHome.png")));
		PulsanteHomeVolo.setBounds(10, 10, 63, 51);
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
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		tabbedPane.setBounds(366, 45, 482, 142);
		PanelTratte.add(tabbedPane);
		
		JButton[] pulsantiMesiAggiungi = new JButton[32];
		
		FieldAggiungiData = new JTextField();
		FieldAggiungiData.setHorizontalAlignment(SwingConstants.CENTER);
		FieldAggiungiData.setEditable(false);
		FieldAggiungiData.setBounds(10, 33, 96, 19);
		FieldAggiungiData.setColumns(10);
		
		JPanel PannelloAggiungi = new JPanel();
		tabbedPane.addTab("Aggiungi", null, PannelloAggiungi, null);
		
		JLabel LabelArrivo = new JLabel("Data e ora d'imbarco");
		LabelArrivo.setHorizontalAlignment(SwingConstants.CENTER);
		LabelArrivo.setBounds(10, 11, 195, 16);
		LabelArrivo.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		
		JComboBox<String> BoxOrari = new JComboBox<String>();
		BoxOrari.setBounds(116, 33, 89, 19);
		BoxOrari.setModel(new DefaultComboBoxModel<String>(new String[] {"00:00", "00:30", "01:00", "01:30", "02:00", "02:30",
																			"03:00", "03:30", "04:00", "04:30", "05:00", "05:30",
																			"06:00", "06:30", "07:00", "07:30", "08:00", "08:30",
																			"09:00", "09:30", "10:00", "10:30", "11:00", "11:30",
																			"12:00", "12:30", "13:00", "13:30", "14:00", "14:30",
																			"15:00", "15:30", "16:00", "16:30", "17:00", "17:30",
																			"18:00", "18:30", "19:00", "19:30", "20:00", "20:30",
																			"21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "23:59"}));
		
		SelectData = new JButton("Sleziona Data");
		SelectData.setBounds(10, 58, 195, 21);
		SelectData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.creaPulsantiCalendario(pulsantiMesiAggiungi, GiorniAggiungiTratta, FieldAggiungiData, Calendario);
				theController.showCorrectCalendar(GiorniAggiungiTratta, GiorniRicercaDataArrivo, GiorniRicercaDataPartenza, GiorniRimuoviTratta, Calendario);
			}
		});
		
					
				PannelloAggiungi.setLayout(null);
				PannelloAggiungi.add(LabelArrivo);
				PannelloAggiungi.add(SelectData);
				PannelloAggiungi.add(FieldAggiungiData);
				PannelloAggiungi.add(BoxOrari);
				
				JLabel LabelDestinazione = new JLabel("Destinazione:");
				LabelDestinazione.setHorizontalAlignment(SwingConstants.CENTER);
				LabelDestinazione.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
				LabelDestinazione.setBounds(230, 58, 152, 16);
				PannelloAggiungi.add(LabelDestinazione);
				
				BoxDestinazione = new JComboBox<String>();
				BoxDestinazione.setModel(new DefaultComboBoxModel<String>(new String[] {"Amsterdam", "Atene", "Barcellona", "Berlino", "Bruxelles", "Cagliari", "Catania", "Cracovia", "Dubai", "Genova", "Roma", "Londra", "Torino", "Trieste", "Venezia", "Milano"}));
				BoxDestinazione.setBounds(230, 73, 152, 26);
				PannelloAggiungi.add(BoxDestinazione);
				
				JLabel NumPrenotazioni = new JLabel("Prenotazioni:");
				NumPrenotazioni.setHorizontalAlignment(SwingConstants.CENTER);
				NumPrenotazioni.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
				NumPrenotazioni.setBounds(230, 11, 152, 19);
				PannelloAggiungi.add(NumPrenotazioni);
				
				FieldPrenotazioni = new JTextField();
				FieldPrenotazioni.setBounds(230, 28, 152, 26);
				PannelloAggiungi.add(FieldPrenotazioni);
				FieldPrenotazioni.setColumns(10);
				
				JButton PulsanteConferma = new JButton("Ok");
				PulsanteConferma.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						theController.newTratta(BoxOrari, BoxDestinazione, FieldPrenotazioni, Avviso, FieldAggiungiData, warnings);
					}
				});
				PulsanteConferma.setBounds(410, 66, 53, 40);
				PannelloAggiungi.add(PulsanteConferma);
		
		PannelloRimuovi = new JPanel();
		tabbedPane.addTab("Rimuovi", null, PannelloRimuovi, null);
		
		JLabel LabelArrivo_1 = new JLabel("Data e ora d'imbarco");
		LabelArrivo_1.setHorizontalAlignment(SwingConstants.CENTER);
		LabelArrivo_1.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		
		textField_19 = new JTextField();
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		
		JComboBox<String> BoxOrari_1 = new JComboBox<String>();
		BoxOrari_1.setModel(new DefaultComboBoxModel(new String[] {"00:00", "00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "23:59"}));
		
		JButton SelectData_1 = new JButton("Sleziona Data");
		SelectData_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.creaPulsantiCalendario(pulsantiMesiRimuovi, GiorniRimuoviTratta, textField_19, Calendario);
				theController.showCorrectCalendar(GiorniRimuoviTratta, GiorniRicercaDataArrivo, GiorniRicercaDataPartenza, GiorniAggiungiTratta, Calendario);
			}
		});
		
		JLabel LabelDestinazione_1 = new JLabel("Destinazione:");
		LabelDestinazione_1.setHorizontalAlignment(SwingConstants.CENTER);
		LabelDestinazione_1.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		
		JComboBox<String> BoxDestinazione_1 = new JComboBox<String>();
		BoxDestinazione_1.setModel(new DefaultComboBoxModel(new String[] {"Amsterdam", "Atene", "Barcellona", "Berlino", "Bruxelles", "Cagliari", "Catania", "Cracovia", "Dubai", "Genova", "Roma", "Londra", "Torino", "Trieste", "Venezia", "Milano"}));
		
		JButton PulsanteConferma_1 = new JButton("Ok");
		PulsanteConferma_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.rimuoviTratta(BoxOrari_1, BoxDestinazione_1, Avviso, textField_19, warnings);
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
								.addComponent(LabelArrivo_1, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_PannelloRimuovi.createSequentialGroup()
									.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(BoxOrari_1, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)))
							.addGap(27)
							.addGroup(gl_PannelloRimuovi.createParallelGroup(Alignment.LEADING)
								.addComponent(LabelDestinazione_1, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
								.addComponent(BoxDestinazione_1, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
							.addGap(93))
						.addGroup(gl_PannelloRimuovi.createSequentialGroup()
							.addComponent(SelectData_1, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
							.addComponent(PulsanteConferma_1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_PannelloRimuovi.setVerticalGroup(
			gl_PannelloRimuovi.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PannelloRimuovi.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_PannelloRimuovi.createParallelGroup(Alignment.LEADING)
						.addComponent(LabelDestinazione_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_PannelloRimuovi.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_PannelloRimuovi.createSequentialGroup()
								.addComponent(LabelArrivo_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addGroup(gl_PannelloRimuovi.createParallelGroup(Alignment.LEADING)
									.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
									.addComponent(BoxOrari_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)))
							.addGroup(gl_PannelloRimuovi.createSequentialGroup()
								.addGap(15)
								.addComponent(BoxDestinazione_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_PannelloRimuovi.createParallelGroup(Alignment.LEADING)
						.addComponent(PulsanteConferma_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(SelectData_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		PannelloRimuovi.setLayout(gl_PannelloRimuovi);
		
		Panel AreaTratte = new Panel();
		AreaTratte.setBackground(Color.WHITE);
		AreaTratte.setBounds(317, 215, 836, 282);
		PanelTratte.add(AreaTratte);
		
		JLayeredPane PannelloTratte = new JLayeredPane();
		
		ListaTratte = new TextArea();
		ListaTratte.setBounds(0, 0, 836, 282);
		PannelloTratte.add(ListaTratte);
		
		JButton PulsanteRicerca = new JButton("Effettua ricerca");
		PulsanteRicerca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.ricercaTratte(checkBoxes, fields, boxes, ListaTratte);
			}
		});
		PulsanteRicerca.setBounds(37, 498, 183, 19);
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
		Biglietto.setIcon(new ImageIcon(AMain.class.getResource("/apResources/BaseBiglietto.png")));
		Biglietto.setHorizontalAlignment(SwingConstants.CENTER);
		Biglietto.setBounds(0, 59, 274, 486);
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
		PannelloTempo.setBounds(671, 358, 490, 166);
		PanelGate.add(PannelloTempo);
		
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
		
		JLabel lblNewLabel_5_1 = new JLabel("Tempo stimato:");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_5_1.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Tempo effettivo:");
		lblNewLabel_5_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_5_1_1.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		
		FieldTempoStimatoGiorno = new JTextField();
		FieldTempoStimatoGiorno.setEditable(false);
		FieldTempoStimatoGiorno.setColumns(10);
		
		FieldTempoEffettivoGiorno = new JTextField();
		FieldTempoEffettivoGiorno.setEditable(false);
		FieldTempoEffettivoGiorno.setColumns(10);
		
		JLabel lblNewLabel_5_1_2 = new JLabel("giorno");
		lblNewLabel_5_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_2.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		
		JLabel lblNewLabel_5_1_2_1 = new JLabel("mese");
		lblNewLabel_5_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_2_1.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		
		FieldTempoStimatoMese = new JTextField();
		FieldTempoStimatoMese.setEditable(false);
		FieldTempoStimatoMese.setColumns(10);
		
		FieldTempoEffettivoMese = new JTextField();
		FieldTempoEffettivoMese.setEditable(false);
		FieldTempoEffettivoMese.setColumns(10);
		
		JLabel lblNewLabel_5_1_2_2 = new JLabel("anno");
		lblNewLabel_5_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_2_2.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		
		FieldTempoStimatoAnno = new JTextField();
		FieldTempoStimatoAnno.setEditable(false);
		FieldTempoStimatoAnno.setColumns(10);
		
		FieldTempoEffettivoAnno = new JTextField();
		FieldTempoEffettivoAnno.setEditable(false);
		FieldTempoEffettivoAnno.setColumns(10);
		GroupLayout gl_BodyPannelloTempo = new GroupLayout(BodyPannelloTempo);
		gl_BodyPannelloTempo.setHorizontalGroup(
			gl_BodyPannelloTempo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_BodyPannelloTempo.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_BodyPannelloTempo.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_5_1_1, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_BodyPannelloTempo.createSequentialGroup()
							.addComponent(lblNewLabel_5_1, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_BodyPannelloTempo.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNewLabel_5_1_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(FieldTempoEffettivoGiorno)
								.addComponent(FieldTempoStimatoGiorno, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))))
					.addGap(18)
					.addGroup(gl_BodyPannelloTempo.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_5_1_2_1, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
						.addComponent(FieldTempoStimatoMese, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
						.addComponent(FieldTempoEffettivoMese, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_BodyPannelloTempo.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_5_1_2_2, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
						.addComponent(FieldTempoStimatoAnno, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
						.addComponent(FieldTempoEffettivoAnno, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(39, Short.MAX_VALUE))
		);
		gl_BodyPannelloTempo.setVerticalGroup(
			gl_BodyPannelloTempo.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_BodyPannelloTempo.createSequentialGroup()
					.addContainerGap(15, Short.MAX_VALUE)
					.addGroup(gl_BodyPannelloTempo.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_BodyPannelloTempo.createSequentialGroup()
							.addComponent(lblNewLabel_5_1_2_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(FieldTempoStimatoAnno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(FieldTempoEffettivoAnno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_BodyPannelloTempo.createSequentialGroup()
							.addComponent(lblNewLabel_5_1_2_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(FieldTempoStimatoMese, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(FieldTempoEffettivoMese, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_BodyPannelloTempo.createSequentialGroup()
							.addComponent(lblNewLabel_5_1_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_BodyPannelloTempo.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_5_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
								.addComponent(FieldTempoStimatoGiorno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_BodyPannelloTempo.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_5_1_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
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
				PannelloTempo.setLayout(gl_PannelloTempo);
		
		JInternalFrame SelectTratta = new JInternalFrame("Seleziona una nuova tratta"); 
		SelectTratta.setBounds(30, 348, 321, 176);
		PanelGate.add(SelectTratta);

		
		JPanel panel_6 = new JPanel();
		GroupLayout groupLayout_3 = new GroupLayout(SelectTratta.getContentPane());
		groupLayout_3.setHorizontalGroup(
			groupLayout_3.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout_3.createSequentialGroup()
					.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout_3.setVerticalGroup(
			groupLayout_3.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_6, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
		);
		
		DefaultListModel<String> ListModelTratte = new DefaultListModel<String>();
		theController.fillJList(ListModelTratte);
		JList<String> list = new JList<String>(ListModelTratte);
		
		JScrollPane scrollPane = new JScrollPane(list);
		panel_6.add(scrollPane);
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.TRAILING)
				.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
		);
		
		JButton ConfermaSelezione = new JButton("Conferma");
		scrollPane.setColumnHeaderView(ConfermaSelezione);
		ConfermaSelezione.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.selectJList(list, FieldT1A1, SelectTratta);
			}
		});
		panel_6.setLayout(gl_panel_6);
		SelectTratta.getContentPane().setLayout(groupLayout_3);
		SelectTratta.setVisible(false);
		
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
		
		JPanel GatesArrivo = new JPanel();
		GatesArrivo.setToolTipText("");
		GatesArrivo.setBounds(10, 11, 146, 211);
		PanelTerminale1.add(GatesArrivo);
		
		JLabel lblNewLabel_1 = new JLabel("Gates");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_3_1 = new JLabel("A2");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		GroupLayout gl_panel_4_1 = new GroupLayout(panel_4_1);
		gl_panel_4_1.setHorizontalGroup(
			gl_panel_4_1.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_3_1, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
		);
		gl_panel_4_1.setVerticalGroup(
			gl_panel_4_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_4_1.createSequentialGroup()
					.addComponent(lblNewLabel_3_1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
					.addGap(1))
		);
		panel_4_1.setLayout(gl_panel_4_1);
		
		JPanel panel_4_2 = new JPanel();
		panel_4_2.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_3_2 = new JLabel("A3");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		GroupLayout gl_panel_4_2 = new GroupLayout(panel_4_2);
		gl_panel_4_2.setHorizontalGroup(
			gl_panel_4_2.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_3_2, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
		);
		gl_panel_4_2.setVerticalGroup(
			gl_panel_4_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_4_2.createSequentialGroup()
					.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_4_2.setLayout(gl_panel_4_2);
		
		JPanel panel_4_3 = new JPanel();
		panel_4_3.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_3_3 = new JLabel("A4");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		GroupLayout gl_panel_4_3 = new GroupLayout(panel_4_3);
		gl_panel_4_3.setHorizontalGroup(
			gl_panel_4_3.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_3_3, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
		);
		gl_panel_4_3.setVerticalGroup(
			gl_panel_4_3.createParallelGroup(Alignment.TRAILING)
				.addComponent(lblNewLabel_3_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
		);
		panel_4_3.setLayout(gl_panel_4_3);
		GroupLayout gl_GatesArrivo = new GroupLayout(GatesArrivo);
		gl_GatesArrivo.setHorizontalGroup(
			gl_GatesArrivo.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
				.addComponent(panel_4, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
				.addGroup(gl_GatesArrivo.createSequentialGroup()
					.addComponent(panel_4_1, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_GatesArrivo.createSequentialGroup()
					.addComponent(panel_4_2, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_GatesArrivo.createSequentialGroup()
					.addComponent(panel_4_3, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_GatesArrivo.setVerticalGroup(
			gl_GatesArrivo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_GatesArrivo.createSequentialGroup()
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_4_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_4_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_4_3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel_3 = new JLabel("A1");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
		);
		panel_4.setLayout(gl_panel_4);
		GatesArrivo.setLayout(gl_GatesArrivo);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(166, 55, 960, 31);
		PanelTerminale1.add(panel_2);
		
		FieldT1A1 = new JTextField();
		FieldT1A1.setEditable(false);
		FieldT1A1.setColumns(10);
		
		CodaFamiglieA1 = new JTextField();
		CodaFamiglieA1.setEnabled(false);
		CodaFamiglieA1.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		CodaFamiglieA1.setText("coda famiglie");
		CodaFamiglieA1.setEditable(false);
		CodaFamiglieA1.setColumns(10);
		
		JCheckBox checkCodaFamiglieT1A1 = new JCheckBox("");
		checkCodaFamiglieT1A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		checkCodaFamiglieT1A1.setSelected(true);
		
		CodaDisabiliA1 = new JTextField();
		CodaDisabiliA1.setEnabled(false);
		CodaDisabiliA1.setText("coda disabili");
		CodaDisabiliA1.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		CodaDisabiliA1.setEditable(false);
		CodaDisabiliA1.setColumns(10);
		
		JCheckBox checkCodaDisabiliT1A1 = new JCheckBox("");
		
		CodaPriorirtyA1 = new JTextField();
		CodaPriorirtyA1.setText("coda priority");
		CodaPriorirtyA1.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		CodaPriorirtyA1.setEnabled(false);
		CodaPriorirtyA1.setEditable(false);
		CodaPriorirtyA1.setColumns(10);
		
		JCheckBox checkCodaPriorityT1A1 = new JCheckBox("");
		
		JButton ButtonModifyT1A1 = new JButton("");
		ButtonModifyT1A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectTratta.setVisible(true);
			}
		});
		ButtonModifyT1A1.setOpaque(false);
		ButtonModifyT1A1.setFocusable(false);
		ButtonModifyT1A1.setContentAreaFilled(false);
		ButtonModifyT1A1.setBorderPainted(false);
		ButtonModifyT1A1.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconEdit.png")));
		
		JComboBox<String> BoxOrari_2 = new JComboBox<String>();
		BoxOrari_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("boo");
			}
		});
		BoxOrari_2.setModel(new DefaultComboBoxModel<String>(new String[] {"No", "00:10", "00:15", "00:20", "00:25", "00:30", "00:35", "00:40", "00:45", "00:50", "00:55", "01:00"}));
		
		ButtonGroup groupTempo = new ButtonGroup();
		
		JTextField[][] fieldsTempo = {{FieldTempoStimatoGiorno, FieldTempoStimatoMese, FieldTempoStimatoAnno}, {FieldTempoEffettivoGiorno, FieldTempoEffettivoMese, FieldTempoEffettivoAnno}};
				
		JPanel[] headersTempo= {HeaderT1A1, HeaderT1A2, HeaderT1A3, HeaderT1A4};
		
		JRadioButton RadioButtonT1A1 = new JRadioButton("");
		RadioButtonT1A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.showAndSetTempo(PannelloTempo, groupTempo, FieldT1A1, headersTempo, fieldsTempo, checksCode);
			}
		});
		groupTempo.add(RadioButtonT1A1);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(FieldT1A1, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(ButtonModifyT1A1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(CodaFamiglieA1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkCodaFamiglieT1A1)
					.addGap(14)
					.addComponent(CodaDisabiliA1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkCodaDisabiliT1A1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(CodaPriorirtyA1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkCodaPriorityT1A1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
					.addComponent(RadioButtonT1A1)
					.addGap(51)
					.addComponent(BoxOrari_2, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addComponent(FieldT1A1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(BoxOrari_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(RadioButtonT1A1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(checkCodaPriorityT1A1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(CodaPriorirtyA1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(checkCodaDisabiliT1A1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(CodaDisabiliA1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(checkCodaFamiglieT1A1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(ButtonModifyT1A1, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
							.addComponent(CodaFamiglieA1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)))
					.addContainerGap())
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_2_2_1 = new JPanel();
		panel_2_2_1.setBackground(new Color(240, 240, 240));
		panel_2_2_1.setBounds(166, 11, 960, 43);
		PanelTerminale1.add(panel_2_2_1);
		
		JLabel lblNewLabel_4 = new JLabel("Tratta");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		
		JLabel lblNewLabel_4_1 = new JLabel("Code");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Tempo");
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Ritardo");
		lblNewLabel_4_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1_1.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		GroupLayout gl_panel_2_2_1 = new GroupLayout(panel_2_2_1);
		gl_panel_2_2_1.setHorizontalGroup(
			gl_panel_2_2_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_2_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
					.addGap(55)
					.addComponent(lblNewLabel_4_1, GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_4_1_1, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_4_1_1_1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_2_2_1.setVerticalGroup(
			gl_panel_2_2_1.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
				.addGroup(gl_panel_2_2_1.createParallelGroup(Alignment.BASELINE)
					.addComponent(lblNewLabel_4_1_1_1, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
					.addComponent(lblNewLabel_4_1_1, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
				.addComponent(lblNewLabel_4_1, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
		);
		panel_2_2_1.setLayout(gl_panel_2_2_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(166, 97, 960, 31);
		PanelTerminale1.add(panel_2_1);
		
		FieldT1A2 = new JTextField();
		FieldT1A2.setEditable(false);
		FieldT1A2.setColumns(10);
		
		JButton ButtonModifyT1A2 = new JButton("");
		ButtonModifyT1A2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectTratta.setVisible(true);
			}
		});
		ButtonModifyT1A2.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconEdit.png")));
		ButtonModifyT1A2.setOpaque(false);
		ButtonModifyT1A2.setFocusable(false);
		ButtonModifyT1A2.setContentAreaFilled(false);
		ButtonModifyT1A2.setBorderPainted(false);
		
		CodaFamiglieA2 = new JTextField();
		CodaFamiglieA2.setText("coda famiglie");
		CodaFamiglieA2.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		CodaFamiglieA2.setEnabled(false);
		CodaFamiglieA2.setEditable(false);
		CodaFamiglieA2.setColumns(10);
		
		JCheckBox checkCodaFamiglieT1A2 = new JCheckBox("");
		checkCodaFamiglieT1A2.setSelected(true);
		
		CodaDisabiliA2 = new JTextField();
		CodaDisabiliA2.setText("coda disabili");
		CodaDisabiliA2.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		CodaDisabiliA2.setEnabled(false);
		CodaDisabiliA2.setEditable(false);
		CodaDisabiliA2.setColumns(10);
		
		JCheckBox checkCodaDisabiliT1A2 = new JCheckBox("");
		
		CodaPriorirtyA2 = new JTextField();
		CodaPriorirtyA2.setText("coda priority");
		CodaPriorirtyA2.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		CodaPriorirtyA2.setEnabled(false);
		CodaPriorirtyA2.setEditable(false);
		CodaPriorirtyA2.setColumns(10);
		
		JCheckBox checkCodaPriorityT1A2 = new JCheckBox("");
		
		JComboBox<String> BoxOrari_2_1 = new JComboBox<String>();
		BoxOrari_2_1.setModel(new DefaultComboBoxModel<String>(new String[] {"No", "00:10", "00:15", "00:20", "00:25", "00:30", "00:35", "00:40", "00:45", "00:50", "00:55", "01:00"}));
		
		JRadioButton RadioButtonT1A2 = new JRadioButton("");
		groupTempo.add(RadioButtonT1A2);
		GroupLayout gl_panel_2_1 = new GroupLayout(panel_2_1);
		gl_panel_2_1.setHorizontalGroup(
			gl_panel_2_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_1.createSequentialGroup()
					.addComponent(FieldT1A2, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(ButtonModifyT1A2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(CodaFamiglieA2, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkCodaFamiglieT1A2)
					.addGap(14)
					.addComponent(CodaDisabiliA2, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(checkCodaDisabiliT1A2)
					.addGap(14)
					.addComponent(CodaPriorirtyA2, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(checkCodaPriorityT1A2)
					.addGap(38)
					.addComponent(RadioButtonT1A2)
					.addGap(52)
					.addComponent(BoxOrari_2_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_2_1.setVerticalGroup(
			gl_panel_2_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_1.createSequentialGroup()
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.LEADING)
						.addComponent(checkCodaFamiglieT1A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(CodaDisabiliA2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkCodaDisabiliT1A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(CodaPriorirtyA2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkCodaPriorityT1A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(RadioButtonT1A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(BoxOrari_2_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(CodaFamiglieA2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(ButtonModifyT1A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(FieldT1A2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_2_1.setLayout(gl_panel_2_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(Color.WHITE);
		panel_2_2.setBounds(166, 139, 960, 31);
		PanelTerminale1.add(panel_2_2);
		
		FieldT1A3 = new JTextField();
		FieldT1A3.setEditable(false);
		FieldT1A3.setColumns(10);
		
		JButton ButtonModifyT1A3 = new JButton("");
		ButtonModifyT1A3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectTratta.setVisible(true);
			}
		});
		ButtonModifyT1A3.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconEdit.png")));
		ButtonModifyT1A3.setOpaque(false);
		ButtonModifyT1A3.setFocusable(false);
		ButtonModifyT1A3.setContentAreaFilled(false);
		ButtonModifyT1A3.setBorderPainted(false);
		
		CodaFamiglieA3 = new JTextField();
		CodaFamiglieA3.setText("coda famiglie");
		CodaFamiglieA3.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		CodaFamiglieA3.setEnabled(false);
		CodaFamiglieA3.setEditable(false);
		CodaFamiglieA3.setColumns(10);
		
		JCheckBox checkCodaFamiglieT1A3 = new JCheckBox("");
		checkCodaFamiglieT1A3.setSelected(true);
		
		CodaDisabiliA3 = new JTextField();
		CodaDisabiliA3.setText("coda disabili");
		CodaDisabiliA3.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		CodaDisabiliA3.setEnabled(false);
		CodaDisabiliA3.setEditable(false);
		CodaDisabiliA3.setColumns(10);
		
		JCheckBox checkCodaDisabiliT1A3 = new JCheckBox("");
		
		CodaPriorirtyA3 = new JTextField();
		CodaPriorirtyA3.setText("coda priority");
		CodaPriorirtyA3.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		CodaPriorirtyA3.setEnabled(false);
		CodaPriorirtyA3.setEditable(false);
		CodaPriorirtyA3.setColumns(10);
		
		JCheckBox checkCodaPriorityT1A3 = new JCheckBox("");
		
		JComboBox<String> BoxOrari_2_2 = new JComboBox<String>();
		BoxOrari_2_2.setModel(new DefaultComboBoxModel<String>(new String[] {"No", "00:10", "00:15", "00:20", "00:25", "00:30", "00:35", "00:40", "00:45", "00:50", "00:55", "01:00"}));
		
		JRadioButton RadioButtonT1A3 = new JRadioButton("");
		groupTempo.add(RadioButtonT1A3);
		GroupLayout gl_panel_2_2 = new GroupLayout(panel_2_2);
		gl_panel_2_2.setHorizontalGroup(
			gl_panel_2_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_2.createSequentialGroup()
					.addComponent(FieldT1A3, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(ButtonModifyT1A3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(CodaFamiglieA3, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkCodaFamiglieT1A3)
					.addGap(14)
					.addComponent(CodaDisabiliA3, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(checkCodaDisabiliT1A3)
					.addGap(14)
					.addComponent(CodaPriorirtyA3, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(checkCodaPriorityT1A3)
					.addGap(38)
					.addComponent(RadioButtonT1A3)
					.addGap(52)
					.addComponent(BoxOrari_2_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_2_2.setVerticalGroup(
			gl_panel_2_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_2.createSequentialGroup()
					.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING)
						.addComponent(checkCodaFamiglieT1A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(CodaDisabiliA3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkCodaDisabiliT1A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(CodaPriorirtyA3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkCodaPriorityT1A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(RadioButtonT1A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(BoxOrari_2_2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(CodaFamiglieA3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(ButtonModifyT1A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(FieldT1A3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_2_2.setLayout(gl_panel_2_2);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBackground(Color.WHITE);
		panel_2_3.setBounds(166, 181, 960, 31);
		PanelTerminale1.add(panel_2_3);
		
		FieldT1A4 = new JTextField();
		FieldT1A4.setEditable(false);
		FieldT1A4.setColumns(10);
		
		JButton ButtonModifyT1A4 = new JButton("");
		ButtonModifyT1A4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectTratta.setVisible(true);
			}
		});
		ButtonModifyT1A4.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconEdit.png")));
		ButtonModifyT1A4.setOpaque(false);
		ButtonModifyT1A4.setFocusable(false);
		ButtonModifyT1A4.setContentAreaFilled(false);
		ButtonModifyT1A4.setBorderPainted(false);
		
		CodaFamiglieA4 = new JTextField();
		CodaFamiglieA4.setText("coda famiglie");
		CodaFamiglieA4.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		CodaFamiglieA4.setEnabled(false);
		CodaFamiglieA4.setEditable(false);
		CodaFamiglieA4.setColumns(10);
		
		JCheckBox checkCodaFamiglieT1A4 = new JCheckBox("");
		checkCodaFamiglieT1A4.setSelected(true);
		
		CodaDisabiliA4 = new JTextField();
		CodaDisabiliA4.setText("coda disabili");
		CodaDisabiliA4.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		CodaDisabiliA4.setEnabled(false);
		CodaDisabiliA4.setEditable(false);
		CodaDisabiliA4.setColumns(10);
		
		JCheckBox checkCodaDisabiliT1A4 = new JCheckBox("");
		
		CodaPriorirtyA4 = new JTextField();
		CodaPriorirtyA4.setText("coda priority");
		CodaPriorirtyA4.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		CodaPriorirtyA4.setEnabled(false);
		CodaPriorirtyA4.setEditable(false);
		CodaPriorirtyA4.setColumns(10);
		
		JCheckBox checkCodaPriorityT1A4 = new JCheckBox("");
		
		checksCode = new JCheckBox[][] {{checkCodaFamiglieT1A1, checkCodaDisabiliT1A1, checkCodaPriorityT1A1},
										 {checkCodaFamiglieT1A2, checkCodaDisabiliT1A2, checkCodaPriorityT1A2},
										 {checkCodaFamiglieT1A3, checkCodaDisabiliT1A3, checkCodaPriorityT1A3},
										 {checkCodaFamiglieT1A4, checkCodaDisabiliT1A4, checkCodaPriorityT1A4}};
									
		
		JComboBox<String> BoxOrari_2_3 = new JComboBox<String>();
		BoxOrari_2_3.setModel(new DefaultComboBoxModel<String>(new String[] {"No", "00:10", "00:15", "00:20", "00:25", "00:30", "00:35", "00:40", "00:45", "00:50", "00:55", "01:00"}));
		
		JRadioButton RadioButtonT1A4 = new JRadioButton("");
		groupTempo.add(RadioButtonT1A4);
		GroupLayout gl_panel_2_3 = new GroupLayout(panel_2_3);
		gl_panel_2_3.setHorizontalGroup(
			gl_panel_2_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_3.createSequentialGroup()
					.addComponent(FieldT1A4, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(ButtonModifyT1A4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(CodaFamiglieA4, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkCodaFamiglieT1A4)
					.addGap(14)
					.addComponent(CodaDisabiliA4, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(checkCodaDisabiliT1A4)
					.addGap(14)
					.addComponent(CodaPriorirtyA4, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(checkCodaPriorityT1A4)
					.addGap(36)
					.addComponent(RadioButtonT1A4)
					.addGap(54)
					.addComponent(BoxOrari_2_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_2_3.setVerticalGroup(
			gl_panel_2_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_3.createSequentialGroup()
					.addGroup(gl_panel_2_3.createParallelGroup(Alignment.LEADING)
						.addComponent(checkCodaFamiglieT1A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(CodaDisabiliA4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkCodaDisabiliT1A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(CodaPriorirtyA4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkCodaPriorityT1A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(RadioButtonT1A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(BoxOrari_2_3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(CodaFamiglieA4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(ButtonModifyT1A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(FieldT1A4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_2_3.setLayout(gl_panel_2_3);
		
		JRadioButton[] radioButtonsTempo= {RadioButtonT1A1, RadioButtonT1A2, RadioButtonT1A3, RadioButtonT1A4};
		
		JPanel panel_1 = new JPanel();
		TerminalPane.addTab("New tab", null, panel_1, null);
		
		JPanel PanelTerminale2 = new JPanel();
		PanelTerminale2.setLayout(null);
		PanelTerminale2.setBorder(new LineBorder(Color.WHITE, 2, true));
		PanelTerminale2.setBackground(new Color(128, 179, 216));
		TerminalPane.addTab("Terminal 2", null, PanelTerminale2, null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setForeground(Color.WHITE);
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(10, 10, 30, 30);
		PanelTerminale2.add(panel_3);
		
		JLabel NumeroUno_1 = new JLabel("1");
		NumeroUno_1.setHorizontalAlignment(SwingConstants.CENTER);
		NumeroUno_1.setForeground(Color.DARK_GRAY);
		NumeroUno_1.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		NumeroUno_1.setBounds(0, 0, 30, 30);
		panel_3.add(NumeroUno_1);
		
		JLabel TerminalUno_2 = new JLabel("Terminale 2");
		TerminalUno_2.setForeground(Color.BLACK);
		TerminalUno_2.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		TerminalUno_2.setBounds(50, 10, 152, 30);
		PanelTerminale2.add(TerminalUno_2);
		
		JLabel TerminalUno_3 = new JLabel("Terminale 2");
		TerminalUno_3.setForeground(Color.WHITE);
		TerminalUno_3.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		TerminalUno_3.setBounds(50, 10, 162, 35);
		PanelTerminale2.add(TerminalUno_3);
		
		TextArea GateArea2 = new TextArea();
		GateArea2.setText("f2");
		GateArea2.setEditable(false);
		GateArea2.setBounds(10, 49, 247, 131);
		PanelTerminale2.add(GateArea2);
		
		JPanel PanelTerminale3 = new JPanel();
		PanelTerminale3.setLayout(null);
		PanelTerminale3.setBorder(new LineBorder(Color.WHITE, 2, true));
		PanelTerminale3.setBackground(new Color(91, 155, 202));
		TerminalPane.addTab("Terminal 3", null, PanelTerminale3, null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setForeground(Color.WHITE);
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBounds(10, 10, 30, 30);
		PanelTerminale3.add(panel_5);
		
		JLabel NumeroUno_2 = new JLabel("1");
		NumeroUno_2.setHorizontalAlignment(SwingConstants.CENTER);
		NumeroUno_2.setForeground(Color.DARK_GRAY);
		NumeroUno_2.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		NumeroUno_2.setBounds(0, 0, 30, 30);
		panel_5.add(NumeroUno_2);
		
		JLabel TerminalUno_4 = new JLabel("Terminale 3");
		TerminalUno_4.setForeground(Color.BLACK);
		TerminalUno_4.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		TerminalUno_4.setBounds(50, 10, 152, 30);
		PanelTerminale3.add(TerminalUno_4);
		
		JLabel TerminalUno_5 = new JLabel("Terminale 3");
		TerminalUno_5.setForeground(Color.WHITE);
		TerminalUno_5.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		TerminalUno_5.setBounds(50, 10, 162, 35);
		PanelTerminale3.add(TerminalUno_5);
		
		TextArea GateArea3 = new TextArea();
		GateArea3.setText("f3");
		GateArea3.setEditable(false);
		GateArea3.setBounds(10, 49, 247, 131);
		PanelTerminale3.add(GateArea3);
		
		JPanel PanelTerminale4 = new JPanel();
		PanelTerminale4.setLayout(null);
		PanelTerminale4.setBorder(new LineBorder(Color.WHITE, 2, true));
		PanelTerminale4.setBackground(new Color(60, 113, 154));
		TerminalPane.addTab("Terminal 4", null, PanelTerminale4, null);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setLayout(null);
		panel_5_1.setForeground(Color.WHITE);
		panel_5_1.setBackground(Color.LIGHT_GRAY);
		panel_5_1.setBounds(10, 10, 30, 30);
		PanelTerminale4.add(panel_5_1);
		
		JLabel NumeroUno_2_1 = new JLabel("1");
		NumeroUno_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		NumeroUno_2_1.setForeground(Color.DARK_GRAY);
		NumeroUno_2_1.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		NumeroUno_2_1.setBounds(0, 0, 30, 30);
		panel_5_1.add(NumeroUno_2_1);
		
		JLabel TerminalUno_4_1 = new JLabel("Terminale 4");
		TerminalUno_4_1.setForeground(Color.BLACK);
		TerminalUno_4_1.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		TerminalUno_4_1.setBounds(50, 10, 152, 30);
		PanelTerminale4.add(TerminalUno_4_1);
		
		JLabel TerminalUno_5_1 = new JLabel("Terminale 4");
		TerminalUno_5_1.setForeground(Color.WHITE);
		TerminalUno_5_1.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		TerminalUno_5_1.setBounds(50, 10, 162, 35);
		PanelTerminale4.add(TerminalUno_5_1);
		
		TextArea GateArea4 = new TextArea();
		GateArea4.setText("f4");
		GateArea4.setEditable(false);
		GateArea4.setBounds(10, 49, 247, 131);
		PanelTerminale4.add(GateArea4);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(20, 76, 860, 223);
		PanelGate.add(panel_10);
		
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
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(0, 0, 10, 10);
		PanelCompagnie.add(panel_11);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255));
		panel_7.setBounds(77, 111, 200, 242);
		PanelCompagnie.add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_8.setBackground(new Color(220, 220, 220));
		
		JPanel panel_8_1 = new JPanel();
		panel_8_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_8_1.setBackground(new Color(245, 245, 245));
		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addGroup(gl_panel_7.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_8, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
						.addComponent(panel_8_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_7.setVerticalGroup(
			gl_panel_7.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addComponent(panel_8_1, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE))
		);
		panel_8.setLayout(new CardLayout(0, 0));
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(220, 220, 220));
		panel_9.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_8.add(panel_9, "name_330446490763300");
		
		JLabel lblNewLabel_8 = new JLabel("EasyJet");
		lblNewLabel_8.setForeground(new Color(0, 0, 0));
		lblNewLabel_8.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_9 = new GroupLayout(panel_9);
		gl_panel_9.setHorizontalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_8, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_9.setVerticalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addGap(70)
					.addComponent(lblNewLabel_8, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_9.setLayout(gl_panel_9);
		
		JPanel panel_8_2 = new JPanel();
		panel_8_2.setBackground(new Color(13, 62, 117));
		GroupLayout gl_panel_8_1 = new GroupLayout(panel_8_1);
		gl_panel_8_1.setHorizontalGroup(
			gl_panel_8_1.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_8_2, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
		);
		gl_panel_8_1.setVerticalGroup(
			gl_panel_8_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_8_1.createSequentialGroup()
					.addComponent(panel_8_2, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(66, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel = new JLabel("Compagnia Aerea");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Lucida Bright", Font.ITALIC, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_8_2 = new GroupLayout(panel_8_2);
		gl_panel_8_2.setHorizontalGroup(
			gl_panel_8_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_8_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_8_2.setVerticalGroup(
			gl_panel_8_2.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_8_2.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_8_2.setLayout(gl_panel_8_2);
		panel_8_1.setLayout(gl_panel_8_1);
		panel_7.setLayout(gl_panel_7);
		
		JPanel panel_7_1 = new JPanel();
		panel_7_1.setBackground(Color.WHITE);
		panel_7_1.setBounds(628, 111, 200, 339);
		PanelCompagnie.add(panel_7_1);
		
		JPanel panel_8_3 = new JPanel();
		panel_8_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_8_3.setBackground(new Color(220, 220, 220));
		panel_8_3.setLayout(new CardLayout(0, 0));
		
		JPanel panel_8_1_1 = new JPanel();
		panel_8_1_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_8_1_1.setBackground(new Color(245, 245, 245));
		
		JPanel panel_8_2_1 = new JPanel();
		panel_8_2_1.setBackground(new Color(13, 62, 117));
		
		JLabel lblNewLabel_6 = new JLabel("Durata Voli");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Lucida Bright", Font.ITALIC, 15));
		GroupLayout gl_panel_8_2_1 = new GroupLayout(panel_8_2_1);
		gl_panel_8_2_1.setHorizontalGroup(
			gl_panel_8_2_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 196, Short.MAX_VALUE)
				.addGroup(gl_panel_8_2_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_8_2_1.setVerticalGroup(
			gl_panel_8_2_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 54, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, gl_panel_8_2_1.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel_6, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_8_2_1.setLayout(gl_panel_8_2_1);
		GroupLayout gl_panel_8_1_1 = new GroupLayout(panel_8_1_1);
		gl_panel_8_1_1.setHorizontalGroup(
			gl_panel_8_1_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 200, Short.MAX_VALUE)
				.addComponent(panel_8_2_1, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
		);
		gl_panel_8_1_1.setVerticalGroup(
			gl_panel_8_1_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 112, Short.MAX_VALUE)
				.addGroup(gl_panel_8_1_1.createSequentialGroup()
					.addComponent(panel_8_2_1, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(54, Short.MAX_VALUE))
		);
		panel_8_1_1.setLayout(gl_panel_8_1_1);
		GroupLayout gl_panel_7_1 = new GroupLayout(panel_7_1);
		gl_panel_7_1.setHorizontalGroup(
			gl_panel_7_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7_1.createSequentialGroup()
					.addGroup(gl_panel_7_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_8_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
						.addComponent(panel_8_1_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_7_1.setVerticalGroup(
			gl_panel_7_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_7_1.createSequentialGroup()
					.addComponent(panel_8_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_8_3, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
		);
		panel_7_1.setLayout(gl_panel_7_1);
		
		JPanel panel_7_2 = new JPanel();
		panel_7_2.setBackground(Color.WHITE);
		panel_7_2.setBounds(351, 111, 200, 292);
		PanelCompagnie.add(panel_7_2);
		
		JPanel panel_8_4 = new JPanel();
		panel_8_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_8_4.setBackground(new Color(220, 220, 220));
		panel_8_4.setLayout(new CardLayout(0, 0));
		
		JPanel panel_8_1_2 = new JPanel();
		panel_8_1_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_8_1_2.setBackground(new Color(245, 245, 245));
		
		JPanel panel_8_2_2 = new JPanel();
		panel_8_2_2.setBackground(new Color(13, 62, 117));
		
		JLabel lblNewLabel_7 = new JLabel("Frequenza Voli");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Lucida Bright", Font.ITALIC, 15));
		GroupLayout gl_panel_8_2_2 = new GroupLayout(panel_8_2_2);
		gl_panel_8_2_2.setHorizontalGroup(
			gl_panel_8_2_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 196, Short.MAX_VALUE)
				.addGroup(gl_panel_8_2_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_8_2_2.setVerticalGroup(
			gl_panel_8_2_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 54, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, gl_panel_8_2_2.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel_7, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_8_2_2.setLayout(gl_panel_8_2_2);
		GroupLayout gl_panel_8_1_2 = new GroupLayout(panel_8_1_2);
		gl_panel_8_1_2.setHorizontalGroup(
			gl_panel_8_1_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 200, Short.MAX_VALUE)
				.addComponent(panel_8_2_2, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
		);
		gl_panel_8_1_2.setVerticalGroup(
			gl_panel_8_1_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 112, Short.MAX_VALUE)
				.addGroup(gl_panel_8_1_2.createSequentialGroup()
					.addComponent(panel_8_2_2, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(54, Short.MAX_VALUE))
		);
		panel_8_1_2.setLayout(gl_panel_8_1_2);
		GroupLayout gl_panel_7_2 = new GroupLayout(panel_7_2);
		gl_panel_7_2.setHorizontalGroup(
			gl_panel_7_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7_2.createSequentialGroup()
					.addGroup(gl_panel_7_2.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_8_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
						.addComponent(panel_8_1_2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_7_2.setVerticalGroup(
			gl_panel_7_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_7_2.createSequentialGroup()
					.addComponent(panel_8_1_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_8_4, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
		);
		panel_7_2.setLayout(gl_panel_7_2);
		
		JPanel panel_7_1_1 = new JPanel();
		panel_7_1_1.setBackground(Color.WHITE);
		panel_7_1_1.setBounds(905, 111, 200, 396);
		PanelCompagnie.add(panel_7_1_1);
		
		JPanel panel_8_3_1 = new JPanel();
		panel_8_3_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_8_3_1.setBackground(new Color(220, 220, 220));
		panel_8_3_1.setLayout(new CardLayout(0, 0));
		
		JPanel panel_8_1_1_1 = new JPanel();
		panel_8_1_1_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_8_1_1_1.setBackground(new Color(245, 245, 245));
		
		JPanel panel_8_2_1_1 = new JPanel();
		panel_8_2_1_1.setBackground(new Color(13, 62, 117));
		
		JLabel lblNewLabel_6_1 = new JLabel("Voli & Tratte");
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setForeground(Color.WHITE);
		lblNewLabel_6_1.setFont(new Font("Lucida Bright", Font.ITALIC, 15));
		GroupLayout gl_panel_8_2_1_1 = new GroupLayout(panel_8_2_1_1);
		gl_panel_8_2_1_1.setHorizontalGroup(
			gl_panel_8_2_1_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 196, Short.MAX_VALUE)
				.addGroup(gl_panel_8_2_1_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_6_1, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_8_2_1_1.setVerticalGroup(
			gl_panel_8_2_1_1.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 54, Short.MAX_VALUE)
				.addGroup(gl_panel_8_2_1_1.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel_6_1, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_8_2_1_1.setLayout(gl_panel_8_2_1_1);
		GroupLayout gl_panel_8_1_1_1 = new GroupLayout(panel_8_1_1_1);
		gl_panel_8_1_1_1.setHorizontalGroup(
			gl_panel_8_1_1_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 200, Short.MAX_VALUE)
				.addComponent(panel_8_2_1_1, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
		);
		gl_panel_8_1_1_1.setVerticalGroup(
			gl_panel_8_1_1_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 209, Short.MAX_VALUE)
				.addGroup(gl_panel_8_1_1_1.createSequentialGroup()
					.addComponent(panel_8_2_1_1, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(151, Short.MAX_VALUE))
		);
		panel_8_1_1_1.setLayout(gl_panel_8_1_1_1);
		GroupLayout gl_panel_7_1_1 = new GroupLayout(panel_7_1_1);
		gl_panel_7_1_1.setHorizontalGroup(
			gl_panel_7_1_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7_1_1.createSequentialGroup()
					.addGroup(gl_panel_7_1_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_8_3_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
						.addComponent(panel_8_1_1_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_7_1_1.setVerticalGroup(
			gl_panel_7_1_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_7_1_1.createSequentialGroup()
					.addComponent(panel_8_1_1_1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_8_3_1, GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
		);
		
		JScrollPane scrollPane_1 = new JScrollPane((Component) null);
		panel_8_3_1.add(scrollPane_1, "name_331447022225400");
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(77, 363, 200, 23);
		PanelCompagnie.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(351, 414, 200, 23);
		PanelCompagnie.add(btnNewButton_1);
		getContentPane().setLayout(groupLayout);
				
		
	}
}