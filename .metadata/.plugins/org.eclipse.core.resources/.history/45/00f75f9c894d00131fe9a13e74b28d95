package padraoSingleton;

public class Conexao {

	private  String address, username, password;
	private static Conexao instancia;
	
	private Conexao(){}
	
	public Conexao(String address, String username, String password){
		this.address = address;
		this.username = username;
		this.password = password;
	}
	
	/*
	public String toString(){
		String retorno = "Adress:" + address+ "\n"+
				"Username" + username+ "\n" +
				"PassWord" + password;
		
		return retorno;
	}
	*/
	
	public static Conexao getConexao(){
			
		if(instancia == null)
			instancia = new Conexao();
		return instancia;
	}

}
