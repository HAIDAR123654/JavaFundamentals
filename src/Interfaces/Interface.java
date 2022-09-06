package Interfaces;

interface Testinter
{
	int a=100;//by variable is static and final
	
	void display();// abstract method , and by default it is a public method
}



public class Interface implements Testinter
{
	public void display()
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		
       Testinter ie = new Interface();  //we can use Interface or Testinter before ie but after new
       // we can use only class name for instantiation
       ie.display();
	}
	

}
