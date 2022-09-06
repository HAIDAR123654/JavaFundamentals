package package1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_1 {

	public static void main(java.lang.String[] args) {
		
		//Declare ArrayList of heterogeneous data
				//ArrayList a_l = new ArrayList();
				
				// Declaration of ArrayList with only homogeneous(int) data
				//ArrayList<Integer> a_l = new ArrayList<Integer>();
				 
				// Declaration of ArrayList with only homogeneous(string) data
				//ArrayList<String> a_l = new ArrayList<String>();
				 
				//we can Declare  ArrayList with a List interface variable
				//Because List is a Parent interface of ArrayList
				  //List a_l = new ArrayList();
		
		// adding element in arraylist from back
		ArrayList al = new ArrayList();
		al.add(100);
		al.add("Welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);
		
		System.out.println(al);
		//size()
		System.out.println("Number of elements in array list :"+al.size());
		
		//remove
		al.remove(1);//here 1 is index
		//al.remove("Welcome");// here welcome is element
		
		System.out.println("After removing element from array list:"+al);
		
		// insert new element at required index
		al.add(2, "Python");
		System.out.println("After insertion new arraylist:"+al);
		
		//retrieve specific element
		System.out.println("Retrived element is:"+al.get(2)); //  2 is index of element
		
		//replace element
		al.set(2, "c#");
		System.out.println("After replacing element:"+al);
		
		//search  - contains()  - Return true/false
		System.out.println(al.contains("c#"));
		System.out.println(al.contains("c++"));
		
		//isEmpty()
		System.out.println(al.isEmpty());
		
		
		//1) for loop
		//System.out.println("Reading elements using for loop .......");
//		for (int i=0;i<al.size();i++)
//		{
//			System.out.println(al.get(i));
//		}
		
		//2) for each loop
//		System.out.println("Reading elements using for each loop .......");
//		for(Object e:al)
//		{
//			System.out.println(e);
//		}
		
		//3)iterator()
		System.out.println("Reading elements using iterator method .......");
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());//printing the element and move to next element
		}
		
		
		

	}

}
