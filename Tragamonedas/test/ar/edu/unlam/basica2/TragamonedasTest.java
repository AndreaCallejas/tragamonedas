package ar.edu.unlam.basica2;

import org.junit.Assert;
import org.junit.Test;

public class TragamonedasTest {
	@Test
	public void generarNumeroEntreUnoYDiez(){
		RandoNumberGenerator numero= new RandoNumberGenerator();
		Integer numeroGenerado= numero.generate();
		Assert.assertTrue((numeroGenerado >= 1) && (numeroGenerado <= 10));
	}
	
	@Test
	public void valorInicialDeLosTamboresEsUno(){
		Tragamonedas tragamoneda= new Tragamonedas();
		Assert.assertTrue(tragamoneda.generator.generate() == 1);
	}
	
	@Test
	public void devolverPremioSiLosTresTamboresSonIguales(){
		Tragamonedas tragamoneda= new Tragamonedas();
		//Sin activar para que los tres tambores tengan valor 1
		//tragamoneda.activar();
		Assert.assertTrue(tragamoneda.entregaPremio());
	}
}
