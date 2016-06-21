package ar.edu.unlam.basica2;

public class RandoNumberGenerator implements NumberGenerator {
	/* post: devuelve el número de posición en la que se
	* encuentra el Tambor. Es un valor comprendido
	* entre 1 y 10.
	*/
	
	@Override
	public Integer generate() {
		// TODO Auto-generated method stub
		return (int) (Math.random() * 10) +1;
	}

}
