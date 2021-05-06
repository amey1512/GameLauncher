
public class ThrowException {
	
	int getValue(int a) throws ArrayIndexOutOfBoundsException {
//		if (a > 5) {
//			throw new ArithmeticException("number is large");
//		}
//		else System.out.println("valid number");
		
		int b[] = new int[5];
		b[6] = 5;
		return 0;
	}
	
	public static void main( String args[]) {
		ThrowException te = new ThrowException();
		int d = 0;
		
		try {
			d = te.getValue(6);	
		}
		catch(Exception e) {
			System.out.println("Inside main");
			System.out.print(d);
		}
	}
}
