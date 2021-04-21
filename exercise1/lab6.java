package lab6.exercise1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class lab6{
	public static void main(String[] args) {
		HashMap<Integer,String> mymap=new HashMap<Integer,String>();
		mymap.put(1001, "sunil");
		mymap.put(1002, "surya");
		mymap.put(1003, "raj");
		mymap.put(1004, "kush");
		mymap.put(1005, "nikhil");
		mymap.put(1006, "Sharan");
		List mylist = new ArrayList<String>();
		mylist.addAll(getValues(mymap));
		System.out.println(mylist);
		}
		public static List<String> getValues(HashMap<Integer,String> m ) {
			List l = new ArrayList<String>();
			//.values()
			l.addAll(m.values());
			Collections.sort(l);
			return l;
		}

		}