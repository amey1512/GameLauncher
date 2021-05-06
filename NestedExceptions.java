
public class NestedExceptions {
	public static void main( String args[]) {
		
		try {
			
			int a = 5;
			int b = 6;
			
			try {
				int c[] = new int[5];
				c[6] = 5;
			}
			catch(Exception e) {
				System.out.println(e);
			}
			finally {
				System.out.println("first finally");
				System.out.println(a);
				System.out.println(b);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("second finally");
		}
	}
}
