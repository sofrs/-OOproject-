package apViews;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.CardLayout;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import apCommon.*;
import java.awt.event.ItemListener;
import java.io.FileInputStream;
import java.sql.SQLException;
import java.text.DateFormat;
import java.awt.event.ItemEvent;

public class AMain extends JFrame {
	
	private JPanel contentPane;
	private Panel BodyContainer;
	private JLayeredPane Volo;
	private JButton PulsanteAereo;
	private JLayeredPane Main;
	private JButton PulsanteGate;
	private JButton PulsanteInfo;
	private JLabel ScrittaCompagnie;
	private JLabel ScrittaMappa;
	private JButton ShowCompagnie;
	private JButton ShowMappa;
	private JLabel InfoUni;
	private JLabel ImmagineFooter;
	private JLayeredPane Gate;
	private JLayeredPane Info;
	private JLayeredPane Mappa;
	private JLayeredPane Compagnie;
	private JLabel OmbraHeaderGate;
	private JLabel lblNewLabel;
	private JButton PulsanteHomeVolo;
	private JLabel ImmAtene;
	private JLabel ImmBarcellona;
	private JLabel ImmBerlino;
	private JLabel ImmBruxelles;
	private JLabel ImmCagliari;
	private JLabel ImmCatania;
	private JLabel ImmCracovia;
	private JLabel ImmDubai;
	private JLabel ImmGenova;
	private JLabel ImmLiverpool;
	private JLabel ImmLondra;
	private JLabel ImmTorino;
	private JLabel ImmTrieste;
	private JLabel ImmVenezia;
	private JLabel ImmVerona;
	private JPanel PannelloRimuovi;
	private JPanel PannelloRischedula;
	private JButton PulsanteHomeGate;
	private JLayeredPane MarzoGiorni;
	private JLayeredPane MarzoHeader;
	private JTextField FieldData;
	private JInternalFrame Calendario;
	private JButton SelectData;
	private JComboBox<String> SelectCittà;
	private JLabel ImmAmsterdam;
	private JLabel[] labelsCittà;
	private JComboBox comboBox;
	private JComboBox<String> BoxDestinazione;
	Controller theController;
	private JTextField FieldPrenotazioni;
	
