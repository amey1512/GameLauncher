public class MyException {

	public static void main(String args[]) {
		
		try {
			System.out.print("\nException not occured");
			int a = 100/0;
		}
		
		catch(ArithmeticException e) {
			System.out.print("\n"+e.getClass());
			System.out.print("\nException handled");
		}
		catch(Exception e) {
			System.out.print("\n"+e.getClass());
			System.out.print("\nException handled");
		}
		finally {
			System.out.print("\nHello");
			System.out.print("\nException occured");
		}
		System.out.print("\nException try code");	
	}
}
