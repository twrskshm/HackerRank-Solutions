import java.util.Arrays;

/**
 * Electronics Shop
 *
 * Time complexity:
 * Worst case: Θ(m * lg(m) + n * lg(n))
 * Best case: Θ(m * lg(m) + n * lg(n))
 *
 * Space complexity:
 * Worst case: Θ(1)
 * Best case: Θ(1)
 *
 * @author Saksham Tiwari
 */

public class ElectronicsShop {
    /**
     * Function that determines most expensive keyboard and drive a person can buy within a budget.
     * @param keyboards Prices of each keyboard.
     * @param drives Prices of each drive.
     * @param b Budget given.
     * @return Maximum amount that can be spent, returns -1 if both cannot be bought.
     */
    static int getMoneySpent(final int[] keyboards, final int[] drives, final int b) {
        Arrays.sort(keyboards);
        Arrays.sort(drives);

        int result = -1;

        for (int keyboardsIndex = 0, drivesIndex = drives.length - 1; keyboardsIndex < keyboards.length && drivesIndex >= 0; ) {
            int sum = keyboards[keyboardsIndex] + drives[drivesIndex];

            if (sum <= b) {
                result = Math.max(result, sum);
                keyboardsIndex++;
            } else {
                drivesIndex--;
            }
        }

        return result;
    }
}
