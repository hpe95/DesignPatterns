package Proxy;

public class Main {

	public static void main(String[] args) {
		GameObject player = new Player();
		GameObjectProxy gameObjectProxy = new GameObjectProxy(player);
		gameObjectProxy.draw(1, 1, 1, 1);
	}

}
