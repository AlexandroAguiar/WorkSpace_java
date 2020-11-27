import java.util.Scanner;

public class IsiTau {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		ContaBancaria cb;
		cb = new ContaBancaria();
		
		// vou preencher como se estivese recuperando dados de um BD
		cb.numeroConta = 12321;
		cb.nomeTitular = "Professor Isidro";
		cb.cpfTitular  = "987.654.321-00";
		cb.saldo       = 0.0;
		
		int opcao;
		double valor;
		boolean resultado;
		
		do {
			System.out.println("**************************************");
			System.out.println("** ISITAU Aqui a moeda é forte      **");
			System.out.println("**************************************");
			System.out.println("   Escolha sua opcao      ");
			System.out.println("   1 - Deposito           ");
			System.out.println("   2 - Saque              ");
			System.out.println("   3 - Exibir Informações ");
			System.out.println("  -1 - Encerrar           ");
			System.out.print  ("   Digite: ");
			opcao = teclado.nextInt();
			switch(opcao) {
			case 1:
				System.out.print("   Digite o valor a depositar R$ ");
				valor = teclado.nextDouble();
				cb.depositar(valor);
				System.out.println("    Deposito efetivado ");
				break;
			case 2:
				System.out.print("   Digite o valor a sacar R$ ");
				valor = teclado.nextDouble();
				// resultado = ;
				if (cb.sacar(valor)) {
					System.out.println("    SAQUE AUTORIZADO");
				}
				else {
					System.out.println("    SALDO INSUFICIENTE - VERIFIQUE");
				}
				break;
			case 3:
				System.out.println("    DADOS da sua conta: ");
				System.out.println(cb.mostraInfo());
				break;
			case -1:
				System.out.println("  OBRIGADO POR CONFIAR SEU RICO $$ CONOSCO");
				break;
			default:
				System.out.println("ERRO - opcao invalida");
			}
			
			
		} while (opcao != -1);
		
		
		
		
		
		teclado.close();
		
	}

}
