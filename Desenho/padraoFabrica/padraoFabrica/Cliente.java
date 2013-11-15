package padraoFabrica;

import javax.swing.JOptionPane;

public class Cliente  {

	
	public static void main(String[] args) {
		
		FabricaAbstrata f, f2;
		Passeio p, p2;
		Utilitario u, u2;
		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("1 = VW ,2 Fiat"));
		
		f = FabricaAbstrata.getFabrica(opcao);
		p = f.criarVeiculoPasseio();
		u = f.criarVeiculoUtilitario();
		
		
		System.out.println(f);
		System.out.println(p);
		System.out.println(u);
		
		int opcao2 = Integer.parseInt(JOptionPane.showInputDialog("1 = VW ,2 Fiat"));
		
		f2 = FabricaAbstrata.getFabrica(opcao2);
		p2 = f.criarVeiculoPasseio();
		u2 = f.criarVeiculoUtilitario();
		
		System.out.println(f2);
		System.out.println(p2);
		System.out.println(u2);

	}

}
