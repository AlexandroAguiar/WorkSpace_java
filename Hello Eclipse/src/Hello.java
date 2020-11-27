import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a;
		float b;
		
		System.out.println("Hello");
		System.out.println("Digite o valor de A");
		a = teclado.nextInt();
		System.out.println("Valor digitado é = "+a);
		
		System.out.println("Digite o valor de B");
		b = teclado.nextFloat();
		System.out.println("Valor digitado é = "+b);	
		teclado.close();
	}

}
