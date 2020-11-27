
public class Principal {
	public static void main(String[] args) {

		// Variavel do tipo produto e (chamei de p)
		Produto p;
		Produto p2;
		
		// o que faz o operador NEW?
		// basicamente ele cria a area de memoria correspondente a estutura do tipo Produto.
		p = new Produto();
		p2 = new Produto();
		
		//vamos preeencher o produto com valores?
		p.codigo    = 123;
		p.nome      = "Bolsa Luis Vitao";
		p.preco     = 29.90;
		p.categoria = "Acessorios";
	    p.qtde      = 10;
	    
	    p2.codigo    = 456;
		p2.nome      = "Relogio Rolequizz";
		p2.preco     = 59.90;
		p2.categoria = "Moda Fina";
	    p2.qtde      = 6;
		
		System.out.println("Produto "+p.codigo+" - "+p.nome);
		System.out.println("Categoria "+p.categoria);
		System.out.printf("Preço R$ %.2f Quantidade Estoque: %d\n",p.preco,p.qtde);
		System.out.println();
		System.out.println("Produto "+p2.codigo+" - "+p2.nome);
		System.out.println("Categoria "+p2.categoria);
		System.out.printf("Preço R$ %.2f Quantidade Estoque: %d\n",p2.preco,p2.qtde);
	}

}
