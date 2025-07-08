package dayNine.StringDemo;

public class SampleStringDemo {
	
	public static void main(String[] args) {
		
		//initialize string
		
		char c[]= {'I','N','D','I','A'};
		
		String s1 = new String (c);
		System.out.println(s1);
		
		
		String s2 = new String (s1);
		System.out.println(s2);
		
		String s3 = "This is how "+"the string is working.";
		System.out.println(s3);
	}

}
