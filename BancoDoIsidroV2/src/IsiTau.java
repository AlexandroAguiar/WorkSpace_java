import com.sun.java_cup.internal.runtime.Scanner;

public class IsiTau {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		ContaBancaria cb;
		cb = new ContaBancaria();
		

		// vou preencher como se estivese recuperando dados de um BD
		cb.setNumeroConta(12321);
		cb.setNomeTitular("Professor Isidro");
		cb.setCpfTitular("987.654.321-00");
		cb.setSaldo(0.0);

		try {
			cb.setNumeroConta(12321);
			cb.setNomeTitular("Professor Isidro");
			cb.setCpfTitular("987.654.321-00");
			cb.setSaldo(0.0);
		} catch (IsiException ex) {
			System.out.println("Erro ao recuperar dados do BD");
		}

		int opcao = 0;
		double valor;
		boolean resultado;
		do {
			try {
				System.out.println("**************************************");
				System.out.println("** ISITAU Aqui a moeda é forte      **");
				System.out.println("**************************************");
				System.out.println("   Escolha sua opcao      ");
				System.out.println("   1 - Deposito           ");
				System.out.println("   2 - Saque              ");
				System.out.println("   3 - Exibir Informações ");
				System.out.println("  -1 - Encerrar           ");
				System.out.print("   Digite: ");
				opcao = teclado.nextInt();
				switch (opcao) {
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
						System.out.println("    SAQUE AUTORIZADO - Novo Saldo R$ " + cb.getSaldo());
					} else {
						System.out.println("    SALDO INSUFICIENTE - VERIFIQUE");
					}
					break;
				case 3:
					System.out.println("    DADOS da sua conta: ");
					System.out.println(cb.mostrarInfo());
					break;
				case -1:
					System.out.println("  OBRIGADO POR CONFIAR SEU RICO $$ CONOSCO");
					break;
				default:
					System.out.println("ERRO - opcao invalida");
				}
			} catch (IsiException ex) {
				System.out.println("Erro na operacao - " + ex.getMessage());
			}

		} while (opcao != -1);
		teclado.close();
	}
}
	