package allActionItem;
public class DisplayGrade {
public static void main(String[] args) {
 int Automation = 100;
 int Bangla = 95;
 int English = 100;
 int Math = 90;
 int Chemistry = 98;
 int Biology= 80;
	 	
 int Avg = (Automation + Bangla + English + Math + Chemistry + Biology) /6;
 
 System.out.println("My Average score is: " + Avg);
 
 if(Avg >= 93 && Avg <= 100){
	 System.out.println("My Grade is: " + 'A');
	 
 }else if(Avg >= 85 && Avg <= 92){
	 System.out.println("My Grade is: " + 'B');
	 
 }else if(Avg>=70 && Avg <= 84){
	 System.out.println("My Grade is: " + 'C');
	 
 }else if(Avg>=60 && Avg <= 69){
	 System.out.println("My Grade is: " + 'D');
	 
 }else{
	 System.out.println("My Grade is: " + 'F');
 }
 
		
		
		
		

	}

}
