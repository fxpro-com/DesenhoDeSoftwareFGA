package padraoFabrica;

public class Fiat extends FabricaAbstrata{

	public Utilitario criarVeiculoUtilitario(){
		return new Strada();
	}
	
	public Passeio criarVeiculoPasseio(){
		return new Palio();
	}

}
