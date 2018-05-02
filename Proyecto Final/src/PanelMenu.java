/*
 * Gustavo Alejandro Flores Cortés
 * A01635151
 * 
 * Daniel Lepe Vega
 * A01633986
 * 
 */
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelMenu extends JPanel{
	private JFrame frame;
	private JLabel Label1;
	private JButton bt1Ano;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private Pasaporte vPass;
	public PanelMenu(Pasaporte vPass) {
		super();
		String[] costos = {"580","1205","1660","2550"};
		String[] vigencia = {"1 Año","3 Años","6 Años","10 Años"};
		this.vPass = vPass;
		setBorder(new CompoundBorder());
		setBackground(Color.WHITE);
		
		this.setPreferredSize(new Dimension(1000,600));
		Label1 = new JLabel();
		Label1.setBounds(49, 47, 918, 66);
		Label1.setBackground(Color.WHITE);
		Label1.setText("TR\u00C1MITE PASAPORTE MEXICANO");
		Label1.setForeground(Color.DARK_GRAY);
		Label1.setFont(new Font("Tahoma", Font.BOLD, 54));
		bt1Ano = new JButton();
		bt1Ano.setBounds(468, 193, 255, 57);
		bt1Ano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vPass.DatosNecesarios.add(costos[0]);
				vPass.DatosNecesarios.add(vigencia[0]);
				vPass.cl.next(vPass.panelCont);
			}
		});
		
		bt1Ano.setText("1 A\u00F1o");
		bt1Ano.setFont(new Font("Tahoma", Font.PLAIN, 40));
		
		JButton bt3Anos = new JButton();
		bt3Anos.setBounds(468, 274, 255, 57);
		bt3Anos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vPass.DatosNecesarios.add(costos[1]);
				vPass.DatosNecesarios.add(vigencia[1]);
				vPass.cl.next(vPass.panelCont);
			}
		});
		setLayout(null);
		bt3Anos.setText("3 A\u00F1os");
		bt3Anos.setFont(new Font("Tahoma", Font.PLAIN, 40));
		add(bt3Anos);
		
		JButton bt6Anos = new JButton();
		bt6Anos.setBounds(468, 362, 255, 57);
		bt6Anos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vPass.DatosNecesarios.add(costos[2]);
				vPass.DatosNecesarios.add(vigencia[2]);
				vPass.cl.next(vPass.panelCont);
			}
		});
		bt6Anos.setText("6 A\u00F1os");
		bt6Anos.setFont(new Font("Tahoma", Font.PLAIN, 40));
		add(bt6Anos);
		
		JButton bt10Anos = new JButton();
		bt10Anos.setBounds(468, 451, 255, 57);
		bt10Anos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vPass.DatosNecesarios.add(costos[3]);
				vPass.DatosNecesarios.add(vigencia[3]);
				vPass.cl.next(vPass.panelCont);
			}
		});
		bt10Anos.setText("10 A\u00F1os");
		bt10Anos.setFont(new Font("Tahoma", Font.PLAIN, 40));
		add(bt10Anos);
		
		lblNewLabel_3 = new JLabel("<html>Recibir un correo de validaci\u00F3n\r<br/>donde vendr\u00E1 la informaci\u00F3n de su cita.\r</html>");
		lblNewLabel_3.setBounds(43, 464, 343, 48);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 20));
		add(lblNewLabel_3);
		
		lblNewLabel_2 = new JLabel("<html>Presentarse con identifiaci\u00F3n solicitada,\r<br/>en el lugar y hora indicado,\r<br/>para tomarle las fotos y validar\r<br/>su informaci\u00F3n en persona<html>");
		lblNewLabel_2.setBounds(43, 330, 346, 96);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 20));
		add(lblNewLabel_2);
		this.add(Label1);
		this.add(bt1Ano);
		
		lblNewLabel = new JLabel("PASOS A SEGUIR:");
		lblNewLabel.setBounds(43, 148, 271, 35);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("<html>Llenar toda la informaci\u00F3n\r<br/>solicitada en \u00E9ste tr\u00E1mite</html>");
		lblNewLabel_1.setBounds(43, 262, 226, 48);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		add(lblNewLabel_1);
		
		lblNewLabel_4 = new JLabel("2.-");
		lblNewLabel_4.setBounds(14, 262, 23, 24);
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 20));
		add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("3.-");
		lblNewLabel_5.setBounds(10, 331, 23, 24);
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 20));
		add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("4.-");
		lblNewLabel_6.setBounds(14, 465, 23, 24);
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 20));
		add(lblNewLabel_6);
		
		JButton btAyuda = new JButton("?");
		btAyuda.setBounds(850, 369, 60, 57);
		btAyuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon precios = new ImageIcon("img//precios.jpeg");
				JOptionPane.showMessageDialog(null, "","Precios", JOptionPane.INFORMATION_MESSAGE,precios);
			}
		});
		btAyuda.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 22));
		add(btAyuda);
		
				
		JLabel label = new JLabel("1.-");
		label.setBounds(14, 194, 23, 24);
		label.setFont(new Font("Arial", Font.BOLD, 20));
		add(label);
		
		JLabel lblseleccionarLaVigencia = new JLabel("<html>Seleccionar la vigencia que tendr\u00E1\r<br/>su pasaporte</html>");
		lblseleccionarLaVigencia.setBounds(43, 193, 299, 48);
		lblseleccionarLaVigencia.setFont(new Font("Arial", Font.PLAIN, 20));
		add(lblseleccionarLaVigencia);
		
		JLabel lbldesconoceLosPrecios = new JLabel("\u00BFDesconoce los precios?");
		lbldesconoceLosPrecios.setBounds(762, 319, 228, 48);
		lbldesconoceLosPrecios.setFont(new Font("Arial", Font.PLAIN, 20));
		add(lbldesconoceLosPrecios);
	}

	

}
