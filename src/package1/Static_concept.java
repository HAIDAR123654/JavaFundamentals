package package1;

public class Static_concept {
	
	int a;// non-static variable
	static int b;//static variable
	
	static void m1() // STATIC
	{
		System.out.println("change kiya hai code source code yani machine se");
		System.out.println("this is m1 - static method");
	}
	
	 void m2() //NON STATIC
	{
		System.out.println("this is m2 - non-static method");
		System.out.println("made changes to see develop branch");

	}
	 
	void m3() //non STATIC
	{
		a = 500; //  non static
		b = 1000; //  static
		m1(); // static
		m2(); // non static
	}

	public static void main(String[] args) {
		//static method can access static stuff only directly
		b=90;
		System.out.println(b);
		m1();
        
		//not accessible becoz it is non static variable
		//a=200;
		//m2();
		
		Static_concept se = new Static_concept();
		se.a = 200;
		System.out.println(se.a);
		se.m2();	
		
		se.m3();
		System.out.println(se.a);
		System.out.println(b);
	}

}
