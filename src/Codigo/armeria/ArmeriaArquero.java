package Codigo.armeria;

import java.util.HashMap;

import Codigo.armaduras.Armadura;
import Codigo.armaduras.ArmaduraLigera;
import Codigo.armas.Arco;
import Codigo.armas.Arma;
import Codigo.armas.Daga;

public class ArmeriaArquero implements Armeria {

	public HashMap<String, Arma> getArmas() {
		// TODO Auto-generated method stub
		
		HashMap<String, Arma> armas=new HashMap<>();
		
		armas.put("lejana", new Arco());
		armas.put("cercana", new Daga());
		
		
		return armas;
	}

	public HashMap<String, Armadura> getArmaduras() {
		// TODO Auto-generated method stub
		
		
		HashMap<String, Armadura> armaduras=new HashMap<>();
		
		armaduras.put("a1", new ArmaduraLigera());
		return armaduras;
	
	}



	
	
	
	
	

}
