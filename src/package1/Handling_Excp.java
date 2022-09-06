package package1;

public class Handling_Excp {

	public static void main(String[] args) {
		// handling ArithmeticException
		System.out.println("program is started");
		int a=20;
		
		try
		{
			System.out.println(a/0);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		//handling NullPointerException
		String s = null;
		try
		{
			System.out.println(s.length());
		}
		
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("program is in progress");
		System.out.println("program is completed");

	}

}
