package stringbuffer.immutable;

public class Test {

	public static void main(String[] args) {
		
		StringBuffer name = new StringBuffer("  Rajesh"); // 100
		System.out.println(name.hashCode());
		System.out.println(name);
		
		name.append(" Rakesh");
		
		System.out.println(name.hashCode());
		System.out.println(name);
	}
}
