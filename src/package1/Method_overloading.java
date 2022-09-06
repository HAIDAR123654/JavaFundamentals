package package1;

public class Method_overloading {
	
	int a;
	int b;
	
	void sum()
	{
		a=10;
		b=20;
		System.out.println(a+b);
	}
	
	void sum(int x, int y)
	{
		a=x;
		b=y;
		System.out.println(a+b);
	}
	
	
	void sum(int x, int y, int z)
	{
		System.out.println(x+y+z);
	}
	
	void sum(int x, double y)
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		
		Method_overloading mo = new Method_overloading();
		mo.sum();// called 1 method
		mo.sum(100, 200); // called 2-method
		mo.sum(10, 20, 30);// called 3-method
		mo.sum(10, 10.5);//called 4-method
		
		

	}

}
