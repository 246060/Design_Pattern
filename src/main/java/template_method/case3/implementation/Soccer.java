package template_method.case3.implementation;

import template_method.case3.template.Game;

public class Soccer extends Game {

	@Override
	protected void initialize() {
		System.out.println("Soccer Game Initialized! Start playing.");
	}

	@Override
	protected void start() {
		System.out.println("Game Started. Welcome to in the Soccer game!");
	}

	@Override
	protected void end() {
		System.out.println("Game Finished!");
	}
}
