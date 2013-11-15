package visao;

import javax.swing.JOptionPane;

import modelo.Arcondicionado;
import modelo.Carroceria;
import modelo.Motor;
import modelo.Pneu;
import modelo.Roda;

import controle.Metalurgica;

public class Cliente {

	
	public static void main(String[] args) {
		int opcao;
		
		Metalurgica metalurgica = null;
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog("1 = criar fábrica Brasileira, 2 = criar fábrica Alemanha"));
		
		metalurgica = Metalurgica.getInstancia(opcao);
		Arcondicionado arcondicionado = metalurgica.criarArcondicionado();
		Carroceria carroceria = metalurgica.criarCarroceria();
		Motor motor = metalurgica.criarMotor();
		Pneu pneu = metalurgica.criarPneu();
		Roda roda = metalurgica.criarRoda();
		
		System.out.println(metalurgica);
		System.out.println(arcondicionado);
		System.out.println(carroceria);
		System.out.println(motor);
		System.out.println(pneu);
		System.out.println(roda);
	}

}
