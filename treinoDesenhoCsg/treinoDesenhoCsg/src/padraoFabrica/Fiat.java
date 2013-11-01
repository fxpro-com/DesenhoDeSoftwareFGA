package padraoFabrica;

public class Fiat extends FabricaAbstrata{

	@Override
	public Utilitario criarVeiculoUtilitario(){
		return new Strada();
	}
	
	@Override
	public Passeio criarVeiculoPasseio(){
		return new Palio();
	}

}
