package Adaptador;

public class AdaptadorA extends Alvo{

	@Override
	public void metodoEsperado() {
		System.out.println("Adaptdor A");
		new Projeto().metodoDisponivel();
	}

}
