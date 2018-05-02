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
import javax.swing.JOptionPane;
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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PanelInfo extends JPanel {
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
	private JLabel lblAdvertenciaCiudad;
	private JLabel lblAdvertenciaEstado;
	private JLabel[] advertencias;
	private JLabel lblAdvertenciaNombre;
	private JLabel lblAdvertenciaApep;
	private JLabel lblAdvertenciaAno;
	private JLabel lblAdvertenciaApem;
	public PanelInfo(Pasaporte vPass) {
		super();
		this.vPass = vPass;
		setBackground(Color.WHITE);
		
		this.setPreferredSize(new Dimension(1000,600));
		
		setUpPanel();
	}

	@SuppressWarnings("unchecked")
	private void setUpPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{35, 159, 80, 38, 189, 60, 43, 38, 48, 39, 117, 73, 0};
		gridBagLayout.rowHeights = new int[]{34, 24, 30, 15, 24, 30, 15, 24, 24, 37, 15, 24, 24, 34, 16, 63, 33, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		Label1 = new JLabel();
		Label1.setFont(new Font("Tahoma", Font.BOLD, 28));
		Label1.setText("DATOS PERSONALES");
		GridBagConstraints gbc_Label1 = new GridBagConstraints();
		gbc_Label1.anchor = GridBagConstraints.NORTHWEST;
		gbc_Label1.insets = new Insets(0, 0, 5, 5);
		gbc_Label1.gridwidth = 3;
		gbc_Label1.gridx = 4;
		gbc_Label1.gridy = 0;
		this.add(Label1, gbc_Label1);
		Label3 = new JLabel();
		Label3.setText("Nombre(s)");
		Label3.setFont(new Font("Arial", Font.BOLD, 20));
		GridBagConstraints gbc_Label3 = new GridBagConstraints();
		gbc_Label3.anchor = GridBagConstraints.NORTHWEST;
		gbc_Label3.insets = new Insets(0, 0, 5, 5);
		gbc_Label3.gridx = 1;
		gbc_Label3.gridy = 1;
		this.add(Label3, gbc_Label3);
		Label7 = new JLabel();
		Label7.setIcon(new ImageIcon("img//ff.png"));
		GridBagConstraints gbc_Label7 = new GridBagConstraints();
		gbc_Label7.fill = GridBagConstraints.BOTH;
		gbc_Label7.insets = new Insets(0, 0, 5, 0);
		gbc_Label7.gridheight = 5;
		gbc_Label7.gridwidth = 6;
		gbc_Label7.gridx = 6;
		gbc_Label7.gridy = 1;
		this.add(Label7, gbc_Label7);
		tfNombre = new JTextField();
		tfNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				Validar(tfNombre,lblAdvertenciaNombre);
			}
		});
		tfNombre.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_tfNombre = new GridBagConstraints();
		gbc_tfNombre.anchor = GridBagConstraints.NORTH;
		gbc_tfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNombre.insets = new Insets(0, 0, 5, 5);
		gbc_tfNombre.gridwidth = 4;
		gbc_tfNombre.gridx = 1;
		gbc_tfNombre.gridy = 2;
		this.add(tfNombre, gbc_tfNombre);
		
		lblAdvertenciaNombre = new JLabel("Ingrese solo letras");
		lblAdvertenciaNombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAdvertenciaNombre.setForeground(new Color(255, 0, 0));
		GridBagConstraints gbc_lblAdvertenciaNombre = new GridBagConstraints();
		gbc_lblAdvertenciaNombre.anchor = GridBagConstraints.NORTH;
		gbc_lblAdvertenciaNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblAdvertenciaNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdvertenciaNombre.gridwidth = 2;
		gbc_lblAdvertenciaNombre.gridx = 1;
		gbc_lblAdvertenciaNombre.gridy = 3;
		add(lblAdvertenciaNombre, gbc_lblAdvertenciaNombre);
		Label2 = new JLabel();
		Label2.setFont(new Font("Arial", Font.BOLD, 20));
		Label2.setText("Apellido Paterno");
		GridBagConstraints gbc_Label2 = new GridBagConstraints();
		gbc_Label2.anchor = GridBagConstraints.NORTHEAST;
		gbc_Label2.insets = new Insets(0, 0, 5, 5);
		gbc_Label2.gridx = 1;
		gbc_Label2.gridy = 4;
		this.add(Label2, gbc_Label2);
		Label15 = new JLabel();
		Label15.setFont(new Font("Arial", Font.BOLD, 20));
		Label15.setText("Apellido Materno");
		GridBagConstraints gbc_Label15 = new GridBagConstraints();
		gbc_Label15.anchor = GridBagConstraints.NORTHWEST;
		gbc_Label15.insets = new Insets(0, 0, 5, 5);
		gbc_Label15.gridwidth = 2;
		gbc_Label15.gridx = 3;
		gbc_Label15.gridy = 4;
		this.add(Label15, gbc_Label15);
		tfApeP = new JTextField();
		tfApeP.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				Validar(tfApeP, lblAdvertenciaApep);
			}
		});
		tfApeP.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_tfApeP = new GridBagConstraints();
		gbc_tfApeP.anchor = GridBagConstraints.NORTH;
		gbc_tfApeP.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfApeP.insets = new Insets(0, 0, 5, 5);
		gbc_tfApeP.gridwidth = 2;
		gbc_tfApeP.gridx = 1;
		gbc_tfApeP.gridy = 5;
		this.add(tfApeP, gbc_tfApeP);
		tfApeM = new JTextField();
		tfApeM.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				Validar(tfApeM, lblAdvertenciaApem);
			}
		});
		tfApeM.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_tfApeM = new GridBagConstraints();
		gbc_tfApeM.anchor = GridBagConstraints.NORTH;
		gbc_tfApeM.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfApeM.insets = new Insets(0, 0, 5, 5);
		gbc_tfApeM.gridwidth = 2;
		gbc_tfApeM.gridx = 3;
		gbc_tfApeM.gridy = 5;
		this.add(tfApeM, gbc_tfApeM);
		
		lblAdvertenciaApep = new JLabel("Ingrese solo letras");
		lblAdvertenciaApep.setForeground(Color.RED);
		lblAdvertenciaApep.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblAdvertenciaApep = new GridBagConstraints();
		gbc_lblAdvertenciaApep.anchor = GridBagConstraints.NORTH;
		gbc_lblAdvertenciaApep.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblAdvertenciaApep.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdvertenciaApep.gridx = 1;
		gbc_lblAdvertenciaApep.gridy = 6;
		add(lblAdvertenciaApep, gbc_lblAdvertenciaApep);
		
		lblAdvertenciaApem = new JLabel("Ingrese solo letras");
		lblAdvertenciaApem.setForeground(Color.RED);
		lblAdvertenciaApem.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblAdvertenciaApem = new GridBagConstraints();
		gbc_lblAdvertenciaApem.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblAdvertenciaApem.anchor = GridBagConstraints.NORTH;
		gbc_lblAdvertenciaApem.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdvertenciaApem.gridwidth = 2;
		gbc_lblAdvertenciaApem.gridx = 3;
		gbc_lblAdvertenciaApem.gridy = 6;
		add(lblAdvertenciaApem, gbc_lblAdvertenciaApem);
		lblFecha = new JLabel();
		lblFecha.setText("Fecha de Nacimiento:\r\n");
		lblFecha.setToolTipText("");
		lblFecha.setFont(new Font("Arial", Font.BOLD, 20));
		GridBagConstraints gbc_lblFecha = new GridBagConstraints();
		gbc_lblFecha.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblFecha.insets = new Insets(0, 0, 5, 5);
		gbc_lblFecha.gridwidth = 2;
		gbc_lblFecha.gridx = 1;
		gbc_lblFecha.gridy = 7;
		this.add(lblFecha, gbc_lblFecha);
		Label16 = new JLabel();
		Label16.setFont(new Font("Arial", Font.BOLD, 20));
		Label16.setText("Sexo");
		GridBagConstraints gbc_Label16 = new GridBagConstraints();
		gbc_Label16.anchor = GridBagConstraints.WEST;
		gbc_Label16.insets = new Insets(0, 0, 5, 5);
		gbc_Label16.gridheight = 2;
		gbc_Label16.gridx = 8;
		gbc_Label16.gridy = 7;
		this.add(Label16, gbc_Label16);
		Label13 = new JLabel();
		Label13.setText("Mes");
		Label13.setFont(new Font("Arial", Font.BOLD, 20));
		GridBagConstraints gbc_Label13 = new GridBagConstraints();
		gbc_Label13.anchor = GridBagConstraints.NORTHWEST;
		gbc_Label13.insets = new Insets(0, 0, 5, 5);
		gbc_Label13.gridx = 1;
		gbc_Label13.gridy = 8;
		this.add(Label13, gbc_Label13);
		Label12 = new JLabel();
		Label12.setFont(new Font("Arial", Font.BOLD, 20));
		Label12.setText("D\u00EDa");
		GridBagConstraints gbc_Label12 = new GridBagConstraints();
		gbc_Label12.anchor = GridBagConstraints.NORTHWEST;
		gbc_Label12.insets = new Insets(0, 0, 5, 5);
		gbc_Label12.gridx = 2;
		gbc_Label12.gridy = 8;
		this.add(Label12, gbc_Label12);
		Label14 = new JLabel();
		Label14.setFont(new Font("Arial", Font.BOLD, 20));
		Label14.setText("A\u00F1o");
		GridBagConstraints gbc_Label14 = new GridBagConstraints();
		gbc_Label14.anchor = GridBagConstraints.NORTHWEST;
		gbc_Label14.insets = new Insets(0, 0, 5, 5);
		gbc_Label14.gridx = 3;
		gbc_Label14.gridy = 8;
		this.add(Label14, gbc_Label14);
		tfAno = new JTextField();
		tfAno.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				try {
					Integer.parseInt(tfAno.getText());
					lblAdvertenciaAno.setText("");
					if(tfAno.getText().length() == 4) {
						if((Integer.parseInt(tfAno.getText())) > 1800){
							lblAdvertenciaAno.setText("");
						}else {
							lblAdvertenciaAno.setText("Ingrese un año valido");
						}
					}else {
						lblAdvertenciaAno.setText("Ingrese un año valido");
					}
				}catch(NumberFormatException e) {
					lblAdvertenciaAno.setText("Ingresa un año valido");
				}
			}
		});
		
		
		cbMes = new JComboBox();
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
		GridBagConstraints gbc_cbMes = new GridBagConstraints();
		gbc_cbMes.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbMes.insets = new Insets(0, 0, 5, 5);
		gbc_cbMes.gridx = 1;
		gbc_cbMes.gridy = 9;
		add(cbMes, gbc_cbMes);
		
		cbDias = new JComboBox();
		cbDias.setToolTipText("");
		cbDias.setMaximumRowCount(33);
		cbDias.setFont(new Font("Arial", Font.PLAIN, 20));
		
		GridBagConstraints gbc_cbDias = new GridBagConstraints();
		gbc_cbDias.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbDias.anchor = GridBagConstraints.SOUTH;
		gbc_cbDias.insets = new Insets(0, 0, 5, 5);
		gbc_cbDias.gridx = 2;
		gbc_cbDias.gridy = 9;
		add(cbDias, gbc_cbDias);
		tfAno.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_tfAno = new GridBagConstraints();
		gbc_tfAno.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfAno.insets = new Insets(0, 0, 5, 5);
		gbc_tfAno.gridwidth = 2;
		gbc_tfAno.gridx = 3;
		gbc_tfAno.gridy = 9;
		this.add(tfAno, gbc_tfAno);
		
		rdMasculino = new JRadioButton("M");
		rdMasculino.setSelected(true);
		rdMasculino.setBackground(Color.WHITE);
		rdMasculino.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_rdMasculino = new GridBagConstraints();
		gbc_rdMasculino.anchor = GridBagConstraints.NORTHWEST;
		gbc_rdMasculino.insets = new Insets(0, 0, 5, 5);
		gbc_rdMasculino.gridx = 8;
		gbc_rdMasculino.gridy = 9;
		add(rdMasculino, gbc_rdMasculino);
		
		
		rdFemenino = new JRadioButton("F");
		rdFemenino.setBackground(Color.WHITE);
		rdFemenino.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_rdFemenino = new GridBagConstraints();
		gbc_rdFemenino.anchor = GridBagConstraints.NORTHWEST;
		gbc_rdFemenino.insets = new Insets(0, 0, 5, 5);
		gbc_rdFemenino.gridx = 9;
		gbc_rdFemenino.gridy = 9;
		add(rdFemenino, gbc_rdFemenino);
		bg = new ButtonGroup();
		bg.add(rdMasculino);
		bg.add(rdFemenino);
		
		lblAdvertenciaAno = new JLabel("Ingrese un a\u00F1o valido");
		lblAdvertenciaAno.setForeground(Color.RED);
		lblAdvertenciaAno.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblAdvertenciaAno = new GridBagConstraints();
		gbc_lblAdvertenciaAno.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblAdvertenciaAno.anchor = GridBagConstraints.NORTH;
		gbc_lblAdvertenciaAno.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdvertenciaAno.gridwidth = 2;
		gbc_lblAdvertenciaAno.gridx = 3;
		gbc_lblAdvertenciaAno.gridy = 10;
		add(lblAdvertenciaAno, gbc_lblAdvertenciaAno);
		Label6 = new JLabel();
		Label6.setFont(new Font("Arial", Font.BOLD, 20));
		Label6.setText("Lugar de Nacimiento");
		GridBagConstraints gbc_Label6 = new GridBagConstraints();
		gbc_Label6.anchor = GridBagConstraints.NORTHWEST;
		gbc_Label6.insets = new Insets(0, 0, 5, 5);
		gbc_Label6.gridwidth = 2;
		gbc_Label6.gridx = 1;
		gbc_Label6.gridy = 11;
		this.add(Label6, gbc_Label6);
		Label10 = new JLabel();
		Label10.setFont(new Font("Arial", Font.BOLD, 20));
		Label10.setText("Ciudad");
		GridBagConstraints gbc_Label10 = new GridBagConstraints();
		gbc_Label10.anchor = GridBagConstraints.NORTHWEST;
		gbc_Label10.insets = new Insets(0, 0, 5, 5);
		gbc_Label10.gridx = 1;
		gbc_Label10.gridy = 12;
		this.add(Label10, gbc_Label10);
		Label11 = new JLabel();
		Label11.setText("Estado");
		Label11.setFont(new Font("Arial", Font.BOLD, 20));
		GridBagConstraints gbc_Label11 = new GridBagConstraints();
		gbc_Label11.anchor = GridBagConstraints.NORTHWEST;
		gbc_Label11.insets = new Insets(0, 0, 5, 5);
		gbc_Label11.gridwidth = 2;
		gbc_Label11.gridx = 3;
		gbc_Label11.gridy = 12;
		this.add(Label11, gbc_Label11);
		Label4 = new JLabel();
		Label4.setFont(new Font("Arial", Font.BOLD, 20));
		Label4.setText("Nacionalidad");
		GridBagConstraints gbc_Label4 = new GridBagConstraints();
		gbc_Label4.anchor = GridBagConstraints.NORTHWEST;
		gbc_Label4.insets = new Insets(0, 0, 5, 5);
		gbc_Label4.gridwidth = 3;
		gbc_Label4.gridx = 6;
		gbc_Label4.gridy = 12;
		this.add(Label4, gbc_Label4);
		tfCiudad = new JTextField();
		tfCiudad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				Validar(tfCiudad, lblAdvertenciaCiudad);
			}
		});
		tfCiudad.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_tfCiudad = new GridBagConstraints();
		gbc_tfCiudad.fill = GridBagConstraints.BOTH;
		gbc_tfCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_tfCiudad.gridwidth = 2;
		gbc_tfCiudad.gridx = 1;
		gbc_tfCiudad.gridy = 13;
		this.add(tfCiudad, gbc_tfCiudad);
		tfEstado = new JTextField();
		tfEstado.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				Validar(tfEstado, lblAdvertenciaEstado);
			}
		});
		tfEstado.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_tfEstado = new GridBagConstraints();
		gbc_tfEstado.fill = GridBagConstraints.BOTH;
		gbc_tfEstado.insets = new Insets(0, 0, 5, 5);
		gbc_tfEstado.gridwidth = 2;
		gbc_tfEstado.gridx = 3;
		gbc_tfEstado.gridy = 13;
		this.add(tfEstado, gbc_tfEstado);
		tfNacionalidad = new JTextField();
		tfNacionalidad.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_tfNacionalidad = new GridBagConstraints();
		gbc_tfNacionalidad.fill = GridBagConstraints.BOTH;
		gbc_tfNacionalidad.insets = new Insets(0, 0, 5, 5);
		gbc_tfNacionalidad.gridwidth = 5;
		gbc_tfNacionalidad.gridx = 6;
		gbc_tfNacionalidad.gridy = 13;
		this.add(tfNacionalidad, gbc_tfNacionalidad);
		
		lblAdvertenciaCiudad = new JLabel("Ingrese una ciudad valida");
		lblAdvertenciaCiudad.setForeground(Color.RED);
		lblAdvertenciaCiudad.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblAdvertenciaCiudad = new GridBagConstraints();
		gbc_lblAdvertenciaCiudad.anchor = GridBagConstraints.NORTH;
		gbc_lblAdvertenciaCiudad.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblAdvertenciaCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdvertenciaCiudad.gridwidth = 2;
		gbc_lblAdvertenciaCiudad.gridx = 1;
		gbc_lblAdvertenciaCiudad.gridy = 14;
		add(lblAdvertenciaCiudad, gbc_lblAdvertenciaCiudad);
		btNext = new JButton();
		btNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(Revision());
				if(Revision()) {
					guardarInfo();
					siguiente = true;
					vPass.cl.next(vPass.panelCont);	
				}else {
					JOptionPane.showMessageDialog(null, "Revise su información","Error",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btAtras = new JButton();
		btAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vPass.cl.previous(vPass.panelCont);
			}
		});
		
		lblAdvertenciaEstado = new JLabel("Ingrese un Estado valido");
		lblAdvertenciaEstado.setForeground(Color.RED);
		lblAdvertenciaEstado.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblAdvertenciaEstado = new GridBagConstraints();
		gbc_lblAdvertenciaEstado.anchor = GridBagConstraints.SOUTH;
		gbc_lblAdvertenciaEstado.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblAdvertenciaEstado.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdvertenciaEstado.gridwidth = 2;
		gbc_lblAdvertenciaEstado.gridx = 3;
		gbc_lblAdvertenciaEstado.gridy = 14;
		add(lblAdvertenciaEstado, gbc_lblAdvertenciaEstado);
		btAtras.setFont(new Font("Arial", Font.PLAIN, 20));
		btAtras.setText("Atr\u00E1s");
		GridBagConstraints gbc_btAtras = new GridBagConstraints();
		gbc_btAtras.anchor = GridBagConstraints.NORTHEAST;
		gbc_btAtras.insets = new Insets(0, 0, 0, 5);
		gbc_btAtras.gridwidth = 2;
		gbc_btAtras.gridx = 8;
		gbc_btAtras.gridy = 16;
		this.add(btAtras, gbc_btAtras);
		btNext.setText("Siguiente");
		btNext.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_btNext = new GridBagConstraints();
		gbc_btNext.anchor = GridBagConstraints.NORTHWEST;
		gbc_btNext.insets = new Insets(0, 0, 0, 5);
		gbc_btNext.gridx = 10;
		gbc_btNext.gridy = 16;
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
		gbc_btSalir.anchor = GridBagConstraints.NORTHWEST;
		gbc_btSalir.gridx = 11;
		gbc_btSalir.gridy = 16;
		this.add(btSalir, gbc_btSalir);
		
		
		advertencias = new JLabel[]{lblAdvertenciaNombre,lblAdvertenciaApep,lblAdvertenciaApem,lblAdvertenciaAno,lblAdvertenciaCiudad,lblAdvertenciaEstado};
		for(int i=0; i< advertencias.length ; i++) {
			advertencias[i].setText("");
		}
	}

	public void Validar(JTextField tfValidar, JLabel lblAdvertencia) {
		try {
			String texto = tfValidar.getText().toString();
			char inputChars[] = texto.toCharArray();
				for(int i = 0; i < texto.length(); i++){
					if(Character.isLetter(inputChars[i]) || inputChars[i] == ' '){
						lblAdvertencia.setText("");
					}
					else{
						throw new Exception();
					}
				}

		}catch(Exception e) {
			lblAdvertencia.setText("Ingresa solo letras");
		}
	}
	public void guardarInfo() {
		Integer[] meses = {1,2,3,4,5,6,7,8,9,10,11,12};
		String fecha,mes,sexo,dia;
		sexo = "M";
		if (siguiente == false) {
			for(int i=2; i <10; i++) {
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
	
	public boolean Revision() {
		boolean bien = false;
		for(int i=0;i<advertencias.length;i++) {
			if(advertencias[i].getText().equals("")) {
				bien = true;
			}else {
				return false;
			}
		}
		if(tfNombre.getText().equals("")) {
			bien = false;
		}else if(tfApeM.getText().equals("")) {
			bien = false;
		}else if(tfApeP.getText().equals("")) {
			bien = false;
		}else if(tfCiudad.getText().equals("")) {
			bien = false;
		}else if(tfEstado.getText().equals("")) {
			bien = false;
		}else if(tfNacionalidad.getText().equals("")) {
			bien = false;
		}else {
			bien = true;
		}
		
		return bien;
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
