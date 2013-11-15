package padraoSingleton;

public class Cliente {

	public static void main( String [] args) {
		
		Conexao c1, c2, c3;
		
		c1 = Conexao.getConexao();
		c2 = Conexao.getConexao();
		c3 = Conexao.getConexao();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c2);
	}

}
