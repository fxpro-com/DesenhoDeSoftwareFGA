package padraoFabrica;

public abstract class FabricaAbstrata {

	
	public abstract Passeio criarVeiculoPasseio();
	public abstract Utilitario criarVeiculoUtilitario();
	
	private static FabricaAbstrata intanciaVw, instanciaFiat;
	
	public static FabricaAbstrata getFabrica(int param){
		
		switch(param){
		
			case 1:
				
				if(intanciaVw == null)
					intanciaVw = new VW();
					return intanciaVw;
			
			case 2: 
				if(instanciaFiat == null)
					instanciaFiat =  new Fiat();
				return instanciaFiat;
	
			default: 
				return null;
	
		}
	}
	

}
