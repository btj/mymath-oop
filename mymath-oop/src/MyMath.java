
public class MyMath {

	/**
	 * Returns the square root of the given number,
	 * rounded down.
	 * 
	 * Contractual programming
	 * 
	 * @pre The given number is nonnegative.
	 *     | 0 <= x
	 * @post The result equals the square root of
	 *       the given number, rounded down.
	 *     | 0 <= result &&
	 *     | result * result <= x &&
	 *     | x < (result + 1) * (result + 1)
	 */
	static int sqrt(int x) {
		int r = 0;
		while ((r + 1) * (r + 1) <= x)
			r++;
		return r;
	}

}
