import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Graphics;
import javax.swing.*;

public class Pasaporte extends JFrame{
	
	protected CardLayout cl = new CardLayout();
	protected JPanel panelc = new JPanel();
	
	public Pasaporte () {
		super("ventana 1 del pasaporte");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000, 600);
		PanelX px=new PanelX();
		this.add(px);
		this.pack();
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Pasaporte Capa1Pas = new Pasaporte(); 
	}
}
