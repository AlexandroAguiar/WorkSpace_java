
public class Emprestimo {
	public static void main(String[] args) {
		Livro l1, l2, l3, l4, l5;
		l1 = new Livro("O Livro", "Mane", 1800, "Sem nocao", 1, 2, true);
		l2 = new Livro("O Mane", "Ze", 1900, "Sem nocao ao quadrado", 1, 3, false);
		l3 = new Livro("O Ze ruela", "Jao", 1950, "Sem nocao ao quadrado", 2, 1, true);
		l4 = new Livro("Jao e o pe", "Maria", 2000, "Sem nocao ao quadrado", 2, 2, true);
		l5 = new Livro("O fim do Mundo", "China", 2020, "Coronga", 100, 100, true);

		System.out.println(l1.exibirinfo());
		System.out.println(l2.exibirinfo());
		System.out.println(l3.exibirinfo());
		System.out.println(l4.exibirinfo());
		System.out.println(l5.exibirinfo());

		l1.emprestar();
		System.out.println(l1.exibirinfo());
		l2.emprestar();
		System.out.println(l2.exibirinfo());
	}

}
