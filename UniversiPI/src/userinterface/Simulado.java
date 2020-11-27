
package userinterface;

import model.QuestaoSimples;
import model.QuestaoMutiplaEscolha;
import model.QuestaoComDica;

public class Simulado {
	public static void main(String[] args) {
		QuestaoSimples S[];
		S = new QuestaoSimples[3];
		
		S[0] = new QuestaoSimples ("\n Quem descobriu o Brasil? \n", "Pedro Alvares Cabral");
		S[1] = new QuestaoMutiplaEscolha ("Qual é esse curso? \n", "JAVA" , "COBOL", "HTML","C#", "JAVA");
		S[2] = new QuestaoComDica ("Como termina esse curso? \n", "Nao Sei!", "Vamos Ver!");
		
		for(int pos=0; pos < 3; pos++) {
			System.out.println(S[pos].aplicarQuestao());
			
		}
		
				
	}
}
