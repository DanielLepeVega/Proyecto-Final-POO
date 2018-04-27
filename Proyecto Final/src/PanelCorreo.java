import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.CompoundBorder;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class PanelCorreo extends JPanel{

	private SpringLayout CurrentLayOut;
	private JFrame frame;
	private JLabel Label1;
	private JTextField tfCorreo;
	private JTextField textField_1;
	private Pasaporte vPass;
	public PanelCorreo(Pasaporte vPass) {
		super();
		this.vPass = vPass;
		setBorder(new CompoundBorder());
		setBackground(Color.WHITE);
		
		this.setPreferredSize(new Dimension(1000,600));
		Label1 = new JLabel();
		Label1.setText("DATOS FINALES");
		Label1.setFont(new Font("Tahoma", Font.PLAIN, 60));
		
		CurrentLayOut = new SpringLayout();
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label1, 0, SpringLayout.NORTH, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label1, 266, SpringLayout.WEST, this);
		
		
		setUpPanel();
	}
	

	
	private void setUpPanel() {
		// TODO Auto-generated method stub
		this.setLayout(CurrentLayOut);
		this.add(Label1);
		
		JLabel lblNewLabel = new JLabel("Se enviar\u00E1 un correo de confirmaci\u00F3n, con fecha, lugar y hora de la cita a:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		add(lblNewLabel);
		
		tfCorreo = new JTextField();
		CurrentLayOut.putConstraint(SpringLayout.NORTH, tfCorreo, 6, SpringLayout.SOUTH, lblNewLabel);
		CurrentLayOut.putConstraint(SpringLayout.WEST, tfCorreo, 222, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.EAST, tfCorreo, -174, SpringLayout.EAST, this);
		tfCorreo.setFont(new Font("Arial", Font.PLAIN, 20));
		add(tfCorreo);
		tfCorreo.setColumns(10);
		
		JButton btnNewButton = new JButton("Atr\u00E1s");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 20));
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Siguiente");
		CurrentLayOut.putConstraint(SpringLayout.NORTH, btnNewButton, 0, SpringLayout.NORTH, btnNewButton_1);
		CurrentLayOut.putConstraint(SpringLayout.EAST, btnNewButton, -22, SpringLayout.WEST, btnNewButton_1);
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 20));
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		CurrentLayOut.putConstraint(SpringLayout.EAST, btnNewButton_1, -20, SpringLayout.WEST, btnNewButton_2);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, btnNewButton_2, -10, SpringLayout.SOUTH, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, btnNewButton_1, 0, SpringLayout.NORTH, btnNewButton_2);
		CurrentLayOut.putConstraint(SpringLayout.EAST, btnNewButton_2, -55, SpringLayout.EAST, this);
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 20));
		add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		CurrentLayOut.putConstraint(SpringLayout.WEST, lblNewLabel_1, 10, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, 0, SpringLayout.SOUTH, this);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\yo_da\\Desktop\\ff.png"));
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("<html>Si usted est\u00E1 de acuerdo con los datos anteriores, ingrese su dirección<br/>de correo electrónico y presione el bot\u00F3n de enviar, si no,<br/>favor de regresar al paso de datos personales</html>");
		CurrentLayOut.putConstraint(SpringLayout.NORTH, lblNewLabel, 17, SpringLayout.SOUTH, lblNewLabel_2);
		CurrentLayOut.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, lblNewLabel_2);
		CurrentLayOut.putConstraint(SpringLayout.EAST, lblNewLabel_2, -183, SpringLayout.EAST, this);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 20));
		add(lblNewLabel_2);
		
		JButton btnNewButton_3 = new JButton("Enviar");
		CurrentLayOut.putConstraint(SpringLayout.NORTH, btnNewButton_3, 493, SpringLayout.NORTH, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, btnNewButton_3, 0, SpringLayout.WEST, btnNewButton_1);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, btnNewButton_3, -23, SpringLayout.NORTH, btnNewButton_1);
		CurrentLayOut.putConstraint(SpringLayout.EAST, btnNewButton_3, -146, SpringLayout.EAST, this);
		btnNewButton_3.setFont(new Font("Arial", Font.PLAIN, 20));
		add(btnNewButton_3);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre Completo");
		CurrentLayOut.putConstraint(SpringLayout.WEST, lblNewLabel_3, 64, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, -481, SpringLayout.SOUTH, this);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 20));
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Fecha de Nacimiento");
		CurrentLayOut.putConstraint(SpringLayout.WEST, lblNewLabel_4, 0, SpringLayout.WEST, lblNewLabel_3);
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 20));
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Sexo");
		CurrentLayOut.putConstraint(SpringLayout.NORTH, lblNewLabel_5, 0, SpringLayout.NORTH, lblNewLabel_4);
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 20));
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Lugar de Nacimiento");
		CurrentLayOut.putConstraint(SpringLayout.WEST, lblNewLabel_5, 160, SpringLayout.EAST, lblNewLabel_6);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, lblNewLabel_6, 0, SpringLayout.NORTH, lblNewLabel_4);
		CurrentLayOut.putConstraint(SpringLayout.WEST, lblNewLabel_6, 143, SpringLayout.EAST, lblNewLabel_4);
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 20));
		add(lblNewLabel_6);
		
		JLabel lblNombre = new JLabel("Nombre Completito");
		CurrentLayOut.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 14, SpringLayout.SOUTH, lblNombre);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, lblNombre, 12, SpringLayout.SOUTH, lblNewLabel_3);
		CurrentLayOut.putConstraint(SpringLayout.WEST, lblNombre, 0, SpringLayout.WEST, lblNewLabel_3);
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 18));
		add(lblNombre);
		
		JLabel lblFecha = new JLabel("Fechita");
		CurrentLayOut.putConstraint(SpringLayout.NORTH, lblFecha, 20, SpringLayout.SOUTH, lblNewLabel_4);
		CurrentLayOut.putConstraint(SpringLayout.WEST, lblFecha, 0, SpringLayout.WEST, lblNewLabel_3);
		lblFecha.setFont(new Font("Arial", Font.PLAIN, 18));
		add(lblFecha);
		
		JLabel lblSexo = new JLabel("Sexito");
		CurrentLayOut.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 18, SpringLayout.SOUTH, lblSexo);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, lblSexo, 0, SpringLayout.NORTH, lblFecha);
		CurrentLayOut.putConstraint(SpringLayout.WEST, lblSexo, 0, SpringLayout.WEST, lblNewLabel_5);
		lblSexo.setFont(new Font("Arial", Font.PLAIN, 18));
		add(lblSexo);
		
		JLabel lblNacimiento = new JLabel("Lugarsito");
		CurrentLayOut.putConstraint(SpringLayout.NORTH, lblNacimiento, 0, SpringLayout.NORTH, lblFecha);
		CurrentLayOut.putConstraint(SpringLayout.WEST, lblNacimiento, 0, SpringLayout.WEST, lblNewLabel_6);
		lblNacimiento.setFont(new Font("Arial", Font.PLAIN, 18));
		add(lblNacimiento);
		
		JLabel lblNewLabel_11 = new JLabel("CURP");
		CurrentLayOut.putConstraint(SpringLayout.NORTH, lblNewLabel_11, 2, SpringLayout.NORTH, lblNewLabel_3);
		CurrentLayOut.putConstraint(SpringLayout.WEST, lblNewLabel_11, 0, SpringLayout.WEST, lblNewLabel_5);
		lblNewLabel_11.setFont(new Font("Arial", Font.BOLD, 18));
		add(lblNewLabel_11);
		
		JLabel lblCurp = new JLabel("CURPsito");
		CurrentLayOut.putConstraint(SpringLayout.NORTH, lblCurp, 0, SpringLayout.NORTH, lblNombre);
		CurrentLayOut.putConstraint(SpringLayout.WEST, lblCurp, 0, SpringLayout.WEST, lblNewLabel_5);
		lblCurp.setFont(new Font("Arial", Font.PLAIN, 18));
		add(lblCurp);
		
		JLabel lblNewLabel_13 = new JLabel("Confirma tu correo");
		CurrentLayOut.putConstraint(SpringLayout.NORTH, lblNewLabel_13, 6, SpringLayout.SOUTH, tfCorreo);
		CurrentLayOut.putConstraint(SpringLayout.WEST, lblNewLabel_13, 0, SpringLayout.WEST, lblNewLabel);
		lblNewLabel_13.setFont(new Font("Arial", Font.PLAIN, 20));
		add(lblNewLabel_13);
		
		textField_1 = new JTextField();
		CurrentLayOut.putConstraint(SpringLayout.NORTH, textField_1, 6, SpringLayout.SOUTH, lblNewLabel_13);
		CurrentLayOut.putConstraint(SpringLayout.WEST, textField_1, 222, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, tfCorreo);
		textField_1.setFont(new Font("Arial", Font.PLAIN, 20));
		add(textField_1);
		textField_1.setColumns(10);
	}



	public void llenarInfo() {
		// TODO Auto-generated method stub
		
	}

}

