
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

}
