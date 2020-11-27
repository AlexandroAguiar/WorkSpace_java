package br.com.alecorp.folhapgto.frontend;

import java.util.ArrayList;

import br.com.alecorp.folhapgto.backend.Chefe;
import br.com.alecorp.folhapgto.backend.Comissionado;
import br.com.alecorp.folhapgto.backend.Empreiteiro;
import br.com.alecorp.folhapgto.backend.Funcionario;
import br.com.alecorp.folhapgto.backend.Horista;

public class Folha {
	public static void main(String[] args) {
		
		ArrayList<Funcionario> pgto;
		
		pgto = new ArrayList<Funcionario>();
		
		pgto.add(new Chefe("Alexandro", 0001, 1000.0f, 1000.0f, 5000.0f));
		pgto.add(new Comissionado("Isidro", 0002, 30000.0f, 100f));
		pgto.add(new Horista("Regiane", 0003, 100000.0f, 5));
		pgto.add(new Empreiteiro("Abel", 0004, 5000.0f));
		
		for (Funcionario f: pgto) {
			//System.out.println(f.getNome()+" R$ " + f.calcularSalario());
			System.out.printf("%5d %30s R$ %9.2f\n ", f.getNumeroRegistro(), f.getNome(), f.calcularSalario());
		}
	}

}
