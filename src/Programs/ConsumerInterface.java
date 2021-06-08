package Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {

	public static void main(String[] args) {

		System.out.println("Printing Integers with Consumer Interface");
		for (int i = 1; i <= 10; i++) {

			if (i > 7 || i < 3) {
				List<Integer> li = new ArrayList<>();
				li.add(i);
				Consumer<Integer> c = (Integer k) -> {
					System.out.println(k);
				};
				li.forEach(c);

			}

		}

	}

}
