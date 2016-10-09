package newconsumer;

import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerTest {

	public static void main(String[] args) {

		Consumer<String> consumer = ConsumerTest::printNames;

		consumer.accept("Jeremy");
		consumer.accept("Paul");
		consumer.accept("Richard");
		
		int x = 99;
		Consumer<Integer> myConsumer = (y) -> {
			System.out.println("x = " + x); // Statement A
			System.out.println("y = " + y);
		};
	
		myConsumer.accept(x);
		myConsumer.accept(100);
		myConsumer.accept(110);
		
		Function<String,String> ft = (name)->{return name + "adsf";};
		System.out.println(ft.apply("adsffad"));
	}

	private static void printNames(String name) {
		System.out.println(name);
	}
}
