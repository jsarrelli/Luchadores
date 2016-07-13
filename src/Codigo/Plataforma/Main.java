package Codigo.Plataforma;

import Codigo.luchadores.Utils;



public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		Juego partida=Juego.getInstance();
		
		
	




		

		partida.gt.crearLuchador(Utils.GLADIADOR, "Cesar");
		partida.gt.crearLuchador(Utils.ARQUERO, "Juanma");
		
		//aca se rompe
		//partida.gt.crearLuchador(Utils.ARQUERO, "Juanma", 3, 3);

		partida.gt.getLuchador("Cesar").atacar(partida.gt.getLuchador("Juanma"));
		
		
		
	

		partida.gt.mostrarTablero();
		
		
		

	


	}

}
