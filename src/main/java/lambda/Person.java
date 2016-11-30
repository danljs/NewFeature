package lambda;

import com.sun.istack.internal.Nullable;

@SuppressWarnings("restriction")
public class Person {
	private int age;
	private String name;
	public Person(int age, @Nullable String name){
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}

	public void printPerson() {
		System.out.println(name);
	}

}
