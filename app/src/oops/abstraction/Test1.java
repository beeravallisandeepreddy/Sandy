package oops.abstraction;

public class Test1 extends Test
{

	public static void main(String[] args) {
		
		Test t = new Test1();
		
		t.add(10, 30);
	}
	
	@Override
	public void add(int i, int j) {
		
		int k = i+j;
		System.out.println(k);
		
	}
	
}
