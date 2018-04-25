import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
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
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.SystemColor;

public class PanelInfo extends JPanel {

	private SpringLayout CurrentLayOut;
	private JFrame frame;
	private Image logo;
	private JLabel Label1,
					Label2,
					Label3,
					Label4,
					Label5,
					Label6,
					Label9;
	private JTextField jtf1,
						jtf2,
						jtf3,
						jtf4,
						jtf5,
						jtf6;
	private JButton B1,
					B2,
					B3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelInfo window = new PanelInfo();
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
	public PanelInfo() {
		super();
		setBackground(Color.LIGHT_GRAY);
		
		this.setPreferredSize(new Dimension(1000,600));
		this.logo = new ImageIcon("logo.png").getImage();
		Label1 = new JLabel();
		Label1.setFont(new Font("Times New Roman", Font.BOLD, 28));
		Label1.setText("ESTADOS UNIDOS MEXICANOS");
		Label2 = new JLabel();
		Label2.setFont(new Font("Arial", Font.PLAIN, 20));
		Label2.setText("Apellidos/Surname/Nom");
		Label3 = new JLabel();
		Label3.setText("Nombres/Given names/Pr\u00E9noms");
		Label3.setFont(new Font("Arial", Font.PLAIN, 20));
		Label4 = new JLabel();
		Label4.setFont(new Font("Arial", Font.PLAIN, 20));
		Label4.setText("Nacionalidad/Nacionality/Nationalit\u00E9");
		Label5 = new JLabel();
		Label5.setText("Fecha de Nacimiento/Date of birth/\r\nDate de naissance\r\n");
		Label5.setToolTipText("");
		Label5.setFont(new Font("Arial", Font.PLAIN, 20));
		Label6 = new JLabel();
		Label6.setFont(new Font("Arial", Font.PLAIN, 20));
		Label6.setText("Lugar de Nacimiento/Place of birth/Lieu de naissance");
		Label9 = new JLabel();
		Label9.setFont(new Font("Arial", Font.PLAIN, 20));
		Label9.setText("Autoridad/Authority/Autorit\u00E9");
		jtf1 = new JTextField();
		jtf1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		jtf2 = new JTextField();
		jtf2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		jtf3 = new JTextField();
		jtf3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		jtf4 = new JTextField();
		jtf4.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		jtf5 = new JTextField();
		jtf5.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		jtf6 = new JTextField();
		B1 = new JButton();
		B1.setFont(new Font("Arial", Font.PLAIN, 20));
		B1.setText("Atr\u00E1s");
		B2 = new JButton();
		B2.setText("Adelante");
		B2.setFont(new Font("Arial", Font.PLAIN, 20));
		B3 = new JButton();
		B3.setFont(new Font("Arial", Font.PLAIN, 20));
		B3.setText("Salir");
		CurrentLayOut = new SpringLayout();
		CurrentLayOut.putConstraint(SpringLayout.NORTH, B3, 0, SpringLayout.NORTH, B1);
		CurrentLayOut.putConstraint(SpringLayout.WEST, B3, 53, SpringLayout.EAST, B2);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, B2, 0, SpringLayout.NORTH, B1);
		CurrentLayOut.putConstraint(SpringLayout.WEST, B2, 46, SpringLayout.EAST, B1);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, B1, -10, SpringLayout.SOUTH, this);
		CurrentLayOut.putConstraint(SpringLayout.EAST, B1, -364, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, jtf5, 23, SpringLayout.SOUTH, Label6);
		CurrentLayOut.putConstraint(SpringLayout.WEST, jtf5, 303, SpringLayout.WEST, Label2);
		CurrentLayOut.putConstraint(SpringLayout.EAST, jtf5, 0, SpringLayout.EAST, Label5);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, jtf4, 23, SpringLayout.SOUTH, Label5);
		CurrentLayOut.putConstraint(SpringLayout.WEST, jtf4, 0, SpringLayout.WEST, Label2);
		CurrentLayOut.putConstraint(SpringLayout.EAST, jtf4, 165, SpringLayout.WEST, Label2);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, jtf3, 0, SpringLayout.NORTH, jtf1);
		CurrentLayOut.putConstraint(SpringLayout.WEST, jtf3, 0, SpringLayout.WEST, Label4);
		CurrentLayOut.putConstraint(SpringLayout.EAST, jtf3, 0, SpringLayout.EAST, Label4);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, jtf2, 0, SpringLayout.NORTH, jtf1);
		CurrentLayOut.putConstraint(SpringLayout.WEST, jtf2, 0, SpringLayout.WEST, Label1);
		CurrentLayOut.putConstraint(SpringLayout.EAST, jtf2, 0, SpringLayout.EAST, Label3);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, jtf1, 26, SpringLayout.SOUTH, Label2);
		CurrentLayOut.putConstraint(SpringLayout.WEST, jtf1, 0, SpringLayout.WEST, Label2);
		CurrentLayOut.putConstraint(SpringLayout.EAST, jtf1, 0, SpringLayout.EAST, Label2);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label5, 0, SpringLayout.WEST, Label2);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, Label5, -108, SpringLayout.NORTH, Label6);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label6, 0, SpringLayout.WEST, Label2);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, Label6, -105, SpringLayout.NORTH, Label9);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label9, 36, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, Label9, -77, SpringLayout.SOUTH, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label1, 26, SpringLayout.NORTH, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label1, 0, SpringLayout.WEST, Label3);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label3, 55, SpringLayout.EAST, Label2);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label4, 0, SpringLayout.NORTH, Label2);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label4, 44, SpringLayout.EAST, Label3);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label3, 0, SpringLayout.NORTH, Label2);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label2, 36, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label2, 93, SpringLayout.NORTH, this);
		
		initialize();
		setUpPanel();
		repaint();
	}

	private void setUpPanel() {
		// TODO Auto-generated method stub
		this.setLayout(CurrentLayOut);
		this.add(Label1);
		this.add(Label2);
		this.add(Label3);
		this.add(Label4);
		this.add(Label5);
		this.add(Label6);
		this.add(Label9);
		this.add(jtf1);
		this.add(jtf2);
		this.add(jtf3);
		this.add(jtf4);
		this.add(jtf5);
		this.add(jtf6);
		this.add(B1);
		this.add(B2);
		this.add(B3);
		
		JComboBox comboBox = new JComboBox();
		CurrentLayOut.putConstraint(SpringLayout.NORTH, comboBox, 0, SpringLayout.NORTH, jtf4);
		CurrentLayOut.putConstraint(SpringLayout.WEST, comboBox, 222, SpringLayout.EAST, jtf4);
		CurrentLayOut.putConstraint(SpringLayout.EAST, comboBox, 0, SpringLayout.EAST, Label5);
		comboBox.setMaximumRowCount(12);
		comboBox.setToolTipText("1\r\n2\r\n3\r\n4\r\n5\r\n6\r\n7\r\n8\r\n9\r\n10\r\n11\r\n12");
		comboBox.setFont(new Font("Arial", Font.PLAIN, 20));
		add(comboBox);
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
		g.drawImage(this.logo,0,0,this.getWidth(),this.getHeight(),this);
		
	}
}
