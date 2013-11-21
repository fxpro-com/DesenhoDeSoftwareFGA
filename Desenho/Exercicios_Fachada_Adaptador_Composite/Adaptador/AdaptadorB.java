package Adaptador;

public class AdaptadorB extends Alvo {
	
	@Override
	public void metodoEsperado() {
		System.out.println("Adaptdor B");
		new Projeto().metodoDisponivel();
	}
}
