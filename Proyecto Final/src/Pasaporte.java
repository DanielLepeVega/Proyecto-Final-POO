import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Graphics;
import javax.swing.*;

public class Pasaporte extends JFrame{
	
	protected CardLayout cl = new CardLayout();
	protected JPanel panelCont = new JPanel();
	private PanelInfo pInfo;
	private PanelMenu pMenu;
	private PanelNacionalidad pNacio;
	
	public Pasaporte () {
		super("ventana 1 del pasaporte");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000, 600);
		
		pInfo = new PanelInfo();
		pMenu = new PanelMenu();
		
		panelCont.setLayout(cl);
		panelCont.add(pInfo,"1");
		
		cl.show(panelCont, "1");
		
		this.pack();
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Pasaporte ventanaPasaporte = new Pasaporte(); 
	}
}
