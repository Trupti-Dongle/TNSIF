package dayTwo;

public class DecisionMakingwithoperation {
	

	public static void main(String[] args) {
		
		int x=8, y =7;
		int a=10, b=11;
		
		if(x>=y)
		{
			System.out.println("true ");
		}
		else
		{
			System.out.println("False");
		}
		//   a>b
		if(!(a<b) || (a==b))
		{
			System.out.println("condition is true ");
		}
		else
		{
			System.out.println("Condition is false");
		}
		
		      System.out.println("\n");
//IfDemo - compare statement
		
		
			int m=4;
			
			if(m == 4 )
				System.out.println("Value of m is 4");
			
			
			System.out.println("\n");
//IfElseDemo
			
			int age =55;
			
			if(age >= 18)
			{ 
				System.out.println("you are eligible for voting ");
			}
			else
			{
				System.out.println("Sorry ! You need to wait more ");
			}
			
			
			System.out.println("\n");
 //NestedIfElseDemo
			

			int f=110, g=20, c=5;
			
			System.out.println("The largest no is : ");
			
			if(f>g )
			{
				if(f>c)
				{
					System.out.println(f);
				}
				else 
				{
					System.out.println(c);
				}
			}
			else
			{
				if(c>g)
				{
					System.out.println(c);
				}
				else {
					System.out.println(g);
				}
			}
	}
}
