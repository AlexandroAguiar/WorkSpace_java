
public class ContaBancaria {
	int numeroConta;
	String nomeTitular;
	String cpfTitular;
	double saldo;
	
	void depositar (double valor) {
		saldo = saldo + valor;
		
	}
	boolean sacar (double valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
			return true;
		}
		else {
			return false;
		}
	}
    String mostraInfo() {
    	String infoConta;
    	infoConta = "Conta " +numeroConta+ " / " +nomeTitular+ " ("+cpfTitular+") R$ "+saldo;
    	return infoConta;
    }
}
