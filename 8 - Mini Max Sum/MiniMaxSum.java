/**
 * Mini Max Sum
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

public class MiniMaxSum {
    /**
     * Function that prints maximum and minimum four element sum from the array.
     * @param arr Integer array we need to iterate.
     */
    static void miniMaxSum(final int[] arr) {
        int largestElement = Integer.MIN_VALUE;
        int smallestElement = Integer.MAX_VALUE;
        long sum = 0;

        for (int element: arr) {
            sum += element;

            if (largestElement < element) {
                largestElement = element;
            }

            if (smallestElement > element) {
                smallestElement = element;
            }
        }

        System.out.println((sum - largestElement) + " " + (sum - smallestElement));
    }
}
