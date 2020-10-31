/**
 * A Very Big Sum
 *
 * Time complexity:
 * Worst case: Θ(n)
 * Best case: Θ(n)
 *
 * Space complexity:
 * Worst case: Θ(1)
 * Best case: Θ(1)
 *
 * @author Saksham Tiwari
 */

public class AVeryBigSum {
    /**
     * Function that finds the sum of all the elements in the input array.
     * @param ar Integer array whose sum we need to calculate.
     * @return Sum of all the elements in the input array.
     */
    static long aVeryBigSum(final long[] ar) {
        long result = 0;

        for (long element: ar) {
            result += element;
        }

        return result;
    }
}
