import java.util.Scanner;

public class Player {
	int number;
	String name;
	Scanner sc;
	void getName() {
		System.out.print("Enter Name - ");
	}
	void setName(String name) {
		this.name = name;
	}
	void guessNumber() {
		System.out.print("Enter the number mate :: ");
		sc = new Scanner(System.in);
		number = sc.nextInt();
	}
}
