package dayNine.StringDemo;

public class StringComparison {
	
	public static void main(String[] args) {
		
	
		
		//creating string using literals
		
		String s1 = "tnsif";
		String s2 = "TNSIF";
		
		
		String s3 = new String ("TNSIF");
		String s4 = new String ("TNSIF");
		
		System.out.println("Case 1: " + (s1==s2));
		System.out.println("Case 1: " + (s1==s3));
		System.out.println("Case 1: " + (s1 .equals (s2)));
		System.out.println("Case 1: " + (s1 .equals (s4)));
		System.out.println("Case 1: " + (s1==s4));
		System.out.println("Case 1: " + (s3 .equals (s4)));
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
//compare by using compareTo
		
		System.out.println(s1.compareTo(s1));
		System.out.println(s1.compareTo(s4));
		
		System.out.println(s1.compareToIgnoreCase(s4));
		

	}

}
