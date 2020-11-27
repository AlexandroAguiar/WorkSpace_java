public class Empregado {
	public static void main(String[] args) {
		
			Resultado r1,r2,r3;
			r1 = new Resultado();
			r2 = new Resultado();
			r3 = new Resultado();
			
		r1.User     = "Alexandro";
		r1.Cargo    = "Analista";
		r1.Salario  = 1000.00;
	    
		r2.User     = "Alexandro Aguiar";
		r2.Cargo    = "Analista PL";
		r2.Salario  = 2000.00;
		
		r3.User     = "Alexandro Aguiar Souza";
		r3.Cargo    = "Analista SR";
		r3.Salario  = 2000.00;
		
	    r1.imprimir();
	    double novoSalario1;
	    novoSalario1 = r1.calcularAumento(15.0);
		System.out.println("Novo Salario - "+novoSalario1);
		System.out.println();
		r2.imprimir();
		double novoSalario2;
	    novoSalario2 = r2.calcularAumento(15.0);
		System.out.println("Novo Salario - "+novoSalario2);
		System.out.println();
		r3.imprimir();
		double novoSalario3;
	    novoSalario3 = r3.calcularAumento(15.0);
		System.out.println("Novo Salario - "+novoSalario2);
		System.out.println();
	}

}
