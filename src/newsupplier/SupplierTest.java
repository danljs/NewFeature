package newsupplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		String s1 = "12345";
		String s2 = "1234" + s1.length();
		System.out.println(s1==s2);
		
		List<String> names = new ArrayList<String>();
		names.add("David");
		names.add("Sam");
		names.add("Ben");

		names.stream().forEach((x) -> {
			printNames(() -> x);
		});

	}

	static void printNames(Supplier<String> arg) {
		System.out.println(arg.get());
	}
}
