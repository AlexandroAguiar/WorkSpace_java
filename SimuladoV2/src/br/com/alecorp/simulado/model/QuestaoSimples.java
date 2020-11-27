package br.com.alecorp.simulado.model;

public class QuestaoSimples {
	protected String enunciado;
	protected String resposta;
	
	public QuestaoSimples(String enunciado, String resposta) {
		super();
		this.enunciado = enunciado;
		this.resposta = resposta;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public boolean corrigir(String respostaaluno) {
		if (this.resposta.equals(respostaaluno)) {
			return true;
		} else {
			return false;
		}
	}
	public String aplicarQuestao() {
		return " Enunciado " + this.enunciado;
	}
}
