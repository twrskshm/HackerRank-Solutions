import java.util.LinkedList;
import java.util.List;

/**
 * Grading Students
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

public class GradingStudents {
    /**
     * Function that rounds up grades of the students when certain conditions are met.
     * @param grades Grades of each student as a list of integers.
     * @return Grades of each student after rounding them up as a list of integers.
     */
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new LinkedList<>();

        for (int element: grades) {
            if (element >= 38) {
                int remainder = element % 5;

                if (remainder == 3 || remainder == 4) {
                    element += 5 - remainder;
                }
            }

            result.add(element);
        }

        return result;
    }
}
