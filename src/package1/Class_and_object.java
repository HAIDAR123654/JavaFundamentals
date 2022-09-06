package package1;

public class Class_and_object {
	
	int empid;
	String empname;
	int salary;
	int deptno;
	
	/*Class_and_object(int id, String name, int sal, int dno )
	{
		empid = id;
		empname = name;
		salary = sal;
		deptno = dno;
	}*/
	
	void setdata(int id, String name, int sal, int dno)
	{
		empid = id;
		empname = name;
		salary = sal;
		deptno = dno;
	}
	
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
		
	}

	public static void main(String[] args) {
		
		//Assigning values to class variables using object---first way
		
		/*Class_and_object emp1 = new Class_and_object();
		
		emp1.empid = 101;
		emp1.empname = "Raj";
		emp1.salary = 20000;
		emp1.deptno = 10;
		emp1.display();*/
		
       /*
		Class_and_object emp2 = new Class_and_object();
		
		emp2.empid = 102;
		emp2.empname = "Kiran";
		emp2.salary = 30000;
		emp2.deptno = 20;
		emp2.display();
		*/
		
		
		
		//Assigning values to class variables through constructor----second way
		/*Class_and_object emp1 = new Class_and_object(101,"Raj",20000,10);
         emp1.display();
         
         Class_and_object emp2 = new Class_and_object(102,"Kiran",30000,20);
         emp2.display();*/
		
		
		//Assigning values to class variables using user define  method----second way
		Class_and_object emp1 = new Class_and_object();
		emp1.setdata(101, "Raj", 20000, 10);
		emp1.display();
		
		Class_and_object emp2 = new Class_and_object();
		emp2.setdata(102, "Kiran", 30000, 20);
		emp2.display();
	}

}
