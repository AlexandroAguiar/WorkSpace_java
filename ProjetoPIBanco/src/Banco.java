""
public class Banco {
	public static void main(String[] args) {
		ContaEspecial E = new ContaEspecial("Alexandro", "123.456.789-00" ,1000, 1000.00f, 2000.00f);
		Conta C = new Conta("Alexandro", "987.654.321.00", 2000, 1000.00f);
		System.out.println(C);
		
		C.creditar (300.00f);
		System.out.println(C);
		if (C.debitar(2000.00f)) {
			System.out.println("Debito Efetuado!");
			System.out.println(C);
			
		}
		else {
			System.out.println("Debito não autorizado!");
		}
		
		System.out.println(E);
		if (E.debitar(1000.00f)) {
			System.out.println("Debito Efetuado!");
			System.out.println(E);
			
		}
		else {
			System.out.println("Debito não autorizado!");
		}
	}

}
