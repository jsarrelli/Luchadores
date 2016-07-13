package Codigo.ataques;


import Codigo.armas.Arma;
import Codigo.luchadores.Luchador;

public class AtaqueLejano extends Ataque{
	
	public Arma setearArma(Luchador atacante) {
		 return atacante.getArmas().get("lejana");
		
	}


}
