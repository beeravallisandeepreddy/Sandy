package exception;

public class ExceptionExample {

	public static void main(String[] args) {

		System.out.println("main method start...");
		
		int i = 10;
		int j = 0;

		try
		{
			int k = i/j; // ArithmeticException
			System.out.println(k);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}

		System.out.println("main method end...");
		System.out.println("main method end...");
		System.out.println("main method end...");
		System.out.println("main method end...");
	}
}
