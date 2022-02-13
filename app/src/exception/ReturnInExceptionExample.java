package exception;

public class ReturnInExceptionExample {

	public static void main(String[] args) {
		
		int k = test();
		System.out.println(k);
	}
	
	@SuppressWarnings("finally")
	public static int test()
	{
	
		try
		{
			int i = 10/0;
			
			return 1;
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
			
			return 2;
		}
		finally {
//			return 3;
		}
		
//		return 4;
	}
}
