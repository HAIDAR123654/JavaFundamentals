package package1;

public class ExceptionExample1 {

	public static void main(String[] args) {
		
		
		System.out.println("started");
        //Thread.sleep(4000);// Identified by the compiler at compile time  InterruptedException , checked exception
        
		int i=10;
		System.out.println(i/0);//ArithmeticException copiler is not able to identyfy these errors, unchecked exception
		System.out.println("stopped");
	}

}
