package me.Boxcubed.Bexer.inst;

import com.badlogic.gdx.utils.JsonValue;
import com.nilunder.bdx.Instantiator;import com.nilunder.bdx.GameObject;
import me.Boxcubed.Bexer.*;
public class iScene extends Instantiator {

	public GameObject newObject(JsonValue gobj){
		String name = gobj.name;

		if (gobj.get("class").asString().equals("Sacky"))
			return new me.Boxcubed.Bexer.Sacky();

		return super.newObject(gobj);
	}
	
}
