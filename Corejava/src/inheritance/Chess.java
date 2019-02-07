package inheritance;

public class Chess {
	public Chess(int a){
		System.out.println("paramter");
	}
	public void get() {
		System.out.println("get");
	}

}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		System.out.println("BoardGame constructor");
	}
}

class Game {
	Game(int i) {
		System.out.println("Game constructor");
	}
}