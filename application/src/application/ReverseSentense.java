package application;

public class ReverseSentense
{
	
	public static void main(String[] args) 
	{
		System.out.println(reverse("Bangalore"));
	}
	
	// Bangalore
	public static String reverse(String s)
	{
		String str = "";
	
		for(int i=s.length()-1; i>=0; i--)
		{
			char c = s.charAt(i);
			str = str.concat(""+c);
		}
		
		return str;
	}
}
