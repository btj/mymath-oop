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
	
	/**
	 * Inserts the value `v` into the part of the given array between index 0 (inclusive) and n (exclusive).
	 *
	 * @pre | array != null
	 * @pre | 0 <= n
	 * @pre | n < array.length
	 * @pre The elements between index 0 (inclusive) and n (exclusive) are in ascending order.
	 *    | IntStream.range(1, n).allMatch(i -> array[i - 1] <= array[i])
	 *    
	 * @post The elements between index 0 (inclusive) and n + 1 (exclusive) are in ascending order.
	 *    | IntStream.range(1, n + 1).allMatch(i -> array[i - 1] <= array[i])
	 * @post The elements that existed between index 0 (inclusive) and n (exclusive) are preserved,
	 *       and v is inserted.
	 *    | IntStream.range(0, n + 1).allMatch(i ->
	 *    |     IntStream.range(0, n + 1).filter(j -> array[j] == array[i]).count() ==
	 *    |     IntStream.range(0, n).filter(j -> old(array.clone())[j] == array[i]).count() +
	 *    |     (array[i] == v ? 1 : 0)
	 *    | )
	 * 
	 * "C ? A : B" means: "if C then A otherwise B"
	 */
	static void insert(int[] array, int n, int v) {
		// TODO: Implement
	}
	
	/**
	 * Sorts the given array.
	 * 
	 * TODO: Document formally!
	 */
	static void insertionSort(int[] array) {
		// TODO: Implement!
	}

}
