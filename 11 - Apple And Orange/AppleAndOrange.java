/**
 * Apple And Orange
 *
 * Time complexity:
 * Worst case: Θ(n + m)
 * Best case: Θ(n + m)
 *
 * Space complexity:
 * Worst case: Θ(1)
 * Best case: Θ(1)
 *
 * @author Saksham Tiwari
 */

public class AppleAndOrange {
    /**
     * Function that counts number of apples and oranges that fell on house.
     * @param s Starting point of house.
     * @param t Ending point of house.
     * @param a Location of apple tree.
     * @param b Location of orange tree.
     * @param apples Location of every apple that fell off.
     * @param oranges Location of every orange that fell off.
     */
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int numberOfApples = 0;
        int numberOfOranges = 0;

        for (int element: apples) {
            int dropLocation = a + element;

            if (dropLocation >= s && dropLocation <= t) {
                numberOfApples++;
            }
        }

        for (int element: oranges) {
            int dropLocation = b + element;

            if (dropLocation >= s && dropLocation <= t) {
                numberOfOranges++;
            }
        }

        System.out.println(numberOfApples);
        System.out.println(numberOfOranges);
    }
}
