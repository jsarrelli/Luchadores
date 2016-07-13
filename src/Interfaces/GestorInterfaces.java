package Interfaces;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public abstract class GestorInterfaces {
	
	
	
	private GestorImagenes gt= GestorImagenes.getInstance();
	
	
	public JButton botonIcon(String categoria,String nombre)
	{
		JButton boton=new JButton(nombre);
		
		
		 boton.setIcon(gt.imagen(categoria));
		 
		 return boton;
		
	}
	
	public JLabel Imagen(String categoria)
	{
		JLabel boton=new JLabel();
		
		
		 boton.setIcon(gt.imagen(categoria));
		 
		 return boton;
		
	}
	
	public ImageIcon ImagenIcon(String categoria)
	{
		
		 return gt.imagen(categoria);
		
	}

}
