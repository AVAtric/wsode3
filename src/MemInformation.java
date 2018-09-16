/**
 * MemInformation dient zur veranschaulichung der Benutzung von der Runtime-Klasse.
 *
 * @author Adnan Vatric
 * @version v 1.0
 */
public class MemInformation {
    /**
     * Gibt die Speichernutzung auf der Konsole aus.
     *
     * @param args Es werden keine Parameter verwendet.
     */
    public static void main(String[] args){
        Runtime rt = Runtime.getRuntime(); // Runtime Objekt initialisieren

        // Speicherauslastung ausgeben
        System.out.println("Max memory: " + rt.maxMemory());
        System.out.println("Total memory: " + rt.totalMemory());
        System.out.println("Free memory: " + rt.freeMemory());
    }
}