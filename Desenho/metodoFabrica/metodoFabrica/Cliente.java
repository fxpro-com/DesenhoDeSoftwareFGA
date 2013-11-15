package metodoFabrica;


import javax.swing.JOptionPane;

public class Cliente {

	public static void main( String [] args) {
		
		Aluno a = null;
		
		int tipoAluno = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de aluno: 1= grad ou 2 = pos, 3 = especial"));
		
		a = Aluno.getAluno(tipoAluno);
		System.out.println(a);
	}

}
