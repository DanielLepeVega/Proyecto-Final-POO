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

public class PanelMenu extends JPanel{
	
	private SpringLayout CurrentLayOut;
	private JFrame frame;
	private Image logo;
	private JLabel Label1;
	private JButton B1,
					B2;
	
	public PanelMenu() {
		super();
		setBorder(new CompoundBorder());
		setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		
		this.setPreferredSize(new Dimension(1000,600));
		this.logo = new ImageIcon("logo.png").getImage();
		Label1 = new JLabel();
		Label1.setBackground(Color.WHITE);
		Label1.setText("MEN\u00DA PRINCIPAL\r\n\r\n\r\n");
		Label1.setForeground(Color.BLUE);
		Label1.setFont(new Font("Tahoma", Font.BOLD, 60));
		B1 = new JButton();
		B1.setBackground(SystemColor.textHighlight);
		B1.setForeground(SystemColor.controlShadow);
		B1.setText("PASAPORTE 1");
		B1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		B2 = new JButton();
		B2.setForeground(SystemColor.controlShadow);
		B2.setBackground(SystemColor.textHighlight);
		B2.setText("PASAPORTE 2\r\n");
		B2.setFont(new Font("Tahoma", Font.PLAIN, 50));
		
		CurrentLayOut = new SpringLayout();
		CurrentLayOut.putConstraint(SpringLayout.NORTH, B2, 0, SpringLayout.NORTH, B1);
		CurrentLayOut.putConstraint(SpringLayout.EAST, B2, -93, SpringLayout.EAST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, B1, 89, SpringLayout.SOUTH, Label1);
		CurrentLayOut.putConstraint(SpringLayout.WEST, B1, 74, SpringLayout.WEST, this);
		CurrentLayOut.putConstraint(SpringLayout.NORTH, Label1, 28, SpringLayout.NORTH, this);
		CurrentLayOut.putConstraint(SpringLayout.WEST, Label1, 224, SpringLayout.WEST, this);
		
		initialize();
		setUpPanel();
		repaint();
	}
	
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
	
	private void setUpPanel() {
		// TODO Auto-generated method stub
		this.setLayout(CurrentLayOut);
		this.add(Label1);
		this.add(B1);
		this.add(B2);
		
	}
	
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
