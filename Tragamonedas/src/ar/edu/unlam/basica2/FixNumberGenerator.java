package ar.edu.unlam.basica2;

public class FixNumberGenerator implements NumberGenerator {
	/* Este generador devolver� siempre number cuando se llame al m�todo generate()
	*/
	private Integer numeroTambor;
	
	public FixNumberGenerator (Integer number) {
		this.numeroTambor= number;
	}
	/* post: devuelve el n�mero de posici�n en la que se
	* encuentra el Tambor. Es un valor comprendido
	* entre 1 y 10.
	*/
	
	@Override
	public Integer generate() {
		// TODO Auto-generated method stub
		return numeroTambor;
	}

}
