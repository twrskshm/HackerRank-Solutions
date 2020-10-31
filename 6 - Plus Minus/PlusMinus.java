/**
 * Plus Minus
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

public class PlusMinus {
    /**
     * Function that finds the ratio of zeroes, positive, negative numbers in the input array.
     * @param arr Integer array we need to iterate.
     * @return Prints the ratio of zeroes, positive, negative numbers in the input array.
     */
    static void plusMinus(final int[] arr) {
        double positives = 0;
        double negatives = 0;
        double zeroes = 0;

        for (int element: arr) {
            if (element > 0) {
                positives++;
            } else if (element < 0) {
                negatives++;
            } else {
                zeroes++;
            }
        }


        System.out.println(positives / arr.length);
        System.out.println(negatives / arr.length);
        System.out.println(zeroes / arr.length);
    }
}
