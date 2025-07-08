package dayNine.StringDemo;

public class StringOperationDemo {

	public static void main(String[] args) {
		
		String s1 = new String ("  INDIAN  ");
		System.out.println(s1);
		
		String s2 = s1.toUpperCase() ;
		System.out.println(s2 + ".......");	
		System.out.println(s2.length());
		int a = s2.length();
		
		String s3 = s1.substring(1,7);
		System.out.println(s3);
		
		System.out.println(s1.trim());
		System.out.println(s1.stripTrailing());
		System.out.println(s1.isEmpty());
		
//String Comparison
		s2 = new String(s1);
		
		//equals --> data
		//== --> object reference(memory check)
		
		System.out.println("Case 1 :" + s1.equals(s2));  //true data same
		System.out.println("Case 2 :" + s1==(s2));    //false memory different  s2 is object.
		
		
		
		

	}

}
