import java.util.Arrays;

/**
 * @author Adnan Vatric
 * @version v 1.0
 *
 * ArrayTesting ist eine Klasse zum veranschaulichen von Array-Funktionen.
 */
public class ArrayTesting {

    /**
     * Bearbeitet Inhalte eines Arrays
     *
     * @param args hier wird nichts übergeben.
     */
    public static void main(String[] args) {
        int[] x = { 7, 12, 3, 9 };
        m1(x);
        System.out.println(Arrays.toString(x));

        x = m2(5);

        System.out.println(Arrays.toString(x));

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
     *
     * @param x
     */
    private static void m3(int[] x) {
        int[] ar = { 10, 5, 30, 7, 20, 9 };
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
    }
}
