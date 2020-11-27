
public class ContaBancaria {
	private int    numeroConta;
	private String nomeTitular;
	private String cpfTitular;
	private double saldo;
	
	// já que os atributos estão "blindados" (encapsulados), precisamos criar métodos para
	// tanto modificar quanto consultar os valores destes atributos
	

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) throws IsiException{
			if (numeroConta <= 0) {
				throw new IsiException("Numero de conta invalido");
			}
			this.numeroConta = numeroConta;
		}

		public String getNomeTitular() {
			return nomeTitular;
		}

        public void setNomeTitular(String nomeTitular) throws IsiException{
			if (nomeTitular == null || nomeTitular.length() == 0) {
				throw new IsiException("Nome do titular deve ser preenchido");
			}
			this.nomeTitular = nomeTitular;
		}

		public String getCpfTitular() {
			return cpfTitular;
		}
		public void setCpfTitular(String cpfTitular) throws IsiException {
			if (cpfTitular == null || cpfTitular.length() == 0) {
				throw new IsiException("CPF do Titular inv�lido");
			}
			this.cpfTitular = cpfTitular;
		}

		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) throws IsiException {
			if (saldo < 0) {
				throw new IsiException("Saldo invalido");
			}

			this.saldo = saldo;
		}
		public void depositar(double valor) throws IsiException {
			if (valor < 0) {
				throw new IsiException("Valor para deposito nao permitido");
			}
			saldo = saldo + valor;
			// ou seja, somo ao saldo o valor passado como par�metro
		}
		public boolean sacar(double valor) throws IsiException {
			if (valor < 0) {
				throw new IsiException("Valor para saque nao permitido");
			}
			if (saldo >= valor) {  // tenho saldo suficiente
				saldo = saldo - valor;
				return true;   // indicando que o saque foi autorizado
		}
		else {
			return false;  // retornar false indica que o saque não foi autorizado
		}
	}
	
	public String mostrarInfo() {
		String infoConta;
		infoConta = "Conta "+numeroConta+" / "+nomeTitular+" ("+cpfTitular+")  R$  "+saldo;
		return infoConta;
	}
}
