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
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.PreparedStatement;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Canvas;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

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
	private JComboBox cbMes;

	private Pasaporte vPass;
	private JRadioButton rdFemenino, rdMasculino; 
	private ButtonGroup bg;
	
	private Boolean siguiente = false;
	private JComboBox cbDias;
	
	public PanelInfo(Pasaporte vPass) {
		super();
		this.vPass = vPass;
		setBackground(Color.WHITE);
		
		this.setPreferredSize(new Dimension(1000,600));
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
		Label7.setIcon(new ImageIcon("img//ff.png"));
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
				
				guardarInfo();
				siguiente = true;
				vPass.cl.next(vPass.panelCont);	
			}
		});
		btNext.setText("Siguiente");
		btNext.setFont(new Font("Arial", Font.PLAIN, 20));
		btSalir = new JButton();
		btSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vPass.dispose();
			}
		});
		btSalir.setFont(new Font("Arial", Font.PLAIN, 20));
		btSalir.setText("Salir");
		CurrentLayOut = new SpringLayout();
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, tfNacionalidad, 0, SpringLayout.SOUTH, tfCiudad);
		CurrentLayOut.putConstraint(SpringLayout.WEST, tfCiudad, 36, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.EAST, tfCiudad, -50, SpringLayout.WEST, tfEstado);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, tfEstado, 40, SpringLayout.SOUTH, Label11);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, tfNacionalidad, 6, SpringLayout.SOUTH, Label4);
		CurrentLayOut.putConstraint(SpringLayout.WEST, tfNacionalidad, 0, SpringLayout.WEST, Label4);
		CurrentLayOut.putConstraint(SpringLayout.EAST, tfNacionalidad, -196, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, tfEstado, 6, SpringLayout.SOUTH, Label11);
		CurrentLayOut.putConstraint(SpringLayout.WEST, tfEstado, 0, SpringLayout.WEST, Label11);
		CurrentLayOut.putConstraint(SpringLayout.EAST, tfEstado, 0, SpringLayout.EAST, tfNombre);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, tfCiudad, 39, SpringLayout.SOUTH, Label10);
		CurrentLayOut.putConstraint(SpringLayout.EAST, tfNombre, -469, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, tfNombre, 36, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.EAST, lblFecha, -433, SpringLayout.WEST, Label16);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, tfCiudad, 6, SpringLayout.SOUTH, Label10);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, lblFecha, -6, SpringLayout.NORTH, Label12);
		CurrentLayOut.putConstraint(SpringLayout.EAST, Label12, -57, SpringLayout.WEST, Label14);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label12, 275, SpringLayout.NORTH, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label13, 0, SpringLayout.NORTH, Label12);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label13, 0, SpringLayout.WEST, Label2);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, tfAno, 6, SpringLayout.SOUTH, Label14);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label3, 36, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label6, 0, SpringLayout.WEST, Label2);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, Label6, -6, SpringLayout.NORTH, Label10);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label10, 410, SpringLayout.NORTH, this);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, btNext, -10, SpringLayout.SOUTH, this);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, btAtras, -10, SpringLayout.SOUTH, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, tfAno, 0, SpringLayout.WEST, Label11);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label14, 0, SpringLayout.NORTH, Label12);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label14, 0, SpringLayout.WEST, Label11);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, btSalir, -10, SpringLayout.SOUTH, this);
		CurrentLayOut.putConstraint(SpringLayout.EAST, btAtras, -6, SpringLayout.WEST, btNext);
		CurrentLayOut.putConstraint(SpringLayout.EAST, btNext, -6, SpringLayout.WEST, btSalir);
		CurrentLayOut.putConstraint(SpringLayout.EAST, btSalir, -24, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label4, 0, SpringLayout.NORTH, Label10);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label16, 257, SpringLayout.NORTH, this);
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
		CurrentLayOut.putConstraint(SpringLayout.EAST, Label16, -280, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, tfNombre, 99, SpringLayout.NORTH, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, tfApeP, 6, SpringLayout.SOUTH, Label2);
		CurrentLayOut.putConstraint(SpringLayout.WEST, tfApeP, 36, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label2, 0, SpringLayout.WEST, Label3);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label10, 36, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.EAST, Label11, -645, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label11, 0, SpringLayout.NORTH, Label10);
		
		setUpPanel();
	}

	@SuppressWarnings("unchecked")
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
		
		
		cbMes = new JComboBox();
		CurrentLayOut.putConstraint(SpringLayout.NORTH, cbMes, 0, SpringLayout.NORTH, tfAno);
		CurrentLayOut.putConstraint(SpringLayout.WEST, cbMes, 0, SpringLayout.WEST, Label2);
		cbMes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(arg0.getStateChange() == ItemEvent.SELECTED) {
					if(cbMes.getSelectedIndex() >-1 ) {
					cbDias.setModel(new DefaultComboBoxModel(getDias(cbMes.getSelectedItem().toString())));
					}
				}
			}
		});
		cbMes.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Septiembre", "Octubre", "Noviembre", "Diciembre", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
		cbMes.setMaximumRowCount(12);
		cbMes.setToolTipText("");
		cbMes.setFont(new Font("Arial", Font.PLAIN, 20));
		add(cbMes);
		
		rdMasculino = new JRadioButton("M");
		CurrentLayOut.putConstraint(SpringLayout.NORTH, rdMasculino, 19, SpringLayout.SOUTH, Label16);
		CurrentLayOut.putConstraint(SpringLayout.EAST, tfAno, -199, SpringLayout.WEST, rdMasculino);
		CurrentLayOut.putConstraint(SpringLayout.EAST, Label4, 0, SpringLayout.EAST, rdMasculino);
		rdMasculino.setSelected(true);
		rdMasculino.setBackground(Color.WHITE);
		CurrentLayOut.putConstraint(SpringLayout.WEST, rdMasculino, 0, SpringLayout.WEST, Label16);
		rdMasculino.setFont(new Font("Arial", Font.PLAIN, 20));
		add(rdMasculino);
		
		rdFemenino = new JRadioButton("F");
		CurrentLayOut.putConstraint(SpringLayout.NORTH, rdFemenino, 106, SpringLayout.SOUTH, Label7);
		rdFemenino.setBackground(Color.WHITE);
		CurrentLayOut.putConstraint(SpringLayout.WEST, rdFemenino, 20, SpringLayout.EAST, rdMasculino);
		rdFemenino.setFont(new Font("Arial", Font.PLAIN, 20));
		add(rdFemenino);
		bg = new ButtonGroup();
		bg.add(rdMasculino);
		bg.add(rdFemenino);
		
		cbDias = new JComboBox();
		CurrentLayOut.putConstraint(SpringLayout.EAST, cbMes, -15, SpringLayout.WEST, cbDias);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, cbDias, 6, SpringLayout.SOUTH, Label12);
		CurrentLayOut.putConstraint(SpringLayout.WEST, cbDias, 0, SpringLayout.WEST, Label12);
		CurrentLayOut.putConstraint(SpringLayout.EAST, cbDias, 53, SpringLayout.WEST, Label12);
		cbDias.setToolTipText("");
		cbDias.setMaximumRowCount(33);
		cbDias.setFont(new Font("Arial", Font.PLAIN, 20));
		cbDias.setModel(new DefaultComboBoxModel(getDias(cbMes.getSelectedItem().toString())));
		
		add(cbDias);
	}

	public void guardarInfo() {
		Integer[] meses = {1,2,3,4,5,6,7,8,9,10,11,12};
		String fecha,mes,sexo,dia;
		sexo = "M";
		if (siguiente == false) {
			for(int i=2; i <10; i++) {
				System.out.println(i);
				vPass.DatosNecesarios.add("");
			}
		}
	
		mes = meses[cbMes.getSelectedIndex()].toString();
		dia = cbDias.getSelectedItem().toString();
		//vPass.DatosNecesarios.add(mes);
		fecha = (tfAno.getText() + "-" + mes +"-" + dia);
		
		
		if(rdMasculino.isSelected()) {
			sexo = "M";
		}else if(rdFemenino.isSelected()){
			sexo = "F";
		}
		
		vPass.DatosNecesarios.set(2,tfNombre.getText());
		vPass.DatosNecesarios.set(3,tfApeP.getText());
		vPass.DatosNecesarios.set(4,tfApeM.getText());
		vPass.DatosNecesarios.set(5,tfCiudad.getText());
		vPass.DatosNecesarios.set(6,tfEstado.getText());
		vPass.DatosNecesarios.set(7,tfNacionalidad.getText());
		vPass.DatosNecesarios.set(8,fecha);
		vPass.DatosNecesarios.set(9,sexo);
		
		int es = 0;
		for(String n:vPass.DatosNecesarios) {
		
			System.out.print((es)+ " "+ n +", ");
			es+=1;
		}
		System.out.println();
		
		
	}
	
	public String[] getDias(String mes) {
		String[] dias = null;
		if(mes.equals("Febrero")) {
			dias = new String[29];
			for(int n = 0; n < 29; n++) {
				dias[n] = Integer.toString(n+1);
			}
		}else if(mes.equals("Abril") || mes.equals("Junio") || mes.equals("Septiembre") || mes.equals("Noviembre")) {
			dias = new String[30];
			for(int n = 0; n < 30; n++) {
				dias[n] = Integer.toString(n+1);
			}
		}else {
			dias = new String[31];
			for(int n = 0; n < 31; n++) {
				dias[n] = Integer.toString(n+1);
			}
		}
		
		return dias;
	}
	
	public void Insertar() {
		Integer[] meses = {1,2,3,4,5,6,7,8,9,10,11,12};
		Connection conexion = null;
		java.sql.PreparedStatement stmt = null;
		java.util.Date nacimiento;
		try {
			conexion = DBUtil.getConnection(DBType.MYSQL);
			
			String nombre, apep,apem,ciudad,estado,nacionalidad,fecha,mes,sexo,dia;
			sexo = "M";
			nombre = tfNombre.getText();
			apep = tfApeP.getText();
			apem = tfApeM.getText();
			ciudad = tfCiudad.getText();
			estado = tfEstado.getText();
			nacionalidad = tfNacionalidad.getText();
			mes = meses[cbMes.getSelectedIndex()-1].toString();
			dia = cbDias.getSelectedItem().toString();
			fecha = (tfAno.getText() + "-" + mes +"-" + dia);
			nacimiento = new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
			Date sqlFecha = new Date(nacimiento.getTime());
			if(rdMasculino.isSelected()) {
				sexo = "M";
			}else if(rdFemenino.isSelected()){
				sexo = "F";
			}
			System.out.println(sqlFecha);
			stmt = conexion.prepareStatement("INSERT INTO inf " + " VALUES (NULL,'" + nombre +"', '" + apep + "','" + apem + "', ?, '"+ sexo +"', '" + estado +"', '" + ciudad + "','" + nacionalidad + "','','0')");
			stmt.setDate(1, sqlFecha);
			stmt.execute();
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
