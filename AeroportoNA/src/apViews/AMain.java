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
import apCommon.Tratta.città;

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
		
		initComponents();
		createEvents();
		
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
		PulsanteInfo.setBounds(659, 57, 85, 90);
		PulsanteInfo.setOpaque(false);
		PulsanteInfo.setFocusable(false);
		PulsanteInfo.setContentAreaFilled(false);
		PulsanteInfo.setBorderPainted(false);
		Main.add(PulsanteInfo);
		
		
		PulsanteGate = new JButton("");
		PulsanteGate.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconGate.png")));
		PulsanteGate.setBounds(439, 57, 85, 90);
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
		PulsanteAereo.setBounds(543, 57, 92, 103);
		Main.add(PulsanteAereo);
		
		
		JLabel MainMenù = new JLabel("");
		MainMenù.setIcon(new ImageIcon(AMain.class.getResource("/apResources/Men\u00F9Sfere.png")));
		MainMenù.setHorizontalAlignment(SwingConstants.CENTER);
		MainMenù.setBounds(233, 10, 719, 179);
		Main.add(MainMenù);
		
		
		JLabel BarraRicerca = new JLabel("");
		BarraRicerca.setIcon(new ImageIcon(AMain.class.getResource("/apResources/BarraRicerca.png")));
		BarraRicerca.setBounds(215, 199, 759, 74);
		Main.add(BarraRicerca);
		
		
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
		
		JPanel ImmCittà = new JPanel();
		ImmCittà.setBounds(37, 378, 183, 109);
		PanelVolo.add(ImmCittà);
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
		
		JLabel[] labelsCittà=new JLabel[]{ImmAmsterdam, ImmAtene, ImmBarcellona, ImmBerlino, ImmBruxelles, ImmCagliari, ImmCatania, ImmCracovia,
											ImmDubai, ImmGenova, ImmLiverpool, ImmLondra, ImmTorino, ImmTrieste, ImmVenezia, ImmVerona};
		
		JComboBox<Tratta.città> SelectCittà = new JComboBox<Tratta.città>();
		SelectCittà.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
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
		tabbedPane.setBounds(317, 72, 836, 117);
		PanelVolo.add(tabbedPane);
		
		JPanel PannelloAggiungi = new JPanel();
		tabbedPane.addTab("Aggiungi", null, PannelloAggiungi, null);
		
		JLabel lblNewLabel_1 = new JLabel("Data e ora di ingresso");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 10, 195, 16);
		lblNewLabel_1.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(116, 32, 89, 19);
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"00:00", "00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "23:59"}));
		
		JButton SelectData = new JButton("Sleziona Data");
		SelectData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		SelectData.setBounds(10, 57, 96, 21);
		
		JInternalFrame Calendario = new JInternalFrame("Calendario");
		Calendario.setClosable(true);
		Calendario.setBounds(315, 208, 393, 317);
		PanelVolo.add(Calendario);
		
		Panel HeaderCalendario = new Panel();
		HeaderCalendario.setBackground(new Color(13, 62, 117));
		
		JPanel BodyCalendario = new JPanel();
		GroupLayout groupLayout_1 = new GroupLayout(Calendario.getContentPane());
		groupLayout_1.setHorizontalGroup(
			groupLayout_1.createParallelGroup(Alignment.LEADING)
				.addComponent(HeaderCalendario, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(BodyCalendario, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		groupLayout_1.setVerticalGroup(
			groupLayout_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout_1.createSequentialGroup()
					.addComponent(HeaderCalendario, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(BodyCalendario, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE))
		);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		GroupLayout gl_HeaderCalendario = new GroupLayout(HeaderCalendario);
		gl_HeaderCalendario.setHorizontalGroup(
			gl_HeaderCalendario.createParallelGroup(Alignment.LEADING)
				.addComponent(layeredPane_1, GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
		);
		gl_HeaderCalendario.setVerticalGroup(
			gl_HeaderCalendario.createParallelGroup(Alignment.LEADING)
				.addComponent(layeredPane_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
		);
		
		Label Marzo = new Label("Marzo");
		Marzo.setForeground(Color.WHITE);
		Marzo.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 22));
		Marzo.setAlignment(Label.CENTER);
		Marzo.setBounds(0, 0, 381, 44);
		layeredPane_1.add(Marzo);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 46, 381, 30);
		layeredPane_1.add(panel_6);
		
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
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGap(0, 381, Short.MAX_VALUE)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addContainerGap()
					.addComponent(Lunedì, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(Martedì, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(Mercoledì, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(Giovedì, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(Venerdì, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(Sabato, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(Domenica, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGap(0, 30, Short.MAX_VALUE)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
						.addComponent(Lunedì, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
						.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
							.addComponent(Sabato, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addComponent(Domenica, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addComponent(Venerdì, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(Giovedì, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(Mercoledì, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(Martedì, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_6.setLayout(gl_panel_6);
		HeaderCalendario.setLayout(gl_HeaderCalendario);
		
		JLayeredPane MarzoGiorni = new JLayeredPane();
		
		JButton uno = new JButton("1");
		uno.setFont(new Font("Tahoma", Font.PLAIN, 10));
		uno.setBounds(10, 0, 43, 30);
		MarzoGiorni.add(uno);
		
		JButton due = new JButton("2");
		due.setFont(new Font("Tahoma", Font.PLAIN, 10));
		due.setBounds(63, 0, 43, 30);
		MarzoGiorni.add(due);
		
		JButton tre = new JButton("3");
		tre.setFont(new Font("Tahoma", Font.PLAIN, 10));
		tre.setBounds(116, 0, 43, 30);
		MarzoGiorni.add(tre);
		
		JButton dieci_31_2 = new JButton("4");
		dieci_31_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		dieci_31_2.setBounds(169, 0, 43, 30);
		MarzoGiorni.add(dieci_31_2);
		
		JButton dieci_31_3 = new JButton("5");
		dieci_31_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		dieci_31_3.setBounds(222, 0, 43, 30);
		MarzoGiorni.add(dieci_31_3);
		
		JButton dieci_31_4 = new JButton("6");
		dieci_31_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		dieci_31_4.setBounds(275, 0, 43, 30);
		MarzoGiorni.add(dieci_31_4);
		
		JButton dieci_31_5 = new JButton("7");
		dieci_31_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		dieci_31_5.setBounds(327, 0, 43, 30);
		MarzoGiorni.add(dieci_31_5);
		
		JButton uno_1 = new JButton("8");
		uno_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		uno_1.setBounds(10, 40, 43, 30);
		MarzoGiorni.add(uno_1);
		
		JButton uno_2 = new JButton("15");
		uno_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		uno_2.setBounds(10, 80, 43, 30);
		MarzoGiorni.add(uno_2);
		
		JButton uno_3 = new JButton("22");
		uno_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		uno_3.setBounds(10, 120, 43, 30);
		MarzoGiorni.add(uno_3);
		
		JButton uno_4 = new JButton("29");
		uno_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		uno_4.setBounds(10, 157, 43, 30);
		MarzoGiorni.add(uno_4);
		
		JButton uno_5 = new JButton("9");
		uno_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		uno_5.setBounds(63, 40, 43, 30);
		MarzoGiorni.add(uno_5);
		
		JButton uno_6 = new JButton("10");
		uno_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		uno_6.setBounds(116, 40, 43, 30);
		MarzoGiorni.add(uno_6);
		
		JButton uno_7 = new JButton("11");
		uno_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		uno_7.setBounds(169, 40, 43, 30);
		MarzoGiorni.add(uno_7);
		
		JButton uno_8 = new JButton("12");
		uno_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		uno_8.setBounds(222, 40, 43, 30);
		MarzoGiorni.add(uno_8);
		
		JButton uno_9 = new JButton("13");
		uno_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		uno_9.setBounds(275, 40, 43, 30);
		MarzoGiorni.add(uno_9);
		
		JButton uno_10 = new JButton("14");
		uno_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		uno_10.setBounds(327, 40, 43, 30);
		MarzoGiorni.add(uno_10);
		
		JButton uno_11 = new JButton("16");
		uno_11.setFont(new Font("Tahoma", Font.PLAIN, 10));
		uno_11.setBounds(63, 80, 43, 30);
		MarzoGiorni.add(uno_11);
		
		JButton uno_12 = new JButton("17");
		uno_12.setFont(new Font("Tahoma", Font.PLAIN, 10));
		uno_12.setBounds(116, 80, 43, 30);
		MarzoGiorni.add(uno_12);
		
		JButton uno_13 = new JButton("18");
		uno_13.setFont(new Font("Tahoma", Font.PLAIN, 10));
		uno_13.setBounds(169, 80, 43, 30);
		MarzoGiorni.add(uno_13);
		
		JButton uno_14 = new JButton("19");
		uno_14.setFont(new Font("Tahoma", Font.PLAIN, 10));
		uno_14.setBounds(222, 80, 43, 30);
		MarzoGiorni.add(uno_14);
		
		JButton uno_15 = new JButton("20");
		uno_15.setFont(new Font("Tahoma", Font.PLAIN, 10));
		uno_15.setBounds(275, 80, 43, 30);
		MarzoGiorni.add(uno_15);
		
		JButton uno_16 = new JButton("21");
		uno_16.setFont(new Font("Tahoma", Font.PLAIN, 10));
		uno_16.setBounds(327, 80, 43, 30);
		MarzoGiorni.add(uno_16);
		
		JButton uno_17 = new JButton("23");
		uno_17.setFont(new Font("Tahoma", Font.PLAIN, 10));
		uno_17.setBounds(63, 120, 43, 30);
		MarzoGiorni.add(uno_17);
		
		JButton uno_18 = new JButton("24");
		uno_18.setFont(new Font("Tahoma", Font.PLAIN, 10));
		uno_18.setBounds(116, 120, 43, 30);
		MarzoGiorni.add(uno_18);
		
		JButton uno_19 = new JButton("25");
		uno_19.setFont(new Font("Tahoma", Font.PLAIN, 10));
		uno_19.setBounds(169, 120, 43, 30);
		MarzoGiorni.add(uno_19);
		
		JButton uno_20 = new JButton("26");
		uno_20.setFont(new Font("Tahoma", Font.PLAIN, 10));
		uno_20.setBounds(222, 120, 43, 30);
		MarzoGiorni.add(uno_20);
		
		JButton uno_21 = new JButton("27");
		uno_21.setFont(new Font("Tahoma", Font.PLAIN, 10));
		uno_21.setBounds(275, 120, 43, 30);
		MarzoGiorni.add(uno_21);
		
		JButton uno_22 = new JButton("28");
		uno_22.setFont(new Font("Tahoma", Font.PLAIN, 10));
		uno_22.setBounds(327, 120, 43, 30);
		MarzoGiorni.add(uno_22);
		
		JButton uno_23 = new JButton("30");
		uno_23.setFont(new Font("Tahoma", Font.PLAIN, 10));
		uno_23.setBounds(63, 157, 43, 30);
		MarzoGiorni.add(uno_23);
		
		JButton uno_24 = new JButton("31");
		uno_24.setFont(new Font("Tahoma", Font.PLAIN, 10));
		uno_24.setBounds(116, 157, 43, 30);
		MarzoGiorni.add(uno_24);
		GroupLayout gl_BodyCalendario = new GroupLayout(BodyCalendario);
		gl_BodyCalendario.setHorizontalGroup(
			gl_BodyCalendario.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_BodyCalendario.createSequentialGroup()
					.addComponent(MarzoGiorni, GroupLayout.PREFERRED_SIZE, 381, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_BodyCalendario.setVerticalGroup(
			gl_BodyCalendario.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_BodyCalendario.createSequentialGroup()
					.addContainerGap()
					.addComponent(MarzoGiorni, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		BodyCalendario.setLayout(gl_BodyCalendario);
		Calendario.getContentPane().setLayout(groupLayout_1);
		Calendario.setVisible(true);
		Calendario.moveToFront();
		
		JTextField FieldData = new JTextField();
		FieldData.setBounds(10, 32, 96, 19);
		FieldData.setEditable(false);
		FieldData.setColumns(10);
		
		PannelloAggiungi.setLayout(null);
		PannelloAggiungi.add(lblNewLabel_1);
		PannelloAggiungi.add(SelectData);
		PannelloAggiungi.add(FieldData);
		PannelloAggiungi.add(comboBox);
		
		PannelloRimuovi = new JPanel();
		tabbedPane.addTab("Rimuovi", null, PannelloRimuovi, null);
		
		PannelloRischedula = new JPanel();
		tabbedPane.addTab("Rischedula", null, PannelloRischedula, null);
		
		
		
		
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
				
			}
		});
		
		//Eventi all'interno del Gate
		PulsanteHomeGate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.setVisible(true);
				Gate.setVisible(false);
			}
		});
		
	}
}
