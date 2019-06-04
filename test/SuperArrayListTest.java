import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercises.SuperArrayList;

class SuperArrayListTest {

	@Test
	void testPop() {
		SuperArrayList list = new SuperArrayList();
		list.add(1);
		list.add("blue");
		list.add('c');
		list.add(true);
		list.add(7);
		assertEquals(7, list.pop());
		assertEquals(4, list.size());
		list.add(5);
		list.add(6);
		assertEquals(6, list.pop());
		assertEquals(5, list.size());

	}

}
