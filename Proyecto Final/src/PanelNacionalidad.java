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
import java.awt.Color;

public class PanelNacionalidad extends JPanel{
	

	private SpringLayout CurrentLayOut;
	private JFrame frame;
	private Image logo;
	private JLabel Label1,
					Label2,
					Label3,
					Label4,
					Label5,
					Label6;
	private JButton B1,
					B2,
					B3,
					B4,
					B5;
	private JTextField jtf1,
						jtf2;
	private JLabel lblNewLabel_1;
	
	public PanelNacionalidad() {
	
		super();
		setBorder(new CompoundBorder());
		setBackground(Color.WHITE);
		
		this.setPreferredSize(new Dimension(1000,600));
		this.logo = new ImageIcon("logo.png").getImage();
		
		Label1 = new JLabel();
		Label1.setText("NACIONALIDAD");
		Label1.setFont(new Font("Tahoma", Font.BOLD, 42));
		Label2 = new JLabel();
		Label2.setFont(new Font("Arial", Font.BOLD, 26));
		Label2.setText("CURP\r\n");
		Label3 = new JLabel();
		Label3.setText("N\u00DAMERO DE ACTA DE NACIMIENTO\r\n");
		Label3.setFont(new Font("Arial", Font.BOLD, 26));
		Label4 = new JLabel();
		Label4.setFont(new Font("Arial", Font.BOLD, 26));
		Label4.setText("ESTADO");
		Label5 = new JLabel();
		Label5.setText("Estadito");
		Label5.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		Label6 = new JLabel();
		Label6.setIcon(new ImageIcon("C:\\Users\\yo_da\\Desktop\\ff.png"));
		B1 = new JButton();
		B1.setText("Consulta CURP");
		B1.setFont(new Font("Arial", Font.PLAIN, 20));
		B2 = new JButton();
		B2.setFont(new Font("Arial", Font.PLAIN, 20));
		B2.setText("Consulta Acta De Nacimiento");
		B3 = new JButton();
		B3.setFont(new Font("Arial", Font.PLAIN, 20));
		B3.setText("ATR\u00C1S");
		B4 = new JButton();
		B4.setFont(new Font("Arial", Font.PLAIN, 20));
		B4.setText("SIGUIENTE");
		B5 = new JButton();
		B5.setFont(new Font("Arial", Font.PLAIN, 20));
		B5.setText("SALIR");
		jtf1 = new JTextField();
		jtf1.setFont(new Font("Arial", Font.PLAIN, 20));
		jtf2 = new JTextField();
		jtf2.setFont(new Font("Arial", Font.PLAIN, 20));
	
		CurrentLayOut = new SpringLayout();
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label6, 0, SpringLayout.NORTH, this);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, Label6, -103, SpringLayout.NORTH, Label4);
		CurrentLayOut.putConstraint(SpringLayout.WEST, B2, 0, SpringLayout.WEST, Label2);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, jtf2, 16, SpringLayout.SOUTH, Label3);
		CurrentLayOut.putConstraint(SpringLayout.WEST, jtf2, 0, SpringLayout.WEST, Label2);
		CurrentLayOut.putConstraint(SpringLayout.EAST, jtf2, -780, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label6, 53, SpringLayout.EAST, Label1);
		CurrentLayOut.putConstraint(SpringLayout.EAST, Label6, -10, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label2, 96, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label3, -5, SpringLayout.NORTH, Label5);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label3, 0, SpringLayout.WEST, Label2);
		CurrentLayOut.putConstraint(SpringLayout.WEST, jtf1, 96, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.EAST, jtf1, -270, SpringLayout.WEST, Label6);
		CurrentLayOut.putConstraint(SpringLayout.EAST, Label4, -212, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label5, 29, SpringLayout.SOUTH, Label4);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label5, 0, SpringLayout.WEST, Label4);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label4, -1, SpringLayout.NORTH, B1);
		CurrentLayOut.putConstraint(SpringLayout.WEST, B3, 604, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label1, 20, SpringLayout.NORTH, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label1, 224, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label2, 140, SpringLayout.NORTH, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, B1, 0, SpringLayout.WEST, Label2);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, jtf1, 6, SpringLayout.SOUTH, Label2);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, B4, 0, SpringLayout.NORTH, B3);
		CurrentLayOut.putConstraint(SpringLayout.WEST, B4, 21, SpringLayout.EAST, B3);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, B3, -21, SpringLayout.SOUTH, this);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, B5, -21, SpringLayout.SOUTH, this);
		CurrentLayOut.putConstraint(SpringLayout.EAST, B5, -31, SpringLayout.EAST, this);
		
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
		this.add(Label5);
		this.add(Label6);
		this.add(B1);
		this.add(B2);
		this.add(B3);
		this.add(B4);
		this.add(B5);
		this.add(jtf1);
		this.add(jtf2);
		
		JLabel lblNewLabel = new JLabel("<html>Si no con\u00F3ces tu CURP, puedes presionar\r<br/>el siguiente bot\u00F3n para consultarlo</htm>");
		CurrentLayOut.putConstraint(SpringLayout.NORTH, B1, 17, SpringLayout.SOUTH, lblNewLabel);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, lblNewLabel, 25, SpringLayout.SOUTH, jtf1);
		CurrentLayOut.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, Label2);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("<html>Si no con\u00F3ces tu n\u00FAmero de acta de nacimiento, puedes presionar\r<br/> el siguiente bot\u00F3n para consultarlo</html>");
		CurrentLayOut.putConstraint(SpringLayout.NORTH, B2, 18, SpringLayout.SOUTH, lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 16));
		CurrentLayOut.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 21, SpringLayout.SOUTH, jtf2);
		CurrentLayOut.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, Label2);
		add(lblNewLabel_1);
	
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
