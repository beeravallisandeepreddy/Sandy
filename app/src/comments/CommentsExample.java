package comments;

public class CommentsExample 
{
	// This is a main method
	public static void main(String[] args) {
		
		System.out.println("main");
		
		System.out.println(add(20,40));
	}
	
	/*
	 	This is a add method
	 	And this method will take 2 parameters
	 	This method will return a int type
	 */
	public static int add(int i, int j)
	{
		int k = i+j;
		
		return k;
	}
}
