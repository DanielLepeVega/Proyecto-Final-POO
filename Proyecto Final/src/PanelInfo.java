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
					lblFecha,
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
	private JTextField tfApeP,
						tfNombre,
						tfNacionalidad,
						tfAno,
						tfCiudad,
						tfEstado,
						tfApeM;
	private JButton btAtras,
					btNext,
					btSalir;
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
		lblFecha = new JLabel();
		lblFecha.setText("Fecha de Nacimiento:\r\n");
		lblFecha.setToolTipText("");
		lblFecha.setFont(new Font("Arial", Font.BOLD, 20));
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
		tfApeP = new JTextField();
		tfApeP.setFont(new Font("Arial", Font.PLAIN, 20));
		tfNombre = new JTextField();
		tfNombre.setFont(new Font("Arial", Font.PLAIN, 20));
		tfNacionalidad = new JTextField();
		tfNacionalidad.setFont(new Font("Arial", Font.PLAIN, 20));
		tfAno = new JTextField();
		tfAno.setFont(new Font("Arial", Font.PLAIN, 20));
		tfCiudad = new JTextField();
		tfCiudad.setFont(new Font("Arial", Font.PLAIN, 20));
		tfEstado = new JTextField();
		tfEstado.setFont(new Font("Arial", Font.PLAIN, 20));
		tfApeM = new JTextField();
		tfApeM.setFont(new Font("Arial", Font.PLAIN, 20));
		btAtras = new JButton();
		btAtras.setFont(new Font("Arial", Font.PLAIN, 20));
		btAtras.setText("ATR\u00C1S");
		btNext = new JButton();
		btNext.setText("SIGUIENTE");
		btNext.setFont(new Font("Arial", Font.PLAIN, 20));
		btSalir = new JButton();
		btSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btSalir.setFont(new Font("Arial", Font.PLAIN, 20));
		btSalir.setText("SALIR");
		CurrentLayOut = new SpringLayout();
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, lblFecha, -11, SpringLayout.NORTH, Label12);
		CurrentLayOut.putConstraint(SpringLayout.EAST, lblFecha, 0, SpringLayout.EAST, Label6);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label14, 0, SpringLayout.NORTH, Label12);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label14, 0, SpringLayout.WEST, Label1);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label13, 0, SpringLayout.NORTH, Label12);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label16, 257, SpringLayout.NORTH, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label12, 37, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label1, 10, SpringLayout.NORTH, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label1, 331, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label7, 70, SpringLayout.NORTH, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label7, 81, SpringLayout.EAST, tfNombre);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, Label7, -63, SpringLayout.NORTH, Label16);
		CurrentLayOut.putConstraint(SpringLayout.EAST, Label7, -39, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, tfApeM, 0, SpringLayout.NORTH, tfApeP);
		CurrentLayOut.putConstraint(SpringLayout.WEST, tfApeM, 0, SpringLayout.WEST, Label15);
		CurrentLayOut.putConstraint(SpringLayout.EAST, tfApeM, 0, SpringLayout.EAST, tfNombre);
		CurrentLayOut.putConstraint(SpringLayout.EAST, tfApeP, 87, SpringLayout.EAST, Label2);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label15, 0, SpringLayout.NORTH, Label2);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label15, 114, SpringLayout.EAST, Label2);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, Label3, -8, SpringLayout.NORTH, tfNombre);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label2, 16, SpringLayout.SOUTH, tfNombre);
		CurrentLayOut.putConstraint(SpringLayout.EAST, tfNombre, 0, SpringLayout.EAST, tfEstado);
		CurrentLayOut.putConstraint(SpringLayout.EAST, Label16, -280, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.EAST, tfAno, -488, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, tfNombre, 99, SpringLayout.NORTH, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, tfApeP, 6, SpringLayout.SOUTH, Label2);
		CurrentLayOut.putConstraint(SpringLayout.WEST, tfApeP, 36, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label2, 0, SpringLayout.WEST, Label3);
		CurrentLayOut.putConstraint(SpringLayout.WEST, tfNombre, 0, SpringLayout.WEST, Label3);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label3, 0, SpringLayout.WEST, Label6);
		CurrentLayOut.putConstraint(SpringLayout.WEST, tfCiudad, 36, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.EAST, tfCiudad, -50, SpringLayout.WEST, tfEstado);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label10, 36, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label8, 36, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label6, 36, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, tfNacionalidad, 1, SpringLayout.NORTH, tfCiudad);
		CurrentLayOut.putConstraint(SpringLayout.WEST, tfNacionalidad, 0, SpringLayout.WEST, Label4);
		CurrentLayOut.putConstraint(SpringLayout.EAST, tfNacionalidad, -168, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label4, 0, SpringLayout.NORTH, Label10);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label4, 0, SpringLayout.WEST, btAtras);
		CurrentLayOut.putConstraint(SpringLayout.EAST, Label11, -645, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, tfEstado, 1, SpringLayout.NORTH, tfCiudad);
		CurrentLayOut.putConstraint(SpringLayout.WEST, tfEstado, 0, SpringLayout.WEST, Label11);
		CurrentLayOut.putConstraint(SpringLayout.EAST, tfEstado, -469, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label11, 0, SpringLayout.NORTH, Label10);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, tfCiudad, 16, SpringLayout.SOUTH, Label10);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, tfCiudad, -17, SpringLayout.NORTH, Label9);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label10, 15, SpringLayout.SOUTH, Label6);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, btNext, -10, SpringLayout.SOUTH, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, btAtras, 0, SpringLayout.NORTH, btNext);
		CurrentLayOut.putConstraint(SpringLayout.EAST, btAtras, -27, SpringLayout.WEST, btNext);
		CurrentLayOut.putConstraint(SpringLayout.EAST, btNext, -28, SpringLayout.WEST, btSalir);
		CurrentLayOut.putConstraint(SpringLayout.WEST, btSalir, 870, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, btSalir, -10, SpringLayout.SOUTH, this);
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
		this.add(lblFecha);
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
		this.add(tfApeP);
		this.add(tfNombre);
		this.add(tfNacionalidad);
		this.add(tfAno);
		this.add(tfCiudad);
		this.add(tfEstado);
		this.add(tfApeM);
		this.add(btAtras);
		this.add(btNext);
		this.add(btSalir);
		
		JComboBox comboBox = new JComboBox();
		CurrentLayOut.putConstraint(SpringLayout.NORTH, comboBox, 301, SpringLayout.NORTH, this);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, Label12, -2, SpringLayout.NORTH, comboBox);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, tfAno, 0, SpringLayout.NORTH, comboBox);
		CurrentLayOut.putConstraint(SpringLayout.WEST, comboBox, 36, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.EAST, comboBox, -883, SpringLayout.EAST, this);
		comboBox.setMaximumRowCount(12);
		comboBox.setToolTipText("1\r\n2\r\n3\r\n4\r\n5\r\n6\r\n7\r\n8\r\n9\r\n10\r\n11\r\n12");
		comboBox.setFont(new Font("Arial", Font.PLAIN, 20));
		add(comboBox);
		
		comboBox_1 = new JComboBox();
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label13, 0, SpringLayout.WEST, comboBox_1);
		CurrentLayOut.putConstraint(SpringLayout.WEST, comboBox_1, 30, SpringLayout.EAST, comboBox);
		CurrentLayOut.putConstraint(SpringLayout.EAST, comboBox_1, -703, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, tfAno, 31, SpringLayout.EAST, comboBox_1);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, comboBox_1, 0, SpringLayout.NORTH, comboBox);
		comboBox_1.setMaximumRowCount(12);
		comboBox_1.setToolTipText("Enero\r\nFebrero\r\nMarzo\r\nAbril\r\nMayo\r\nJunio\r\nJulio\r\nAgosto\r\nSeptiembre\r\nSeptiembre\r\nOctubre\r\nNoviembre\r\nDiciembre\r\nSeptiembre\r\nOctubre\r\nNoviembre\r\nDiciembre");
		comboBox_1.setFont(new Font("Arial", Font.PLAIN, 20));
		add(comboBox_1);
		
		JRadioButton rdMasculino = new JRadioButton("M");
		rdMasculino.setSelected(true);
		rdMasculino.setBackground(Color.WHITE);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, rdMasculino, -1, SpringLayout.NORTH, tfAno);
		CurrentLayOut.putConstraint(SpringLayout.WEST, rdMasculino, 0, SpringLayout.WEST, Label16);
		rdMasculino.setFont(new Font("Arial", Font.PLAIN, 20));
		add(rdMasculino);
		
		JRadioButton rdFemenino = new JRadioButton("F");
		rdFemenino.setBackground(Color.WHITE);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, rdFemenino, -1, SpringLayout.NORTH, tfAno);
		CurrentLayOut.putConstraint(SpringLayout.WEST, rdFemenino, 20, SpringLayout.EAST, rdMasculino);
		rdFemenino.setFont(new Font("Arial", Font.PLAIN, 20));
		add(rdFemenino);
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
