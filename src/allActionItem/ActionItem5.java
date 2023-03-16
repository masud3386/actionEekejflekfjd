package allActionItem;

public class ActionItem5 {
	public void findletter(char alphbet) {
		
		char letter = (alphbet);
		
		if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u')
		{
			System.out.println("the letter is consonant");
		}
		else 
		{
			System.out.println("this alphabe is not known to me");
		}
	}

	public static void main(String[] args) {
		ActionItem5 le= new ActionItem5();
	
	le.findletter('a');
		

	}

}
