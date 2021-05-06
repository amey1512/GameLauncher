interface Printable{
	int x =5;
	void print();  
	
	
	//to check Java8 feature of adding default.
	default void dfaultMethod() {
		System.out.println("Default method test - Printable");
	}
}

interface Showable extends Printable{  
	void show();  
	
	
	//to check Java8 feature of adding default.
	//we can override default method in dfaultMethod() 
	default void dfaultMethod() {
		System.out.println("Default method test - Showable");
	}
}

//class ParentChecks{
//	int y = 10;
//}

public class LearnInterface implements Showable{ 
	
	public void print(){
		System.out.println("Hello");
	}  
	
	public void show(){
		System.out.println("Welcome");
	}

	int y = 5;
	public static void main(String args[]){  
		LearnInterface obj = new LearnInterface();  
		obj.print();  
		obj.show();  
		System.out.println(obj.x);
		System.out.println(obj.y);
		
		
		
		//to check Java8 feature of adding default.
		obj.dfaultMethod();
		
		Showable sh = new LearnInterface();
		sh.dfaultMethod();
		
		Printable pt = new LearnInterface();
		pt.dfaultMethod();
		
	}	
}
 