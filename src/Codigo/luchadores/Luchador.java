package Codigo.luchadores;

import java.util.HashMap;


import Codigo.Tablero.Contenedor;
import Codigo.armeria.Armeria;
import Codigo.ataques.Ataque;
import Codigo.ataques.AtaqueCercano;
import Codigo.ataques.AtaqueLejano;
import Codigo.armaduras.Armadura;

import Codigo.armas.Arma;


public abstract class Luchador extends Contenedor {

	protected String username;
	protected HashMap<String,Arma> armas;
	protected HashMap<String, Armadura> armaduras;

	protected int x;
	protected int y;
	protected int vida;

	public Luchador(String username, Armeria armeria, int x, int y) {
		super();

		this.username = username;
		this.armas = armeria.getArmas();
		this.armaduras = armeria.getArmaduras();
		this.x = x;
		this.y = y;
		this.vida=100;
	}

	public String getUsername() {
		return username;
	}



	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public void setUsername(String username) {
		this.username = username;
	}



	public HashMap<String, Arma> getArmas() {
		return armas;
	}

	public void setArmas(HashMap<String, Arma> armas) {
		this.armas = armas;
	}

	public HashMap<String, Armadura> getArmaduras() {
		return armaduras;
	}

	public void setArmaduras(HashMap<String, Armadura> armaduras) {
		this.armaduras = armaduras;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
//Receta(){
//	paso1;
//	paso2;
//}
//paso2 abstract;
//paso1(){
//	
//	asgfg
//}
	public Luchador clone(){
		
		
		try {
			return (Luchador) super.clone();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void setear(String username,HashMap<String, Arma> armas,HashMap<String, Armadura> armaduras,int x,int y)
	{
		setUsername(username);
		setArmas(armas);
		setArmaduras(armaduras);
		setX(x);
		setY(y);

	}

	public String visualizarObjetivo (Luchador atacado)
	{
		
		
		if(atacado.getX()==this.x||atacado.getX()==this.x+1||atacado.getX()==this.x-1)
		{	
			if(atacado.getY()==this.y||atacado.getY()==this.y+1||atacado.getY()==this.y-1)
			{
				return "cerca";
			}
		}
		
		
		
		if(atacado.getX()==this.x||atacado.getX()==this.x+2||atacado.getX()==this.x-2)
		{	
			if(atacado.getY()==this.y||atacado.getY()==this.y+2||atacado.getY()==this.y-2)
			{
				return "lejos";
			}
			
		}

		return "inalcanzable";

	}



	public void atacar(Luchador atacado)
	{

		

		String opcion=visualizarObjetivo(atacado);
		
	

		if(!opcion.equals("inalcanzable")){
			Ataque ataque=null;

			switch (opcion) {
			case "cerca":

				ataque= new AtaqueCercano();
				System.out.println("Atacando con "+this.getClass().getSimpleName()+" "+this.username+" "+" usando arma cercana: "+armas.get("cercana"));
			

				break;

			case "lejos":

				ataque= new AtaqueLejano();
				System.out.println("Atacando con "+this.getClass().getSimpleName()+" "+this.username+" "+" usando arma lejana: "+armas.get("lejana"));

				break;



			}
			ataque.atacar(this, atacado);
			
			
		}
		else 
		{
			System.out.println("No se puede atacar, objetivo fuera de alcance");
		}

		
		

	}

	@Override
	public String toString() {
		return " "+this.username+" - Vida:"+this.vida+"%";
	}

	public void recibioAtaque(Arma arma) {
		
		vida-=arma.getDamage();
	
		System.out.println("El "+this.getClass().getSimpleName()+" "+this.username+" esta herido. Vida: "+this.vida+"%");
		
	}

	public void herir(Arma arma) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
