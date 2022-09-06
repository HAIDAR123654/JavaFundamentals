package package1;
import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Welcome");
		//StringBuilder builder = new StringBuilder("Welcome");
		
		sb.append(" home");
		
		sb.insert(7, " to");
		
		sb.replace(11, 15, "world");
		
		sb.delete(7, 16);
		
		sb.reverse();
		System.out.println(sb);
		System.out.println(add(2,3));
		
		System.out.println("new changes has been done in cloned git");
		System.out.println("new changes has been done in cloned git");

		Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c;
	System.out.println(c=a+b);
		
}
	
	  private static int add(int a, int b) {
		  int sum = a + b;
		  return sum;
	  }
	 

	}



		

	


