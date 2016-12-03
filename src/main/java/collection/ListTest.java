package collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<String>();
		l1.add("l1");
		l1.add("l2");
		l1.add("l3");
		
		List<String> m1 = new ArrayList<String>();
		m1.addAll(l1);
		System.out.println(l1.toString());
	}

}
