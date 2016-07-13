package Codigo.ataques;


import Codigo.armas.Arma;
import Codigo.luchadores.Luchador;

public abstract class Ataque {
	
	
	
	public Ataque() {
		super();
		
	}


	public void atacar(Luchador atacante,Luchador atacado)
	
	{
		
		
		Arma arma=setearArma(atacante);
		atacado.recibioAtaque(arma);
	}
	
	
	public abstract Arma setearArma(Luchador atacante);
	

}
