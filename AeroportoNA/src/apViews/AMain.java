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
	private JButton PulsanteAvanti;
	private JLayeredPane MarzoGiorni;
	private JLayeredPane AprileGiorni;
	private JLayeredPane AprileHeader;
	private JLayeredPane MarzoHeader;
	private JButton PulsanteIndietro;
	private JTextField FieldData;
	private JInternalFrame Calendario;
	private JButton SelectData;
	private JComboBox<città> SelectCittà;
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
	
	//Enums
	public enum città{
		Amsterdam,
		Atene,
		Barcellona,
		Berlino,
		Bruxelles,
		Cagliari,
		Catania,
		Cracovia,
		Dubai,
		Genova,
		Liverpool,
		Londra,
		Torino,
		Trieste,
		Venezia,
		Verona;
	};
	
	public enum IDTratta{
		NAMS01,
		NATE02,
		NBAR03,
		NBER04,
		NBRU05,
		NCAG06,
		NCAT07,
		NCRA08,
		NDUB09,
		NGEN10,
		NLIV11,
		NLON12,
		NTOR13,
		NTRI14,
		NVEN15,
		NVER16;
	};
	
	public enum IDAereo{
		A300F, //Airbus
		A310F,
		A320,
		A330F,
		A380F,
		A300_600ST,
		An_124, //Antonov
		An_225,
		B727F, //Boeing
		B737,
		B757PF,
		B767F,
		B47F,
		B747, 
		B777F,
		DC_3, //Douglas
		DC_8F,
		DC_9F,
		Il_18T, //Ilyushin
		Il_76,
		Il_96T,
		DC_10F, //McDonnell
		MD_11F,
		Tu_204F, //Tupolev
		Tu_204C;
	};
	
	public enum Modello{
		Airbus,
		Antonov,
		Boeing,
		Douglas,
		Ilyushin,
		McDonnell,
		Tupolev;
	};
	
	//Launch the application
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AMain frame = new AMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AMain() {
		
		initValues();
		initComponents();
		createEvents();
		
	}
	
	//Questo metodo contiene il codice per inizializzare variabili
	private void initValues() {
		Compagnia[] compagnie = new Compagnia[5];
		compagnie[0] = new Compagnia("EasyJet", "www.easyjet.com");
		compagnie[1] = new Compagnia("Ryanair", "www.ryanair.com");
		compagnie[2] = new Compagnia("Eurowings", "www.eurowings.com");
		compagnie[3] = new Compagnia("Delta airlines", "www.delta.com");
		compagnie[4] = new Compagnia("Alitalia", "www.alitalia.com");
		Aereo[] aerei = new Aereo[100];
		aerei[0] = new Aereo(IDAereo.A300F, Modello.Airbus, compagnie[0]);
		Volo[] voli = new Volo[100];
		voli[0] = new Volo();
		Tratte = new Tratta[100];
		//Tratte[0] = new Tratta();
		
	}
	
	//Questo metodo contiene il codice per creare e inizializzare componenti 
	private void initComponents() {
		

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
		Main.add(PulsanteInfo);
		
		
		PulsanteGate = new JButton("");
		PulsanteGate.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconGate.png")));
		PulsanteGate.setBounds(439, 176, 85, 90);
		PulsanteGate.setOpaque(false);
		PulsanteGate.setFocusable(false);
		PulsanteGate.setContentAreaFilled(false);
		PulsanteGate.setBorderPainted(false);
		Main.add(PulsanteGate);
		
		
		PulsanteAereo = new JButton("");
		PulsanteAereo.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconAereo.png")));
		PulsanteAereo.setOpaque(false);
		PulsanteAereo.setFocusable(false);
		PulsanteAereo.setContentAreaFilled(false);
		PulsanteAereo.setBorderPainted(false);
		PulsanteAereo.setBounds(543, 176, 92, 103);
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
		Calendario.setBounds(-82, 171, 393, 326);
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
		
		PulsanteAvanti = new JButton("");
		PulsanteAvanti.setIcon(new ImageIcon(AMain.class.getResource("/apResources/FrecciaDestra.png")));
		PulsanteAvanti.setBounds(334, 0, 47, 39);
		PulsanteAvanti.setOpaque(false);
		PulsanteAvanti.setFocusable(false);
		PulsanteAvanti.setContentAreaFilled(false);
		PulsanteAvanti.setBorderPainted(false);
		MarzoHeader.add(PulsanteAvanti);
		
		JLabel LabelMarzo = new JLabel("MARZO");
		LabelMarzo.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		LabelMarzo.setForeground(Color.WHITE);
		LabelMarzo.setHorizontalAlignment(SwingConstants.CENTER);
		LabelMarzo.setBounds(0, 0, 381, 39);
		MarzoHeader.add(LabelMarzo);
		
		AprileHeader = new JLayeredPane();
		HeaderCalendario.add(AprileHeader, "name_81101437069600");
		
		PulsanteIndietro = new JButton("");
		PulsanteIndietro.setIcon(new ImageIcon(AMain.class.getResource("/apResources/FrecciaSinistra.png")));
		PulsanteIndietro.setOpaque(false);
		PulsanteIndietro.setFocusable(false);
		PulsanteIndietro.setContentAreaFilled(false);
		PulsanteIndietro.setBorderPainted(false);
		PulsanteIndietro.setBounds(0, 0, 47, 39);
		AprileHeader.add(PulsanteIndietro);
		
		JLabel LabelAprile = new JLabel("APRILE");
		LabelAprile.setHorizontalAlignment(SwingConstants.CENTER);
		LabelAprile.setForeground(Color.WHITE);
		LabelAprile.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		LabelAprile.setBounds(0, 0, 381, 39);
		AprileHeader.add(LabelAprile);
		BodyCalendario.setLayout(new CardLayout(0, 0));
		
		MarzoGiorni = new JLayeredPane();
		
		unoM = new JButton("1");
		unoM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		unoM.setBounds(10, 0, 43, 30);
		MarzoGiorni.add(unoM);
		
		dueM = new JButton("2");
		dueM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		dueM.setBounds(63, 0, 43, 30);
		MarzoGiorni.add(dueM);
		
		treM = new JButton("3");
		treM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		treM.setBounds(116, 0, 43, 30);
		MarzoGiorni.add(treM);
		
		quattroM = new JButton("4");
		quattroM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		quattroM.setBounds(169, 0, 43, 30);
		MarzoGiorni.add(quattroM);
		
		cinqueM = new JButton("5");
		cinqueM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cinqueM.setBounds(222, 0, 43, 30);
		MarzoGiorni.add(cinqueM);
		
		seiM = new JButton("6");
		seiM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		seiM.setBounds(275, 0, 43, 30);
		MarzoGiorni.add(seiM);
		
		setteM = new JButton("7");
		setteM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		setteM.setBounds(327, 0, 43, 30);
		MarzoGiorni.add(setteM);
		
		ottoM = new JButton("8");
		ottoM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		ottoM.setBounds(10, 40, 43, 30);
		MarzoGiorni.add(ottoM);
		
		quindiciM = new JButton("15");
		quindiciM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		quindiciM.setBounds(10, 80, 43, 30);
		MarzoGiorni.add(quindiciM);
		
		ventidueM = new JButton("22");
		ventidueM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		ventidueM.setBounds(10, 120, 43, 30);
		MarzoGiorni.add(ventidueM);
		
		ventinoveM = new JButton("29");
		ventinoveM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		ventinoveM.setBounds(10, 157, 43, 30);
		MarzoGiorni.add(ventinoveM);
		
		noveM = new JButton("9");
		noveM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		noveM.setBounds(63, 40, 43, 30);
		MarzoGiorni.add(noveM);
		
		dieciM = new JButton("10");
		dieciM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		dieciM.setBounds(116, 40, 43, 30);
		MarzoGiorni.add(dieciM);
		
		undiciM = new JButton("11");
		undiciM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		undiciM.setBounds(169, 40, 43, 30);
		MarzoGiorni.add(undiciM);
		
		dodiciM = new JButton("12");
		dodiciM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		dodiciM.setBounds(222, 40, 43, 30);
		MarzoGiorni.add(dodiciM);
		
		trediciM = new JButton("13");
		trediciM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		trediciM.setBounds(275, 40, 43, 30);
		MarzoGiorni.add(trediciM);
		
		quattordiciM = new JButton("14");
		quattordiciM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		quattordiciM.setBounds(327, 40, 43, 30);
		MarzoGiorni.add(quattordiciM);
		
		sediciM = new JButton("16");
		sediciM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		sediciM.setBounds(63, 80, 43, 30);
		MarzoGiorni.add(sediciM);
		
		diciassetteM = new JButton("17");
		diciassetteM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		diciassetteM.setBounds(116, 80, 43, 30);
		MarzoGiorni.add(diciassetteM);
		
		diciottoM = new JButton("18");
		diciottoM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		diciottoM.setBounds(169, 80, 43, 30);
		MarzoGiorni.add(diciottoM);
		
		diciannoveM = new JButton("19");
		diciannoveM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		diciannoveM.setBounds(222, 80, 43, 30);
		MarzoGiorni.add(diciannoveM);
		
		ventiM = new JButton("20");
		ventiM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		ventiM.setBounds(275, 80, 43, 30);
		MarzoGiorni.add(ventiM);
		
		ventunoM = new JButton("21");
		ventunoM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		ventunoM.setBounds(327, 80, 43, 30);
		MarzoGiorni.add(ventunoM);
		
		ventitreM = new JButton("23");
		ventitreM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		ventitreM.setBounds(63, 120, 43, 30);
		MarzoGiorni.add(ventitreM);
		
		ventiquattroM = new JButton("24");
		ventiquattroM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		ventiquattroM.setBounds(116, 120, 43, 30);
		MarzoGiorni.add(ventiquattroM);
		
		venticinqueM = new JButton("25");
		venticinqueM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		venticinqueM.setBounds(169, 120, 43, 30);
		MarzoGiorni.add(venticinqueM);
		
		ventiseiM = new JButton("26");
		ventiseiM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		ventiseiM.setBounds(222, 120, 43, 30);
		MarzoGiorni.add(ventiseiM);
		
		ventisetteM = new JButton("27");
		ventisetteM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		ventisetteM.setBounds(275, 120, 43, 30);
		MarzoGiorni.add(ventisetteM);
		
		ventottoM = new JButton("28");
		ventottoM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		ventottoM.setBounds(327, 120, 43, 30);
		MarzoGiorni.add(ventottoM);
		
		trentaM = new JButton("30");
		trentaM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		trentaM.setBounds(63, 157, 43, 30);
		MarzoGiorni.add(trentaM);
		
		trentunoM = new JButton("31");
		trentunoM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		trentunoM.setBounds(116, 157, 43, 30);
		MarzoGiorni.add(trentunoM);
		BodyCalendario.add(MarzoGiorni, "name_81540142032100");
		
		AprileGiorni = new JLayeredPane();
		BodyCalendario.add(AprileGiorni, "name_81540177227900");
		
		JButton quattro_1 = new JButton("4");
		quattro_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		quattro_1.setBounds(169, 0, 43, 30);
		AprileGiorni.add(quattro_1);
		
		JButton cinque_1 = new JButton("5");
		cinque_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cinque_1.setBounds(222, 0, 43, 30);
		AprileGiorni.add(cinque_1);
		
		JButton sei_1 = new JButton("6");
		sei_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		sei_1.setBounds(275, 0, 43, 30);
		AprileGiorni.add(sei_1);
		
		JButton sette_1 = new JButton("7");
		sette_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		sette_1.setBounds(327, 0, 43, 30);
		AprileGiorni.add(sette_1);
		
		JButton otto_1 = new JButton("8");
		otto_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		otto_1.setBounds(10, 40, 43, 30);
		AprileGiorni.add(otto_1);
		
		JButton quindici_1 = new JButton("15");
		quindici_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		quindici_1.setBounds(10, 80, 43, 30);
		AprileGiorni.add(quindici_1);
		
		JButton ventidue_1 = new JButton("22");
		ventidue_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		ventidue_1.setBounds(10, 120, 43, 30);
		AprileGiorni.add(ventidue_1);
		
		JButton ventinove_1 = new JButton("29");
		ventinove_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		ventinove_1.setBounds(10, 157, 43, 30);
		AprileGiorni.add(ventinove_1);
		
		JButton nove_1 = new JButton("9");
		nove_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		nove_1.setBounds(63, 40, 43, 30);
		AprileGiorni.add(nove_1);
		
		JButton dieci_1 = new JButton("10");
		dieci_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		dieci_1.setBounds(116, 40, 43, 30);
		AprileGiorni.add(dieci_1);
		
		JButton undici_1 = new JButton("11");
		undici_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		undici_1.setBounds(169, 40, 43, 30);
		AprileGiorni.add(undici_1);
		
		JButton dodici_1 = new JButton("12");
		dodici_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		dodici_1.setBounds(222, 40, 43, 30);
		AprileGiorni.add(dodici_1);
		
		JButton tredici_1 = new JButton("13");
		tredici_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		tredici_1.setBounds(275, 40, 43, 30);
		AprileGiorni.add(tredici_1);
		
		JButton quattordci_1 = new JButton("14");
		quattordci_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		quattordci_1.setBounds(327, 40, 43, 30);
		AprileGiorni.add(quattordci_1);
		
		JButton sedici_1 = new JButton("16");
		sedici_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		sedici_1.setBounds(63, 80, 43, 30);
		AprileGiorni.add(sedici_1);
		
		JButton diciassette_1 = new JButton("17");
		diciassette_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		diciassette_1.setBounds(116, 80, 43, 30);
		AprileGiorni.add(diciassette_1);
		
		JButton diciotto_1 = new JButton("18");
		diciotto_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		diciotto_1.setBounds(169, 80, 43, 30);
		AprileGiorni.add(diciotto_1);
		
		JButton diciannove_1 = new JButton("19");
		diciannove_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		diciannove_1.setBounds(222, 80, 43, 30);
		AprileGiorni.add(diciannove_1);
		
		JButton venti_1 = new JButton("20");
		venti_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		venti_1.setBounds(275, 80, 43, 30);
		AprileGiorni.add(venti_1);
		
		JButton ventuno_1 = new JButton("21");
		ventuno_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		ventuno_1.setBounds(327, 80, 43, 30);
		AprileGiorni.add(ventuno_1);
		
		JButton ventitre_1 = new JButton("23");
		ventitre_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		ventitre_1.setBounds(63, 120, 43, 30);
		AprileGiorni.add(ventitre_1);
		
		JButton ventiquattro_1 = new JButton("24");
		ventiquattro_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		ventiquattro_1.setBounds(116, 120, 43, 30);
		AprileGiorni.add(ventiquattro_1);
		
		JButton venticinque_1 = new JButton("25");
		venticinque_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		venticinque_1.setBounds(169, 120, 43, 30);
		AprileGiorni.add(venticinque_1);
		
		JButton ventisei_1 = new JButton("26");
		ventisei_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		ventisei_1.setBounds(222, 120, 43, 30);
		AprileGiorni.add(ventisei_1);
		
		JButton ventisette_1 = new JButton("27");
		ventisette_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		ventisette_1.setBounds(275, 120, 43, 30);
		AprileGiorni.add(ventisette_1);
		
		JButton ventotto_1 = new JButton("28");
		ventotto_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		ventotto_1.setBounds(327, 120, 43, 30);
		AprileGiorni.add(ventotto_1);
		
		JButton trenta_1 = new JButton("30");
		trenta_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		trenta_1.setBounds(63, 157, 43, 30);
		AprileGiorni.add(trenta_1);
		
		JButton trentuno_1 = new JButton("31");
		trentuno_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		trentuno_1.setBounds(116, 157, 43, 30);
		AprileGiorni.add(trentuno_1);
		
		JButton trentuno_1_1 = new JButton("31");
		trentuno_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		trentuno_1_1.setBounds(169, 157, 43, 30);
		AprileGiorni.add(trentuno_1_1);
		
		JButton trentuno_1_2 = new JButton("31");
		trentuno_1_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		trentuno_1_2.setBounds(222, 157, 43, 30);
		AprileGiorni.add(trentuno_1_2);
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
		
		SelectCittà = new JComboBox<città>();
		SelectCittà.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		SelectCittà.setBounds(37, 320, 183, 21);
		SelectCittà.setModel(new DefaultComboBoxModel<città>(città.values()));
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
		
		FieldData = new JTextField();
		FieldData.setHorizontalAlignment(SwingConstants.CENTER);
		FieldData.setEditable(false);
		FieldData.setBounds(10, 32, 96, 19);
		FieldData.setColumns(10);
		
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
		BoxDestinazione.setModel(new DefaultComboBoxModel(città.values()));
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
		PannelloAggiungi.add(PulsanteReverse);
		
		LabelIDAereo = new JLabel("ID Aereo:");
		LabelIDAereo.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		LabelIDAereo.setBounds(275, 77, 81, 16);
		PannelloAggiungi.add(LabelIDAereo);
		
		JComboBox<String>BoxIDAereo = new JComboBox<String>();
		BoxIDAereo.setModel(new DefaultComboBoxModel(IDAereo.values()));
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
		PanelGate.add(PulsanteHomeGate);
		
		
		Info = new JLayeredPane();
		BodyContainer.add(Info, "name_7222503502800");
		
		
		Mappa = new JLayeredPane();
		BodyContainer.add(Mappa, "name_7278817582900");
		
		
		Compagnie = new JLayeredPane();
		BodyContainer.add(Compagnie, "name_7308097032100");
		getContentPane().setLayout(groupLayout);
		
		
	}
	
	
	// Questo metodo contiene il codice per creare eventi 
	private void createEvents() {
		
		
		//Eventi all'interno del Main
		PulsanteAereo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Volo.setVisible(true);
				Main.setVisible(false);
			}
		});
		
		PulsanteGate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gate.setVisible(true);
				Main.setVisible(false);
			}
		});
		
		PulsanteInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Info.setVisible(true);
				Main.setVisible(false);
			}
		});
		
		//Eventi all'interno del Volo
		PulsanteHomeVolo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.setVisible(true);
				Volo.setVisible(false);
				Calendario.setVisible(false);
			}
		});
		
		SelectCittà.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int selection = SelectCittà.getSelectedIndex();
				int index=0;
				for (JLabel label : labelsCittà) {
					if(index==selection)
			           label.setVisible(true);
					else label.setVisible(false);
					index++;
				}
			}
		});
		
		SelectData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calendario.setVisible(true);
			}
		});
		
		PulsanteReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ("Napoli".equals(BoxPartenza.getSelectedItem())){
					BoxDestinazione.setModel(new DefaultComboBoxModel(new String[] {"Napoli"}));
					BoxPartenza.setModel(new DefaultComboBoxModel(città.values()));
				}
				else {
					BoxPartenza.setModel(new DefaultComboBoxModel(new String[] {"Napoli"}));
					BoxDestinazione.setModel(new DefaultComboBoxModel(città.values()));
				}
			}
		});
		
		//Eventi all'interno del Gate
		PulsanteHomeGate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.setVisible(true);
				Gate.setVisible(false);
			}
		});
		
	
		//Eventi nel calendario
		PulsanteAvanti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AprileGiorni.setVisible(true);
				AprileHeader.setVisible(true);
				MarzoHeader.setVisible(false);
				MarzoGiorni.setVisible(false);
			}
		});
	
		PulsanteIndietro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MarzoHeader.setVisible(true);
				MarzoGiorni.setVisible(true);
				AprileGiorni.setVisible(false);
				AprileHeader.setVisible(false);		
			}
		});
	
		//Giorni Marzo
		unoM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("01/03/21");
				Calendario.setVisible(false);
			}
		});
	
		dueM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("02/03/21");
				Calendario.setVisible(false);
			}
		});
	
		treM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("03/03/21");
				Calendario.setVisible(false);
			}
		});
	
		quattroM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("04/03/21");
				Calendario.setVisible(false);
			}
		});
	
		cinqueM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("05/03/21");
				Calendario.setVisible(false);
			}
		});
	
		seiM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("06/03/21");
				Calendario.setVisible(false);
			}
		});
	
		setteM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("07/03/21");
				Calendario.setVisible(false);
			}
		});
	
		ottoM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("08/03/21");
				Calendario.setVisible(false);
			}
		});
	
		noveM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("09/03/21");
				Calendario.setVisible(false);
			}
		});
	
		dieciM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("10/03/21");
				Calendario.setVisible(false);
			}
		});
	
		undiciM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("11/03/21");
				Calendario.setVisible(false);
			}
		});
	
		dodiciM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("12/03/21");
				Calendario.setVisible(false);
			}
		});
	
		trediciM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("13/03/21");
				Calendario.setVisible(false);
			}
		});
	
		quattordiciM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("14/03/21");
				Calendario.setVisible(false);
			}
		});
	
		quindiciM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("15/03/21");
				Calendario.setVisible(false);
			}
		});
	
		sediciM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("16/03/21");
				Calendario.setVisible(false);
			}
		});
	
		diciassetteM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("17/03/21");
				Calendario.setVisible(false);
			}
		});
	
		diciottoM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("18/03/21");
				Calendario.setVisible(false);
			}
		});
	
		diciannoveM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("19/03/21");
				Calendario.setVisible(false);
			}
		});
	
		ventiM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("20/03/21");
				Calendario.setVisible(false);
			}
		});
	
		ventunoM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("21/03/21");
				Calendario.setVisible(false);
			}
		});
	
		ventidueM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("22/03/21");
				Calendario.setVisible(false);
			}
		});
	
		ventitreM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("23/03/21");
				Calendario.setVisible(false);
			}
		});
	
		ventiquattroM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("24/03/21");
				Calendario.setVisible(false);
			}
		});
	
		venticinqueM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("25/03/21");
				Calendario.setVisible(false);
			}
		});
	
		ventiseiM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("26/03/21");
				Calendario.setVisible(false);
			}
		});
	
		ventisetteM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("27/03/21");
				Calendario.setVisible(false);
			}
		});
	
		ventottoM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("28/03/21");
				Calendario.setVisible(false);
			}
		});
	
		ventinoveM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("29/03/21");
				Calendario.setVisible(false);
			}
		});
	
		trentaM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("30/03/21");
				Calendario.setVisible(false);
			}
		});
	
		trentunoM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldData.setText("31/03/21");
				Calendario.setVisible(false);
			}
		});
	}
}
