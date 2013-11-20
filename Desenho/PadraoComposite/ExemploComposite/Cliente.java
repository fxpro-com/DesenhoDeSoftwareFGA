package ExemploComposite;

public class Cliente {
	
	public static void main(String[] args){
		
		Componente c;
		c = new Folha(2);
		c.addComponente(null);
		
		c.operation();
		
		c = new Composto("C");
		c.add(new Folha(1));
		c.add(new Folha(2));
		c.add(new Folha(3));
		
		Componente d = new Composto("D");
		d.addComponente( new Folha(4));
		d.addComponente( new Folha(5));
		
		d.addComponente(d);
		d.addComponente(d);
		
		c.operation();
		
	}

}
