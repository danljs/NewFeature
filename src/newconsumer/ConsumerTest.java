package newconsumer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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
		
		List<String> l = new ArrayList<String>();
		l.add("1");
		l.add("2");
		l.add("3");
		l.forEach(System.out::println);
		
		Random rnd = new Random();
		rnd.ints().limit(10).forEach(System.out::println);
		
		//rnd.ints().sorted().limit(10).forEach(System.out::println);

		rnd.ints().limit(10).sorted().forEach(System.out::println);
		
		try {
			System.out.println("==================peek==============");
			Files.list(Paths.get("."))
			     .map(Path::getFileName)
			     .peek(System.out::println)
			     .forEach(p -> printNames(p.toString() + "oy"));
			
			System.out.println("===============sorted=================");
			Files.list(Paths.get("."))
			     .map(Path::getFileName) // still a path
			     .map(Path::toString) // convert to Strings
			     .filter(name -> name.endsWith(".md"))
			     .sorted() // sort them alphabetically
			     .limit(5) // first 5
			     .forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void printNames(String name) {
		System.out.println(name);
	}
}
