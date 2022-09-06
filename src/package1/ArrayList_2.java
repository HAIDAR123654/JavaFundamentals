package package1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_2 {

	public static void main(java.lang.String[] args) {
		ArrayList al = new ArrayList();
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		
		// create some other arraylist and copy all the object from anr to other arraylist
		ArrayList al_dub = new ArrayList();
		al_dub.addAll(al);
		System.out.println(al_dub);
		
		// Remove all element 
		al_dub.removeAll(al_dub);
		System.out.println("After removing:"+al_dub);//print []
		
		// Sort ----- we use Collections.sort() from util package we dont have direct method in arraylist
		
		System.out.println("Elements in arraylist:"+al);
		// sorting bydefault in ascending order
		Collections.sort(al);
		System.out.println("Elements after sorting:"+al);
		
		// sorting in descending order
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Elements after sorting in descending order:"+al);
		
		//shuffling ---- Collections.shuffle
		Collections.shuffle(al);
		System.out.println("Elements after shuffling:"+al);//random order
		
		
		
		
		

	}

}
