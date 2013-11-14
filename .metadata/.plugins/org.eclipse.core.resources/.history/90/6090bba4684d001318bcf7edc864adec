package metodoFabricaConcertado;



public abstract class Aluno {

	protected String nome;
	protected int matricula;
	
	
	public static Aluno getAluno(int parametro){
		Aluno a = null;
		
		switch(parametro){
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
		return a;
	}
	

}
