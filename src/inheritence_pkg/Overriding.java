package inheritence_pkg;


class Bank
{
	int getRateOfIntrest()
	{
		return 0;
	}
}

class SBI extends Bank
{
	int getRateOfIntrest()//Overridden function
	{
		return 10;
	}
}

class ICICI extends Bank
{
	int getRateOfIntrest()//Overridden function
	{
		return 15;
	}
}

class AXIS extends Bank  
{
	int getRateOfIntrest()//Overridden function
	{
		return 12;
	}
}




public class Overriding {

	public static void main(String[] args) {
		
		SBI sbiobj=new SBI();
		System.out.println(sbiobj.getRateOfIntrest());//10
		
		ICICI  iciciobj=new ICICI();
		System.out.println(iciciobj.getRateOfIntrest());//15
		
		AXIS axisobj=new AXIS();
		System.out.println(axisobj.getRateOfIntrest());//12
		

	}

}
