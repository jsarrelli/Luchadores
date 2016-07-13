package Codigo.armeria;

import java.util.HashMap;

import Codigo.armaduras.Armadura;
import Codigo.armas.Arma;
public interface Armeria {
	
public HashMap<String, Arma> getArmas() ;
public HashMap<String, Armadura> getArmaduras();


}
