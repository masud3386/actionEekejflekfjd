package allActionItem;

public class SwipeNumbers {

	public static void main(String[] args) {
		int a=10, b=20;
		System.out.println("before swipe number:" +a);
		System.out.println("before swiping number" +b);
		
		a=a+b; // a=10+20=30
		b=a-b;//b= 30-20=10
		a=a-b; //a= 30-10=20
		System.out.println("after swipe number:" + a);
		System.out.println( "after swiping number :" + b);
		
	}

}
