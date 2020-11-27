
public class PrincipalV2 {
	public static void main(String[] args) {

		// Variavel do tipo produto e (chamei de p)
		ProdutoV2 p_2;
		ProdutoV2 p2_2;
		
		// o que faz o operador NEW?
		// basicamente ele cria a area de memoria correspondente a estutura do tipo Produto.
		p_2 = new ProdutoV2();
		p2_2 = new ProdutoV2();
		
		//vamos preeencher o produto com valores?
		p_2.codigo    = 123;
		p_2.nome      = "Bolsa Luis Vitao";
		p_2.preco     = 29.90;
		p_2.categoria = "Acessorios";
	    p_2.qtde      = 10;
	    
	    p2_2.codigo    = 456;
		p2_2.nome      = "Relogio Rolequizz";
		p2_2.preco     = 59.90;
		p2_2.categoria = "Moda Fina";
	    p2_2.qtde      = 6;
		
	    p_2.imprimir();
	    double novoPreco1;
	    novoPreco1 = p_2.calcularDesconto(15.0);
		System.out.println("Desconto promocional - "+novoPreco1);
		System.out.println();
		p2_2.imprimir();
		double novoPreco2;
	    novoPreco2 = p2_2.calcularDesconto(25.0);
		System.out.println("Desconto promocional - "+novoPreco2);
	}

}
