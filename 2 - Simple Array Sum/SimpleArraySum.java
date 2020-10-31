/**
 * Simple Array Sum
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

public class SimpleArraySum {
    /**
     * Function that adds all the elements in the input array.
     * @param ar Integer array whose sum we need to find.
     * @return Sum of all the elements in the input array.
     */
    static int simpleArraySum(final int[] ar) {
        int sum = 0;

        for (int element: ar) {
            sum += element;
        }

        return sum;
    }
}
