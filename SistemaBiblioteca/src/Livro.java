
public class Livro {
	private String titulo;
	private String autor;
	private int anodeplic;
	private String categoria;
	private int numest, numeprt;
	boolean emprest;
	
	public Livro(String titulo, String autor, int anodeplic, String categoria, int numest, int numeprt, boolean emprest) {
		this.titulo = titulo;
		this.autor = autor;
		this.anodeplic = anodeplic;
		this.categoria = categoria;
		this.numest = numest;
		this.numeprt = numeprt;
		this.emprest = emprest;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnodeplic() {
		return anodeplic;
	}

	public void setAnodeplic(int anodeplic) {
		this.anodeplic = anodeplic;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getNumest() {
		return numest;
	}

	public void setNumest(int numest) {
		this.numest = numest;
	}

	public int getNumeprt() {
		return numeprt;
	}

	public void setNumeprt(int numeprt) {
		this.numeprt = numeprt;
	}

	public boolean isEmprest() {
		return emprest;
	}

	public void setEmprest(boolean emprest) {
		this.emprest = emprest;
	}

	public void emprestar() {
		this.emprest = true;
	}

	public void devolver() {
		this.emprest = false;
	}

	public String exibirinfo() {
		String resultado;
		resultado = "Livro:'"+titulo+ "'/ Autor:'" + autor+ "'/ Ano de Publicacao:'" + anodeplic + "'/ Categoria:'" + categoria + "'/ NºEstante:'" +numest+ "'/ NºPrtateleira:'" +numeprt+ "'/ Esta emprestado:'" +emprest +"'\n";
		String empr;
		if (emprest) {
			empr = " Livro Emprestado";
		}
		else {
			empr = " Livro Disponivel no Acervo";
		}
		return resultado + empr;
		
	}

}
