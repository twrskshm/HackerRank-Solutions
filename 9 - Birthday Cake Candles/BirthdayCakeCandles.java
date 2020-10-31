import java.util.List;

/**
 * Birthday Cake Candles
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

public class BirthdayCakeCandles {
    /**
     * Function that calculates the total number of candles that can be blown
     * @param candles Integer array that containing heights of all the candles.
     * @return Returns total number of candles that can be blown
     */
    public static int birthdayCakeCandles(List<Integer> candles) {
        int largestElement = Integer.MIN_VALUE;
        int result = 0;

        for (int element: candles) {
            if (largestElement < element) {
                largestElement = element;
                result = 1;
            } else if (largestElement == element) {
                result++;
            }
        }

        return result;
    }
}
