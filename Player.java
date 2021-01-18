import java.util.Scanner;

public class Player {
	int number;
	String name;
	
	void getName() {
		System.out.print("Enter Name - ");
	}
	void setName(String name) {
		this.name = name;
	}
	void guessNumber() {
		System.out.print("Enter the number mate :: ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
	}
}
