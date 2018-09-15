/**
 * ExampleFor dient zur veranschaulichung der Benutzung von for-Schleifen.
 *
 * @author Adnan Vatric
 * @version v 1.0
 */
public class ExampleFor {
    /**
     * Es wird ein String-Array mittels for-Schleife auf der Konsole ausgegeben.
     *
     * @param args Wird zurzeit nicht verwendet.
     */
    public static void main(String[] args) {
        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }
    }
}
