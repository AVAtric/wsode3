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
        // Tage definieren
        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        // Alle Tage durchlaufen und ausgeben
        for(String day : days){
            System.out.println(day);
        }
    }
}
