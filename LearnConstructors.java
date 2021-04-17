class MyConstructor {
	int sid;
	String sname;
	int age; 
	
	// Basic Constructor and parameterized constructor its overloading
/*	MyConstructor(int i, int a){
		sid = i;
		age = a;
	}
	MyConstructor(int i, String s, int a){
		sid = i;
		age = a;
		sname = s;
	} 
*/
	
	//Copy Constructors
	MyConstructor(int sid, String sname){
		this.sid = sid;
		this.sname = sname;
	}
	MyConstructor(MyConstructor myc){
		this.sid = myc.sid;
		this.sname = myc.sname;
	}
}

public class LearnConstructors {
	
	static {
		System.out.println("Checking Static block of Java and its call");
	}
	
	public static void main(String args[]) {
		
		MyConstructor myc1 = new MyConstructor(5, "Amey");
		System.out.println(myc1.sid);
		System.out.println(myc1.sname);
		MyConstructor myc2 = new MyConstructor(myc1);
		System.out.println(myc2.sname);
	}
}
