package compositeExemploCongresso;

public abstract class Participante {
	
    public String getNome() {
		return null;
	}
    
    public int getAssento() {
        throw new UnsupportedOperationException();
    }
 
    public void adicionar(Participante participante) {
        throw new UnsupportedOperationException();
    }
 
    public void remover(Participante participante) {
        throw new UnsupportedOperationException();
    }
 
    public Participante getFilho(int index) {
        throw new UnsupportedOperationException();
    }
	

}
