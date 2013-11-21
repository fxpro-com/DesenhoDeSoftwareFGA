package Fachada;

public class Fachada {
	
	public void funcionalidade1(){
		System.out.println("Fachada: funcionalidade1()");
		
		new A().m1();
		new B().m4();
		new A().m2();
		new D().m3();
	}
	
	public void funcionalidade2(){
		System.out.println("Fachada: funcionalidade2()");
		new C().m2();
		new B().m5();
		new D().m1();
	}
	
	public void funcionalidade3(){
		System.out.println("Fachada: funcionalidade3()");
		new A().m3();
		new B().m4();
		new C().m2();
		new D().m1();
	}

}
