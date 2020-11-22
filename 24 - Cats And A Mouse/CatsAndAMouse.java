/**
 * Cats And A Mouse
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

public class CatsAndAMouse {
    /**
     * Function that determines if cat A gets to the mouse before cat B, or if mouse escapes.
     * @param x Location of cat A.
     * @param y Location of cat B.
     * @param z Location of mouse C.
     * @return Returns string "Cat A" if cat A reaches the mouse before cat B and vice versa. Returns "Mouse C" if mouse escapes.
     */
    static String catAndMouse(final int x, final int y, final int z) {
        String result = "";
        int catOneDistance = Math.abs(z - x);
        int catTwoDistance = Math.abs(y - z);

        if (catOneDistance < catTwoDistance) {
            result = "Cat A";
        } else if (catOneDistance > catTwoDistance) {
            result = "Cat B";
        } else {
            result = "Mouse C";
        }

        return result;
    }
}
