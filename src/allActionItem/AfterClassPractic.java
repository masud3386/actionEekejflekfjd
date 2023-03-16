package allActionItem;

public class AfterClassPractic {
	
	
	
	public static void main(String[] args) {
		
	doFactorial(5);
	doFactorial(6);
	doFactorial(17);
		
	}
	
	public static void doFactorial(int number) {
		int i=1;
		long factorial = 1;
		while (i<=number) {
			factorial *= i;
			i++;
		}
		System.out.printf("Factorial of %d = %d", number,factorial);
		System.out.println();
		
		
		
	}

}
