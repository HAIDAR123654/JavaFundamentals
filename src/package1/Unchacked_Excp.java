package package1;

public class Unchacked_Excp {

	public static void main(String[] args) {
		
		int a = 20;
		//System.out.println(a/0); AirthmaticException
		
		String s = null;
		//System.out.println(s.length());NullPointerException
		
		//String st = "12345";
		//int i = Integer.parseInt(st);
		//System.out.println(i); // successfully compiled and run but
		
		//String  sr = "asfdg";
		//int j = Integer.parseInt(sr);//NumberFormatException
		//System.out.println(j);
		
		int arr[] = new int[5];
		arr[10] = 100;//ArrayIndexOutOfBoundsException
		
		
		

	}

}
