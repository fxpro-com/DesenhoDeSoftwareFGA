package template;

import javax.swing.JOptionPane;

public class Cliente {

	
	public static void main(String[] args) {
	
		while(true){
			int opcao = Integer.parseInt(JOptionPane.showInputDialog("1 = comportamento 1, 2 = comportamento 2, 2 = SAIR"));
			
			A.metodoFabrica(opcao);
			
			A.metodoTemplate();
			
			if(opcao == 3)
				break;
		
		}

	}
	
}
