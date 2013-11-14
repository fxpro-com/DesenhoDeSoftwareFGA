package controle;

import javax.print.attribute.standard.Media;

import modelo.Arcondicionado;
import modelo.Carroceria;
import modelo.Motor;
import modelo.Pneu;
import modelo.Roda;

public abstract class Metalurgica {
	
	private static MetalurgicaAlema instanciaAlema;
	private static MetalurgicaBrasileira instanciaBrasileira;
	
	public abstract Motor criarMotor();
	public abstract Roda criarRoda();
	public abstract Pneu criarPneu();
	
	public Arcondicionado criarArcondicionado() {
		Arcondicionado arCondicionado = new Arcondicionado();
		return arCondicionado;
	}
	
	public Carroceria criarCarroceria() {
		Carroceria carroceria = new Carroceria();
		return carroceria;
	}
	
	//Implementação do Singleton
	public static Metalurgica getInstancia(int parametro){
		
		switch (parametro) {
			case 1:
				if(instanciaBrasileira == null){
					instanciaBrasileira = new MetalurgicaBrasileira();
				}
				return instanciaBrasileira;
			case 2:
				if(instanciaAlema == null){
					instanciaAlema = new MetalurgicaAlema();
				}
				return instanciaAlema;
	
			default:
					System.out.println("Opção não disponível");
					return null;
				
		}
		
	}
	
}
