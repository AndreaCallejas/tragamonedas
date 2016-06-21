package ar.edu.unlam.basica2;

public class Tragamonedas {
	/* post: los 3 Tambores del Tragamonedas están
	* en la posición 1.
	*/
	FixNumberGenerator generator= new FixNumberGenerator(1);
	
	private Tambor tambor1;
	private Tambor tambor2;
	private Tambor tambor3;
	
	public Tragamonedas() {
		this.tambor1= new Tambor(generator);
		this.tambor2= new Tambor(generator);
		this.tambor3= new Tambor(generator);
	}
	/* post: activa el Tragamonedas haciendo girar
	* sus 3 Tambores.
	*/
	public void activar() {
		this.tambor1.girar();
		this.tambor2.girar();
		this.tambor3.girar();
	}
	/* post: indica si el Tragamonedas entrega un premio
	* a partir de la posición de sus 3 Tambores.
	*/
	public Boolean entregaPremio() {
		Boolean resultado= false;
		if((this.tambor1.getPosicion() == this.tambor2.getPosicion()) && this.tambor2.getPosicion() == this.tambor3.getPosicion()){
			resultado= true;
		}
		
		return resultado;
	}
}
