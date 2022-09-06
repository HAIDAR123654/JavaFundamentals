
public class Array_Example2 {

	public static void main(String[] args) {
		
		String s[] = new String[3];
		
		s[0] = "welcome";
		s[1] = "to";
		s[2] = "training";
		
		System.out.println(s.length);
		
		for(String i:s)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		
		
		
		
		int a[] = {100,200,300,400,500};
		
		for(int i:a)
		{
			System.out.println(i);
		}
		
		//want to print sum of the arrays;
		
		int d = 0;
		for(int i:a)
		{
			d = d + i;
		}
		System.out.println(d);

	}

}
