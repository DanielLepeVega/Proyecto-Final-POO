import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import java.awt.Font;
import javax.swing.JComboBox;

public class PanelNacionalidad extends JPanel{
	

	private SpringLayout CurrentLayOut;
	private JFrame frame;
	private Image logo;
	private JLabel Label1,
					Label2,
					Label3,
					Label4;
	private JButton B1,
					B2,
					B3,
					B4,
					B5;
	private JTextField jtf1,
						jtf2;
	private JComboBox comboBox;
	
	public PanelNacionalidad() {
	
		super();
		setBorder(new CompoundBorder());
		setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		
		this.setPreferredSize(new Dimension(1000,600));
		this.logo = new ImageIcon("logo.png").getImage();
		
		Label1 = new JLabel();
		Label1.setText("NACIONALIDAD");
		Label1.setFont(new Font("Times New Roman", Font.BOLD, 42));
		Label2 = new JLabel();
		Label2.setFont(new Font("Arial", Font.PLAIN, 26));
		Label2.setText("CURP\r\n");
		Label3 = new JLabel();
		Label3.setText("N\u00DAMERO DE ACTA DE NACIMIENTO\r\n");
		Label3.setFont(new Font("Arial", Font.PLAIN, 26));
		Label4 = new JLabel();
		Label4.setFont(new Font("Arial", Font.PLAIN, 26));
		Label4.setText("ESTADO");
		B1 = new JButton();
		B1.setText("CONSULTA CURP");
		B1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		B2 = new JButton();
		B2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		B2.setText("CONSULTA ACTA DE NACIMIENTO");
		B3 = new JButton();
		B3.setText("Atr\u00E1s");
		B4 = new JButton();
		B4.setText("Adelante");
		B5 = new JButton();
		B5.setText("Salir\r\n");
		jtf1 = new JTextField();
		jtf1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		jtf2 = new JTextField();
		jtf2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
	
		CurrentLayOut = new SpringLayout();
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label4, 70, SpringLayout.SOUTH, Label1);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label1, 21, SpringLayout.NORTH, this);
		CurrentLayOut.putConstraint(SpringLayout.EAST, Label1, 0, SpringLayout.EAST, Label4);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, B1, -296, SpringLayout.SOUTH, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label3, 34, SpringLayout.SOUTH, B1);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label3, 0, SpringLayout.WEST, Label2);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label2, 0, SpringLayout.NORTH, Label4);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label2, 0, SpringLayout.WEST, B1);
		CurrentLayOut.putConstraint(SpringLayout.WEST, jtf1, 98, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.EAST, jtf1, -326, SpringLayout.WEST, Label4);
		CurrentLayOut.putConstraint(SpringLayout.WEST, jtf2, 96, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.EAST, jtf2, -780, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, B2, 96, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, B1, 0, SpringLayout.WEST, B2);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, jtf2, -41, SpringLayout.NORTH, B2);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, B2, -81, SpringLayout.SOUTH, this);
		CurrentLayOut.putConstraint(SpringLayout.EAST, Label4, -218, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, B5, 0, SpringLayout.NORTH, B3);
		CurrentLayOut.putConstraint(SpringLayout.EAST, B5, -31, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, B4, 0, SpringLayout.NORTH, B3);
		CurrentLayOut.putConstraint(SpringLayout.WEST, B4, 58, SpringLayout.EAST, B3);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, B3, -21, SpringLayout.SOUTH, this);
		CurrentLayOut.putConstraint(SpringLayout.EAST, B3, -270, SpringLayout.EAST, this);
		
		initialize();
		setUpPanel();
		repaint();
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelNacionalidad window = new PanelNacionalidad();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void setUpPanel() {
		// TODO Auto-generated method stub
		this.setLayout(CurrentLayOut);
		this.add(Label1);
		this.add(Label2);
		this.add(Label3);
		this.add(Label4);
		this.add(B1);
		this.add(B2);
		this.add(B3);
		this.add(B4);
		this.add(B5);
		this.add(jtf1);
		this.add(jtf2);
		
		comboBox = new JComboBox();
		CurrentLayOut.putConstraint(SpringLayout.NORTH, jtf1, 0, SpringLayout.NORTH, comboBox);
		comboBox.setToolTipText("Jalisco\r\nNuevo Le\u00F3n\r\nCiudad de M\u00E9xico");
		comboBox.setFont(new Font("Arial", Font.PLAIN, 20));
		CurrentLayOut.putConstraint(SpringLayout.NORTH, comboBox, 32, SpringLayout.SOUTH, Label4);
		CurrentLayOut.putConstraint(SpringLayout.WEST, comboBox, 0, SpringLayout.WEST, B3);
		CurrentLayOut.putConstraint(SpringLayout.EAST, comboBox, -152, SpringLayout.EAST, this);
		add(comboBox);
	
	}
	
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
