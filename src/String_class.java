
public class String_class {

	public static void main(String[] args) {
		
		String s="Welcome";
		System.out.println(s.length());
		
		//concatenation
//		String s1 = "Welcome to";
//		String s2 = " training";
//		
//		System.out.println(s1+s2);
//		System.out.println(s1.concat(s2));
//        System.out.println("welcome to"+" training");
//        System.out.println("welocme to".concat(s2));
        
        //equals
       String s3 = "WELCOME";
       String s4 = "welcome";
       
       System.out.println(s3.equals(s4));// java is case sensitive
       System.out.println(s3.equalsIgnoreCase(s4));
       
       //contains()
       System.out.println(s3.contains("WEL"));//true
       System.out.println(s3.contains("WeL"));//flase
       
       //substrings
       
       
      System.out.println(s.substring(0,3));// WEL
      System.out.println(s.substring(2,5));// LCO
      
      // replace
      
      System.out.println(s.replace('e', 'a'));
      System.out.println(s.replace("come", "go"));
       
       
       
      }
}
