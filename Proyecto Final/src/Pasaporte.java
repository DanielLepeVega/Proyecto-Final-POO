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
		super("VENTANA PRINCIPAL");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000, 600);
		
		pInfo = new PanelInfo(this);
		pMenu = new PanelMenu(this);
		pNacio = new PanelNacionalidad(this);
		panelCont.setLayout(cl);
		panelCont.add(pMenu,"1");
		panelCont.add(pInfo,"2");
		panelCont.add(pNacio,"3");
		cl.show(panelCont, "1");
		
		this.add(panelCont);
		this.setResizable(false);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Pasaporte ventanaPasaporte = new Pasaporte(); 
	}
}
