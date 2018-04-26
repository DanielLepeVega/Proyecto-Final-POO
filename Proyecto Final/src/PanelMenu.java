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
import javax.swing.SpringLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelMenu extends JPanel{
	
	private SpringLayout CurrentLayOut;
	private JFrame frame;
	private Image logo;
	private JLabel Label1;
	private JButton btPasaporte1,
					btPasaporte2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	
	public PanelMenu(Pasaporte vPass) {
		super();
		setBorder(new CompoundBorder());
		setBackground(Color.WHITE);
		
		this.setPreferredSize(new Dimension(1000,600));
		this.logo = new ImageIcon("logo.png").getImage();
		Label1 = new JLabel();
		Label1.setBackground(Color.WHITE);
		Label1.setText("MENÚ PRINCIPAL");
		Label1.setForeground(Color.BLUE);
		Label1.setFont(new Font("Tahoma", Font.BOLD, 60));
		btPasaporte1 = new JButton();
		btPasaporte1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vPass.cl.next(vPass.panelCont);
			}
		});
		btPasaporte1.setBackground(Color.WHITE);
		btPasaporte1.setForeground(Color.BLACK);
		btPasaporte1.setText("PASAPORTE 1");
		btPasaporte1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btPasaporte2 = new JButton();
		btPasaporte2.setForeground(Color.BLACK);
		btPasaporte2.setBackground(Color.LIGHT_GRAY);
		btPasaporte2.setText("PASAPORTE 2\r\n");
		btPasaporte2.setFont(new Font("Tahoma", Font.PLAIN, 50));
		
		CurrentLayOut = new SpringLayout();
		CurrentLayOut.putConstraint(SpringLayout.WEST, btPasaporte2, 0, SpringLayout.WEST, btPasaporte1);
		CurrentLayOut.putConstraint(SpringLayout.SOUTH, btPasaporte2, -122, SpringLayout.SOUTH, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, btPasaporte1, 89, SpringLayout.SOUTH, Label1);
		CurrentLayOut.putConstraint(SpringLayout.WEST, btPasaporte1, 74, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label1, 28, SpringLayout.NORTH, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label1, 224, SpringLayout.WEST, this);
		
		initialize();
		setUpPanel();
		repaint();
	}
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelMenu window = new PanelMenu();
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
		this.add(btPasaporte1);
		this.add(btPasaporte2);
		
		lblNewLabel = new JLabel("PASOS A SEGUIR:");
		CurrentLayOut.putConstraint(SpringLayout.NORTH, lblNewLabel, 0, SpringLayout.NORTH, btPasaporte1);
		CurrentLayOut.putConstraint(SpringLayout.EAST, lblNewLabel, -137, SpringLayout.EAST, this);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("<html>Llenar toda la informaci\u00F3n\r<br/>solicitada en \u00E9ste tr\u00E1mite</html>");
		CurrentLayOut.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 23, SpringLayout.SOUTH, lblNewLabel);
		CurrentLayOut.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblNewLabel);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("<html>Presentarse con identifiaci\u00F3n solicitada,\r<br/>en el lugar y hora indicado,\r<br/>para tomarle las fotos y validar\r<br/>su informaci\u00F3n en persona<html>");
		CurrentLayOut.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 45, SpringLayout.SOUTH, lblNewLabel_1);
		CurrentLayOut.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, lblNewLabel);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 20));
		add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("<html>Recibir un correo con la informaci\u00F3n\r<br/>digitalizada que podr\u00E1 usar\r<br/>como documento oficial</html>");
		CurrentLayOut.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 47, SpringLayout.SOUTH, lblNewLabel_2);
		CurrentLayOut.putConstraint(SpringLayout.WEST, lblNewLabel_3, 0, SpringLayout.WEST, lblNewLabel);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 20));
		add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("1.-");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 20));
		CurrentLayOut.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 0, SpringLayout.NORTH, lblNewLabel_1);
		CurrentLayOut.putConstraint(SpringLayout.EAST, lblNewLabel_4, -35, SpringLayout.WEST, lblNewLabel_1);
		add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("2.-");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 20));
		CurrentLayOut.putConstraint(SpringLayout.NORTH, lblNewLabel_5, 0, SpringLayout.NORTH, lblNewLabel_2);
		CurrentLayOut.putConstraint(SpringLayout.WEST, lblNewLabel_5, 0, SpringLayout.WEST, lblNewLabel_4);
		add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("3.-");
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 20));
		CurrentLayOut.putConstraint(SpringLayout.NORTH, lblNewLabel_6, 0, SpringLayout.NORTH, lblNewLabel_3);
		CurrentLayOut.putConstraint(SpringLayout.WEST, lblNewLabel_6, 0, SpringLayout.WEST, lblNewLabel_4);
		add(lblNewLabel_6);
		
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
