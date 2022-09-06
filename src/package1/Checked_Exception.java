package package1;

public class Checked_Exception {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("program is started");
		System.out.println("program is in progress");
		
		/*try
		{
		Thread.sleep(4000);// checked exception
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}*/
		
		Thread.sleep(4000);
		System.out.println("program is completed");
		System.out.println("program is excited");

	}

}
