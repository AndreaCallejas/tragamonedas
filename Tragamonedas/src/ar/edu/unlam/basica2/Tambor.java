package ar.edu.unlam.basica2;

public class Tambor {
	private Integer posicionTambor;
	
	public Tambor(NumberGenerator generator) {
		this.posicionTambor= generator.generate();
	}
	/* post: devuelve el número de posición en la que se
	* encuentra el Tambor. Es un valor comprendido
	* entre 1 y 10.
	*/
	public Integer getPosicion() {
		return this.posicionTambor;
	}

	/* post: hace girar el tambor y luego se detiene en
	* una posición comprendida entre 1 y 10.
	*/
	public void girar() {
		RandoNumberGenerator giro= new RandoNumberGenerator();
		this.posicionTambor= giro.generate();
	}
}
