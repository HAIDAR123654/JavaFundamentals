package Interfaces;


interface A
{
	int a=100;
	void display();
}

interface B
{
	int b=20;
	void show();
}
public class MultipleINH_through_Interface implements A,B
{
	public void display() 
	{
		System.out.println(a);
	}
	
	public void show() 
	{
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		MultipleINH_through_Interface mi=new MultipleINH_through_Interface();
		mi.display();
		mi.show();

	}

}
