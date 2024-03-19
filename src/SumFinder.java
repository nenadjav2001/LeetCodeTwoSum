/**
 * Die Klasse SumFinder findet zwei Zahlen in einem Array, deren Summe einem bestimmten Zielwert entspricht.
 */

  //LeetCode Challenge TwoSum level = easy
  // Meine Lösung der Challenge :

public class SumFinder {

    /**
     * Diese Methode sucht nach zwei Zahlen in einem Array, deren Summe dem Zielwert entspricht.
     *
     * @param targetSum Der Zielwert, dessen Summe gefunden werden soll.
     * @param sums Ein Array von Ganzzahlen, in dem die Summe gefunden werden soll.
     * @return Die Summe der zwei Zahlen, die dem Zielwert entsprechen, oder -1, falls keine gefunden werden.
     */
    public static int twoSumFinder(int targetSum, int[] sums) {

        // Durchlaufe das Array, um die Kombinationen zu überprüfen
        for (int i = 0; i < sums.length; i++) {
            for (int j = i + 1; j < sums.length; j++) {

                // Überprüfe, ob die Summe von sums[i] und sums[j] dem Zielwert entspricht
                if (sums[i] + sums[j] == targetSum) {
                    // Falls ja, gebe die Zahlen aus und ihre Summe zurück
                    System.out.println("Die Summe " + targetSum + " ergibt sich durch: " + sums[i] + " + " + sums[j]);
                    return sums[i] + sums[j];
                }
            }
        }

        // Falls keine Kombination gefunden wurde, gebe eine entsprechende Meldung aus und -1 zurück
        System.out.println("Keine der Zahlen ergibt die Summe.");
        return -1;
    }

    /**
     * Die Hauptmethode des Programms, die das zweiSumFinder-Methode mit Testdaten aufruft.
     *
     * @param args Die Befehlszeilenargumente (nicht verwendet in diesem Programm).
     */
    public static void main(String[] args) {

        // Testdaten
        int[] numbers = {1, 9, 5, 2, 8, 5, 9, 10, 10};
        int targetSum = 20;

        // Aufruf der twoSumFinder-Methode mit den Testdaten
        twoSumFinder(targetSum, numbers);

    }
}
