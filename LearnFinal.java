class finalA{
	int id;
	String name;
	final int age;
	final static int rollNo;
	
	finalA(){
		System.out.println("Inside Constructor\n");
		id= 5;
		name ="Amey";
		age = 10;
	}
	
	static {
		System.out.println("Inside static initializer block\n");
		rollNo = 621;
	}
	
	void display() {
		System.out.println("age = "+age+"\n");
		System.out.println("rollNO = "+rollNo+"\n");
	}
	
	int increase( final int n) { //final parameter can not be changed.
		int m = n;   //n++;
		return m;
	}
}

public class LearnFinal {
	public static void main(String args[]) {
		System.out.println("Inside main\n");
		finalA fa = new finalA();
		fa.display();
		fa.increase(5);
	}
}
