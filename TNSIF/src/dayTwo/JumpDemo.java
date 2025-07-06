package dayTwo;

public class JumpDemo {
	
	public static void main(String[] args) {
		
//BreakDemo
		
		for(int i=1; i<10; i++)
		{
			
				//break;
			       System.out.println(i);
	
			System.out.println("Hello friends");
			break;
			
		}
		
//ContinueDemo
		System.out.println("\n");

		for(int k=5; k<15; k++)
		{
			//odd no are skipped
			
			if(k%2 !=0)
				continue;
			//even number are printed
			System.out.println(k + " ");
		}
		
//SwitchDemo
		System.out.println("\n");
		
		int userInput=4;
		
		switch(userInput)
		{
		
		case 1: System.out.println("Current Recharge details ");
		break;
		
		case 2: System.out.println("Current recharge expiry");
		break;
		
		case 3: System.out.println("New offers");
		break;
		
		case 4: System.out.println("Talk to our customer support person ");
		break;
		
		default : 
			System.out.println(userInput + " is not a valid input given by you");
			break;
		}
	}

}
