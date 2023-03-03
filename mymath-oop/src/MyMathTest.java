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
		MyMath.sqrt(-1);
	}

}
