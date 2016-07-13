package Codigo.Plataforma;



import Codigo.Tablero.Tablero;
import Codigo.Tablero.GestorTablero;


public class Juego {
	
	private static   Juego INSTANCE=null;
	public Tablero tablero;
	public GestorTablero gt;
	
	
	private Juego()
	{
		this.tablero=new Tablero();
		this.gt=new GestorTablero(tablero);
		
		
		
	
		}
	

	public static Juego getInstance() {
    	
    	if (INSTANCE==null){
    		INSTANCE = new Juego() {
			};
			
    	}
		return INSTANCE;
	}


	
	
	
    	

}
