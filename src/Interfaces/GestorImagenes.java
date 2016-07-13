package Interfaces;

import java.awt.Image;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.ImageIcon;


public class GestorImagenes {

	private static   GestorImagenes INSTANCE=null;
	
	
	private HashMap<String, ImageIcon> imagenes;



	private GestorImagenes()
	{

		this.imagenes=new HashMap<String, ImageIcon>();
		iniciarlizarMap();
		
		



	}

	public static GestorImagenes getInstance() {

		if (INSTANCE==null){
			INSTANCE = new GestorImagenes() {
			};

		}
		
		
		return INSTANCE;
	}


	private void iniciarlizarMap() {

		Vector<String> nombres=new Vector<>();

		nombres.addElement("gladiador");
		nombres.addElement("arquero");
		nombres.addElement("roca");
		nombres.addElement("montana");
		nombres.addElement("arbol");


		for(String nombre:nombres)
		{

			ImageIcon imagen = new ImageIcon("resources/"+nombre+".png");
			Image img=imagen.getImage();
			Image newimg = img.getScaledInstance(100, 90, java.awt.Image.SCALE_SMOOTH);
			 imagen=new ImageIcon(newimg);

			imagenes.put(nombre, imagen);
		}

	}

	
	public ImageIcon imagen(String nombre)
	{
		
		
		
		 return imagenes.get(nombre);
		
		
	}
	





}
