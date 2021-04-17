
public class CheckObjectCreation {
	
	public static void main(String args[]) {
		CheckObjectCreation cocr = new CheckObjectCreation();
		
		int res = CheckStaticSum(5,6);
		System.out.print(res);
		
		res = cocr.CheckSum(6, 6);
		System.out.print("\n"+res);
		
	}
	
	static int CheckStaticSum(int a, int b) {
		return a+b;
	}
	
	private int CheckSum(int c, int d) {
		return c+d;
	}
}
