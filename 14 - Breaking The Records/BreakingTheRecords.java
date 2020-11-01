/**
 * Breaking The Records
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

public class BreakingTheRecords {
    /**
     * Function that counts number of times Maria broke her highest score and lowest score records.
     * @param scores Maria's scores for the season as an integer array.
     * @return Returns number of times Maria broke her highest score and lowest score records as an array.
     */
    static int[] breakingRecords(final int[] scores) {
        final int[] result = new int[] {-1, -1};
        int highestScore = Integer.MIN_VALUE;
        int lowestScore = Integer.MAX_VALUE;

        for (int element: scores) {
            if (element > highestScore) {
                highestScore = element;
                result[0]++;
            }

            if (element < lowestScore) {
                lowestScore = element;
                result[1]++;
            }
        }

        return result;
    }
}
