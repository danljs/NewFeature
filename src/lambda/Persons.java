package lambda;

import java.util.List;

public class Persons {
	public void printPersonsOlderThan(List<Person> roster, int age) {
	    for (Person p : roster) {
	        if (p.getAge() >= age) {
	            p.printPerson();
	        }
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}
