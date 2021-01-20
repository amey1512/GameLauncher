public class LocalArray {
	public static void main(String []args) {
		int[] array = new int[5];		
		System.out.println(array.getClass());
		System.out.println(array.getClass().getTypeName());
		System.out.println(array.getClass().getSuperclass());
	}
}
