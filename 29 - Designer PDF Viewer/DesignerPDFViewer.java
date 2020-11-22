/**
 * Designer PDF Viewer
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

public class DesignerPDFViewer {
    /**
     * Function that calculates area of a word.
     * @param h Heights of each character.
     * @param word Word whose area we need to calculate.
     * @return Area of the word.
     */
    static int designerPdfViewer(final int[] h, final String word) {
        int maximumHeight = 0;

        for (int index = 0; index < word.length(); index++) {
            maximumHeight = Math.max(maximumHeight, h[word.charAt(index) - 'a']);
        }

        return word.length() * maximumHeight;
    }
}
