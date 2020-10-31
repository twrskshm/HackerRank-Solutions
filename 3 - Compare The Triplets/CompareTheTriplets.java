import java.util.LinkedList;
import java.util.List;

/**
 * Compare The Triplets
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

public class CompareTheTriplets {
    /**
     * Function that finds total points earned by both Alice and Bob.
     * @param a Ratings for Alice's challenges in the form of a list.
     * @param b Ratings for Bob's challenges in the form of a list.
     * @return Total points earned by both Alice and Bob in the form of a list.
     */
    static List<Integer> compareTriplets(final List<Integer> a, final List<Integer> b) {
        List<Integer> result = new LinkedList<>();
        int aliceScore = 0;
        int bobScore = 0;

        for (int index = 0; index < a.size(); index++) {
            if (a.get(index) > b.get(index)) {
                aliceScore++;
            } else if (a.get(index) < b.get(index)) {
                bobScore++;
            }
        }

        result.add(aliceScore);
        result.add(bobScore);
        return result;
    }
}
