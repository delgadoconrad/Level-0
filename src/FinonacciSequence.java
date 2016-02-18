
public class FinonacciSequence {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		
		for (int i = 0; i < 23; i++) {
		//	System.out.println(a+b);
			System.out.println(a);
			a = a+b;
			System.out.println(b);
			b = a+b;
		}
		
	}
}
