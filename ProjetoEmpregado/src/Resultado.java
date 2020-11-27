public class Resultado {
    String User;
    double Salario;
    String Cargo;
    
    void imprimir() {
	System.out.println("Nome "+ User);
	System.out.println("Cargo "+ Cargo);
	System.out.printf("Salario R$ %.2f ",Salario);
    }
    double calcularAumento(double aumento) {
    	return Salario + Salario * aumento/100;
    }
}
