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

        // Überprüfung ob Parameter übergeben worden sind
        switch (args.length){
            case 0:
                System.out.println("No parameters found !");
                break;
             default:
                 System.out.println("Found " + args.length + " parameters.");
                 break;
        }
    }
}
