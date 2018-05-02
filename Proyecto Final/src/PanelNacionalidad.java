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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

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
		this.setPreferredSize(new Dimension(1000, 600));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{96, 124, 342, 53, 117, 129, 95, 0};
		gridBagLayout.rowHeights = new int[]{71, 69, 30, 30, 38, 34, 30, 30, 38, 33, 33, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		Label1 = new JLabel();
		Label1.setText("NACIONALIDAD");
		Label1.setFont(new Font("Tahoma", Font.BOLD, 42));
		GridBagConstraints gbc_Label1 = new GridBagConstraints();
		gbc_Label1.anchor = GridBagConstraints.SOUTHWEST;
		gbc_Label1.insets = new Insets(0, 0, 5, 5);
		gbc_Label1.gridx = 2;
		gbc_Label1.gridy = 0;
		this.add(Label1, gbc_Label1);
		Label6 = new JLabel();
		Label6.setIcon(new ImageIcon("img\\ff.png"));
		GridBagConstraints gbc_Label6 = new GridBagConstraints();
		gbc_Label6.fill = GridBagConstraints.BOTH;
		gbc_Label6.insets = new Insets(0, 0, 5, 0);
		gbc_Label6.gridheight = 4;
		gbc_Label6.gridwidth = 3;
		gbc_Label6.gridx = 4;
		gbc_Label6.gridy = 0;
		this.add(Label6, gbc_Label6);
		Label2 = new JLabel();
		Label2.setFont(new Font("Arial", Font.BOLD, 26));
		Label2.setText("CURP\r\n");
		GridBagConstraints gbc_Label2 = new GridBagConstraints();
		gbc_Label2.anchor = GridBagConstraints.NORTHWEST;
		gbc_Label2.insets = new Insets(0, 0, 5, 5);
		gbc_Label2.gridx = 1;
		gbc_Label2.gridy = 2;
		this.add(Label2, gbc_Label2);
		tfCurp = new JTextField();
		tfCurp.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_tfCurp = new GridBagConstraints();
		gbc_tfCurp.anchor = GridBagConstraints.NORTH;
		gbc_tfCurp.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfCurp.insets = new Insets(0, 0, 5, 5);
		gbc_tfCurp.gridwidth = 2;
		gbc_tfCurp.gridx = 1;
		gbc_tfCurp.gridy = 3;
		this.add(tfCurp, gbc_tfCurp);
		
		JLabel lblNewLabel = new JLabel("<html>Si no con\u00F3ces tu CURP, puedes presionar\r<br/>el siguiente bot\u00F3n para consultarlo</htm>");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 4;
		add(lblNewLabel, gbc_lblNewLabel);
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
		GridBagConstraints gbc_btCurp = new GridBagConstraints();
		gbc_btCurp.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btCurp.insets = new Insets(0, 0, 5, 5);
		gbc_btCurp.gridwidth = 2;
		gbc_btCurp.gridx = 1;
		gbc_btCurp.gridy = 5;
		this.add(btCurp, gbc_btCurp);
		Label4 = new JLabel();
		Label4.setFont(new Font("Arial", Font.BOLD, 26));
		Label4.setText("ESTADO");
		GridBagConstraints gbc_Label4 = new GridBagConstraints();
		gbc_Label4.anchor = GridBagConstraints.NORTH;
		gbc_Label4.insets = new Insets(0, 0, 5, 5);
		gbc_Label4.gridwidth = 2;
		gbc_Label4.gridx = 4;
		gbc_Label4.gridy = 5;
		this.add(Label4, gbc_Label4);
		lbEstado = new JLabel();
		lbEstado.setText("Estadito");
		lbEstado.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		GridBagConstraints gbc_lbEstado = new GridBagConstraints();
		gbc_lbEstado.anchor = GridBagConstraints.SOUTH;
		gbc_lbEstado.insets = new Insets(0, 0, 5, 5);
		gbc_lbEstado.gridwidth = 2;
		gbc_lbEstado.gridx = 4;
		gbc_lbEstado.gridy = 6;
		this.add(lbEstado, gbc_lbEstado);
		btNext = new JButton();
		btNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				guardarDatos();
				pCorreo.llenarInfo();
				vPass.cl.next(vPass.panelCont);
			}
		});
		btAtras = new JButton();
		btAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vPass.cl.previous(vPass.panelCont);
			}
		});
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
		Label3 = new JLabel();
		Label3.setText("N\u00DAMERO DE ACTA DE NACIMIENTO\r\n");
		Label3.setFont(new Font("Arial", Font.BOLD, 26));
		GridBagConstraints gbc_Label3 = new GridBagConstraints();
		gbc_Label3.anchor = GridBagConstraints.NORTHWEST;
		gbc_Label3.insets = new Insets(0, 0, 5, 5);
		gbc_Label3.gridwidth = 2;
		gbc_Label3.gridx = 1;
		gbc_Label3.gridy = 8;
		this.add(Label3, gbc_Label3);
		tfActa = new JTextField();
		tfActa.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_tfActa = new GridBagConstraints();
		gbc_tfActa.anchor = GridBagConstraints.NORTH;
		gbc_tfActa.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfActa.insets = new Insets(0, 0, 5, 5);
		gbc_tfActa.gridx = 1;
		gbc_tfActa.gridy = 9;
		this.add(tfActa, gbc_tfActa);
		
		lblNewLabel_1 = new JLabel("<html>Si no con\u00F3ces tu n\u00FAmero de acta de nacimiento, puedes presionar\r<br/> el siguiente bot\u00F3n para consultarlo</html>");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridwidth = 2;
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 10;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		btActa.setFont(new Font("Arial", Font.PLAIN, 20));
		btActa.setText("Consulta Acta de Nacimiento");
		GridBagConstraints gbc_btActa = new GridBagConstraints();
		gbc_btActa.anchor = GridBagConstraints.NORTHWEST;
		gbc_btActa.insets = new Insets(0, 0, 5, 5);
		gbc_btActa.gridwidth = 2;
		gbc_btActa.gridx = 1;
		gbc_btActa.gridy = 12;
		this.add(btActa, gbc_btActa);
		btAtras.setFont(new Font("Arial", Font.PLAIN, 20));
		btAtras.setText("Atr\u00E1s");
		GridBagConstraints gbc_btAtras = new GridBagConstraints();
		gbc_btAtras.anchor = GridBagConstraints.NORTHEAST;
		gbc_btAtras.insets = new Insets(0, 0, 0, 5);
		gbc_btAtras.gridx = 4;
		gbc_btAtras.gridy = 13;
		this.add(btAtras, gbc_btAtras);
		btNext.setFont(new Font("Arial", Font.PLAIN, 20));
		btNext.setText("Siguiente");
		GridBagConstraints gbc_btNext = new GridBagConstraints();
		gbc_btNext.anchor = GridBagConstraints.NORTH;
		gbc_btNext.fill = GridBagConstraints.HORIZONTAL;
		gbc_btNext.insets = new Insets(0, 0, 0, 5);
		gbc_btNext.gridx = 5;
		gbc_btNext.gridy = 13;
		this.add(btNext, gbc_btNext);
		btSalir = new JButton();
		btSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vPass.dispose();
			}
		});
		btSalir.setFont(new Font("Arial", Font.PLAIN, 20));
		btSalir.setText("Salir");
		GridBagConstraints gbc_btSalir = new GridBagConstraints();
		gbc_btSalir.anchor = GridBagConstraints.NORTH;
		gbc_btSalir.fill = GridBagConstraints.HORIZONTAL;
		gbc_btSalir.gridx = 6;
		gbc_btSalir.gridy = 13;
		this.add(btSalir, gbc_btSalir);
	}

	protected void guardarDatos() {
		vPass.DatosNecesarios.add(tfCurp.getText());
		vPass.DatosNecesarios.add(tfActa.getText());
		int es = 0;
		for(String n:vPass.DatosNecesarios) {
		
			System.out.print((es)+ " "+ n +", ");
			es+=1;
		}
		System.out.println();
		
	}

	
}
