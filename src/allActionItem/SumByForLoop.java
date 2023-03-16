package allActionItem;

public class SumByForLoop {

	public static void main(String[] args) {
		int sum = 0;
		for(int num = 20; num <=40; num++)
		{
			if(num % 2 == 0)
			{
				sum = sum + num;
			}
		}
		
		System.out.println("Summation of my number is : " + sum);

	}

}
