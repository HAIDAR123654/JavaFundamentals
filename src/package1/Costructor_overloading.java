package package1;

public class Costructor_overloading {
	
	int a=0;
	int b=0;
	double c=0;
	
	Costructor_overloading()//1
	{
		a=10;
		b=20;
		c=20.5;
	}
	
	Costructor_overloading(int x,int y)//2
	{
		a=x;
		b=y;
	}
	
	Costructor_overloading(int x,double y)//3
	{
		a=x;
		c=y;
	}
	
	Costructor_overloading(int x,int y,double z)//4
	{
		a=x;
		b=y;
		c=z;
	}
	
	Costructor_overloading(int x,double y,int z)//5
	{
		a=x;
		c=y;
		b=z;
	}
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
    
	public static void main(String[] args) {
		
		
		//Costructor_overloading co=new Costructor_overloading();// called 1-constructor
		//Costructor_overloading co=new Costructor_overloading(10,60);// called 2-constructor
		//Costructor_overloading co=new Costructor_overloading(10,30.5);// called 3-constructor
		//Costructor_overloading co=new Costructor_overloading(5,5,5.5);// called 4-constructor
		Costructor_overloading co=new Costructor_overloading(5,5.15,5);// called 5-constructor
		co.display();
	}

}
