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
import javax.swing.JRadioButton;

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
					Label7,
					Label8,
					Label9,
					Label10,
					Label11,
					Label12,
					Label13,
					Label14,
					Label15,
					Label16;
	private JTextField jtf1,
						jtf2,
						jtf3,
						jtf4,
						jtf6,
						jtf7,
						jtf8;
	private JButton B1,
					B2,
					B3;
	private JComboBox comboBox_1;

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
		setBackground(Color.WHITE);
		
		this.setPreferredSize(new Dimension(1000,600));
		this.logo = new ImageIcon("logo.png").getImage();
		Label1 = new JLabel();
		Label1.setFont(new Font("Tahoma", Font.BOLD, 28));
		Label1.setText("DATOS PERSONALES");
		Label2 = new JLabel();
		Label2.setFont(new Font("Arial", Font.BOLD, 20));
		Label2.setText("Apellido Paterno");
		Label3 = new JLabel();
		Label3.setText("Nombre(s)");
		Label3.setFont(new Font("Arial", Font.BOLD, 20));
		Label4 = new JLabel();
		Label4.setFont(new Font("Arial", Font.BOLD, 20));
		Label4.setText("Nacionalidad");
		Label5 = new JLabel();
		Label5.setText("Fecha de Nacimiento\r\n");
		Label5.setToolTipText("");
		Label5.setFont(new Font("Arial", Font.BOLD, 20));
		Label6 = new JLabel();
		Label6.setFont(new Font("Arial", Font.BOLD, 20));
		Label6.setText("Lugar de Nacimiento");
		Label7 = new JLabel();
		Label7.setIcon(new ImageIcon("C:\\Users\\yo_da\\Desktop\\ff.png"));
		Label8 = new JLabel();
		Label8.setText("Autoridadsita");
		Label8.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		Label9 = new JLabel();
		Label9.setFont(new Font("Arial", Font.BOLD, 20));
		Label9.setText("Autoridad");
		Label10 = new JLabel();
		Label10.setFont(new Font("Arial", Font.BOLD, 20));
		Label10.setText("Ciudad");
		Label11 = new JLabel();
		Label11.setText("Estado");
		Label11.setFont(new Font("Arial", Font.BOLD, 20));
		Label12 = new JLabel();
		Label12.setFont(new Font("Arial", Font.BOLD, 20));
		Label12.setText("D\u00EDa");
		Label13 = new JLabel();
		Label13.setText("Mes");
		Label13.setFont(new Font("Arial", Font.BOLD, 20));
		Label14 = new JLabel();
		Label14.setFont(new Font("Arial", Font.BOLD, 20));
		Label14.setText("A\u00F1o");
		Label15 = new JLabel();
		Label15.setFont(new Font("Arial", Font.BOLD, 20));
		Label15.setText("Apellido Materno");
		Label16 = new JLabel();
		Label16.setFont(new Font("Arial", Font.BOLD, 20));
		Label16.setText("Sexo");
		jtf1 = new JTextField();
		jtf1.setFont(new Font("Arial", Font.PLAIN, 20));
		jtf2 = new JTextField();
		jtf2.setFont(new Font("Arial", Font.PLAIN, 20));
		jtf3 = new JTextField();
		jtf3.setFont(new Font("Arial", Font.PLAIN, 20));
		jtf4 = new JTextField();
		jtf4.setFont(new Font("Arial", Font.PLAIN, 20));
		jtf6 = new JTextField();
		jtf6.setFont(new Font("Arial", Font.PLAIN, 20));
		jtf7 = new JTextField();
		jtf7.setFont(new Font("Arial", Font.PLAIN, 20));
		jtf8 = new JTextField();
		jtf8.setFont(new Font("Arial", Font.PLAIN, 20));
		B1 = new JButton();
		B1.setFont(new Font("Arial", Font.PLAIN, 20));
		B1.setText("ATR\u00C1S");
		B2 = new JButton();
		B2.setText("SIGUIENTE");
		B2.setFont(new Font("Arial", Font.PLAIN, 20));
		B3 = new JButton();
		B3.setFont(new Font("Arial", Font.PLAIN, 20));
		B3.setText("SALIR");
		CurrentLayOut = new SpringLayout();
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label1, 10, SpringLayout.NORTH, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label1, 331, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label7, 70, SpringLayout.NORTH, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label7, 81, SpringLayout.EAST, jtf2);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, Label7, -63, SpringLayout.NORTH, Label16);
		CurrentLayOut.putConstraint(SpringLayout.EAST, Label7, -39, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, jtf8, 0, SpringLayout.NORTH, jtf1);
		CurrentLayOut.putConstraint(SpringLayout.WEST, jtf8, 0, SpringLayout.WEST, Label15);
		CurrentLayOut.putConstraint(SpringLayout.EAST, jtf8, 0, SpringLayout.EAST, jtf2);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label5, 6, SpringLayout.SOUTH, jtf1);
		CurrentLayOut.putConstraint(SpringLayout.EAST, jtf1, 87, SpringLayout.EAST, Label2);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label15, 0, SpringLayout.NORTH, Label2);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label15, 114, SpringLayout.EAST, Label2);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, Label3, -8, SpringLayout.NORTH, jtf2);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label2, 16, SpringLayout.SOUTH, jtf2);
		CurrentLayOut.putConstraint(SpringLayout.EAST, jtf2, 0, SpringLayout.EAST, jtf7);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label16, 0, SpringLayout.NORTH, Label12);
		CurrentLayOut.putConstraint(SpringLayout.EAST, Label16, -280, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label12, 22, SpringLayout.SOUTH, Label5);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label14, 0, SpringLayout.NORTH, Label12);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label14, 0, SpringLayout.WEST, jtf4);
		CurrentLayOut.putConstraint(SpringLayout.EAST, jtf4, -488, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label13, 0, SpringLayout.NORTH, Label12);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label12, 0, SpringLayout.WEST, Label2);
		CurrentLayOut.putConstraint(SpringLayout.EAST, Label5, 0, SpringLayout.EAST, Label6);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, jtf2, 99, SpringLayout.NORTH, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, jtf1, 6, SpringLayout.SOUTH, Label2);
		CurrentLayOut.putConstraint(SpringLayout.WEST, jtf1, 36, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label2, 0, SpringLayout.WEST, Label3);
		CurrentLayOut.putConstraint(SpringLayout.WEST, jtf2, 0, SpringLayout.WEST, Label3);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label3, 0, SpringLayout.WEST, Label6);
		CurrentLayOut.putConstraint(SpringLayout.WEST, jtf6, 36, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.EAST, jtf6, -50, SpringLayout.WEST, jtf7);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label10, 36, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label8, 36, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label6, 36, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, jtf3, 1, SpringLayout.NORTH, jtf6);
		CurrentLayOut.putConstraint(SpringLayout.WEST, jtf3, 0, SpringLayout.WEST, Label4);
		CurrentLayOut.putConstraint(SpringLayout.EAST, jtf3, -168, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label4, 0, SpringLayout.NORTH, Label10);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label4, 0, SpringLayout.WEST, B1);
		CurrentLayOut.putConstraint(SpringLayout.EAST, Label11, -645, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, jtf7, 1, SpringLayout.NORTH, jtf6);
		CurrentLayOut.putConstraint(SpringLayout.WEST, jtf7, 0, SpringLayout.WEST, Label11);
		CurrentLayOut.putConstraint(SpringLayout.EAST, jtf7, -469, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label11, 0, SpringLayout.NORTH, Label10);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, jtf6, 16, SpringLayout.SOUTH, Label10);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, jtf6, -17, SpringLayout.NORTH, Label9);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label10, 15, SpringLayout.SOUTH, Label6);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, B2, -10, SpringLayout.SOUTH, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, B1, 0, SpringLayout.NORTH, B2);
		CurrentLayOut.putConstraint(SpringLayout.EAST, B1, -27, SpringLayout.WEST, B2);
		CurrentLayOut.putConstraint(SpringLayout.EAST, B2, -28, SpringLayout.WEST, B3);
		CurrentLayOut.putConstraint(SpringLayout.WEST, B3, 870, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, B3, -10, SpringLayout.SOUTH, this);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, Label8, -19, SpringLayout.SOUTH, this);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, Label6, -105, SpringLayout.NORTH, Label9);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label9, 36, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, Label9, -77, SpringLayout.SOUTH, this);
		
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
		this.add(Label7);
		this.add(Label8);
		this.add(Label9);
		this.add(Label10);
		this.add(Label11);
		this.add(Label12);
		this.add(Label13);
		this.add(Label14);
		this.add(Label15);
		this.add(Label16);
		this.add(jtf1);
		this.add(jtf2);
		this.add(jtf3);
		this.add(jtf4);
		this.add(jtf6);
		this.add(jtf7);
		this.add(jtf8);
		this.add(B1);
		this.add(B2);
		this.add(B3);
		
		JComboBox comboBox = new JComboBox();
		CurrentLayOut.putConstraint(SpringLayout.NORTH, comboBox, 20, SpringLayout.SOUTH, Label12);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, jtf4, 0, SpringLayout.NORTH, comboBox);
		CurrentLayOut.putConstraint(SpringLayout.WEST, comboBox, 36, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.EAST, comboBox, -883, SpringLayout.EAST, this);
		comboBox.setMaximumRowCount(12);
		comboBox.setToolTipText("1\r\n2\r\n3\r\n4\r\n5\r\n6\r\n7\r\n8\r\n9\r\n10\r\n11\r\n12");
		comboBox.setFont(new Font("Arial", Font.PLAIN, 20));
		add(comboBox);
		
		comboBox_1 = new JComboBox();
		CurrentLayOut.putConstraint(SpringLayout.WEST, comboBox_1, 30, SpringLayout.EAST, comboBox);
		CurrentLayOut.putConstraint(SpringLayout.EAST, comboBox_1, -703, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, jtf4, 31, SpringLayout.EAST, comboBox_1);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label13, 0, SpringLayout.WEST, comboBox_1);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, comboBox_1, 0, SpringLayout.NORTH, comboBox);
		comboBox_1.setMaximumRowCount(12);
		comboBox_1.setToolTipText("Enero\r\nFebrero\r\nMarzo\r\nAbril\r\nMayo\r\nJunio\r\nJulio\r\nAgosto\r\nSeptiembre\r\nSeptiembre\r\nOctubre\r\nNoviembre\r\nDiciembre\r\nSeptiembre\r\nOctubre\r\nNoviembre\r\nDiciembre");
		comboBox_1.setFont(new Font("Arial", Font.PLAIN, 20));
		add(comboBox_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("M");
		CurrentLayOut.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton, -1, SpringLayout.NORTH, jtf4);
		CurrentLayOut.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton, 0, SpringLayout.WEST, Label16);
		rdbtnNewRadioButton.setFont(new Font("Arial", Font.PLAIN, 20));
		add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("F");
		CurrentLayOut.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton_1, -1, SpringLayout.NORTH, jtf4);
		CurrentLayOut.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton_1, 20, SpringLayout.EAST, rdbtnNewRadioButton);
		rdbtnNewRadioButton_1.setFont(new Font("Arial", Font.PLAIN, 20));
		add(rdbtnNewRadioButton_1);
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
