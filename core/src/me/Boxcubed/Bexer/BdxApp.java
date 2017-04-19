package me.Boxcubed.Bexer;

import java.util.*;

import com.badlogic.gdx.*;

import com.nilunder.bdx.*;
import com.nilunder.bdx.utils.LinkedListNamed;

import me.Boxcubed.Bexer.objects.GameOPack;

public class BdxApp extends Game {
	public static Scene scene;
	public static LinkedListNamed<GameOPack> objects;
	@Override
	public void create(){
		Bdx.init();

		Scene.instantiators = new HashMap<String, Instantiator>();
		Scene.instantiators.put("Scene", new me.Boxcubed.Bexer.inst.iScene());
		
		objects=new LinkedListNamed<GameOPack>();
		Bdx.scenes.add(new Scene("Scene"));
		Bdx.firstScene = "Scene";
		scene=Bdx.scenes.get(0);
		
		
		
		
		
	}

	@Override
	public void dispose(){
		super.dispose();
		Bdx.dispose();
	}

	@Override
	public void render(){
		
		Bdx.main();
		super.render();
	}

	@Override
	public void resize(int width, int height){
		Bdx.resize(width, height);
	}

	@Override
	public void pause(){
	}

	@Override
	public void resume(){
	}
}
