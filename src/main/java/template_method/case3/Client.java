package template_method.case3;

import template_method.case3.implementation.Chess;
import template_method.case3.implementation.Soccer;
import template_method.case3.template.Game;

public class Client {

	public static void main(String[] args) {
		Game game1 = new Chess();
		game1.play();

		System.out.println("-------------------------");
		Game game2 = new Soccer();
		game2.play();
	}

}
