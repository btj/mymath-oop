import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {
	
	@Test
	void test() {
		int a = 3;
		int b = 4;
		int c2 = a*a + b*b;
		int c = MyMath.sqrt(c2);
		assertEquals(5, c);
		assertThrows(IllegalArgumentException.class, () -> MyMath.sqrt(-1));
	}
	
	@Test
	void testIsSorted() {
		int[] elems = {10, 20, 30};
		assertEquals(true, MyMath.isSorted(elems));
		int[] elemsNotSorted = {20, 10, 30};
		assertEquals(false, MyMath.isSorted(elemsNotSorted));
		assertThrows(IllegalArgumentException.class, () -> MyMath.isSorted(null));
	}
	
	@Test
	void testNegateElements() {
		int[] elems = {10, 20, 30};
		MyMath.negateElements(elems);
		assertArrayEquals(new int[] {-10, -20, -30}, elems);
	}
	
	@Test
	void testInsert() {
		int[] elems = {10, 20, 30, 5, 7, 3};
		MyMath.insert(elems, 3, 15);
		assertArrayEquals(
				new int[] {10, 15, 20, 30, 7, 3},
				elems);
		MyMath.insert(elems, 4, 35);
		assertArrayEquals(
				new int[] {10, 15, 20, 30, 35, 3},
				elems);
		MyMath.insert(elems, 5, 5);
		assertArrayEquals(
				new int[] {5, 10, 15, 20, 30, 35},
				elems);
	}

}
