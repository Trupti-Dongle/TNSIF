package daySeven.overriding;

public class OverRidingDemo {
	public static void main(String[] args) {
		
		RBI rbi;
		
		//Dynamic Binding assigning child object to parent class variable
		
		rbi = new SBI();
		System.out.println(rbi.getRateofInterest());
		
		rbi = new ICICI();
		System.out.println(rbi.getRateofInterest());
		
		rbi = new HDFC();
		System.out.println(rbi.getRateofInterest());
		
		
		
	}

}
