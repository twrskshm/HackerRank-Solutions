import java.util.List;

/**
 * Sub-array Division
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

public class SubarrayDivision {
    /**
     * Function that finds number of ways chocolate bar can be divided.
     * @param s Chocolate bar as an array of integer.
     * @param d Ron's birth day.
     * @param m Ron's birth month.
     * @return Returns number of ways chocolate bar can be divided.
     */
    static int birthday(List<Integer> s, int d, int m) {
        int result = 0;
        int sum = 0;

        for (int index = 0; index < s.size(); index++) {
            if (index >= m) {
                sum -=s.get(index - m);
            }

            sum += s.get(index);

            if (index >= m - 1 && sum == d) {
                result++;
            }
        }

        return result;
    }
}
