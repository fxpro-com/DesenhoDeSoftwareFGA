package padraoFabricaAbstrata;

public class VW extends FabricaAbstrata {

	public Passeio criarVeiculoPasseio(){
		return new Fox();
	}
	
	public Utilitario criarVeiculoUtilitario(){
		return new Saveiro();
	}

}
