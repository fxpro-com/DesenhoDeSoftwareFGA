package teste;

import static org.junit.Assert.*;

import modelo.Carroceria;
import modelo.Motor;
import modelo.Pneu;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import controle.Metalurgica;
import controle.MetalurgicaAlema;
import controle.MetalurgicaBrasileira;

public class MetalurgicaTest {

	Metalurgica metalurgica;
	MetalurgicaBrasileira metalurgicaBrasileira;
	MetalurgicaAlema metalurgicaAlema;
	
	
	@Before
	public void setUp() throws Exception {
		metalurgicaAlema = new MetalurgicaAlema();
		metalurgicaBrasileira = new MetalurgicaBrasileira();
		
		System.out.println("Comecando");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Terminando");
	}
	
	@Test
	public void testaClassesDiferentes() {
		assertNotSame(metalurgicaAlema.getClass(), metalurgicaBrasileira.getClass());
	}
	
	@Test
	public void testaInstanciaBrasileira(){
		metalurgica = Metalurgica.getInstancia(1);
		assertEquals(metalurgica.getClass(), metalurgicaBrasileira.getClass());
	}
	
	@Test
	public void testaInstanciaAlema(){
		metalurgica = Metalurgica.getInstancia(2);
		assertEquals(metalurgica.getClass(), metalurgicaAlema.getClass());
	}
	
	@Test
	public void testaInstanciaNula(){
		assertEquals(metalurgica.getInstancia(3), null);
	}
	
	@Test
	public void testaCriarMotor(){
		Carroceria carroceria = new Carroceria();
		assertEquals(carroceria.getClass(), carroceria.getClass());
	}

}
