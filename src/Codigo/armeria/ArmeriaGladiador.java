package Codigo.armeria;

import java.util.HashMap;

import Codigo.armaduras.Armadura;

import Codigo.armaduras.ArmaduraPesada;

import Codigo.armas.Arma;
import Codigo.armas.Espada;
import Codigo.armas.Lanza;

public class ArmeriaGladiador implements Armeria{

	public HashMap<String, Arma> getArmas() {
		// TODO Auto-generated method stub
		
		HashMap<String, Arma> armas=new HashMap<>();
		
		armas.put("lejana", new Lanza());
		armas.put("cercana", new Espada());
		
		
		return armas;
	}

	public HashMap<String, Armadura> getArmaduras() {
		// TODO Auto-generated method stub
		
		
		HashMap<String, Armadura> armaduras=new HashMap<>();
		
		armaduras.put("a1", new ArmaduraPesada());
		return armaduras;
	
	}

}
