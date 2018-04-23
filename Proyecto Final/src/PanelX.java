import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SpringLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.Canvas;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class PanelX extends JPanel {

	private SpringLayout CurrentLayOut;
	private JFrame frame;
	private Image Pas;
	private JButton BotonFoto;
	private JLabel Label1,
					Label2,
					Label3,
					Label4,
					Label5;
	private JTextArea JTA1,
						JTA2,
						JTA3,
						JTA4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelX window = new PanelX();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PanelX() {
		super();
		
		this.setPreferredSize(new Dimension(1000,600));
		
	
		
		this.Pas = new ImageIcon("pasaporte.jpg").getImage();
		BotonFoto = new JButton(); 
		Label1 = new JLabel();
		Label1.setFont(new Font("Times New Roman", Font.BOLD, 28));
		Label1.setText("ESTADOS UNIDOS MEXICANOS");
		Label2 = new JLabel();
		Label2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		Label2.setText("Apellidos/Surname/Nom");
		Label3 = new JLabel();
		Label3.setText("Nombres/Given names/Pr\u00E9noms");
		Label3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		Label4 = new JLabel();
		Label4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		Label4.setText("Nacionalidad/Nacionality/Nationalit\u00E9");
		JTA1 = new JTextArea();
		JTA1.setEnabled(false);
		JTA1.setEditable(false);
		JTA1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		JTA1.setWrapStyleWord(true);
		JTA1.setToolTipText("");
		JTA1.setText(" PASAPORTE\r\n PASSPORT \r\n PASSEPORT");
		JTA2 = new JTextArea();
		JTA2.setEnabled(false);
		JTA2.setEditable(false);
		JTA2.setText("Tipo/Type/\r\nCategorie");
		JTA2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		JTA3 = new JTextArea();
		JTA3.setEditable(false);
		JTA3.setEnabled(false);
		JTA3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		JTA3.setText("Clave del pa\u00EDs de expedici\u00F3n/Cod of issuing \r\nState/Code du pays \u00E9metteur");
		JTA4 = new JTextArea();
		JTA4.setEnabled(false);
		JTA4.setEditable(false);
		JTA4.setText("Pasaporte No./Passport No./No. du Passeport");
		JTA4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		CurrentLayOut = new SpringLayout();
		
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label4, 32, SpringLayout.SOUTH, Label3);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label4, 0, SpringLayout.WEST, Label1);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label3, 90, SpringLayout.SOUTH, Label2);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label3, 0, SpringLayout.WEST, Label1);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label2, 17, SpringLayout.SOUTH, JTA2);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label2, 301, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, JTA4, 0, SpringLayout.NORTH, JTA1);
		CurrentLayOut.putConstraint(SpringLayout.EAST, JTA4, -24, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, JTA3, 0, SpringLayout.NORTH, JTA1);
		CurrentLayOut.putConstraint(SpringLayout.WEST, JTA3, 74, SpringLayout.EAST, JTA2);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label1, 10, SpringLayout.NORTH, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label1, 0, SpringLayout.WEST, JTA2);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, JTA2, 0, SpringLayout.NORTH, JTA1);
		CurrentLayOut.putConstraint(SpringLayout.WEST, JTA2, 122, SpringLayout.EAST, JTA1);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, BotonFoto, 30, SpringLayout.SOUTH, JTA1);
		CurrentLayOut.putConstraint(SpringLayout.WEST, BotonFoto, 22, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, BotonFoto, -167, SpringLayout.SOUTH, this);
		CurrentLayOut.putConstraint(SpringLayout.EAST, BotonFoto, 232, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, JTA1, -477, SpringLayout.SOUTH, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, JTA1, 98, SpringLayout.WEST, this);
		initialize();
		setUpPanel();
		repaint();
	}

	private void setUpPanel() {
		// TODO Auto-generated method stub
		this.setLayout(CurrentLayOut);
		this.add(BotonFoto);
		this.add(Label1);
		this.add(JTA1);
		this.add(JTA2);
		this.add(JTA3);
		this.add(JTA4);
		this.add(Label2);
		this.add(Label3);
		this.add(Label4);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
	}

	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		g.drawImage(this.Pas,0,0,this.getWidth(),this.getHeight(),this);
	}
}
