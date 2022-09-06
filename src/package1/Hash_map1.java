package package1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_map1 {

	public static void main(String[] args) {
		// for hetrogenous key and value
		//HashMap m = new HashMap();
		
		// for homogenous key and values
		HashMap<Integer,String> m = new HashMap<Integer,String>();
		
		m.put(101, "John");
		m.put(102, "David");
		m.put(103, "Scott");
		m.put(104, "Mary");
		m.put(105, "Tye");
		m.put(103, "x");//old value replaced by new value
		m.put(106,"David");//value can be dublicate
		
		System.out.println(m);//{101=John, 102=David, 103=Scott, 104=Mary, 105=Tye}
         
		System.out.println(m.get(105));
		
		m.remove(106);
		System.out.println(m);
		
		System.out.println(m.containsKey(101));//true
		System.out.println(m.containsKey(106));//false
		
		System.out.println(m.containsValue("Mary"));//true
		System.out.println(m.containsValue("Y"));//false
		
		System.out.println(m.isEmpty());//false
		
		System.out.println(m.keySet());//return all the key as a set
		
		//reading all individual key one by one
		for(Object i:m.keySet())
		{
			System.out.println(i);
		}
		
		
		System.out.println(m.values());//return all the key as a collection
		//reading all individual values one by one
		for(Object i:m.values())
		{
			System.out.println(i);
		}
		
		// printing key and values together
//		for(Object i:m.keySet())
//		{
//			System.out.println(i+"    "+m.get(i));
//		}
		
		
		System.out.println(m.entrySet());//return all entries as a set [101=John, 102=David, 103=x, 104=Mary, 105=Tye]
		
		
		//there is a Entry interface which is a inside interface Map
		// so if we get a entry(pair of key and value) then we can get also key and value from particular entry
		// Entry method
		//*****************************
//		for(Map.Entry  entry:m.entrySet())
//		{
//			System.out.println(entry.getKey()+"    "+entry.getValue());
//		}
		
		//iterrator()
		Set s = m.entrySet();
		
		Iterator itr = s.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry =   (Entry) itr.next();
			System.out.println(entry.getKey()+"     "+entry.getValue());
		}
		
	}

}
