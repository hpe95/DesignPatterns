package Proxy;

import java.util.Vector;

public interface GameObject {
	
	/*protected Integer x, y;
	protected Integer width, height;
	protected String textureName;
	protected Vector<int[]> position;*/ //should contain only two integers
	
	void draw(Integer x, Integer y, Integer width, Integer height);
	void inputHandle(Vector<int[]> position);
	
	
}
