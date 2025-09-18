package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.Mario;
import com.in28minutes.learn_spring_framework.game.PacmanGame;
import com.in28minutes.learn_spring_framework.game.SuperContra;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		//var game = new Mario();
//		var game = new SuperContra();
		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
		
		gameRunner.run();

	}

}
