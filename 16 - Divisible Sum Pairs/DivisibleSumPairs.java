import java.util.HashMap;

/**
 * Divisible Sum Pairs
 *
 * Time complexity:
 * Worst case: Θ(n)
 * Best case: Θ(n)
 *
 * Space complexity:
 * Worst case: Θ(n)
 * Best case: Θ(1)
 *
 * @author Saksham Tiwari
 */

public class DivisibleSumPairs {
    /**
     * Function that finds number of pairs whose sum is divisible by k.
     * @param n Length of the integer array.
     * @param k Divisor of the sum.
     * @param ar Input array.
     * @return Returns number of pairs whose sum is divisible by k.
     */
    static int divisibleSumPairs(final int n, final int k, final int[] ar) {
        final HashMap<Integer, Integer> seen = new HashMap<>();
        int result = 0;

        for (int element: ar) {
            int remainder = element % k;
            int possiblePartner = (k - remainder) % k;

            result += seen.getOrDefault(possiblePartner, 0);
            seen.put(remainder, seen.getOrDefault(remainder, 0) + 1);
        }

        return result;
    }
}
