package metodoFabrica;

import javax.swing.JOptionPane;

public class Cliente {

	public static void main( String [] args) {
		
		Aluno a = null;
		
		int tipoAluno = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de aluno: 1= grad ou 2 = pos, 3 = especial"));
		
		switch(tipoAluno){
		
			case 1: 
				a = new Graduacao();
				break;
				
			case 2: 
				a = new PosGraduacao();
				break;
			case 3: 
				a = null;
				break;
				
		}
		
		System.out.println(a);
	}

}
