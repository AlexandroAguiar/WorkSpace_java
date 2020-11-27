package core;

public class Pessoa extends Object{
	protected String nome;     // ao trocar de PRIVATE para PROTECTED, a idéia é que eu consiga
	protected String telefone; // continuar bloqueando o acesso aos atributos para outras classes de 
	protected String email;    // outros pacotes, entretanto liberar o acesso às classes filhas
	
	public Pessoa(String nome, String telefone, String email) {
		super();   // isso aqui é a chamada ao construtor da classe Object (já que toda classe é filha de Object), e ele cuida de inicializar os atributos
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", telefone=" + telefone + ", email=" + email + "]";
	}
}
