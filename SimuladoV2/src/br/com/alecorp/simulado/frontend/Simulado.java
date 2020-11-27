
package br.com.alecorp.simulado.frontend;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.alecorp.simulado.model.QuestaoComDica;
import br.com.alecorp.simulado.model.QuestaoMutiplaEscolha;
import br.com.alecorp.simulado.model.QuestaoSimples;

public class Simulado {
	public static void main(String[] args) {
		float acertos=0;
		String resposta;
	
//		QuestaoSimples S[];
//		S = new QuestaoSimples[3];
//		
//		S[0] = new QuestaoSimples ("%n Quem descobriu o Brasil? %n", "Pedro Alvares Cabral");
//		S[1] = new QuestaoMutiplaEscolha ("Qual é esse curso? \n", "JAVA" , "COBOL", "HTML","C#", "JAVA");
//		S[2] = new QuestaoComDica ("Como termina esse curso? \n", "Nao Sei!", "Vamos Ver!");
//		
//		for(int pos=0; pos < 3; pos++) {
//			System.out.println(S[pos].aplicarQuestao());
//			
//		}
		
		ArrayList<QuestaoSimples> lista;
		
		lista = new ArrayList<QuestaoSimples>();
		
		lista.add(new QuestaoSimples("\n Quem descobriu o Brasil? \n", "Pedro Alvares Cabral"));
		lista.add(new QuestaoMutiplaEscolha("Qual é esse curso? \n", "JAVA" , "COBOL", "HTML","C#", "JAVA"));
		lista.add(new QuestaoComDica("Como termina esse curso? \n", "Nao Sei!", "Vamos Ver!"));
		
		for (int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i).aplicarQuestao());
			
		}
		
		for (QuestaoSimples q: lista) {
			
			resposta = JOptionPane.showInputDialog(q.aplicarQuestao());
			if (q.corrigir(resposta)) {
				acertos = acertos +1;
			}
		}
			JOptionPane.showMessageDialog(null,
					"Sua nota final foi " +String.format("%.2f", acertos/lista.size()*10),
					"Resultado",
					JOptionPane.INFORMATION_MESSAGE);
	}
}
