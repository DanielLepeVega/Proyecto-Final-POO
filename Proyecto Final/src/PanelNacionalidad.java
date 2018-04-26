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
import java.awt.Desktop;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class PanelNacionalidad extends JPanel{
	

	private SpringLayout CurrentLayOut;
	private JFrame frame;
	private Image logo;
	private JLabel Label1,
					Label2,
					Label3,
					Label4,
					lbEstado,
					Label6;
	private JButton btCurp,
					btActa,
					btAtras,
					btNext,
					btSalir;
	private JTextField tfCurp,
						btNumActa;
	private JLabel lblNewLabel_1;
	
	public PanelNacionalidad(Pasaporte vPass) {
	
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
		lbEstado = new JLabel();
		lbEstado.setText("Estadito");
		lbEstado.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		Label6 = new JLabel();
		Label6.setIcon(new ImageIcon("C:\\Users\\yo_da\\Desktop\\ff.png"));
		btCurp = new JButton();
		btCurp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (Desktop.isDesktopSupported()) {
				    try {
						Desktop.getDesktop().browse(new URI("https://consultas.curp.gob.mx"));
					} catch (IOException e) {
						e.printStackTrace();
					} catch (URISyntaxException e) {
						e.printStackTrace();
					}
				}
			}
		});
		btCurp.setText("Consulta CURP");
		btCurp.setFont(new Font("Arial", Font.PLAIN, 20));
		btActa = new JButton();
		btActa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (Desktop.isDesktopSupported()) {
				    try {
						Desktop.getDesktop().browse(new URI("https://www.gob.mx/ActaNacimiento/"));
					} catch (IOException e) {
						e.printStackTrace();
					} catch (URISyntaxException e) {
						e.printStackTrace();
					}
				}
			}
		});
		btActa.setFont(new Font("Arial", Font.PLAIN, 20));
		btActa.setText("Consulta Acta de Nacimiento");
		btAtras = new JButton();
		btAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vPass.cl.previous(vPass.panelCont);
			}
		});
		btAtras.setFont(new Font("Arial", Font.PLAIN, 20));
		btAtras.setText("Atr\u00E1s");
		btNext = new JButton();
		btNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vPass.cl.next(vPass.panelCont);
			}
		});
		btNext.setFont(new Font("Arial", Font.PLAIN, 20));
		btNext.setText("Siguiente");
		btSalir = new JButton();
		btSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vPass.dispose();
			}
		});
		btSalir.setFont(new Font("Arial", Font.PLAIN, 20));
		btSalir.setText("Salir");
		tfCurp = new JTextField();
		tfCurp.setFont(new Font("Arial", Font.PLAIN, 20));
		btNumActa = new JTextField();
		btNumActa.setFont(new Font("Arial", Font.PLAIN, 20));
	
		CurrentLayOut = new SpringLayout();
		CurrentLayOut.putConstraint(SpringLayout.NORTH, btSalir, 0, SpringLayout.NORTH, btAtras);
		CurrentLayOut.putConstraint(SpringLayout.WEST, btSalir, 24, SpringLayout.EAST, btNext);
		CurrentLayOut.putConstraint(SpringLayout.WEST, btActa, 0, SpringLayout.WEST, Label2);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label6, 0, SpringLayout.NORTH, this);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, Label6, -103, SpringLayout.NORTH, Label4);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, btNumActa, 16, SpringLayout.SOUTH, Label3);
		CurrentLayOut.putConstraint(SpringLayout.WEST, btNumActa, 0, SpringLayout.WEST, Label2);
		CurrentLayOut.putConstraint(SpringLayout.EAST, btNumActa, -780, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label6, 53, SpringLayout.EAST, Label1);
		CurrentLayOut.putConstraint(SpringLayout.EAST, Label6, -10, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label2, 96, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label3, -5, SpringLayout.NORTH, lbEstado);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label3, 0, SpringLayout.WEST, Label2);
		CurrentLayOut.putConstraint(SpringLayout.WEST, tfCurp, 96, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.EAST, tfCurp, -270, SpringLayout.WEST, Label6);
		CurrentLayOut.putConstraint(SpringLayout.EAST, Label4, -212, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, lbEstado, 29, SpringLayout.SOUTH, Label4);
		CurrentLayOut.putConstraint(SpringLayout.WEST, lbEstado, 0, SpringLayout.WEST, Label4);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label4, -1, SpringLayout.NORTH, btCurp);
		CurrentLayOut.putConstraint(SpringLayout.WEST, btAtras, 604, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label1, 20, SpringLayout.NORTH, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label1, 224, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label2, 140, SpringLayout.NORTH, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, btCurp, 0, SpringLayout.WEST, Label2);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, tfCurp, 6, SpringLayout.SOUTH, Label2);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, btNext, 0, SpringLayout.NORTH, btAtras);
		CurrentLayOut.putConstraint(SpringLayout.WEST, btNext, 21, SpringLayout.EAST, btAtras);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, btAtras, -21, SpringLayout.SOUTH, this);
		
		initialize();
		setUpPanel();
		repaint();
	}

	/*
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
	
	*/
	private void setUpPanel() {
		// TODO Auto-generated method stub
		this.setLayout(CurrentLayOut);
		this.add(Label1);
		this.add(Label2);
		this.add(Label3);
		this.add(Label4);
		this.add(lbEstado);
		this.add(Label6);
		this.add(btCurp);
		this.add(btActa);
		this.add(btAtras);
		this.add(btNext);
		this.add(btSalir);
		this.add(tfCurp);
		this.add(btNumActa);
		
		JLabel lblNewLabel = new JLabel("<html>Si no con\u00F3ces tu CURP, puedes presionar\r<br/>el siguiente bot\u00F3n para consultarlo</htm>");
		CurrentLayOut.putConstraint(SpringLayout.NORTH, btCurp, 17, SpringLayout.SOUTH, lblNewLabel);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, lblNewLabel, 25, SpringLayout.SOUTH, tfCurp);
		CurrentLayOut.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, Label2);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("<html>Si no con\u00F3ces tu n\u00FAmero de acta de nacimiento, puedes presionar\r<br/> el siguiente bot\u00F3n para consultarlo</html>");
		CurrentLayOut.putConstraint(SpringLayout.NORTH, btActa, 4, SpringLayout.SOUTH, lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 16));
		CurrentLayOut.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 21, SpringLayout.SOUTH, btNumActa);
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
		//g.drawImage(this.logo,0,0,this.getWidth(),this.getHeight(),this);
		
	}
}
