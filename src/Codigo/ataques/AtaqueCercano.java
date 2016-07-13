package Codigo.ataques;



import Codigo.armas.Arma;
import Codigo.luchadores.Luchador;

public class AtaqueCercano extends Ataque {


	@Override
	public Arma setearArma(Luchador atacante) {
		 return atacante.getArmas().get("cercana");
		
	}
}
