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
        int[] x = { 7, 12, 3, 9, 7, 20 };

        m1(x);
        System.out.println(Arrays.toString(x));

        int[] x1 = m2(5);
        System.out.println(Arrays.toString(x1));

        m3(x);
    }

    /**
     * Jedes Element des Arrays wird mit 2 multipliziert.
     *
     * @param ar Ein Array mit Integer-Werten.
     */
    private static void m1(int[] ar) {
        for (int i = 0; i < ar.length; i++)
            ar[i] *= 2;
    }

    /**
     * Es wird ein neues Array erstellt und ist genau so groß
     * wie der übergebene Parameter. Dieses wird am ende zurück gegeben.
     *
     * @param n Anzahl der Elemente im zurückgegebenen Array
     * @return Das erzeugte Array
     */
    private static int[] m2(int n) {
        int[] ar = new int[n];
        for (int i = 0; i < n; i++)
            ar[i] = i;
        return ar;
    }

    /**
     * Das übergebene Array wird sortiert und auf der Konsole
     * ausgegeben.
     *
     * @param ar Ein Array mit unsortiere Int Daten.
     */
    private static void m3(int[] ar) {
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
    }
}
