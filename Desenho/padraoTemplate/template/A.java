package template;

public class A {
	
	public static A referencia;
	
	public void op1() {
	}
	public void op2() {
	}
	
	public void metodoTemplate(){
		System.out.println("Comportamento comum 1");
		referencia.op1();
		
		System.out.println("Comportamento comum 2");
		referencia.op2();
		
		System.out.println("Comportamento comum 3");
	}

}
