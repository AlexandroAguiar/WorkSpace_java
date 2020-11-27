package br.com.alecorp.folhapgto.backend;

public class Comissionado extends Funcionario {

	private float salarioBase;
	private float comissao;
	
	public Comissionado(String nome, int numeroRegistro, float salarioBase, float comissao) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}
	
	public float calcularSalario() {
		return salarioBase + salarioBase * comissao / 100;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
}
