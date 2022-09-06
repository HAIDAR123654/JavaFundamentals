package Interfaces;


class Test
{
	final int a=10;
	
	final void m1()
	{
		// a=20;// not valid
		System.out.println(a);
	}
}

class Test123 extends Test
{
	/*void m1() // not valid becoz m1 is final method
	{
		System.out.println("m1 is overriden");// overriden m1
	}*/
}

public class final_examples {

	public static void main(String[] args) {
		
       Test123 m=new Test123();
       m.m1();
	}

}
