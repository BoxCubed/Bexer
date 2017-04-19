package me.Boxcubed.Bexer;

import java.util.*;

import com.badlogic.gdx.*;

import com.nilunder.bdx.*;

public class BdxApp implements ApplicationListener {

	@Override
	public void create(){
		Bdx.init();

		Scene.instantiators = new HashMap<String, Instantiator>();
		Scene.instantiators.put("Scene", new me.Boxcubed.Bexer.inst.iScene());

		Bdx.scenes.add(new Scene("Scene"));
		Bdx.firstScene = "Scene";
	}

	@Override
	public void dispose(){
		Bdx.dispose();
	}

	@Override
	public void render(){
		Bdx.main();
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
