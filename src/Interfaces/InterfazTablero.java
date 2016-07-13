package Interfaces;

import java.awt.Button;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import Codigo.Plataforma.Obstaculo;
import Codigo.Tablero.GestorTablero;
import Codigo.Tablero.Tablero;
import Codigo.luchadores.Arquero;
import Codigo.luchadores.Gladiador;
import Codigo.luchadores.Luchador;

public  class InterfazTablero extends GestorInterfaces {


	private Tablero tablero;
	private GestorTablero gt;
	private  JFrame interfaz;
	

	

	
	public InterfazTablero(GestorTablero gt)
	{
		this.gt=gt;
		this.tablero=gt.getTablero();
		interfaz=new JFrame("Tablero");
		dibujar(tablero);
		
	
	}


	public void dibujar(Tablero tablero)
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		interfaz.setLayout(new GridLayout(5, 5));

		

		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{




				if(tablero.getTablero()[j][i]!=null){

					if(tablero.getTablero()[j][i] instanceof Obstaculo){
						
					
						interfaz.add(botonIcon(tablero.getTablero()[j][i].toString(), ""));
					}


					if(tablero.getTablero()[j][i] instanceof Luchador){
						
						
						
						if(tablero.getTablero()[j][i] instanceof Gladiador)
						{
							

							interfaz.add(botonIcon("gladiador", tablero.getTablero()[j][i].toString()));
					}
						
						
						if(tablero.getTablero()[j][i] instanceof Arquero)
						{

							
							interfaz.add(botonIcon("arquero", tablero.getTablero()[j][i].toString()));
					}
						
						
					}


				}
				else
					interfaz.add(new Button());

			}

		}
		interfaz.pack();
		interfaz.setVisible(true);
		interfaz.addKeyListener(eventoTeclado);
		interfaz.requestFocus();
		





	}


	public KeyListener eventoTeclado = new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {
			
			
		
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode()==78)
			{
				
				new InterfazNuevoLuchador(gt,interfaz);
				
						
				
				
			}
			
			if(e.getKeyCode()==77)
			{
				
				new InterfazNuevoObstaculo(gt,interfaz);
				
						
				
				
			}
			
		}
		

	};



	

	

	
	


}
