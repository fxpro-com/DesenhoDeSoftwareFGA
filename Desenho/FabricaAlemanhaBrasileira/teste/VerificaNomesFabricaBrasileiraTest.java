package teste;

import static org.junit.Assert.*;

import modelo.Arcondicionado;
import modelo.Carroceria;
import modelo.MotorAluminio;
import modelo.MotorFerro;
import modelo.PneuBorracha;
import modelo.RodaAco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import controle.Metalurgica;
import controle.MetalurgicaBrasileira;

public class VerificaNomesFabricaBrasileiraTest {

	MetalurgicaBrasileira metalurgicaBrasileira;
	Arcondicionado arcondicionado;
	Carroceria carroceria;
	MotorFerro motorFerro;
	PneuBorracha pneuBorracha;
	RodaAco rodaAco;
	
	
	
	@Before
	public void setup(){
		metalurgicaBrasileira = new MetalurgicaBrasileira();
		arcondicionado = new Arcondicionado();
		carroceria = new Carroceria();
		motorFerro = new MotorFerro();
		pneuBorracha = new PneuBorracha();
		rodaAco = new RodaAco();
	}
	
	
	@Test
	public void testarNomeArcondicionado(){
		Assert.assertEquals(Arcondicionado.class, arcondicionado.getClass());
	}
	
	@Test
	public void testarNomeMetalurgicaBrasileira(){
		Assert.assertEquals(MetalurgicaBrasileira.class, metalurgicaBrasileira.getClass());
	}
	
	@Test
	public void testarNomeCarroceria(){
		Assert.assertEquals(Carroceria.class, carroceria.getClass());
	}
	
	@Test
	public void testarNomeMotorFerro(){
		Assert.assertEquals(MotorFerro.class, motorFerro.getClass());
	}
	
	@Test
	public void testarNomePneuBorracha(){
		Assert.assertEquals(PneuBorracha.class, pneuBorracha.getClass());
	}
	
	@Test
	public void testarNomeRodaAco(){
		Assert.assertEquals(RodaAco.class, rodaAco.getClass());
	}

}
