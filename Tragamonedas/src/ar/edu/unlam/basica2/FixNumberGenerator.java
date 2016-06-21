package ar.edu.unlam.basica2;

public class FixNumberGenerator implements NumberGenerator {
	/* Este generador devolverá siempre number cuando se llame al método generate()
	*/
	private Integer numeroTambor;
	
	public FixNumberGenerator (Integer number) {
		this.numeroTambor= number;
	}
	/* post: devuelve el número de posición en la que se
	* encuentra el Tambor. Es un valor comprendido
	* entre 1 y 10.
	*/
	
	@Override
	public Integer generate() {
		// TODO Auto-generated method stub
		return numeroTambor;
	}

}
