import java.util.List;

/**
 * Diagonal Difference
 *
 * Time complexity:
 * Worst case: Θ(n^2)
 * Best case: Θ(n^2)
 *
 * Space complexity:
 * Worst case: Θ(1)
 * Best case: Θ(1)
 *
 * @author Saksham Tiwari
 */

public class DiagonalDifference {
    /**
     * Function that finds the absolute difference between the sum of matrix's two diagonals.
     * @param arr Integer array whose sum we need to calculate.
     * @return Absolute difference between the sum of matrix's two diagonals.
     */
    public static int diagonalDifference(List<List<Integer>> arr) {
        int result = 0;

        for (int row = 0; row < arr.size(); row++) {
            for (int column = 0; column < arr.size(); column++) {
                if (row == column) {
                    result += arr.get(row).get(column);
                }

                if (row + column + 1 == arr.size()) {
                    result -= arr.get(row).get(column);
                }
            }
        }

        return Math.abs(result);
    }
}
