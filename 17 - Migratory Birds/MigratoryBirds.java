import java.util.HashMap;
import java.util.List;

/**
 * Migratory Birds
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

public class MigratoryBirds {
    /**
     * Function that finds the most common bird sighted.
     * @param arr Integer array representing types of birds sighted.
     * @return Returns the id of most common bird sighted.
     */
    static int migratoryBirds(final List<Integer> arr) {
        final HashMap<Integer, Integer> frequency = new HashMap<>();
        int mostFrequentElement = Integer.MAX_VALUE;
        int maximumOccurrence = 0;

        for (int element: arr) {
            frequency.put(element, frequency.getOrDefault(element, 0) + 1);

            if (maximumOccurrence < frequency.get(element) || (maximumOccurrence == frequency.get(element) && mostFrequentElement > element)) {
                mostFrequentElement = element;
                maximumOccurrence = frequency.get(element);
            }
        }

        return mostFrequentElement;
    }
}
