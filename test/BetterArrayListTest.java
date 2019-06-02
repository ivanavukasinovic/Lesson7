import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import examples.BetterArrayList;

class BetterArrayListTest {

	@Test
	void test() {
		ArrayList<Object> stack1 = new ArrayList<Object>();
		BetterArrayList bett = new BetterArrayList(stack1);
		stack1.add(1);
		stack1.add("two");
		stack1.add(3);
		stack1.add("four");
		stack1.add(5);
		bett.print();
		assertEquals(5, bett.pop());
		assertEquals("four", bett.pop());
		stack1.add("six");
		bett.print();
		assertEquals("six", bett.pop());
	}

}
