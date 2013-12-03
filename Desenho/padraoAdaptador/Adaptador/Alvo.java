package Adaptador;

import javax.swing.JOptionPane;

public abstract class Alvo {
	
	static AdaptadorA a;
	static AdaptadorB b;

	public abstract void metodoEsperado();

	public static  Alvo  obterAdaptador(int opcao) {
		
		switch (opcao) {
		
		case 1:
				if(a == null){
					a = new AdaptadorA();
				}
				return a;
			
		case 2:
				if(b == null){
					b = new AdaptadorB();
				}
				return b;
			
		default:
			return null;
		}
	
	}
	
}
