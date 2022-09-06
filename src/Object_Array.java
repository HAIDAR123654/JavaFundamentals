
public class Object_Array {

	public static void main(String[] args) {
		
		Object a[] = new Object[5];
		
		a[0] = 10;
		a[1] = 20.5;
		a[2] = "welcome";
		a[3] = 'G';
		a[4] = true;
		
		for(Object i:a)
		{
			System.out.println(i);
		}
		
		Object s[] = {100,345.678,"welcome",'G',false};
		
		for(Object i:s)
		{
			System.out.println(i);
		}
	}

}
