package string;

public class StringExample1 {

	public static void main(String[] args) {
		
		String fname = "      Rakesh  Raj     ";
		System.out.println(fname);
		
		fname = fname.trim();
		System.out.println(fname);
		
		
		String str = "HydBlr";
		String sub = str.substring(1);
		System.out.println(sub);
		
		
		String str1 = "RajeshsRajesh";
		int i = str1.indexOf('s');
		System.out.println(i);
		
		int j = str1.lastIndexOf('s');
		System.out.println(j);
		
		System.out.println("===============");
		for(int k=0; k<str1.length(); k++)
		{
			if(str1.charAt(k) == 's')
			{
				System.out.println(k);
			}
		}
		
//		Blr
//		blr
		
		String str2 = "Rajesh";
		String str3 = "rajesh";
		int z = str2.compareTo(str3);
		System.out.println(z); // randaom number
		
		String str4 = "Rajesh";
		String str5 = "rajesh";
		int z1 = str4.compareToIgnoreCase(str5);
		System.out.println(z1); // 0
		
		String s1 = "Raj";
		String s2 = "raj";
		boolean b = s1.equals(s2);
		System.out.println(b);
		
		String s3 = "Raj";
		String s4 = "raj";
		boolean b1 = s3.equalsIgnoreCase(s4);
		System.out.println(b1);
		
		
		
		
		
		
		
		
		
		
	}
}
