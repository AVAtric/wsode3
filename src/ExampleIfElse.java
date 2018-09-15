/**
 * ExampleIfElse dient zur veranschaulichung der Benutzung von if-else-Anweisungen.
 *
 * @author Adnan Vatric
 * @version v 1.0
 */
public class ExampleIfElse {
    /**
     * Es wird überprüft ob Parameter übergeben worden sind.
     *
     * @param args Parameter zum testen.
     */
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No parameters found !");
        } else {
            System.out.println("Found " + args.length + " parameters.");
        }
    }
}
