package core;


/* a operacão EXTENDS pode ser interpretada como:
 * 
 * 
 *   A classe ESTUDANTE tem TUDO O QUE TEM EM PESSOA, mais as suas respectivas Particularidades
 */
public class Estudante extends Pessoa{
		
	private int numMatricula;
	private String curso;
	
	public Estudante(String nome, String telefone, String email, int numMatricula, String curso) {
		super(nome, telefone, email); // a 1a linha obrigatoriamente é chamar o construtor da classe pai
		this.numMatricula = numMatricula;
		this.curso = curso;
	}
	
	public int getNumMatricula() {
		return numMatricula;
	}
	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Estudante [numMatricula=" + numMatricula + ", curso=" + curso + ", nome=" + nome + ", telefone="
				+ telefone + ", email=" + email + "]";
	}
}
