package template_method.case3.implementation;

import template_method.case3.template.Game;

public class Chess extends Game {

	@Override
	protected void initialize() {
		System.out.println("Chess Game Initialized! Start playing.");
	}

	@Override
	protected void start() {
		System.out.println("Game Started. Welcome to in the chess game!");
	}

	@Override
	protected void end() {
		System.out.println("Game Finished!");
	}
}
