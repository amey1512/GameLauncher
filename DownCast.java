class Animal {
	void put() {
		System.out.println("Animal is eating\n");
	}
}

class Dog extends Animal {
	void put() {
		System.out.println("Animal is eating\n");
	}
	int xval =5;
	
	static void method(Animal a) {
		if( a instanceof Dog) {
			Dog d = (Dog) a;
			System.out.println("Instance downcasted - "+ d.xval);
		}
	}
	
}

public class DownCast {
	public static void main(String args[]) {
//		Dog d = new Animal();  //Compile time error
		
//		Dog d = (Dog)new Animal();  // Throws classcast exception
		
		Animal a = new Dog();	
		Dog.method(a);
	}
}
