package apViews;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLayeredPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
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
import apCommon.*;

public class AMain extends JFrame {

	private JPanel contentPane;
	private Panel BodyContainer;
	private JLayeredPane BodyVolo;
	private JButton PulsanteAereo;
	private JLayeredPane BodyMain;
	private JButton PulsanteGate;
	private JButton PulsanteInfo;
	private JLabel ScrittaCompagnie;
	private JLabel ScrittaMappa;
	private JButton ShowCompagnie;
	private JButton ShowMappa;
	private JLabel InfoUni;
	private JLabel ImmagineFooter;
	private JLayeredPane BodyGate;
	private JLayeredPane BodyInfo;
	private JLayeredPane BodyMappa;
	private JLayeredPane BodyCompagnie;
	private JButton PulsanteHome;
	private JLabel OmbraHeaderVolo;
	private JLabel Biglietto;
	private JLabel OmbraHeaderGate;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel NumeroUno;
	private JLabel TerminalUno;
	private JLabel TerminalUno_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel NumeroUno_1;
	private JLabel TerminalUno_2;
	private JLabel TerminalUno_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JLabel NumeroUno_2;
	private JLabel TerminalUno_4;
	private JLabel TerminalUno_5;
	private JLabel lblNewLabel;

	

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

	
	//Create the frame.
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
		

		BodyMain = new JLayeredPane();
		BodyContainer.add(BodyMain, "MainPage");
		

