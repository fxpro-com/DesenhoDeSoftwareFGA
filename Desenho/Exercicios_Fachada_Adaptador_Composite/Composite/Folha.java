package Composite;

import ExemploComposite.Componente;
import ExemploComposite.Folha;

public class Folha implements Componente{
	
	private int ma;
	
	
	Folha (int ma){
		this.ma = ma;
	}


	@Override
	public void operation() {
		System.out.println(ma);
	}


	@Override
	public void addComponente(Componente C) {
		
	}


	@Override
	public void add(Folha D) {
		
	}

}
