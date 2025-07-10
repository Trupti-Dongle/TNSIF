package dayEleven.finallyblock;

import java.util.Scanner;

public class usingThrow {
	
	static float acceptNumber() {
		
		Scanner sc = new Scanner(System.in);
		
		float n = sc.nextFloat();
		sc.close();
		return n;
		
	}
	
	public static void main(String[] args) {
		float per;
		System.out.println("Enter your percentage");
		per = acceptNumber();
		try {
			if(per<0)
				throw new negativeException();
			else if  (per>100)
			    throw new greatervalueException();
			else
				System.out.println("Valid Percentage");
		}
		catch(negativeException | greatervalueException e ) {
			
			System.err.println("Error : " + e.getMessage());
		}
			
		
	}

}
