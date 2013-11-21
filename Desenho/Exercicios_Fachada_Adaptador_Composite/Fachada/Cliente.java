package Fachada;

import javax.swing.JOptionPane;

public class Cliente {


	public static void main(String[] args) {
		
		int opcao;
		
		Fachada fachada = new Fachada();
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog("1 = Funcionalidade 1, 2 = funcionalidade 2, 3 = funcionalidade 3"));
		
		switch (opcao) {
			case 1:
				fachada.funcionalidade1();
				break;
				
			case 2:
				fachada.funcionalidade2();
				break;
				
			case 3:
				fachada.funcionalidade3();
				break;
				
			default:
				System.out.println("Opcao invalida");
			}

	}

}
