class MyConstructor {
	int sid;
	String sname;
	int age; 
	// Basic Constructor and parameterized constructor its overloading
	MyConstructor(int i, int a){
		sid = i;
		age = a;
	}
	MyConstructor(int i, String s, int a){
		sid = i;
		age = a;
		sname = s;
	}
	
}


public class LearnConstructors {
	public static void main(String args[]) {
		
		MyConstructor myc = new MyConstructor(005, "Amey", 12);
		System.out.println(myc.sid);
		System.out.println(myc.age);
		System.out.println(myc.sname);
		
	}
}
