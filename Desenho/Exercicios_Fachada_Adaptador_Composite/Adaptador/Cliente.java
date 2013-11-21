package Adaptador;

import javax.swing.JOptionPane;

public class Cliente {

	
	public static void main(String[] args) {
		
		Alvo a = null;
		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("1 Adaptador A= 1, 2 = Adaptador B"));
		a = Alvo.obterAdaptador(opcao);
		a.metodoEsperado();

	}

}
