/*
 * Gustavo Alejandro Flores Cortés
 * A01635151
 * 
 * Daniel Lepe Vega
 * A01633986
 * 
 */
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PanelCorreo extends JPanel{
	private JLabel Label1;
	private JTextField tfCorreo;
	private JTextField tfConfirma;
	private Pasaporte vPass;
	private JLabel lblCurp;
	private JLabel lblNombre;
	private JLabel lblFecha;
	private JLabel lblSexo;
	private JLabel lblNacimiento;
	private boolean siguiente;
	public PanelCorreo(Pasaporte vPass) {
		super();
		this.vPass = vPass;
		setBorder(new CompoundBorder());
		setBackground(Color.WHITE);		
		this.setPreferredSize(new Dimension(1000,600));		
		setUpPanel();
	}
	

	
	private void setUpPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{1, 53, 198, 95, 44, 196, 33, 79, 118, 118, 0};
		gridBagLayout.rowHeights = new int[]{73, 24, 22, 24, 22, 72, 24, 30, 24, 30, 27, 33, 1, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		Label1 = new JLabel();
		Label1.setText("DATOS FINALES");
		Label1.setFont(new Font("Tahoma", Font.BOLD, 42));
		GridBagConstraints gbc_Label1 = new GridBagConstraints();
		gbc_Label1.fill = GridBagConstraints.BOTH;
		gbc_Label1.insets = new Insets(0, 0, 5, 5);
		gbc_Label1.gridwidth = 5;
		gbc_Label1.gridx = 3;
		gbc_Label1.gridy = 0;
		this.add(Label1, gbc_Label1);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre Completo");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 1;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel_11 = new JLabel("CURP");
		lblNewLabel_11.setFont(new Font("Arial", Font.BOLD, 18));
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.anchor = GridBagConstraints.SOUTH;
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_11.gridx = 8;
		gbc_lblNewLabel_11.gridy = 1;
		add(lblNewLabel_11, gbc_lblNewLabel_11);
		
		lblNombre = new JLabel("Nombre Completito");
		lblNombre.setFont(new Font("Bookman Old Style", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.NORTH;
		gbc_lblNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridwidth = 6;
		gbc_lblNombre.gridx = 2;
		gbc_lblNombre.gridy = 2;
		add(lblNombre, gbc_lblNombre);
		
		lblCurp = new JLabel("CURPsito");
		lblCurp.setFont(new Font("Bookman Old Style", Font.PLAIN, 18));
		GridBagConstraints gbc_lblCurp = new GridBagConstraints();
		gbc_lblCurp.anchor = GridBagConstraints.NORTH;
		gbc_lblCurp.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblCurp.insets = new Insets(0, 0, 5, 0);
		gbc_lblCurp.gridwidth = 2;
		gbc_lblCurp.gridx = 8;
		gbc_lblCurp.gridy = 2;
		add(lblCurp, gbc_lblCurp);
		
		JLabel lblNewLabel_4 = new JLabel("Fecha de Nacimiento");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 2;
		gbc_lblNewLabel_4.gridy = 3;
		add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("Lugar de Nacimiento");
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 5;
		gbc_lblNewLabel_6.gridy = 3;
		add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("Sexo");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 8;
		gbc_lblNewLabel_5.gridy = 3;
		add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		lblFecha = new JLabel("Fechita");
		lblFecha.setFont(new Font("Bookman Old Style", Font.PLAIN, 18));
		GridBagConstraints gbc_lblFecha = new GridBagConstraints();
		gbc_lblFecha.anchor = GridBagConstraints.NORTH;
		gbc_lblFecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFecha.insets = new Insets(0, 0, 5, 5);
		gbc_lblFecha.gridx = 2;
		gbc_lblFecha.gridy = 4;
		add(lblFecha, gbc_lblFecha);
		
		lblNacimiento = new JLabel("Lugarsito");
		lblNacimiento.setFont(new Font("Bookman Old Style", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNacimiento = new GridBagConstraints();
		gbc_lblNacimiento.anchor = GridBagConstraints.NORTH;
		gbc_lblNacimiento.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNacimiento.insets = new Insets(0, 0, 5, 5);
		gbc_lblNacimiento.gridwidth = 3;
		gbc_lblNacimiento.gridx = 5;
		gbc_lblNacimiento.gridy = 4;
		add(lblNacimiento, gbc_lblNacimiento);
		
		lblSexo = new JLabel("Sexito");
		lblSexo.setFont(new Font("Bookman Old Style", Font.PLAIN, 18));
		GridBagConstraints gbc_lblSexo = new GridBagConstraints();
		gbc_lblSexo.anchor = GridBagConstraints.NORTH;
		gbc_lblSexo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSexo.gridx = 8;
		gbc_lblSexo.gridy = 4;
		add(lblSexo, gbc_lblSexo);
		
		JLabel lblNewLabel_2 = new JLabel("<html>Si usted est\u00E1 de acuerdo con los datos anteriores, ingrese su dirección<br/>de correo electrónico y presione el bot\u00F3n de enviar, si no,<br/>favor de regresar al paso de datos personales</html>");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridwidth = 7;
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 6;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Se enviar\u00E1 un correo de confirmaci\u00F3n, con fecha, lugar y hora de la cita a:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridwidth = 7;
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 8;
		add(lblNewLabel, gbc_lblNewLabel);
		
		tfCorreo = new JTextField();
		tfCorreo.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_tfCorreo = new GridBagConstraints();
		gbc_tfCorreo.anchor = GridBagConstraints.NORTH;
		gbc_tfCorreo.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfCorreo.insets = new Insets(0, 0, 5, 5);
		gbc_tfCorreo.gridwidth = 6;
		gbc_tfCorreo.gridx = 3;
		gbc_tfCorreo.gridy = 9;
		add(tfCorreo, gbc_tfCorreo);
		tfCorreo.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Confirma tu correo");
		lblNewLabel_13.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_13 = new GridBagConstraints();
		gbc_lblNewLabel_13.gridwidth = 2;
		gbc_lblNewLabel_13.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblNewLabel_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_13.gridx = 2;
		gbc_lblNewLabel_13.gridy = 10;
		add(lblNewLabel_13, gbc_lblNewLabel_13);
		
		tfConfirma = new JTextField();
		tfConfirma.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_tfConfirma = new GridBagConstraints();
		gbc_tfConfirma.anchor = GridBagConstraints.NORTH;
		gbc_tfConfirma.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfConfirma.insets = new Insets(0, 0, 5, 5);
		gbc_tfConfirma.gridwidth = 6;
		gbc_tfConfirma.gridx = 3;
		gbc_tfConfirma.gridy = 11;
		add(tfConfirma, gbc_tfConfirma);
		tfConfirma.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\yo_da\\Desktop\\ff.png"));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 12;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JButton btAtras = new JButton("Atr\u00E1s");
		btAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vPass.cl.previous(vPass.panelCont);
			}
		});
		btAtras.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_btAtras = new GridBagConstraints();
		gbc_btAtras.anchor = GridBagConstraints.NORTHWEST;
		gbc_btAtras.insets = new Insets(0, 0, 0, 5);
		gbc_btAtras.gridx = 7;
		gbc_btAtras.gridy = 14;
		add(btAtras, gbc_btAtras);
		
		JButton btSend = new JButton("Enviar");
		btSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!tfCorreo.getText().isEmpty()) {
					if(validate(tfCorreo.getText())) {
						if(tfCorreo.getText().equals(tfConfirma.getText())){
							System.out.println("Correos iguales");
							int dialogResult = JOptionPane.showConfirmDialog (null, "¿Esta seguro de enviar la información?","Atención",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
							if(dialogResult == JOptionPane.YES_OPTION){
								guardarInfo();
								siguiente = true;
								Insertar();
								JOptionPane.showMessageDialog(null, "Gracias por registrarse, recibirá una notificación de aprobación lo más pronto posible.","Registro Completado",JOptionPane.INFORMATION_MESSAGE);
								vPass.dispose();
							}
							
						}else {
							JOptionPane.showMessageDialog(null, "Los correos no coinciden.");
						}
					}else {
						JOptionPane.showMessageDialog(null, "Ingrese un correo valido.");
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "Ingrese su correo");
				}
			}
		});
		btSend.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_btSend = new GridBagConstraints();
		gbc_btSend.anchor = GridBagConstraints.NORTHWEST;
		gbc_btSend.insets = new Insets(0, 0, 0, 5);
		gbc_btSend.gridx = 8;
		gbc_btSend.gridy = 14;
		add(btSend, gbc_btSend);
		
		JButton btSalir = new JButton("Salir");
		btSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vPass.dispose();
			}
		});
		btSalir.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_btSalir = new GridBagConstraints();
		gbc_btSalir.anchor = GridBagConstraints.NORTHWEST;
		gbc_btSalir.gridx = 9;
		gbc_btSalir.gridy = 14;
		add(btSalir, gbc_btSalir);
	}


	//COMIENZA CÓDIGO OBTENIDO
	/*
	 * Código obtenido de
	 * https://stackoverflow.com/questions/8204680/java-regex-email
	 * 
	 * Autor:
	 * Jason Buberel
	 */
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
			Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	public static boolean validate(String emailStr) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
		return matcher.find();
	}
	
	//FIN DE CÓDIGO OBTENIDO
	public void llenarInfo() {
		// TODO Auto-generated method stub
		this.lblNombre.setText((vPass.DatosNecesarios.get(2)) + " " + (vPass.DatosNecesarios.get(3)) + " " + (vPass.DatosNecesarios.get(4)));
		this.lblCurp.setText(vPass.DatosNecesarios.get(10));
		this.lblNacimiento.setText((vPass.DatosNecesarios.get(5)) + ", " + vPass.DatosNecesarios.get(6));
		this.lblFecha.setText(vPass.DatosNecesarios.get(8));
		if(vPass.DatosNecesarios.get(9).equals("M")) {
			lblSexo.setText("Masculino");
		}else {
			lblSexo.setText("Femenino");
		}
	}

	public void guardarInfo() {

		if(siguiente == false) {
			vPass.DatosNecesarios.add("");
		}
		vPass.DatosNecesarios.set(12,tfCorreo.getText());
	}

	public void Insertar() {
		Integer[] meses = {1,2,3,4,5,6,7,8,9,10,11,12};
		Connection conexion = null;
		java.sql.PreparedStatement stmt = null;
		java.util.Date nacimiento;
		try {
			conexion = DBUtil.getConnection(DBType.MYSQL);
			String nombre, apep,apem,ciudad,estado,nacionalidad,fecha,sexo,precio,vigencia,curp,acta,correo;
			precio = vPass.DatosNecesarios.get(0);
			vigencia = vPass.DatosNecesarios.get(1);
			nombre = vPass.DatosNecesarios.get(2);
			apep = vPass.DatosNecesarios.get(3);
			apem = vPass.DatosNecesarios.get(4);
			ciudad = vPass.DatosNecesarios.get(5);
			estado = vPass.DatosNecesarios.get(6);
			nacionalidad = vPass.DatosNecesarios.get(7);
			fecha = vPass.DatosNecesarios.get(8);
			sexo = vPass.DatosNecesarios.get(9);
			curp = vPass.DatosNecesarios.get(10);
			acta = vPass.DatosNecesarios.get(11);
			correo = vPass.DatosNecesarios.get(12);
			
			nacimiento = new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
			Date sqlFecha = new Date(nacimiento.getTime());

			System.out.println(sqlFecha);
			stmt = conexion.prepareStatement("INSERT INTO inf " + " VALUES (NULL,'"+nombre+"','"+apep+"','"+apem +"', ?,'"+sexo+"','"+estado+"','"+ciudad+"','"+nacionalidad+"','"+curp+"','"+acta+"','"+vigencia+"','"+precio+"','"+correo+"','0')");
			stmt.setDate(1, sqlFecha);
			stmt.execute();
			JOptionPane.showMessageDialog(null, "Información enviada con éxitco.");
		} catch (SQLException e) {
			DBUtil.processException(e);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conexion != null) {
				try {
					conexion.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

