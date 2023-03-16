package allActionItem;

public class SumByWhileLoop {

	public static void main(String[] args) {
		
		int num = 20;
		int sum = 0;
		while(num <= 40)
		{
			if(num % 2 == 0)
			{
				sum = sum + num;
				
			}
			num++;
		 
		}
		
		System.out.println("Summation of my number is : " + sum );

	}

}
