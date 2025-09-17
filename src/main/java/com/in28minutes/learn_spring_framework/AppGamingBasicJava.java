package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.Mario;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		var mario = new Mario();
		var gameRunner = new GameRunner(mario);
		
		gameRunner.run();

	}

}
