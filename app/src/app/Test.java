package app;

public class Test {
	
	public static int i = 10;

	public static void main(String[] args)
	{
		System.out.println("main");
		
		Test.test();
		
		Test obj = new Test();
		obj.test1();
	}
	
	public Test()
	{
		System.out.println("Constructor");
	}
	
	static
	{
		System.out.println("SIB");
	}
	
	{
		System.out.println("IIB");
	}
	
	protected static void test()
	{
		System.out.println("test");
	}
	
	public void test1()
	{
		System.out.println("test1");
	}
}
