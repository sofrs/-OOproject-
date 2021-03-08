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
	private JPanel Terminale1;
	private JPanel panel_1;
	private JLabel NumeroUno;
	private JLabel TerminalUno;
	private JLabel TerminalUno_1;
	private JPanel Terminale2;
	private JPanel panel_3;
	private JLabel NumeroUno_1;
	private JLabel TerminalUno_2;
	private JLabel TerminalUno_3;
	private JPanel Terminale3;
	private JPanel panel_5;
	private JLabel NumeroUno_2;
	private JLabel TerminalUno_4;
	private JLabel TerminalUno_5;
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
	private JComboBox SelectCittà;
	private JLabel ImmAmsterdam;
	private JLabel[] labelsCittà;
	private JButton unoM;
	private JButton dueM;
	private JButton treM;
	private JButton quattroM;
	private JButton cinqueM;
	private JButton seiM;
	private JButton setteM;
	private JButton ottoM;
	private JButton ventidueM;
	private JButton ventinoveM;
	private JButton noveM;
	private JButton dieciM;
	private JButton undiciM;
	private JButton dodiciM;
	private JButton trediciM;
	private JButton quattordiciM;
	private JButton sediciM;
	private JButton diciassetteM;
	private JButton diciottoM;
	private JButton diciannoveM;
	private JButton ventiM;
	private JButton ventunoM;
	private JButton ventitreM;
	private JButton ventiquattroM;
	private JButton venticinqueM;
	private JButton ventiseiM;
	private JButton ventisetteM;
	private JButton ventottoM;
	private JButton trentaM;
	private JButton trentunoM;
	private JButton quindiciM;
	private JLabel LabelIDAereo;
	private JComboBox comboBox;
	private JLayeredPane PannelloVoliAmsterdam;
	private JButton PulsanteReverse;
	private JComboBox<String> BoxPartenza;
	private JComboBox<String> BoxDestinazione;
	private Tratta[] Tratte;
	Controller theController;
	
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
		Calendario.setBounds(317, 199, 393, 326);
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
		FieldData.setBounds(10, 32, 96, 19);
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
		SelectCittà.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		SelectCittà.setBounds(37, 320, 183, 21);
		theController.setCittàBox(SelectCittà);
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
		tabbedPane.setBounds(317, 44, 836, 145);
		PanelVolo.add(tabbedPane);
		
		JPanel PannelloAggiungi = new JPanel();
		tabbedPane.addTab("Aggiungi", null, PannelloAggiungi, null);
		
		JLabel LabelArrivo = new JLabel("Data e ora d'imbarco");
		LabelArrivo.setHorizontalAlignment(SwingConstants.CENTER);
		LabelArrivo.setBounds(10, 10, 195, 16);
		LabelArrivo.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		
		JComboBox<String> BoxOrari = new JComboBox<String>();
		BoxOrari.setBounds(116, 32, 89, 19);
		BoxOrari.setModel(new DefaultComboBoxModel<String>(new String[] {"00:00", "00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "23:59"}));
		
		SelectData = new JButton("Sleziona Data");
		SelectData.setBounds(10, 57, 96, 21);
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
		
		JLabel LabelPartenza = new JLabel("Partenza:");
		LabelPartenza.setHorizontalAlignment(SwingConstants.CENTER);
		LabelPartenza.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		LabelPartenza.setBounds(274, 13, 152, 16);
		PannelloAggiungi.add(LabelPartenza);
		
		JLabel LabelDestinazione = new JLabel("Destinazione:");
		LabelDestinazione.setHorizontalAlignment(SwingConstants.CENTER);
		LabelDestinazione.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		LabelDestinazione.setBounds(550, 13, 152, 16);
		PannelloAggiungi.add(LabelDestinazione);
		
		BoxPartenza = new JComboBox<String>();
		BoxPartenza.setModel(new DefaultComboBoxModel(new String[] {"Napoli"}));
		BoxPartenza.setBounds(274, 28, 152, 26);
		PannelloAggiungi.add(BoxPartenza);
		
		BoxDestinazione = new JComboBox<String>();
		//BoxDestinazione.setModel(new DefaultComboBoxModel(città.values()));
		BoxDestinazione.setBounds(550, 28, 152, 26);
		PannelloAggiungi.add(BoxDestinazione);
		
		JButton PulsanteConferma = new JButton("Ok");
		PulsanteConferma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tratta nuovaTratta = new Tratta();
			}
		});
		PulsanteConferma.setBounds(768, 66, 53, 40);
		PannelloAggiungi.add(PulsanteConferma);
		
		PulsanteReverse = new JButton("");
		PulsanteReverse.setOpaque(false);
		PulsanteReverse.setFocusable(false);
		PulsanteReverse.setContentAreaFilled(false);
		PulsanteReverse.setBorderPainted(false);
		PulsanteReverse.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconReverse.png")));
		PulsanteReverse.setBounds(460, 10, 66, 68);
		PulsanteReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ("Napoli".equals(BoxPartenza.getSelectedItem())){
					BoxDestinazione.setModel(new DefaultComboBoxModel(new String[] {"Napoli"}));
					//BoxPartenza.setModel(new DefaultComboBoxModel(città.values()));
				}
				else {
					BoxPartenza.setModel(new DefaultComboBoxModel(new String[] {"Napoli"}));
					//BoxDestinazione.setModel(new DefaultComboBoxModel(città.values()));
				}
			}
		});
		PannelloAggiungi.add(PulsanteReverse);
		
		LabelIDAereo = new JLabel("ID Aereo:");
		LabelIDAereo.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		LabelIDAereo.setBounds(275, 77, 81, 16);
		PannelloAggiungi.add(LabelIDAereo);
		
		JComboBox<String>BoxIDAereo = new JComboBox<String>();
		//BoxIDAereo.setModel(new DefaultComboBoxModel(IDAereo.values()));
		BoxIDAereo.setBounds(345, 76, 81, 17);
		PannelloAggiungi.add(BoxIDAereo);
		
		PannelloRimuovi = new JPanel();
		tabbedPane.addTab("Rimuovi", null, PannelloRimuovi, null);
		
		PannelloRischedula = new JPanel();
		tabbedPane.addTab("Rischedula", null, PannelloRischedula, null);
		
		Panel AreaVoli = new Panel();
		AreaVoli.setBackground(Color.WHITE);
		AreaVoli.setBounds(317, 215, 836, 282);
		PanelVolo.add(AreaVoli);
		
		JScrollBar scrollBar = new JScrollBar();
		
		JLayeredPane PannelliVoli = new JLayeredPane();
		GroupLayout gl_AreaVoli = new GroupLayout(AreaVoli);
		gl_AreaVoli.setHorizontalGroup(
			gl_AreaVoli.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_AreaVoli.createSequentialGroup()
					.addComponent(PannelliVoli, GroupLayout.PREFERRED_SIZE, 814, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		gl_AreaVoli.setVerticalGroup(
			gl_AreaVoli.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE)
				.addComponent(PannelliVoli, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
		);
		PannelliVoli.setLayout(new CardLayout(0, 0));
		
		PannelloVoliAmsterdam = new JLayeredPane();
		PannelliVoli.add(PannelloVoliAmsterdam, "name_91597616460700");
		AreaVoli.setLayout(gl_AreaVoli);
		
		
		
		
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
		
		Terminale1 = new JPanel();
		Terminale1.setBorder(new LineBorder(Color.WHITE, 2, true));
		Terminale1.setBackground(new Color(166, 201, 227));
		Terminale1.setBounds(147, 69, 212, 190);
		PanelGate.add(Terminale1);
		Terminale1.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setForeground(Color.WHITE);
		panel_1.setBounds(10, 10, 30, 30);
		Terminale1.add(panel_1);
		panel_1.setLayout(null);
		
		NumeroUno = new JLabel("1");
		NumeroUno.setForeground(Color.DARK_GRAY);
		NumeroUno.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		NumeroUno.setHorizontalAlignment(SwingConstants.CENTER);
		NumeroUno.setBounds(0, 0, 30, 30);
		panel_1.add(NumeroUno);
		
		TerminalUno = new JLabel("Terminale 1");
		TerminalUno.setForeground(Color.BLACK);
		TerminalUno.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		TerminalUno.setBounds(50, 10, 152, 30);
		Terminale1.add(TerminalUno);
		
		TerminalUno_1 = new JLabel("Terminale 1");
		TerminalUno_1.setBounds(50, 10, 162, 35);
		Terminale1.add(TerminalUno_1);
		TerminalUno_1.setForeground(Color.WHITE);
		TerminalUno_1.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		
		Terminale2 = new JPanel();
		Terminale2.setLayout(null);
		Terminale2.setBorder(new LineBorder(Color.WHITE, 2, true));
		Terminale2.setBackground(new Color(128, 179, 216));
		Terminale2.setBounds(466, 69, 212, 190);
		PanelGate.add(Terminale2);
		
		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setForeground(Color.WHITE);
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(10, 10, 30, 30);
		Terminale2.add(panel_3);
		
		NumeroUno_1 = new JLabel("1");
		NumeroUno_1.setHorizontalAlignment(SwingConstants.CENTER);
		NumeroUno_1.setForeground(Color.DARK_GRAY);
		NumeroUno_1.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		NumeroUno_1.setBounds(0, 0, 30, 30);
		panel_3.add(NumeroUno_1);
		
		TerminalUno_2 = new JLabel("Terminale 1");
		TerminalUno_2.setForeground(Color.BLACK);
		TerminalUno_2.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		TerminalUno_2.setBounds(50, 10, 152, 30);
		Terminale2.add(TerminalUno_2);
		
		TerminalUno_3 = new JLabel("Terminale 1");
		TerminalUno_3.setForeground(Color.WHITE);
		TerminalUno_3.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		TerminalUno_3.setBounds(50, 10, 162, 35);
		Terminale2.add(TerminalUno_3);
		
		Terminale3 = new JPanel();
		Terminale3.setLayout(null);
		Terminale3.setBorder(new LineBorder(Color.WHITE, 2, true));
		Terminale3.setBackground(new Color(91, 155, 202));
		Terminale3.setBounds(788, 69, 212, 190);
		PanelGate.add(Terminale3);
		
		panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setForeground(Color.WHITE);
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBounds(10, 10, 30, 30);
		Terminale3.add(panel_5);
		
		NumeroUno_2 = new JLabel("1");
		NumeroUno_2.setHorizontalAlignment(SwingConstants.CENTER);
		NumeroUno_2.setForeground(Color.DARK_GRAY);
		NumeroUno_2.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		NumeroUno_2.setBounds(0, 0, 30, 30);
		panel_5.add(NumeroUno_2);
		
		TerminalUno_4 = new JLabel("Terminale 1");
		TerminalUno_4.setForeground(Color.BLACK);
		TerminalUno_4.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		TerminalUno_4.setBounds(50, 10, 152, 30);
		Terminale3.add(TerminalUno_4);
		
		TerminalUno_5 = new JLabel("Terminale 1");
		TerminalUno_5.setForeground(Color.WHITE);
		TerminalUno_5.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		TerminalUno_5.setBounds(50, 10, 162, 35);
		Terminale3.add(TerminalUno_5);
		
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
		
		// Info		
		
				Info = new JLayeredPane();
				BodyContainer.add(Info, "name_7222503502800");
				
				
				
				JPanel BackgroundInfo = new JPanel();
				BackgroundInfo.setFocusTraversalPolicyProvider(true);
				BackgroundInfo.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
				BackgroundInfo.setBorder(null);
				BackgroundInfo.setBackground(new Color(208, 215, 232));
				BackgroundInfo.setBounds(0, 0, 1193, 535);
				Info.add(BackgroundInfo);
				BackgroundInfo.setLayout(null);
				
				JLabel OmbraHeaderInfo = new JLabel("");
				OmbraHeaderInfo.setBounds(0, -15, 1199, 63);
				OmbraHeaderInfo.setIcon(new ImageIcon(AMain.class.getResource("/apResources/OmbraHeader.png")));
				PanelGate.add(OmbraHeaderInfo);
				
				JButton PulsanteHomeInfo = new JButton("");
				
				// dovrebbe andare nella sezione degli eventi in basso, ma esce errore
				
				PulsanteHomeInfo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Main.setVisible(true);
						Info.setVisible(false);
					}
				});
				
				PulsanteHomeInfo.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconHome.png")));
				PulsanteHomeInfo.setOpaque(false);
				PulsanteHomeInfo.setFocusable(false);
				PulsanteHomeInfo.setContentAreaFilled(false);
				PulsanteHomeInfo.setBorderPainted(false);
				PulsanteHomeInfo.setBounds(10, 10, 63, 51);
				BackgroundInfo.add(PulsanteHomeInfo);
				
				OmbraHeaderInfo = new JLabel("");
				OmbraHeaderInfo.setBounds(0, -15, 1199, 63);
				OmbraHeaderInfo.setIcon(new ImageIcon(AMain.class.getResource("/apResources/OmbraHeader.png")));
				BackgroundInfo.add(OmbraHeaderInfo);
				
				JLabel lblNewLabel_17 = new JLabel("Contattaci");
				lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_17.setForeground(Color.LIGHT_GRAY);
				lblNewLabel_17.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 15));
				lblNewLabel_17.setBounds(1009, 252, 115, 28);
				BackgroundInfo.add(lblNewLabel_17);
				
				JButton PulsanteContattaci_1 = new JButton("");
				PulsanteContattaci_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//Contattaci.setVisible(true);
						Info.setVisible(false);
					}
				});
				
				
				PulsanteContattaci_1.setIcon(new ImageIcon(AMain.class.getResource("/apResources/BackgroundPulsante.png")));
				PulsanteContattaci_1.setBounds(982, 241, 170, 51);
				BackgroundInfo.add(PulsanteContattaci_1);
				PulsanteContattaci_1.setOpaque(false);
				PulsanteContattaci_1.setFocusable(false);
				PulsanteContattaci_1.setContentAreaFilled(false);
				PulsanteContattaci_1.setBorderPainted(false);
				
				JTextArea textContattaci = new JTextArea();
				textContattaci.setForeground(Color.DARK_GRAY);
				textContattaci.setFont(new Font("Lucida Bright", Font.BOLD, 18));
				textContattaci.setText("Se hai bisogno di \r\n       ulteriori \r\n   informazioni");
				textContattaci.setWrapStyleWord(true);
				textContattaci.setLineWrap(true);
				textContattaci.setBounds(982, 154, 170, 76);
				textContattaci.setOpaque(false);
				textContattaci.setFocusable(false);
				BackgroundInfo.add(textContattaci);
				
				JLabel lblNewLabel_18 = new JLabel("FAQ");
				lblNewLabel_18.setForeground(Color.DARK_GRAY);
				lblNewLabel_18.setFont(new Font("Lucida Bright", Font.BOLD, 23));
				lblNewLabel_18.setBounds(36, 72, 63, 28);
				BackgroundInfo.add(lblNewLabel_18);
				
				JLabel lblNewLabel_19 = new JLabel("Quali documenti occorrono per il viaggio?");
				lblNewLabel_19.setForeground(Color.DARK_GRAY);
				lblNewLabel_19.setFont(new Font("Lucida Bright", Font.ITALIC, 15));
				lblNewLabel_19.setBounds(36, 123, 384, 28);
				BackgroundInfo.add(lblNewLabel_19);
				
				JTextArea txtrAlCheckinOccorre = new JTextArea();
				txtrAlCheckinOccorre.setEditable(false);
				txtrAlCheckinOccorre.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
				txtrAlCheckinOccorre.setForeground(Color.DARK_GRAY);
				txtrAlCheckinOccorre.setText("Al check-in occorre presentare il biglietto cartaceo o elettronico ed un documento, passaporto o carta di identit\u00E0, in corso di validit\u00E0. E' inoltre necessario verificare eventuale visto d'ingresso o vaccinazioni particolari richieste dal Paese in cui ci si reca.");
				txtrAlCheckinOccorre.setWrapStyleWord(true);
				txtrAlCheckinOccorre.setLineWrap(true);
				txtrAlCheckinOccorre.setBounds(36, 158, 820, 41);
				txtrAlCheckinOccorre.setOpaque(false);
				txtrAlCheckinOccorre.setFocusable(false);
				BackgroundInfo.add(txtrAlCheckinOccorre);
				
				JLabel lblNewLabel_20 = new JLabel("Quali sono gli articoli non ammessi nel bagaglio a mano?");
				lblNewLabel_20.setFont(new Font("Lucida Bright", Font.ITALIC, 15));
				lblNewLabel_20.setForeground(Color.DARK_GRAY);
				lblNewLabel_20.setBounds(36, 210, 465, 20);
				BackgroundInfo.add(lblNewLabel_20);
				
				JTextArea txtrInCabinaNon = new JTextArea();
				txtrInCabinaNon.setForeground(Color.DARK_GRAY);
				txtrInCabinaNon.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
				txtrInCabinaNon.setLineWrap(true);
				txtrInCabinaNon.setWrapStyleWord(true);
				txtrInCabinaNon.setText("In cabina non sono ammessi armi improprie quali forbici, coltelli, oggetti appuntiti, limette etc. n\u00E9 sostanze esplosive, tossiche o corrosive, armi da sparo o da taglio.");
				txtrInCabinaNon.setBounds(36, 241, 802, 39);
				txtrInCabinaNon.setOpaque(false);
				txtrInCabinaNon.setFocusable(false);
				BackgroundInfo.add(txtrInCabinaNon);
				
				JLabel lblNewLabel_21 = new JLabel("Come posso richiedere un'assistenza speciale?");
				lblNewLabel_21.setForeground(Color.DARK_GRAY);
				lblNewLabel_21.setFont(new Font("Lucida Bright", Font.ITALIC, 15));
				lblNewLabel_21.setBounds(36, 291, 425, 28);
				BackgroundInfo.add(lblNewLabel_21);
				
				JTextArea txtrAllattoDellaPrenotazione = new JTextArea();
				txtrAllattoDellaPrenotazione.setForeground(Color.DARK_GRAY);
				txtrAllattoDellaPrenotazione.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
				txtrAllattoDellaPrenotazione.setWrapStyleWord(true);
				txtrAllattoDellaPrenotazione.setLineWrap(true);
				txtrAllattoDellaPrenotazione.setEditable(false);
				txtrAllattoDellaPrenotazione.setText("All'atto della prenotazione, o almeno 48 ore prima della partenza, puoi richiedere assistenza speciale alla compagnia aerea o al tuo agente di viaggio. E' importante fornire alla compagnia aerea informazioni dettagliate in merito alle tue esigenze. L'assistenza \u00E8 gratuita e sar\u00E0 cura della compagnia aerea inoltrare la richiesta all'aeroporto ed informare tutti gli scali che verranno toccati durante il tuo viaggio.");
				txtrAllattoDellaPrenotazione.setOpaque(false);
				txtrAllattoDellaPrenotazione.setFocusable(false);
				txtrAllattoDellaPrenotazione.setBounds(36, 330, 802, 68);
				BackgroundInfo.add(txtrAllattoDellaPrenotazione);
				
				JLabel lblNewLabel_22 = new JLabel("Se perdo il bagaglio a chi devo rivolgermi?");
				lblNewLabel_22.setFont(new Font("Lucida Bright", Font.ITALIC, 15));
				lblNewLabel_22.setForeground(Color.DARK_GRAY);
				lblNewLabel_22.setBounds(36, 409, 425, 20);
				BackgroundInfo.add(lblNewLabel_22);
				
				JTextArea txtrInCasoDi = new JTextArea();
				txtrInCasoDi.setText("In caso di smarrimento o danneggiamento del bagaglio, prima di lasciare la sala riconsegna bagagli, \u00E8 necessario compilare l'apposito modulo denominato PIR (Property Irregularity Report) presso gli uffici Lost&Found della societ\u00E0 di handling che svolge i servizi di assistenza a terra per conto della compagnia aerea con la quale hai viaggiato. Per la riconsegna del bagaglio smarrito sarai contattato direttamente dall'ufficio Lost&Found di riferimento.");
				txtrInCasoDi.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
				txtrInCasoDi.setForeground(Color.DARK_GRAY);
				txtrInCasoDi.setWrapStyleWord(true);
				txtrInCasoDi.setLineWrap(true);
				txtrInCasoDi.setEditable(false);
				txtrInCasoDi.setOpaque(false);
				txtrInCasoDi.setFocusable(false);
				txtrInCasoDi.setBounds(36, 433, 802, 76);
				BackgroundInfo.add(txtrInCasoDi);
				
				JPanel panel_2 = new JPanel();
				panel_2.setBackground(UIManager.getColor("CheckBox.light"));
				panel_2.setBounds(0, 73, 249, 28);
				BackgroundInfo.add(panel_2);						
				
				Mappa = new JLayeredPane();
				BodyContainer.add(Mappa, "name_7278817582900");
				
				JButton PulsanteHomeMappa = new JButton("");
				
				PulsanteHomeMappa.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Main.setVisible(true);
						Mappa.setVisible(false);
						
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
				Mappa.add(PulsanteHomeMappa);
				
				JPanel BackgroundMappa = new JPanel();
				BackgroundMappa.setFocusTraversalPolicyProvider(true);
				BackgroundMappa.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
				BackgroundMappa.setBorder(null);
				BackgroundMappa.setBackground(new Color(208, 215, 232));
				BackgroundMappa.setBounds(0, 0, 1193, 535);
				Mappa.add(BackgroundMappa);
				BackgroundMappa.setLayout(null);
			
				
				JLabel OmbraHeaderMappa = new JLabel("");
				OmbraHeaderMappa.setBounds(0, 0, 1199, 63);
				BackgroundMappa.add(OmbraHeaderMappa);
				OmbraHeaderMappa.setBounds(0, -15, 1199, 63);
				OmbraHeaderMappa.setIcon(new ImageIcon(AMain.class.getResource("/apResources/OmbraHeader.png")));
				
				JButton FotoMappa = new JButton("");
				FotoMappa.setIcon(new ImageIcon(AMain.class.getResource("/apResources/MappaUni.png")));
				FotoMappa.setFocusPainted(false);
				FotoMappa.setOpaque(false);
				FotoMappa.setFocusable(false);
				FotoMappa.setContentAreaFilled(false);
				FotoMappa.setBorderPainted(false);
				FotoMappa.setBounds(348, 10, 818, 515);
				BackgroundMappa.add(FotoMappa);
				
				JPanel panel = new JPanel();
				panel.setBackground(UIManager.getColor("CheckBox.light"));
				panel.setBounds(10, 84, 316, 162);
				BackgroundMappa.add(panel);
				
				JLabel Mappa_Aeroporto = new JLabel("Mappa Aeroporto");
				Mappa_Aeroporto.setHorizontalAlignment(SwingConstants.CENTER);
				Mappa_Aeroporto.setForeground(Color.DARK_GRAY);
				Mappa_Aeroporto.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 30));
				Mappa_Aeroporto.setBackground(Color.LIGHT_GRAY);
				
				JPanel panel_4 = new JPanel();
				GroupLayout gl_panel = new GroupLayout(panel);
				gl_panel.setHorizontalGroup(
					gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(10)
							.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 294, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addComponent(Mappa_Aeroporto, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
				);
				gl_panel.setVerticalGroup(
					gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(Mappa_Aeroporto, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
				GroupLayout gl_panel_4 = new GroupLayout(panel_4);
				gl_panel_4.setHorizontalGroup(
					gl_panel_4.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_panel_4.createSequentialGroup()
							.addContainerGap()
							.addComponent(textAreaMappa, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
				gl_panel_4.setVerticalGroup(
					gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel_4.createSequentialGroup()
							.addContainerGap()
							.addComponent(textAreaMappa, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
				);
				panel_4.setLayout(gl_panel_4);
				panel.setLayout(gl_panel);
				
				Compagnie = new JLayeredPane();
				BodyContainer.add(Compagnie, "name_7308097032100");
				
				JButton PulsanteHomeCompagnie = new JButton("");
				PulsanteHomeCompagnie.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Main.setVisible(true);
						Compagnie.setVisible(false);
					}
				});
				PulsanteHomeCompagnie.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconHome.png")));
				PulsanteHomeCompagnie.setOpaque(false);
				PulsanteHomeCompagnie.setFocusable(false);
				PulsanteHomeCompagnie.setContentAreaFilled(false);
				PulsanteHomeCompagnie.setBorderPainted(false);
				PulsanteHomeCompagnie.setBounds(10, 10, 63, 51);
				Compagnie.add(PulsanteHomeCompagnie);
				
				JPanel BackgroundCompagnie = new JPanel();
				BackgroundCompagnie.setBackground(new Color(208, 215, 232));
				BackgroundCompagnie.setBounds(0, 0, 1193, 535);
				Compagnie.add(BackgroundCompagnie);
				BackgroundCompagnie.setLayout(null);
				
				JLabel OmbraHeaderCompagnie = new JLabel("");
				OmbraHeaderCompagnie.setBounds(0, -15, 1199, 63);
				OmbraHeaderCompagnie.setIcon(new ImageIcon(AMain.class.getResource("/apResources/OmbraHeader.png")));
				BackgroundCompagnie.add(OmbraHeaderCompagnie);
				
		// Contattaci
				
				
				JLayeredPane Contattaci = new JLayeredPane();
				BodyContainer.add(Contattaci, "name_388611001422200");
				getContentPane().setLayout(groupLayout);
				
				JButton PulsanteHomeContattaci = new JButton("");
				
				
				PulsanteHomeContattaci.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					Main.setVisible(true);
					Contattaci.setVisible(false);
					
					}
				});
				PulsanteHomeContattaci.setIcon(null);
				PulsanteHomeContattaci.setOpaque(false);
				PulsanteHomeContattaci.setFocusable(false);
				PulsanteHomeContattaci.setContentAreaFilled(false);
				PulsanteHomeContattaci.setBorderPainted(false);
				PulsanteHomeContattaci.setBounds(10, 10, 63, 51);
				Contattaci.add(PulsanteHomeContattaci);
				
				JPanel BackgroundContattaci = new JPanel();
				BackgroundContattaci.setBorder(null);
				BackgroundContattaci.setBackground(new Color(208, 215, 232));
				BackgroundContattaci.setBounds(0, 0, 1193, 535);
				Contattaci.add(BackgroundContattaci);
				BackgroundContattaci.setLayout(null);
				
				
				
				OmbraHeaderGate = new JLabel("");
				OmbraHeaderGate.setBounds(0, -15, 1199, 63);
				OmbraHeaderGate.setIcon(new ImageIcon(AMain.class.getResource("/apResources/OmbraHeader.png")));
				BackgroundContattaci.add(OmbraHeaderGate);
				
				JLabel lblNewLabel_11 = new JLabel("Dati di contatto");
				lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblNewLabel_11.setBounds(65, 151, 146, 24);
				BackgroundContattaci.add(lblNewLabel_11);
				
				JLabel lblNewLabel_2 = new JLabel("Assistenza Passeggeri");
				lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
				lblNewLabel_2.setBounds(63, 62, 273, 24);
				BackgroundContattaci.add(lblNewLabel_2);
				
				JLabel lblNewLabel_3 = new JLabel("Per chiedere informazioni \u00E8 possibile contattare il numero 081-2531111 o compilare il seguente form");
				lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblNewLabel_3.setBounds(63, 97, 734, 24);
				BackgroundContattaci.add(lblNewLabel_3);
				
				JLabel lblNewLabel_4 = new JLabel("*");
				lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblNewLabel_4.setForeground(Color.RED);
				lblNewLabel_4.setBounds(182, 158, 46, 14);
				BackgroundContattaci.add(lblNewLabel_4);
				
				JLabel lblNewLabel_5 = new JLabel("Nome");
				lblNewLabel_5.setBounds(65, 212, 46, 14);
				BackgroundContattaci.add(lblNewLabel_5);
				
				JLabel lblNewLabel_6 = new JLabel("Cognome");
				lblNewLabel_6.setBounds(195, 212, 46, 14);
				BackgroundContattaci.add(lblNewLabel_6);
				
				JLabel lblNewLabel_7 = new JLabel("E-mail");
				lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblNewLabel_7.setBounds(65, 251, 94, 20);
				BackgroundContattaci.add(lblNewLabel_7);
				
				JLabel lblNewLabel_8 = new JLabel("*");
				lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblNewLabel_8.setForeground(Color.RED);
				lblNewLabel_8.setBounds(112, 256, 46, 14);
				BackgroundContattaci.add(lblNewLabel_8);
				
				JLabel lblNewLabel_9 = new JLabel("example@example.com");
				lblNewLabel_9.setBounds(65, 313, 120, 14);
				BackgroundContattaci.add(lblNewLabel_9);
				
				JLabel lblNewLabel_10 = new JLabel("Numero di telefono");
				lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblNewLabel_10.setBounds(65, 350, 146, 24);
				BackgroundContattaci.add(lblNewLabel_10);
				
				lblNewLabel_11 = new JLabel("Prefisso");
				lblNewLabel_11.setBounds(65, 416, 46, 14);
				BackgroundContattaci.add(lblNewLabel_11);
				
				JLabel lblNewLabel_12 = new JLabel("Numero di telefono");
				lblNewLabel_12.setBounds(152, 416, 94, 14);
				BackgroundContattaci.add(lblNewLabel_12);
				
				JLabel lblNewLabel_13 = new JLabel("Scrivi qui la tua richiesta");
				lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblNewLabel_13.setBounds(422, 155, 187, 17);
				BackgroundContattaci.add(lblNewLabel_13);
				
				Component btnNewButton_1 = new JButton("Invia");
				btnNewButton_1.setBounds(543, 457, 89, 23);
				BackgroundContattaci.add(btnNewButton_1);
				
				JLabel lblNewLabel_14 = new JLabel("-");
				lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 13));
				lblNewLabel_14.setBounds(127, 388, 18, 14);
				BackgroundContattaci.add(lblNewLabel_14);
				
				JLabel lblNewLabel_15 = new JLabel("*");
				lblNewLabel_15.setForeground(Color.RED);
				lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblNewLabel_15.setBounds(210, 357, 46, 14);
				BackgroundContattaci.add(lblNewLabel_15);
				
				JLabel lblNewLabel_16 = new JLabel("*");
				lblNewLabel_16.setForeground(Color.RED);
				lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblNewLabel_16.setBounds(608, 158, 46, 14);
				BackgroundContattaci.add(lblNewLabel_16);
				
				JTextArea txtrDaFinireSto = new JTextArea();
				txtrDaFinireSto.setText("DA FINIRE STO SCLERANDO MALISSIMO NON HO CAPITO COSA FARE PERCH\u00E8 ");
				txtrDaFinireSto.setWrapStyleWord(true);
				txtrDaFinireSto.setLineWrap(true);
				txtrDaFinireSto.setRows(40);
				txtrDaFinireSto.setBounds(422, 184, 329, 221);
				BackgroundContattaci.add(txtrDaFinireSto);
				
				JTextArea textArea_1 = new JTextArea();
				textArea_1.setLineWrap(true);
				textArea_1.setWrapStyleWord(true);
				textArea_1.setBounds(137, 385, 178, 22);
				BackgroundContattaci.add(textArea_1);
				
				JTextArea textArea_2 = new JTextArea();
				textArea_2.setLineWrap(true);
				textArea_2.setWrapStyleWord(true);
				textArea_2.setBounds(65, 383, 52, 22);
				BackgroundContattaci.add(textArea_2);
				
				
				JTextArea textArea_3 = new JTextArea();
				textArea_3.setWrapStyleWord(true);
				textArea_3.setLineWrap(true);
				textArea_3.setBounds(65, 280, 250, 22);
				BackgroundContattaci.add(textArea_3);
				
				JTextArea textArea_4 = new JTextArea();
				textArea_4.setWrapStyleWord(true);
				textArea_4.setLineWrap(true);
				textArea_4.setBounds(195, 184, 120, 22);
				BackgroundContattaci.add(textArea_4);
				
				JTextArea textArea_5 = new JTextArea();
				textArea_5.setColumns(1);
				textArea_5.setRows(1);
				textArea_5.setWrapStyleWord(true);
				textArea_5.setLineWrap(true);
				textArea_5.setBounds(65, 184, 120, 22);
				BackgroundContattaci.add(textArea_5);
				
				JPanel panel_61 = new JPanel();
				panel_61.setBackground(UIManager.getColor("CheckBox.light"));
				panel_61.setBounds(0, 97, 751, 24);
				BackgroundContattaci.add(panel_61);
				
		
	}
	
}