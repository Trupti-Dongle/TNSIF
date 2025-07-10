package dayTwelve.multithreading;

public class ChildDemo {

	public static void main(String[] args) {
		
		Childthread c=new Childthread(10, "Hello");
		Childthread c1=new Childthread(5, "TNSIF");
		
		c.start();
		c1.start();
		System.out.println("End of the Program");

	}

}