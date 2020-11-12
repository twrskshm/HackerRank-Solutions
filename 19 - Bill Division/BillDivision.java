import java.util.List;

/**
 * Bill Division
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

public class BillDivision {
    /**
     * Function that checks if the bill was split fairly between Brian and Anna.
     * @param bill Integer array representing cost of each item ordered.
     * @param k Item Anna didn't eat.
     * @param b Amount of money Anna contributed.
     */
    static void bonAppetit(final List<Integer> bill, final int k, final int b) {
        int total = 0;

        for (int index = 0; index < bill.size(); index++) {
            if (index != k) {
                total += bill.get(index);
            }
        }

        if (b == total / 2) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - (total / 2));
        }
    }
}
