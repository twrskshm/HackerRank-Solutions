import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Climbing The Leaderboard
 *
 * Time complexity:
 * Worst case: Θ(n + m)
 * Best case: Θ(n + m)
 *
 * Space complexity:
 * Worst case: Θ(n)
 * Best case: Θ(1)
 *
 * @author Saksham Tiwari
 */

public class ClimbingTheLeaderboard {
    /**
     * Function that determines rank of each player.
     * @param ranked Current leaderboard as a list.
     * @param player Points scored by new players as a list.
     * @return Ranks of each player as a list.
     */
    public static List<Integer> climbingLeaderboard(final List<Integer> ranked, final List<Integer> player) {
        final List<Integer> result = new LinkedList<>();
        final HashMap<Integer, Integer> pointsToRank = new HashMap<>();
        int rank = 1;

        for (int element: ranked) {
            if (!pointsToRank.containsKey(element)) {
                pointsToRank.put(element, rank++);
            }
        }

        for (int currentPoint: player) {
            int innerResult = pointsToRank.get(ranked.get(ranked.size() - 1)) + 1;

            while (!ranked.isEmpty() && ranked.get(ranked.size() - 1) <= currentPoint) {
                innerResult = pointsToRank.get(ranked.get(ranked.size() - 1));
                ranked.remove(ranked.size() - 1);
            }

            innerResult = ranked.isEmpty() ? 1 : innerResult;
            result.add(innerResult);
        }

        return result;
    }
}
