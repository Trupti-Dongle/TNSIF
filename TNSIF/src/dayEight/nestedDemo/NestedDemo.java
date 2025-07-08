package dayEight.nestedDemo;

public class NestedDemo implements OuterInterface , OuterInterface.innerInterface {

	@Override
	public void calArea() {
		System.out.println("Interface");
		// TODO Auto-generated method stub
		
	}

	@Override
	public int id() {
		
		System.out.println("OuterInterface");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void print() {
		
		System.out.println("innerInterface");
		// TODO Auto-generated method stub
		
	}
	

}
