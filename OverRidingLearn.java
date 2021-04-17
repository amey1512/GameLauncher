class firstClass {
	
	static void printing() {
		System.out.println("firstClass message");
	}
}

class secondClass extends firstClass {

	static void printing() {
		System.out.println("secondClass message");
	}
	
	int printing(int a) {
		System.out.println("secondClass int message");
		return 5;
	}
}


public class OverRidingLearn {
	
	public static void main(String args[]) {
//		firstClass f = new firstClass();
		secondClass s = new secondClass();
		
//		f.printing();
		s.printing(6);
		
//		firstClass.printing();
//		secondClass.printing();
	}
}
