package userinterface;

import core.Estudante;
import core.Pessoa;

public class ClassePrincipal {
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Isidro", "98765-4321", "isidro@isidro.com");
		Estudante e = new Estudante("Robernilson","91234-5678","rober@nilson.com",9876,"Computacao");
		
		System.out.println(p);
		System.out.println(e);
		
	}

}
