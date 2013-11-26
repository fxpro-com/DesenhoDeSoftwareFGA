package Composite;

import ExemploComposite.Componente;
import ExemploComposite.Folha;

public interface Componente {
	
	void operation();
	
	void addComponente( Componente C);

	void add(Folha folha);
	
	

}
