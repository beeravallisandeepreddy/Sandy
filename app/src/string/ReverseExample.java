package string;

public class ReverseExample {

	public static void main(String[] args) 
	{
		String s = "Bangalore";
		
		// Convert from String to StringBuilder
		
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb);
		
		// Converting from StringBuilder to String
		String reverse = sb.reverse().toString();
		System.out.println(reverse);
		
	}
}
