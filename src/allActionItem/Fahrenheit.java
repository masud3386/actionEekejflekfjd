package allActionItem;

public class Fahrenheit {

	public static void main(String[] args) {
	
		System.out.println("Fahrenheit is : " + convertcelsius(34));
		
		
	}
	
	public static double convertcelsius(int celsius) {
		double fahrenheit = (celsius * 9/5) + 32;
		return fahrenheit;
		
	}
	

}
