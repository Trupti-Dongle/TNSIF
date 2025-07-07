package daySeven.Overloading;

public class OverLoadingDemo {
	
	public static void main(String[] args) {
		
//		Point p = new Point() ; //default
//		System.out.println(p);
		
		Point p = new Point( 2.3f,3.4f) ; //default
		System.out.println(p);
		
		System.out.println("----------Method OverLoading---------");
		
		System.out.println(MethodOverLoading.addition(4, 5));
		
	}

}
