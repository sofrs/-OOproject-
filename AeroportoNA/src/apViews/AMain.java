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

public class AMain extends JFrame {

	private JPanel contentPane;
	private Panel BodyContainer;
	private JLayeredPane BodyVolo;
	private JButton PulsanteAereo;
	private JLayeredPane BodyMain;
	private JPanel BarraRicerca;

	
	/**
	 * Launch the application.
	 */
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

	
	/**
	 * Create the frame.
	 */
	public AMain() {
		
		initComponents();
		createEvents();
		
	}
	
	
	//Questo metodo contiene il codice per creare e inizializzare componenti 
	private void initComponents() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 750);
		setResizable(false);
		getContentPane().setBackground(new Color(13, 62, 117));
		JPanel Header = new JPanel();
		Header.setBackground(new Color(13, 62, 117));
		
		JLabel ImmagineHeader = new JLabel("");
		ImmagineHeader.setIcon(new ImageIcon(AMain.class.getResource("/apResources/HeaderNapoliFull.png")));
		GroupLayout gl_Header = new GroupLayout(Header);
		gl_Header.setHorizontalGroup(
			gl_Header.createParallelGroup(Alignment.LEADING)
				.addComponent(ImmagineHeader, GroupLayout.PREFERRED_SIZE, 1186, Short.MAX_VALUE)
		);
		gl_Header.setVerticalGroup(
			gl_Header.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Header.createSequentialGroup()
					.addComponent(ImmagineHeader)
					.addContainerGap(168, Short.MAX_VALUE))
		);
		Header.setLayout(gl_Header);
		
		BodyContainer = new Panel();
		BodyContainer.setLayout(new CardLayout());
		
		BodyMain = new JLayeredPane();
		BodyContainer.add(BodyMain, "MainPage");
		
		PulsanteAereo = new JButton("");
		PulsanteAereo.setIcon(new ImageIcon(AMain.class.getResource("/apResources/IconPulsanteAereo2.png")));
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
		
		JPanel panel = new JPanel();
		panel.setBounds(945, 10, 214, 412);
		BodyMain.add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		BarraRicerca = new JPanel();
		BarraRicerca.setBackground(new Color(0, 153, 255));
		BarraRicerca.setForeground(new Color(0, 51, 255));
		BarraRicerca.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
		BarraRicerca.setBounds(266, 200, 660, 45);
		
		BodyMain.add(BarraRicerca);
		
		BodyVolo = new JLayeredPane();
		BodyContainer.add(BodyVolo, "VoloPage");
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
		getContentPane().setLayout(groupLayout);
			
	}
	
	
	// Questo metodo contiene il codice per creare eventi 
	private void createEvents() {
		
		PulsanteAereo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BodyVolo.setVisible(true);
				BodyMain.setVisible(false);
			}
		});
		
	}
}

