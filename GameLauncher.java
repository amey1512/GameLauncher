
public class GameLauncher {
	static GuessGame g;
	
	public static void main( String args[]) {
		System.out.print("Hello Welcome to Game Launcher");
		GuessGame g = new GuessGame();
		g.startGame();
	}
	
	public static void main() {
		System.out.print("Main method overloaded- no args");
	}
	
	public static void main(int a) {
		System.out.print("Main method overloaded - int");
	}
}
