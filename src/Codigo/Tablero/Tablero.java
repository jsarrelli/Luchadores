

package Codigo.Tablero;
import java.util.HashMap;
import java.util.Set;



import Codigo.Plataforma.Obstaculo;
import Codigo.luchadores.Luchador;


public  class Tablero implements Cloneable {
	
	
	
	private HashMap <String,Obstaculo> obstaculos;
	private HashMap <String,Luchador> luchadores;
	private Contenedor[][] tablero;

	
	
	public Tablero()
	{
		obstaculos = new HashMap <String,Obstaculo>();
		luchadores=new HashMap<String,Luchador>();
		
		
		
		this.tablero=new Contenedor[5][5];
		inicializarTablero();
		
		
	
		}
	

	


	public HashMap<String, Obstaculo> getObstaculos() {
		return obstaculos;
	}





	public void setObstaculos(HashMap<String, Obstaculo> obstaculos) {
		this.obstaculos = obstaculos;
	}





	public void setLuchadores(HashMap<String, Luchador> luchadores) {
		this.luchadores = luchadores;
	}





	public  void add(Obstaculo obstaculo)
	{
		obstaculos.put(obstaculo.getTipo(),obstaculo);
		
		
	}
	
	public void add(Luchador luchador)
	{
		luchadores.put(luchador.getUsername(), luchador);
	}



	
	


	


	public HashMap<String, Luchador> getLuchadores() {
		return luchadores;
	}


	


	public Contenedor[][] getTablero() {
		return tablero;
	}





	
	
	
	
	public void inicializarTablero()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				tablero[j][i]=null;
				
			}
		}
	}
	
	public void listarObstaculos()
	{
		
		System.out.println("\nObstaculos:");
		Set<String> keys= obstaculos.keySet();
		for(String key:keys)
		{
			System.out.println(obstaculos.get(key));
		}
	}
	
	




	
	
	

}
