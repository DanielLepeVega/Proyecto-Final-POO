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
						tfActa;
	private JLabel lblNewLabel_1;
	private Pasaporte vPass;
	private PanelCorreo pCorreo;
	public PanelNacionalidad(Pasaporte vPass, PanelCorreo pCorreo) {
		super();
		this.pCorreo = pCorreo;
		this.vPass = vPass;
		setBackground(Color.WHITE);
		this.setPreferredSize(new Dimension(1000,600));
		
		Label1 = new JLabel();
		Label1.setBounds(224, 20, 342, 51);
		Label1.setText("NACIONALIDAD");
		Label1.setFont(new Font("Tahoma", Font.BOLD, 42));
		Label2 = new JLabel();
		Label2.setBounds(96, 140, 74, 30);
		Label2.setFont(new Font("Arial", Font.BOLD, 26));
		Label2.setText("CURP\r\n");
		Label3 = new JLabel();
		Label3.setBounds(96, 339, 457, 30);
		Label3.setText("N\u00DAMERO DE ACTA DE NACIMIENTO\r\n");
		Label3.setFont(new Font("Arial", Font.BOLD, 26));
		Label4 = new JLabel();
		Label4.setBounds(679, 285, 109, 30);
		Label4.setFont(new Font("Arial", Font.BOLD, 26));
		Label4.setText("ESTADO");
		lbEstado = new JLabel();
		lbEstado.setBounds(679, 344, 77, 24);
		lbEstado.setText("Estadito");
		lbEstado.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		Label6 = new JLabel();
		Label6.setBounds(619, 0, 371, 182);
		Label6.setIcon(new ImageIcon("img\\ff.png"));
		btCurp = new JButton();
		btCurp.setBounds(96, 286, 219, 33);
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
		btActa.setBounds(96, 478, 371, 33);
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
		btAtras.setBounds(637, 533, 97, 33);
		btAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vPass.cl.previous(vPass.panelCont);
			}
		});
		btAtras.setFont(new Font("Arial", Font.PLAIN, 20));
		btAtras.setText("Atr\u00E1s");
		btNext = new JButton();
		btNext.setBounds(746, 533, 129, 33);
		btNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				guardarDatos();
				pCorreo.llenarInfo();
				vPass.cl.next(vPass.panelCont);
			}
		});
		btNext.setFont(new Font("Arial", Font.PLAIN, 20));
		btNext.setText("Siguiente");
		btSalir = new JButton();
		btSalir.setBounds(895, 533, 95, 33);
		btSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vPass.dispose();
			}
		});
		btSalir.setFont(new Font("Arial", Font.PLAIN, 20));
		btSalir.setText("Salir");
		tfCurp = new JTextField();
		tfCurp.setBounds(96, 176, 253, 30);
		tfCurp.setFont(new Font("Arial", Font.PLAIN, 20));
		tfActa = new JTextField();
		tfActa.setBounds(96, 385, 124, 30);
		tfActa.setFont(new Font("Arial", Font.PLAIN, 20));
	
		this.setLayout(null);
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
		this.add(tfActa);
		
		JLabel lblNewLabel = new JLabel("<html>Si no con\u00F3ces tu CURP, puedes presionar\r<br/>el siguiente bot\u00F3n para consultarlo</htm>");
		lblNewLabel.setBounds(96, 231, 294, 38);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("<html>Si no con\u00F3ces tu n\u00FAmero de acta de nacimiento, puedes presionar\r<br/> el siguiente bot\u00F3n para consultarlo</html>");
		lblNewLabel_1.setBounds(96, 436, 459, 38);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 16));
		add(lblNewLabel_1);
	}

	protected void guardarDatos() {
		vPass.DatosNecesarios.add(tfCurp.getText());
		vPass.DatosNecesarios.add(tfActa.getText());
		for(String n:vPass.DatosNecesarios) {
			System.out.print(n+", ");
		}
		
	}

	
}
