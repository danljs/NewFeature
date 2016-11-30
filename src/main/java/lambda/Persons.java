package lambda;

import java.util.ArrayList;
import java.util.List;

public class Persons {
	public void printPersonsOlderThan(List<Person> roster, int age) {
	    for (Person p : roster) {
	        if (p.getAge() >= age) {
	            p.printPerson();
	        }
	    }
	}
	
	public void printPersons(
	    List<Person> roster, CheckPerson tester) {
	    for (Person p : roster) {
	        if (tester.test(p)) {
	            p.printPerson();
	        }
	    }
	}
	// Functional interfaces have a single functionality to exhibit. 
	// For example, a Comparable interface with a single method 'compareTo' is used for comparison purpose. 
	// Java 8 has defined a lot of functional interfaces to be used extensively in lambda expressions.
	interface CheckPerson {
	    boolean test(Person p);
//	    boolean test1(Person p);
	}
	public static void main(String[] args) {
		List<Person> l = new ArrayList<Person>();
		l.add(new Person(8,"Jason_0"));
		l.add(new Person(18,"Jason_1"));
		l.add(new Person(28,"Jason_2"));
		l.add(new Person(38,"Jason_3"));
		l.add(new Person(48,"Jason_4"));
		l.add(new Person(58,"Jason_5"));
		l.add(new Person(68,"Jason_6"));
		l.add(new Person(78,"Jason_7"));
		
		Persons ps = new Persons();
		ps.printPersonsOlderThan(l, 48);
		ps.printPersons(l, (Person p) -> p.getAge() >= 38);
	}
	
}
