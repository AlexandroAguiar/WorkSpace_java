
package userinterface;

import Model.CartaoCashBack;
import Model.CartaoPrePago;

public class FrontEnd {
	public static void main(String[] args) {
		CartaoPrePago cartoes[];
		cartoes = new CartaoPrePago[4];

		cartoes[0] = new CartaoPrePago("9999 9999 9999 9999", "Alexandro9", 2020, 04, 1000.0);
		cartoes[1] = new CartaoCashBack("8888 8888 8888 8888", "Alexandro8", 2021, 04, 1000.0, 1);
		cartoes[2] = new CartaoCashBack("7777 7777 7777 7777", "Alexandro7", 2022, 04, 1000.0, 2);
		cartoes[3] = new CartaoCashBack("6666 6666 6666 6666", "Alexandro6", 2023, 04, 1000.0, 3);
		for (CartaoPrePago c : cartoes) {
			System.out.println(c);
		}
		for (CartaoPrePago c : cartoes) {
			System.out.println(c);
			if (c.comprar(100.0)) {
				System.out.println("Compra aprovada!");
			}

		}
		for (CartaoPrePago c : cartoes) {
			System.out.println(c);
		}
	}
}
