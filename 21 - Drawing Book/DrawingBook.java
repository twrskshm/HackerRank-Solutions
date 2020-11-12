/**
 * Drawing Book
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

public class DrawingBook {
    /**
     * Function that finds minimum page turns required to reach page number p.
     * @param n Total number of pages in the book.
     * @param p Page number students are required to turn to.
     * @return Minimum page turns required.
     */
    static int pageCount(final int n, final int p) {
        if (p - 1 < n - p) {
            return p / 2;
        } else {
            return n / 2 - p / 2;
        }
    }
}
