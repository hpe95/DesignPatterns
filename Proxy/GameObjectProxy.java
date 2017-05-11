package Proxy;

import java.util.Vector;

public class GameObjectProxy implements GameObject {
	private GameObject gameObject;
	
	public GameObjectProxy(GameObject gameObject){
		this.gameObject = gameObject;
	}
	
	@Override
	public void draw(Integer x, Integer y, Integer width, Integer height) {
		this.gameObject.draw(x, y, width, height);
		
	}

	@Override
	public void inputHandle(Vector<int[]> position) {
		this.gameObject.inputHandle(position);
		
	}
	
	
	
}
