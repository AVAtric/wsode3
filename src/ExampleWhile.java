/**
 * ExampleWhile dient zur veranschaulichung der Benutzung von while-Schleifen.
 *
 * @author Adnan Vatric
 * @version v 1.0
 */
public class ExampleWhile {
    /**
     * Mittels while-Schleife wird ein Wert von 0 bis 9 hoch gezählt und
     * auf der Konsole ausgegeben.
     *
     * @param args Zurzeit werden keine Parameter verwendet.
     */
    public static void main(String[] args) {
        int i = 0;

        while (i < 10) {
            System.out.println(String.format("Loop %d", i));
            i++;
        }
    }
}
