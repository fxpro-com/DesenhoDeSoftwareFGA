package CompositeExemploAula;

import java.util.Enumeration;
import java.util.Vector;


public  class Composto implements Componente{

	String nome;
	private Vector <Componente> comp = new Vector <Componente>();
	
	public Composto(String nome){
		this.nome = nome;
		
		comp = new Vector <Componente>();
	}
	
	@Override
	public void operation() {
		System.out.println(nome);
		Enumeration <Componente> e = comp.elements();
		
		while (e.hasMoreElements()){
			Componente c = e.nextElement();
			c.operation();
			
		}
		
	}

	@Override
	public void addComponente(Componente c) {
		comp.add(c);
		
	}

	@Override
	public void add(Folha folha) {
		
	}

}
