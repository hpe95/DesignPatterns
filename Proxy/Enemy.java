package Proxy;

import java.util.Vector;

public class Enemy implements GameObject {

	@Override
	public void draw(Integer x, Integer y, Integer width, Integer height) {
		System.out.println("DRAWING ENEMY");
		System.out.println("Drawing at xPos: " + x);
		System.out.println("Drawing at yPos: " + y);
		System.out.println("Drawing with width value: " + width);
		System.out.println("Drawing with height value: " + height);
		
	}

	@Override
	public void inputHandle(Vector<int[]> position) {
		System.out.println("HANDLING INPUT ENEMY");
		
	}

}
