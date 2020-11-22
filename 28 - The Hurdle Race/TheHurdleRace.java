/**
 * The Hurdle Race
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

public class TheHurdleRace {
    /**
     * Function that determines total doses of potion needed to complete the race.
     * @param k Character's ability to jump.
     * @param height Heights of the hurdles as integer array.
     * @return Doses of potion character will need.
     */
    static int hurdleRace(final int k, final int[] height) {
        int maximumHeight = 0;

        for (int element: height) {
            maximumHeight = Math.max(maximumHeight, element);
        }

        return k > maximumHeight ? 0 : maximumHeight - k;
    }
}
