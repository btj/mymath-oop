import java.util.stream.IntStream;

public class MyMath {

	/**
	 * Returns the square root of the given number,
	 * rounded down.
	 * 
	 * Defensive programming
	 * 
	 * @throws IllegalArgumentException if the given number is negative
	 *     | x < 0
	 * @post The result equals the square root of
	 *       the given number, rounded down.
	 *     | 0 <= result &&
	 *     | result * result <= x &&
	 *     | x < (result + 1) * (result + 1)
	 */
	static int sqrt(int x) {
		if (x < 0)
			throw new IllegalArgumentException("`x` is negative");
		
		int r = 0;
		while ((r + 1) * (r + 1) <= x)
			r++;
		return r;
	}
	
	/**
	 * Returns whether the elements of the given array are in ascending order.
	 * 
	 * @throws IllegalArgumentException if `elements` is null
	 *     | elements == null
	 * @post For each i between 1 (inclusive) and `elements.length` (exclusive), the element at index
	 *       i - 1 is not greater than the element at index i.
	 *     | result == IntStream.range(1, elements.length).allMatch(i -> elements[i - 1] <= elements[i])
	 */
	static boolean isSorted(int[] elements) {
		if (elements == null)
			throw new IllegalArgumentException("`elements` is null");
		
		for (int i = 1; i < elements.length; i++)
			if (elements[i - 1] > elements[i])
				return false;
		return true;
	}
	
	/**
	 * Replaces each element of the given array by its negation.
	 * 
	 * @pre | elements != null
	 * @post | IntStream.range(0, elements.length).allMatch(i -> elements[i] == -old(elements.clone())[i])
	 */
	static void negateElements(int[] elements) {
		for (int i = 0; i < elements.length; i++)
			elements[i] = -elements[i];
	}

}
