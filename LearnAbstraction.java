abstract class Vehicle{
	Vehicle() {
		System.out.println("Vehicle class constructor created\n");
	}
	
	abstract void run();
	
	void start() {
		System.out.println("Vehicle has started\n");	
	}
	
	static {
		System.out.println("parent - static block created\n");
	}
}

class Bike extends Vehicle{
	Bike() {
		System.out.println("Bike class constructor created\n");	
	}
	void run() {
		this.start();
		System.out.println("Bike is running\n");
	}
	
	static {
		System.out.println("child - static block created\n");
	}
}

public class LearnAbstraction {
	static {
		System.out.println("Main - static block created\n");
	}

	public static void main(String args[]) {
		
//		Bike b = new Bike();
		Vehicle v = new Bike();
//		v.start();
		v.run();
		
	}
}
