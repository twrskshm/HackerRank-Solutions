import java.util.HashSet;

/**
 * Sales By Match
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

public class SalesByMatch {
    /**
     * Function that finds total pairs of matching socks.
     * @param n Length of the integer array.
     * @param ar Colors of each sock.
     * @return Returns total pairs of matching socks.
     */
    static int sockMerchant(final int n, final int[] ar) {
        HashSet<Integer> seen = new HashSet<>();
        int result = 0;

        for (int element: ar) {
            if (seen.contains(element)) {
                result++;
                seen.remove(element);
            } else {
                seen.add(element);
            }
        }

        return result;
    }
}
