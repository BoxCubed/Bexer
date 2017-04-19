package me.Boxcubed.Bexer.objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.math.Vector3;

import me.Boxcubed.Bexer.BdxApp;

public class Sacky extends GameOPack{
	
	
	
	
	
	@Override
	public void init() {
		BdxApp.objects.add(this);
		pos=new Vector3();
	}
	
	@Override
    public void main(){
        if (Gdx.input.isKeyJustPressed(Keys.SPACE))
            applyForce(0, 0, 300);
        if(Gdx.input.isKeyPressed(Keys.W))
        	applyForce(0, 5, 0);
        
        if(Gdx.input.isKeyPressed(Keys.S))
        	applyForce(0, -5, 0);
        
        if(Gdx.input.isKeyPressed(Keys.D))
        	applyForce(5, 0, 0);
        
        if(Gdx.input.isKeyPressed(Keys.A))
        	applyForce(-5, 0, 0);
        
    }
    
}