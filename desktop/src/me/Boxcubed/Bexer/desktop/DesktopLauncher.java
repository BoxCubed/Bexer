package me.Boxcubed.Bexer.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import me.Boxcubed.Bexer.BdxApp;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Bexer";
		config.width = 800;
		config.height = 450;
		new LwjglApplication(new BdxApp(), config);
	}
}
