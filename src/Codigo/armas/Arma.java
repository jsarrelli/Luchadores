package Codigo.armas;



public abstract class Arma {
	
	private int damage;
	
	
	
	public Arma(int damage) {
		super();
		this.damage = damage;
	}

	





	public int getDamage() {
		return damage;
	}







	public void setDamage(int damage) {
		this.damage = damage;
	}







	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
	
	

}
