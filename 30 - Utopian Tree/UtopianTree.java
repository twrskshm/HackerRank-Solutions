/**
 * Utopian Tree
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

public class UtopianTree {
    /**
     * Function that returns height of the tree after n cycles.
     * @param n Number of cycles.
     * @return Height of the tree.
     */
    static int utopianTree(final int n) {
        int result = 1;

        for (int iterator = 1; iterator <= n; iterator++) {
            result = iterator % 2 == 1 ? result * 2 : result + 1;
        }

        return result;
    }
}
