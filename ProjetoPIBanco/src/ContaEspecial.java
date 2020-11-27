
public class ContaEspecial extends Conta{
	protected float limite;

	public ContaEspecial(String nomeTitular, String cpf, int numeroConta, float saldo, float limite) {
		super(nomeTitular, cpf, numeroConta, saldo);
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + ", nomeTitular=" + nomeTitular + ", cpf=" + cpf + ", numeroConta="
				+ numeroConta + ", saldo=" + saldo + "]";
	}
	
	public boolean debitar(float valor) {
		if (valor <= saldo + limite) {
			saldo = saldo - valor;
			return true;
		} else {
			return false;
		}
	}
}
