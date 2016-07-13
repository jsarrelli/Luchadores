package Codigo.Plataforma;

import Codigo.Tablero.Contenedor;

public class Obstaculo extends Contenedor{
	
	protected String tipo;
	
	protected int x;
	protected int y;
	
	public Obstaculo() {
		super();
		this.tipo="roca";
		
		this.x=1;
		this.y=2;
		
	}
	
	public Obstaculo clone(){
		try {
			return (Obstaculo) super.clone();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String getTipo()
	{
		return this.tipo;
	}

	

	public void setTipo(String tipo) {
		this.tipo = tipo;
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

	





	

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Obstaculo other = (Obstaculo) obj;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return tipo;
	}

	public void setear(String tipo,int x,int y)
	{
		setTipo(tipo);
		
		setX(x);
		setY(y);
		
	}
	
	
	
	
	
	
	
	
	

}
