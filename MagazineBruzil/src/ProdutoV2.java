
public class ProdutoV2 {
    int codigo;
    String nome;
    double preco;
    int qtde;
    String categoria;
    
    void imprimir() {
	System.out.println("Produto "+ codigo +" - "+ nome);
	System.out.println("Categoria "+ categoria);
	System.out.printf("Preço R$ %.2f Quantidade Estoque: %d\n ",preco,qtde);
    }
    double calcularDesconto(double desconto) {
    	//return preco * 0.9;
    	return preco - preco * desconto/100;
    }
}