	public AMain(Controller c) throws SQLException {
		theController = c;
		
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
		

		BodyContainer = new Panel();
		BodyContainer.setLayout(new CardLayout());
		

		Main = new JLayeredPane();
		BodyContainer.add(Main, "MainPage");
		
		
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
				theController.switchPanel(Main, Volo);
			}
		});
		Main.add(PulsanteAereo);
		
		
		JLabel MainMenù = new JLabel("");
		MainMenù.setIcon(new ImageIcon(AMain.class.getResource("/apResources/Men\u00F9Sfere.png")));
		MainMenù.setHorizontalAlignment(SwingConstants.CENTER);
		MainMenù.setBounds(233, 129, 719, 179);
		Main.add(MainMenù);
		
		
		ScrittaCompagnie = new JLabel("Compagnie Aeree");
		ScrittaCompagnie.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 15));
		ScrittaCompagnie.setForeground(Color.DARK_GRAY);
		ScrittaCompagnie.setHorizontalAlignment(SwingConstants.CENTER);
		ScrittaCompagnie.setBounds(1016, 38, 147, 19);
		Main.add(ScrittaCompagnie);
		
		
		ScrittaMappa = new JLabel("Mappa");
		ScrittaMappa.setForeground(Color.DARK_GRAY);
		ScrittaMappa.setHorizontalAlignment(SwingConstants.CENTER);
		ScrittaMappa.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 15));
		ScrittaMappa.setBounds(76, 38, 147, 19);
		Main.add(ScrittaMappa);
		
		
		ShowCompagnie = new JButton("New button");
		ShowCompagnie = new JButton("");
		ShowCompagnie.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconaCompagnie.png")));
		ShowCompagnie.setBounds(949, 10, 227, 179);
		ShowCompagnie.setOpaque(false);
		ShowCompagnie.setFocusable(false);
		ShowCompagnie.setContentAreaFilled(false);
		ShowCompagnie.setBorderPainted(false);
		Main.add(ShowCompagnie);
		
		
		ShowMappa = new JButton("New button");
		ShowMappa.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconaMappa.png")));
		ShowMappa.setBounds(10, 10, 227, 179);
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
		
		
		InfoUni = new JLabel("Universit\u00E0 degli Studi di Napoli Federico II - Corso Umberto I 40 - 80138 Napoli - Centralino +39 081 2531111 contactcenter@unina.it - C.F. 00876220633 - PEC ateneo@pec.unina.it");
		InfoUni.setHorizontalAlignment(SwingConstants.CENTER);
		InfoUni.setForeground(Color.GRAY);
		InfoUni.setFont(new Font("Tahoma", Font.PLAIN, 12));
		InfoUni.setBounds(-7, 514, 1193, 21);
		Main.add(InfoUni);
		
		
		ImmagineFooter = new JLabel("");
		ImmagineFooter.setBounds(-7, 338, 1200, 197);
		ImmagineFooter.setIcon(new ImageIcon(AMain.class.getResource("/apResources/Footer.png")));
		Main.add(ImmagineFooter);
		
		Volo = new JLayeredPane();
		BodyContainer.add(Volo, "VoloPage");
		
		
		JPanel PanelVolo = new JPanel();
		PanelVolo.setBackground(new Color(208, 215, 232));
		PanelVolo.setBounds(0, 0, 1193, 535);
		Volo.add(PanelVolo);
		PanelVolo.setLayout(null);
		
		Calendario = new JInternalFrame("Calendario");
		Calendario.setClosable(true);
		Calendario.setBounds(-100, 198, 393, 326);
		PanelVolo.add(Calendario);
		
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
		HeaderCalendario.add(MarzoHeader, "name_80105300536100");
		
		JLabel LabelMarzo = new JLabel("MARZO");
		LabelMarzo.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		LabelMarzo.setForeground(Color.WHITE);
		LabelMarzo.setHorizontalAlignment(SwingConstants.CENTER);
		LabelMarzo.setBounds(0, 0, 381, 39);
		MarzoHeader.add(LabelMarzo);
		
		FieldData = new JTextField();
		FieldData.setHorizontalAlignment(SwingConstants.CENTER);
		FieldData.setEditable(false);
		FieldData.setBounds(10, 43, 96, 19);
		FieldData.setColumns(10);
		BodyCalendario.setLayout(new CardLayout(0, 0));
		
		MarzoGiorni = new JLayeredPane();
		
		BodyCalendario.add(MarzoGiorni, "name_81540142032100");
		
		JButton[] pulsantiMesi = new JButton[32];
		theController.creaPulsantiCalendarioMarzo(pulsantiMesi, MarzoGiorni, FieldData, Calendario);
		Calendario.getContentPane().setLayout(groupLayout_1);
		
		JPanel ImmCittà = new JPanel();
		ImmCittà.setBounds(37, 378, 183, 109);
		PanelVolo.add(ImmCittà);
		ImmCittà.setLayout(new CardLayout());
		
		ImmAmsterdam = new JLabel("");
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
		
		labelsCittà = new JLabel[]{ImmAmsterdam, ImmAtene, ImmBarcellona, ImmBerlino, ImmBruxelles, ImmCagliari, ImmCatania, ImmCracovia,
											ImmDubai, ImmGenova, ImmLiverpool, ImmLondra, ImmTorino, ImmTrieste, ImmVenezia, ImmVerona};
		
		SelectCittà = new JComboBox<String>();
		SelectCittà.setModel(new DefaultComboBoxModel<String>(new String[] {"Amsterdam", "Atene", "Barcellona", "Berlino", "Bruxelles", "Cagliari", "Catania", "Cracovia", "Dubai", "Genova", "Roma", "Londra", "Torino", "Trieste", "Venezia", "Milano"}));
		SelectCittà.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		SelectCittà.setBounds(37, 320, 183, 21);
		SelectCittà.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					theController.setImageBox(SelectCittà, labelsCittà);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		PanelVolo.add(SelectCittà);
		
		
		JLabel OmbraHeaderVolo = new JLabel("");
		OmbraHeaderVolo.setIcon(new ImageIcon(AMain.class.getResource("/apResources/OmbraHeader.png")));
		OmbraHeaderVolo.setBounds(0, 0, 1193, 34);
		PanelVolo.add(OmbraHeaderVolo);
		
		PulsanteHomeVolo = new JButton("");
		PulsanteHomeVolo.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconHome.png")));
		PulsanteHomeVolo.setBounds(10, 10, 63, 51);
		PulsanteHomeVolo.setOpaque(false);
		PulsanteHomeVolo.setFocusable(false);
		PulsanteHomeVolo.setContentAreaFilled(false);
		PulsanteHomeVolo.setBorderPainted(false);
		PulsanteHomeVolo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.switchPanel(Volo, Main);
				Calendario.setVisible(false);
			}
		});
		PanelVolo.add(PulsanteHomeVolo); 
        
		JLabel Biglietto = new JLabel("New label");
		Biglietto.setIcon(new ImageIcon(AMain.class.getResource("/apResources/BaseBiglietto.png")));
		Biglietto.setHorizontalAlignment(SwingConstants.CENTER);
		Biglietto.setBounds(0, 59, 274, 486);
		PanelVolo.add(Biglietto);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		tabbedPane.setBounds(366, 45, 741, 154);
		PanelVolo.add(tabbedPane);
		
		JPanel PannelloAggiungi = new JPanel();
		tabbedPane.addTab("Aggiungi", null, PannelloAggiungi, null);
		
		JLabel LabelArrivo = new JLabel("Data e ora d'imbarco");
		LabelArrivo.setHorizontalAlignment(SwingConstants.CENTER);
		LabelArrivo.setBounds(10, 21, 195, 16);
		LabelArrivo.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		
		JComboBox<String> BoxOrari = new JComboBox<String>();
		BoxOrari.setBounds(116, 43, 89, 19);
		BoxOrari.setModel(new DefaultComboBoxModel<String>(new String[] {"00:00", "00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "23:59"}));
		
		SelectData = new JButton("Sleziona Data");
		SelectData.setBounds(10, 68, 195, 21);
		SelectData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calendario.setVisible(true);
			}
		});
		
		
		
		PannelloAggiungi.setLayout(null);
		PannelloAggiungi.add(LabelArrivo);
		PannelloAggiungi.add(SelectData);
		PannelloAggiungi.add(FieldData);
		PannelloAggiungi.add(BoxOrari);
		
		JLabel LabelDestinazione = new JLabel("Destinazione:");
		LabelDestinazione.setHorizontalAlignment(SwingConstants.CENTER);
		LabelDestinazione.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		LabelDestinazione.setBounds(446, 21, 152, 16);
		PannelloAggiungi.add(LabelDestinazione);
		
		BoxDestinazione = new JComboBox<String>();
		BoxDestinazione.setModel(new DefaultComboBoxModel<String>(new String[] {"Amsterdam", "Atene", "Barcellona", "Berlino", "Bruxelles", "Cagliari", "Catania", "Cracovia", "Dubai", "Genova", "Roma", "Londra", "Torino", "Trieste", "Venezia", "Milano"}));
		BoxDestinazione.setBounds(446, 36, 152, 26);
		PannelloAggiungi.add(BoxDestinazione);
		
		JLabel NumPrenotazioni = new JLabel("Prenotazioni:");
		NumPrenotazioni.setHorizontalAlignment(SwingConstants.CENTER);
		NumPrenotazioni.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		NumPrenotazioni.setBounds(254, 19, 152, 19);
		PannelloAggiungi.add(NumPrenotazioni);
		
		FieldPrenotazioni = new JTextField();
		FieldPrenotazioni.setBounds(254, 36, 152, 26);
		PannelloAggiungi.add(FieldPrenotazioni);
		FieldPrenotazioni.setColumns(10);
		
		PannelloRimuovi = new JPanel();
		tabbedPane.addTab("Rimuovi", null, PannelloRimuovi, null);
		
		PannelloRischedula = new JPanel();
		tabbedPane.addTab("Rischedula", null, PannelloRischedula, null);
		
		Panel AreaVoli = new Panel();
		AreaVoli.setBackground(Color.WHITE);
		AreaVoli.setBounds(317, 215, 836, 282);
		PanelVolo.add(AreaVoli);
		AreaVoli.setLayout(new CardLayout(0, 0));
		
		JLayeredPane layeredPane = new JLayeredPane();
		AreaVoli.add(layeredPane, "name_177262891347200");
		
		JList<Tratta> list = new JList<Tratta>();
		list.setBounds(0, 281, 836, -280);
		layeredPane.add(list);
		
		JInternalFrame Warning = new JInternalFrame("Warning!");
		Warning.setBounds(260, 11, 353, 164);
		layeredPane.add(Warning);
		Warning.getContentPane().setBackground(new Color(13, 62, 117));
		
		JButton btnNewButton = new JButton("Annulla");
		
		JPanel panel = new JPanel();
		GroupLayout groupLayout_2 = new GroupLayout(Warning.getContentPane());
		groupLayout_2.setHorizontalGroup(
			groupLayout_2.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout_2.createSequentialGroup()
					.addGroup(groupLayout_2.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout_2.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout_2.createSequentialGroup()
							.addGap(111)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(243, Short.MAX_VALUE))
		);
		groupLayout_2.setVerticalGroup(
			groupLayout_2.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
					.addGap(25))
		);
		
		JLabel lblNewLabel_2 = new JLabel("- HAI INSERITO VALORI NON VALIDI -");
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(13, 62, 117));
		lblNewLabel_2.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		Warning.getContentPane().setLayout(groupLayout_2);
		Warning.setVisible(false);
		
		JButton PulsanteConferma = new JButton("Ok");
		PulsanteConferma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theController.newTratta(BoxOrari, BoxDestinazione, FieldPrenotazioni, Warning, FieldData);
			}
		});
		PulsanteConferma.setBounds(673, 72, 53, 40);
		PannelloAggiungi.add(PulsanteConferma);
		
		
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
		BodyContainer.add(Gate, "name_7197058332500");
		
		JPanel PanelGate = new JPanel();
		PanelGate.setBorder(null);
		PanelGate.setBackground(new Color(208, 215, 232));
		PanelGate.setBounds(0, 0, 1193, 535);
		Gate.add(PanelGate);
		PanelGate.setLayout(null);
		
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
		BodyContainer.add(Info, "name_7222503502800");
				
				
				
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
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(20, 415, 1129, 109);
		PanelGate.add(tabbedPane_1);
		
		JTabbedPane TerminalPane = new JTabbedPane(JTabbedPane.TOP);
		TerminalPane.setBounds(20, 80, 1129, 327);
		PanelGate.add(TerminalPane);
		
		JPanel PanelTerminale1 = new JPanel();
		PanelTerminale1.setLayout(null);
		PanelTerminale1.setBorder(new LineBorder(Color.WHITE, 2, true));
		PanelTerminale1.setBackground(new Color(166, 201, 227));
		TerminalPane.addTab("Terminal 1", null, PanelTerminale1, null);
		
		JPanel GatesArrivo = new JPanel();
		GatesArrivo.setToolTipText("");
		GatesArrivo.setBounds(10, 11, 79, 277);
		PanelTerminale1.add(GatesArrivo);
		
		TextArea GateArea1 = new TextArea();
		GateArea1.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		GateArea1.setEditable(false);
		GateArea1.setColumns(2);
		
		JLabel lblNewLabel_1 = new JLabel("Gates");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		GroupLayout gl_GatesArrivo = new GroupLayout(GatesArrivo);
		gl_GatesArrivo.setHorizontalGroup(
			gl_GatesArrivo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_GatesArrivo.createSequentialGroup()
					.addGroup(gl_GatesArrivo.createParallelGroup(Alignment.TRAILING)
						.addComponent(GateArea1, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_GatesArrivo.setVerticalGroup(
			gl_GatesArrivo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_GatesArrivo.createSequentialGroup()
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(GateArea1, GroupLayout.PREFERRED_SIZE, 235, Short.MAX_VALUE))
		);
		GatesArrivo.setLayout(gl_GatesArrivo);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(99, 11, 111, 277);
		PanelTerminale1.add(panel_2);
		
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
		
		theController.setTerminalGate(GateArea1, GateArea2, GateArea3, GateArea4);
		
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
		BodyContainer.add(Mappa, "name_7278817582900");
				
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
		BodyContainer.add(Compagnie, "name_7308097032100");
				
				
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
		getContentPane().setLayout(groupLayout);
				
		
	}
}