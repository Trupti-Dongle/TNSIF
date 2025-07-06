package dayTwo;

public class loopsDemo {
	public static void main(String[] args) {
		
//ForLoopsDemo
		

		for(int i=1; i<=100 ; i++)
	
		{
			System.out.print("value of i :"+ i + " \n ");
		}
		
//WhileDemo
		System.out.println("\n");
		
		int i=99;// user value/ user input 
		
		while(i<=100)
		{
			System.out.println(i);
			i++;
		}
		
//DoWhileLoopDemo
	System.out.println("\n");
	
	int j=11;
	do {
		System.out.println(j);
		j++;
	}
	while(j <=10);
	
//NestedForLoopDemo
	System.out.println("\n");
	

	//program to print the multiplication tables
	//int a given range by using nested forloop
	
	  int beg=5;
	  int end=8;
	
	  for(int x=beg; x<=end; x++)
	  {
		for(int y=1; y<=10; y++)
		{
			System.out.println(x + "*"+ y+ "="+ x*y);
		}
		System.out.println();
	  }
	  
//ForEachLoopDemo
	  
	  System.out.println("\n");

		int a[]= {10,20,30,40,50};
		
		//for integer array
		for (int k:a)
		{
			System.out.print(k+ " ");
		}
	
    }

}
