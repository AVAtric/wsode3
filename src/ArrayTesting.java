import java.util.Arrays;

/**
 * ArrayTesting ist eine Klasse zum veranschaulichen von Array-Funktionen.
 *
 * @author Adnan Vatric
 * @version v 1.0
 */
public class ArrayTesting {

    /**
     * Bearbeitet Inhalte eines Arrays
     *
     * @param args hier wird nichts übergeben.
     */
    public static void main(String[] args) {
        int[] x = { 7, 12, 3, 9, 7, 20 }; // Werte werden initialisiert

        m1(x); // Werte in Array werden mit 2 multipliziert
        System.out.println(Arrays.toString(x)); // Array wird ausgegeben

        int[] x1 = m2(5); // Neues Array mit der Länge 5 wird erstellt
        System.out.println(Arrays.toString(x1)); // Array wird ausgegeben

        m3(x); // Array wird sortiert und ausgegeben
    }

    /**
     * Jedes Element des Arrays wird mit 2 multipliziert.
     *
     * @param ar Ein Array mit Integer-Werten.
     */
    private static void m1(int[] ar) {
        for (int i = 0; i < ar.length; i++)
            ar[i] *= 2; // Wert mit 2 multiplizieren und zurück speichern
    }

    /**
     * Es wird ein neues Array erstellt und ist genau so groß
     * wie der übergebene Parameter. Dieses wird am ende zurück gegeben.
     *
     * @param n Anzahl der Elemente im zurückgegebenen Array
     * @return Das erzeugte Array
     */
    private static int[] m2(int n) {
        int[] ar = new int[n]; // Array initieren
        for (int i = 0; i < n; i++)
            ar[i] = i; // Wert ist der selbe wie der Index
        return ar; // Array zurück gegeben
    }

    /**
     * Das übergebene Array wird sortiert und auf der Konsole
     * ausgegeben.
     *
     * @param ar Ein Array mit unsortiere Int Daten.
     */
    private static void m3(int[] ar) {
        Arrays.sort(ar); // Array sortieren
        System.out.println(Arrays.toString(ar)); // Array ausgeben
    }
}
