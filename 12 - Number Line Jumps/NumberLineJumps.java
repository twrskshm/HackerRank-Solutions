/**
 * Number Line Jumps
 *
 * Time complexity:
 * Worst case: Θ(1)
 * Best case: Θ(1)
 *
 * Space complexity:
 * Worst case: Θ(1)
 * Best case: Θ(1)
 *
 * @author Saksham Tiwari
 */

public class NumberLineJumps {
    /**
     * Function that checks if two kangaroos at different positions with different velocities meet at a point in same time.
     * @param x1 Starting position of kangaroo one.
     * @param x2 Starting position of kangaroo two.
     * @param v1 Velocity of kangaroo one.
     * @param v2 Velocity of kangaroo two.
     * @return Returns "YES" if they meet at one point in one time, else returns "NO".
     */
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 > v2 && (x2 - x1) % (v2 - v1) == 0) {
            return "YES";
        }

        return "NO";
    }
}
