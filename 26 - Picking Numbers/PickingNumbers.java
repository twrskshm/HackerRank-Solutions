import java.util.HashMap;
import java.util.List;

/**
 * Picking Numbers
 *
 * Time complexity:
 * Worst case: Θ(n)
 * Best case: Θ(n)
 *
 * Space complexity:
 * Worst case: Θ(n)
 * Best case: Θ(1)
 *
 * @author Saksham Tiwari
 */

public class PickingNumbers {
    /**
     * Function that finds maximum length of subarray where difference between any two elements is not more than 1.
     * @param a Array of integers.
     * @return Maximum length of subarray where difference between any two elements is not more than 1.
     */
    public static int pickingNumbers(final List<Integer> a) {
        int result = 0;
        final HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int element: a) {
            frequency.put(element, frequency.getOrDefault(element, 0) + 1);
            result = Math.max(result, frequency.get(element) + frequency.getOrDefault(element - 1, 0));
            result = Math.max(result, frequency.get(element) + frequency.getOrDefault(element + 1, 0));
        }

        return result;
    }
}
