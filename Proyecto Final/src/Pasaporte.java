import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Locale.IsoCountryCode;

import javax.swing.*;

public class Pasaporte extends JFrame{
	
	protected CardLayout cl = new CardLayout();
	protected JPanel panelCont = new JPanel();
	private PanelInfo pInfo;
	private PanelMenu pMenu;
	private PanelNacionalidad pNacio;
	private PanelIdentidad pIde;
	private PanelCorreo pMail;
	protected ArrayList<String> DatosNecesarios;
	public Pasaporte () {
		super("VENTANA PRINCIPAL");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(1000, 600));
		DatosNecesarios = new ArrayList<String>();
		pInfo = new PanelInfo(this);
		pMenu = new PanelMenu(this);
		pIde = new PanelIdentidad(this);
		pMail = new PanelCorreo(this);
		pNacio = new PanelNacionalidad(this,pMail);
		panelCont.setLayout(cl);
		panelCont.add(pMenu,"1");
		panelCont.add(pInfo,"2");
		panelCont.add(pNacio,"3");
		panelCont.add(pMail,"4");
		
		cl.show(panelCont, "1");
		
		getContentPane().add(panelCont);
		this.setResizable(false);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Pasaporte ventanaPasaporte = new Pasaporte(); 
		String[] paises = Locale.getISOCountries();
		String[] estados = {};
		ventanaPasaporte.getAllCountries();
	}
	
	 public String[] getAllCountries() {
		    String[] countries = new String[Locale.getISOCountries().length];
		    String[] countryCodes = Locale.getISOCountries();
		    for (int i = 0; i < countryCodes.length; i++) {
		        Locale obj = new Locale("", countryCodes[i]);
		        countries[i] = obj.getDisplayCountry();
		    }
		    
		    for(String n:countries) {
				System.out.println(n);
					
			}
		    return countries;
		 }
}
