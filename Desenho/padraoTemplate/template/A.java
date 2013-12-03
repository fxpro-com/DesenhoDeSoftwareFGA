package template;

public class A {
	
	public static A referencia;
	
	public void op1() {
		System.out.println("Metodo 1, Classe mãe");
	}
	public void op2() {
		System.out.println("Metodo 2, Classe mãe");
	}
	
	public static void metodoTemplate(){
		System.out.println("Comportamento comum 1");
		referencia.op1();
		
		System.out.println("Comportamento comum 2");
		referencia.op2();
		
		System.out.println("Comportamento comum 3");
	}
	
	public static A metodoFabrica(int i){
		
		switch (i) {
			case 1:
				if(referencia == null)
					referencia = new A1();
	
			case 2:
				if(referencia == null)
					referencia = new A2();
		}
		
		return referencia;
	}

}
