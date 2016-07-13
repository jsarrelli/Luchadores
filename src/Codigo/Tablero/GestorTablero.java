package Codigo.Tablero;



import Codigo.Plataforma.Obstaculo;
import Codigo.luchadores.Arquero;
import Codigo.luchadores.Gladiador;
import Codigo.luchadores.Luchador;
import Codigo.luchadores.Utils;
import Interfaces.InterfazTablero;

public class GestorTablero {
	
	
	private Tablero tablero;
	
	
	public GestorTablero(Tablero tablero)
	{
		this.tablero=tablero;
		
		
	
		}
	
	
	



	
	
	public Tablero getTablero() {
		return tablero;
	}








	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}




	public void agregarObstaculo(String tipo) 
	{
		
		
		int x=0;
		int y=0;
		do
		{
			x=(int)(Math.random() * 5); 
			y= (int)(Math.random() * 5); 
		}while(!verificarPosicionDisponible(x,y));
		
		
		
		agregarObstaculo(tipo, x, y);
		
		
		
	}



	public void agregarObstaculo(String tipo,int x,int y) 
	{
		Obstaculo obstaculoNuevo=tablero.getObstaculos().get(tipo);
		
		
		if(obstaculoNuevo!=null)
		{
			obstaculoNuevo=obstaculoNuevo.clone();
			obstaculoNuevo.setear(tipo, x, y);
					
		}
		
		else
		{
			 obstaculoNuevo=new Obstaculo();
			obstaculoNuevo.setear(tipo, x, y);
		}
		//agrega obstaculo al HashMap
		tablero.add(obstaculoNuevo);
		
		
		//agrega obstaculos a la matriz tablero
		tablero.getTablero()[x][y]=obstaculoNuevo;
		
		
	}
	
	
	public void crearLuchador( Utils Luchador,String username)
	{
		
		int x=0;
		int y=0;
		do
		{
			x=(int)(Math.random() * 5); 
			y= (int)(Math.random() * 5); 
		}while(!verificarPosicionDisponible(x,y));
		
		
		crearLuchador(Luchador, username,x,y);
		
		
	}


	private boolean verificarPosicionDisponible(int x, int y) {
		if(tablero.getTablero()[x][y]!=null){
			return false;
		}
		
		return true;
		
	}








	public  void crearLuchador(Utils luchador, String username, int x, int y) {


		
		Luchador luchadorNuevo = tablero.getLuchadores().get(username);
		if(luchadorNuevo!=null)
		{
			luchadorNuevo=((Luchador)luchadorNuevo.clone());
			luchadorNuevo.setear(username,tablero.getLuchadores().get(username).getArmas() , tablero.getLuchadores().get(username).getArmaduras(), x, y);
					
		}
		
		else
		{
			
			
			switch(luchador){
			case ARQUERO:
				
				luchadorNuevo=new Arquero(username, x, y);
				break;
				
				
			case GLADIADOR:
				luchadorNuevo=new Gladiador(username, x, y);
				break;
				
			}
			
		
		}
		//agrega luchadores al HashMap
		tablero.add(luchadorNuevo);
		
		
		//agrega luchadores a la matriz tablero
		tablero.getTablero()[x][y]=luchadorNuevo;
	
		
	
		
	}
	
	
	
	
	public Luchador getLuchador (String username)
	{
		return tablero.getLuchadores().get(username);
	}
	
	public void mostrarTablero()
	{
		
		crearInterfaz();
		
	}
	
	public void crearInterfaz()
	{
		new InterfazTablero(this);
	}
	


}

