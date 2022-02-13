package oops;

public class CompileTimePolymorphismExample
{

	public static void main(String[] args) {
		
		CompileTimePolymorphismExample obj = new CompileTimePolymorphismExample();
		
		obj.login("abc", "xyz");
		
		obj.login("abc", "xyz", "admin");
		
	}
	
	public void login(String uname, String pwd)
	{
		System.out.println("login method with 2 args");
	}
	
	public void login(String uname, String pwd, String type)
	{
		System.out.println("login method with 3 args");
	}
}