		PulsanteInfo = new JButton("");
		PulsanteInfo.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconInfo.png")));
		PulsanteInfo.setBounds(659, 57, 85, 90);
		PulsanteInfo.setOpaque(false);
		PulsanteInfo.setFocusable(false);
		PulsanteInfo.setContentAreaFilled(false);
		PulsanteInfo.setBorderPainted(false);
		BodyMain.add(PulsanteInfo);
		
		
		PulsanteGate = new JButton("");
		PulsanteGate.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconGate.png")));
		PulsanteGate.setBounds(439, 57, 85, 90);
		PulsanteGate.setOpaque(false);
		PulsanteGate.setFocusable(false);
		PulsanteGate.setContentAreaFilled(false);
		PulsanteGate.setBorderPainted(false);
		BodyMain.add(PulsanteGate);
		
		
		PulsanteAereo = new JButton("");
		PulsanteAereo.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconAereo.png")));
		PulsanteAereo.setOpaque(false);
		PulsanteAereo.setFocusable(false);
		PulsanteAereo.setContentAreaFilled(false);
		PulsanteAereo.setBorderPainted(false);
		PulsanteAereo.setBounds(543, 57, 92, 103);
		BodyMain.add(PulsanteAereo);
		
		
		JLabel MainMenù = new JLabel("");
		MainMenù.setIcon(new ImageIcon(AMain.class.getResource("/apResources/Men\u00F9Sfere.png")));
		MainMenù.setHorizontalAlignment(SwingConstants.CENTER);
		MainMenù.setBounds(233, 10, 719, 179);
		BodyMain.add(MainMenù);
		
		
		JLabel BarraRicerca = new JLabel("");
		BarraRicerca.setIcon(new ImageIcon(AMain.class.getResource("/apResources/BarraRicerca.png")));
		BarraRicerca.setBounds(215, 199, 759, 74);
		BodyMain.add(BarraRicerca);
		
		
		ScrittaCompagnie = new JLabel("Compagnie Aeree");
		ScrittaCompagnie.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 15));
		ScrittaCompagnie.setForeground(Color.DARK_GRAY);
		ScrittaCompagnie.setHorizontalAlignment(SwingConstants.CENTER);
		ScrittaCompagnie.setBounds(1016, 38, 147, 19);
		BodyMain.add(ScrittaCompagnie);
		
		
		ScrittaMappa = new JLabel("Mappa");
		ScrittaMappa.setForeground(Color.DARK_GRAY);
		ScrittaMappa.setHorizontalAlignment(SwingConstants.CENTER);
		ScrittaMappa.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 15));
		ScrittaMappa.setBounds(76, 38, 147, 19);
		BodyMain.add(ScrittaMappa);
		
		
		ShowCompagnie = new JButton("New button");
		ShowCompagnie = new JButton("");
		ShowCompagnie.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconaCompagnie.png")));
		ShowCompagnie.setBounds(949, 10, 227, 179);
		ShowCompagnie.setOpaque(false);
		ShowCompagnie.setFocusable(false);
		ShowCompagnie.setContentAreaFilled(false);
		ShowCompagnie.setBorderPainted(false);
		BodyMain.add(ShowCompagnie);
		
		
		ShowMappa = new JButton("New button");
		ShowMappa.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconaMappa.png")));
		ShowMappa.setBounds(10, 10, 227, 179);
		ShowMappa.setOpaque(false);
		ShowMappa.setFocusable(false);
		ShowMappa.setContentAreaFilled(false);
		ShowMappa.setBorderPainted(false);
		BodyMain.add(ShowMappa);
		
		
		InfoUni = new JLabel("Universit\u00E0 degli Studi di Napoli Federico II - Corso Umberto I 40 - 80138 Napoli - Centralino +39 081 2531111 contactcenter@unina.it - C.F. 00876220633 - PEC ateneo@pec.unina.it");
		InfoUni.setHorizontalAlignment(SwingConstants.CENTER);
		InfoUni.setForeground(Color.GRAY);
		InfoUni.setFont(new Font("Tahoma", Font.PLAIN, 12));
		InfoUni.setBounds(-7, 514, 1193, 21);
		BodyMain.add(InfoUni);
		
		
		ImmagineFooter = new JLabel("");
		ImmagineFooter.setBounds(-7, 338, 1200, 197);
		ImmagineFooter.setIcon(new ImageIcon(AMain.class.getResource("/apResources/Footer.png")));
		BodyMain.add(ImmagineFooter);
		
		
		BodyVolo = new JLayeredPane();
		BodyContainer.add(BodyVolo, "VoloPage");
		
		
		PulsanteHome = new JButton("");
		PulsanteHome.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconHome.png")));
		PulsanteHome.setOpaque(false);
		PulsanteHome.setFocusable(false);
		PulsanteHome.setContentAreaFilled(false);
		PulsanteHome.setBorderPainted(false);
		PulsanteHome.setBounds(0, 0, 60, 61);
		BodyVolo.add(PulsanteHome);
		
		
		OmbraHeaderVolo = new JLabel("");
		OmbraHeaderVolo.setIcon(new ImageIcon(AMain.class.getResource("/apResources/OmbraHeader.png")));
		OmbraHeaderVolo.setBounds(0, -15, 1199, 63);
		BodyVolo.add(OmbraHeaderVolo);
		
		
		Biglietto = new JLabel("New label");
		Biglietto.setIcon(new ImageIcon(AMain.class.getResource("/apResources/BaseBiglietto.png")));
		Biglietto.setBounds(0, 64, 274, 471);
		Biglietto.setHorizontalAlignment(SwingConstants.CENTER);
		BodyVolo.add(Biglietto);
		
		
		JPanel BackgroundVolo = new JPanel();
		BackgroundVolo.setBackground(new Color(208, 215, 232));
		BackgroundVolo.setBounds(0, 0, 1193, 535);
		BodyVolo.add(BackgroundVolo);
		GroupLayout gl_BackgroundVolo = new GroupLayout(BackgroundVolo);
		gl_BackgroundVolo.setHorizontalGroup(
			gl_BackgroundVolo.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1193, Short.MAX_VALUE)
		);
		gl_BackgroundVolo.setVerticalGroup(
			gl_BackgroundVolo.createParallelGroup(Alignment.LEADING)
				.addGap(0, 535, Short.MAX_VALUE)
		);
		BackgroundVolo.setLayout(gl_BackgroundVolo);
		
		
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
		
		
		BodyGate = new JLayeredPane();
		BodyContainer.add(BodyGate, "name_7197058332500");
		OmbraHeaderVolo.setBounds(0, -15, 1199, 63);
		
		JPanel BackgroundBodyGate = new JPanel();
		BackgroundBodyGate.setBorder(null);
		BackgroundBodyGate.setBackground(new Color(208, 215, 232));
		BackgroundBodyGate.setBounds(0, 0, 1193, 535);
		BodyGate.add(BackgroundBodyGate);
		BackgroundBodyGate.setLayout(null);
		
		OmbraHeaderGate = new JLabel("");
		OmbraHeaderGate.setBounds(0, -15, 1199, 63);
		OmbraHeaderGate.setIcon(new ImageIcon(AMain.class.getResource("/apResources/OmbraHeader.png")));
		BackgroundBodyGate.add(OmbraHeaderGate);
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(Color.WHITE, 2, true));
		panel.setBackground(new Color(166, 201, 227));
		panel.setBounds(147, 69, 212, 190);
		BackgroundBodyGate.add(panel);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setForeground(Color.WHITE);
		panel_1.setBounds(10, 10, 30, 30);
		panel.add(panel_1);
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
		panel.add(TerminalUno);
		
		TerminalUno_1 = new JLabel("Terminale 1");
		TerminalUno_1.setBounds(50, 10, 162, 35);
		panel.add(TerminalUno_1);
		TerminalUno_1.setForeground(Color.WHITE);
		TerminalUno_1.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(Color.WHITE, 2, true));
		panel_2.setBackground(new Color(128, 179, 216));
		panel_2.setBounds(466, 69, 212, 190);
		BackgroundBodyGate.add(panel_2);
		
		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setForeground(Color.WHITE);
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(10, 10, 30, 30);
		panel_2.add(panel_3);
		
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
		panel_2.add(TerminalUno_2);
		
		TerminalUno_3 = new JLabel("Terminale 1");
		TerminalUno_3.setForeground(Color.WHITE);
		TerminalUno_3.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		TerminalUno_3.setBounds(50, 10, 162, 35);
		panel_2.add(TerminalUno_3);
		
		panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(Color.WHITE, 2, true));
		panel_4.setBackground(new Color(91, 155, 202));
		panel_4.setBounds(788, 69, 212, 190);
		BackgroundBodyGate.add(panel_4);
		
		panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setForeground(Color.WHITE);
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBounds(10, 10, 30, 30);
		panel_4.add(panel_5);
		
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
		panel_4.add(TerminalUno_4);
		
		TerminalUno_5 = new JLabel("Terminale 1");
		TerminalUno_5.setForeground(Color.WHITE);
		TerminalUno_5.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		TerminalUno_5.setBounds(50, 10, 162, 35);
		panel_4.add(TerminalUno_5);
		
		
		BodyInfo = new JLayeredPane();
		BodyContainer.add(BodyInfo, "name_7222503502800");
		
		
		BodyMappa = new JLayeredPane();
		BodyContainer.add(BodyMappa, "name_7278817582900");
		
		
		BodyCompagnie = new JLayeredPane();
		BodyContainer.add(BodyCompagnie, "name_7308097032100");
		getContentPane().setLayout(groupLayout);
		
		
	}
	
	
	// Questo metodo contiene il codice per creare eventi 
	private void createEvents() {
		
		//Eventi all'interno del BodyMain
		PulsanteAereo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BodyVolo.setVisible(true);
				BodyMain.setVisible(false);
			}
		});
		
		PulsanteGate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BodyVolo.setVisible(true);
				BodyGate.setVisible(false);
			}
		});
		
		PulsanteInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BodyVolo.setVisible(true);
				BodyInfo.setVisible(false);
			}
		});
		
		//Eventi all'interno del BodyVolo
		PulsanteHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BodyMain.setVisible(true);
				BodyVolo.setVisible(false);
			}
		});
	}
}
