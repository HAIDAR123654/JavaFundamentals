package package1;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_to_arraylist {

	public static void main(String[] args) {
		String arr[] = {"Dog", "cat", "Elephant"};
		for(String i:arr)
		{
			System.out.println(i);
		}
		
		//Arrays class comes from util packages
		
		ArrayList al = new ArrayList(Arrays.asList(arr));
		System.out.println(al);
		System.out.println("made changes to see develop branch");

	}

}
