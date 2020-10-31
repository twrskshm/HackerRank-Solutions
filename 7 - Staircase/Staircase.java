/**
 * Staircase
 *
 * Time complexity:
 * Worst case: Θ(n^2)
 * Best case: Θ(n^2)
 *
 * Space complexity:
 * Worst case: Θ(1)
 * Best case: Θ(1)
 *
 * @author Saksham Tiwari
 */

public class Staircase {
    /**
     * Function that prints staircase of size n.
     * @param n Size of staircase.
     */
    static void staircase(final int n) {
        for (int iterator = 1; iterator <= n; iterator++) {
            for (int spaceNumber = 1; spaceNumber <= n - iterator; spaceNumber++) {
                System.out.print(" ");
            }

            for (int poundNumber = 1; poundNumber <= iterator; poundNumber++) {
                System.out.print("#");
            }

            System.out.println();
        }
    }
}
