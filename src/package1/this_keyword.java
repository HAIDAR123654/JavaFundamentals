package package1;

public class this_keyword {
	
	int a;
	int b;
	
	void sum(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		 this_keyword ob=new  this_keyword();
		 ob.sum(15, 10);

	}

}

// int a, int b is a local variable to the class and in method sum() argument 
// int a int b is external variables so compiler will get confuse which variable is assign in which
// variable
// we can use same variable name to avoid many variables so we use this keyword
