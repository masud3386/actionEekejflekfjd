package allActionItem;

public class SumAfterClass {

	public static void main(String[] args) {
		doSum();
		
	}
	
	public static void doSum() 
	{
		
		int start = 20,end = 40,sum=0;
		
		while(start <= end ) 
		{
			
			if(start % 2 == 0) 
			{
				sum = sum + start;
			}
			start++;
			
			
		}
		System.out.println("The result of additon is :" + sum);
		
		
	}

}
