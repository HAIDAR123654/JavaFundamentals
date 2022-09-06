package package1;

public class Esception_with_finally {

	public static void main(String[] args) {
		int arr[] = new int[5];
		
		//Exception occurs, catch block handles, finally block also execute
//		try
//		{
//			arr[10] = 100;
//		}
//		
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println(e.getMessage());
//		}
//		
//		finally
//		{
//			System.out.println("this is finally block");
//		}
		
		
		//2)Exception not occurs, catch block will ignore, finally block execute always

//		try
//		{
//			arr[4] = 100;
//		}
//		
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println(e.getMessage());
//		}
//		
//		finally
//		{
//			System.out.println("this is finally block");
//		}
		
		
		//Exception occurs, catch block not handles(because we gave other exceptions), finally block execute always
		
		//but exception will be printed off course
		try
		{
			arr[10] = 100;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("this is finally block");
		}

	}

}
