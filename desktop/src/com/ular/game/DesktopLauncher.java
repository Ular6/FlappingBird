package com.ular.game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Window;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration;
import com.ular.game.FlappyDemo;

public class DesktopLauncher {
	public static void main (String[] arg) {

		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setTitle(FlappyDemo.TITLE);
		config.setForegroundFPS(60);
		new Lwjgl3Application(new FlappyDemo(), config);
	}
}
