/**
 * Counting Valleys
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

public class CountingValleys {
    /**
     * Function that finds number of valleys encountered during the trek.
     * @param steps Number of steps in the hike.
     * @param path String describing the path.
     * @return Returns number of valleys encountered.
     */
    public static int countingValleys(final int steps, final String path) {
        int level = 0;
        int result = 0;

        for (int index = 0; index < path.length(); index++) {
            if (path.charAt(index) == 'D') {
                level -= 1;
            } else {
                if (level == -1) {
                    result++;
                }

                level += 1;
            }
        }

        return result;
    }
}
