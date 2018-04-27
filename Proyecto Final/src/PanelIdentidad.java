import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.CompoundBorder;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelIdentidad extends JPanel{
	
	private SpringLayout CurrentLayOut;
	private JFrame frame;
	private JLabel Label1;
	private Pasaporte vPass;
	public PanelIdentidad(Pasaporte vPass) {
		super();
		this.vPass = vPass;
		setBorder(new CompoundBorder());
		setBackground(Color.WHITE);
		
		this.setPreferredSize(new Dimension(1000,600));
		Label1 = new JLabel();		
		Label1.setFont(new Font("Tahoma", Font.BOLD, 60));
		Label1.setText("IDENTIDAD");
		CurrentLayOut = new SpringLayout();
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label1, 0, SpringLayout.NORTH, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label1, 240, SpringLayout.WEST, this);
		
		initialize();
		setUpPanel();
		repaint();
	}

	private void setUpPanel() {
		this.setLayout(CurrentLayOut);
		this.add(Label1);
		
		JButton btImagen = new JButton("Inserte aqu\u00ED su imagen");
		CurrentLayOut.putConstraint(SpringLayout.NORTH, btImagen, 177, SpringLayout.NORTH, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, btImagen, 55, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, btImagen, 409, SpringLayout.NORTH, this);
		btImagen.setFont(new Font("Arial", Font.PLAIN, 20));
		add(btImagen);
		
		JLabel lblNewLabel = new JLabel("<html>Si usted es mayor de edad, favor de identificarse\r<br/>mediante su credencial de elector (INE),\r<br/>modalidad obligatoria de identificaci\u00F3n si usted\r<br/>tiene m\u00E1s de 18 a\u00F1os cumplidos</html>");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		CurrentLayOut.putConstraint(SpringLayout.NORTH, lblNewLabel, 0, SpringLayout.NORTH, btImagen);
		CurrentLayOut.putConstraint(SpringLayout.WEST, lblNewLabel, 125, SpringLayout.EAST, btImagen);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<html>Si usted es menor de edad, favor de identificarse\r<br/> mediante su credencial vigente de la escuela</html>");
		CurrentLayOut.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 88, SpringLayout.SOUTH, lblNewLabel);
		CurrentLayOut.putConstraint(SpringLayout.EAST, lblNewLabel_1, 0, SpringLayout.EAST, lblNewLabel);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("*Favor de presentarse el d\u00EDa de su cita con la identificaci\u00F3n que adjunto en este paso");
		CurrentLayOut.putConstraint(SpringLayout.WEST, lblNewLabel_2, 58, SpringLayout.WEST, this);
		lblNewLabel_2.setFont(new Font("Arial", Font.ITALIC, 20));
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		CurrentLayOut.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 21, SpringLayout.NORTH, this);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\yo_da\\Desktop\\ff.png"));
		CurrentLayOut.putConstraint(SpringLayout.WEST, lblNewLabel_3, 65, SpringLayout.EAST, Label1);
		add(lblNewLabel_3);
		
		JButton btAtras = new JButton("Atr\u00E1s");
		btAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vPass.cl.previous(vPass.panelCont);
			}
		});
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, -36, SpringLayout.NORTH, btAtras);
		btAtras.setFont(new Font("Arial", Font.PLAIN, 20));
		CurrentLayOut.putConstraint(SpringLayout.WEST, btAtras, 0, SpringLayout.WEST, lblNewLabel_3);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, btAtras, -10, SpringLayout.SOUTH, this);
		add(btAtras);
		
		JButton btNext = new JButton("Siguiente");
		btNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vPass.cl.next(vPass.panelCont);
			}
		});
		btNext.setFont(new Font("Arial", Font.PLAIN, 20));
		CurrentLayOut.putConstraint(SpringLayout.WEST, btNext, 27, SpringLayout.EAST, btAtras);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, btNext, 0, SpringLayout.SOUTH, btAtras);
		add(btNext);
		
		JButton btSalir = new JButton("Salir");
		btSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vPass.dispose();
			}
		});
		CurrentLayOut.putConstraint(SpringLayout.NORTH, btSalir, 0, SpringLayout.NORTH, btAtras);
		CurrentLayOut.putConstraint(SpringLayout.EAST, btSalir, -22, SpringLayout.EAST, this);
		btSalir.setFont(new Font("Arial", Font.PLAIN, 20));
		add(btSalir);
		}
	
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
