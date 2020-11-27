package Model;

public class CartaoCashBack extends CartaoPrePago {

	private int tipo;

	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoVal, int mesVal, double saldo, int tipo) {
		super(numeroCartao, nomeTitular, anoVal, mesVal, saldo);
		this.tipo = tipo;
	}
	
	public boolean comprar(double valor) {
		if (super.saldo >= valor) {
			super.saldo -= valor;
			
			if (tipo == 1) {
				super.saldo += valor * 0.08;
			}
			else if (tipo == 2) {
				super.saldo += valor * 0.05;
			}
			else if (tipo == 3) {
				super.saldo += valor * 0.02;
			}
			
			return true;
		}
		else {
			return false;
		}
	}

	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "CartaoCashBack [tipo=" + tipo + ", numeroCartao=" + numeroCartao + ", nomeTitular=" + nomeTitular
				+ ", anoVal=" + anoValidade + ", mesVal=" + mesValidade + ", saldo=" + saldo + "]";
	}
}