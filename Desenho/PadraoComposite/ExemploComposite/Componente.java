package ExemploComposite;

import Composite.Componente;
import Composite.Folha;

public interface Componente {
	
	void operation();
	
	void addComponente( Componente C);

	void add(Folha folha);
	
	

}
