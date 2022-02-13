package exception;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		
		System.out.println("main method start");
		String age = "abc";
		
		try
		{
			int age1 = Integer.parseInt(age);
			System.out.println(age1);
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		System.out.println("main method end");
	}
}
