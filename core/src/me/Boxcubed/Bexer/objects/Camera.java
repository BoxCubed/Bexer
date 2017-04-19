package me.Boxcubed.Bexer.objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

import me.Boxcubed.Bexer.BdxApp;

public class Camera extends com.nilunder.bdx.Camera { 
	Vector3 lastMousePos;
	Vector3 newMousePos;
	Vector3 rotate;
	Vector2 middle=new Vector2(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
	@Override
	public void init() {
		//lastMousePos=data.unproject(new Vector3(Gdx.input.getX(), Gdx.input.getY(), 0));
		rotate=new Vector3(-55, 0, 0);
	}
	@Override
	public void main() {
		transform(BdxApp.scene.objects.get("Sacky").transform());
		rotate(rotate.x,rotate.y,rotate.z);
		newMousePos=new Vector3(Gdx.input.getX(), Gdx.input.getY(), 0);
		rotate.x=(-11*newMousePos.y)/45+562199/4500;
		System.out.println((178-newMousePos.y)/125+" "+newMousePos.y);
		//-57to-53      -53/0 -57/500  y=450/-110x+511
		if(Gdx.input.isKeyPressed(Keys.MINUS))
			rotate.x-=0.01f;
		if(Gdx.input.isKeyPressed(Keys.EQUALS))
			rotate.x+=0.01f;
		
		
	}

}
