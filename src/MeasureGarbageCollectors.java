/**
 * Die Klasse MeasureGarbageCollectors dient zum veranschaulichen der Funktion des gc.
 *
 * @author Adnan Vatric
 * @version v 1.0
 */
public class MeasureGarbageCollectors {
    /**
     * Zeigt den verwendeten Speicher vor und nach dem aufräumen vom
     * Speicher durch den gc.
     *
     * @param args Es werden keine Parameter verwendet
     */
    public static void main(String[] args){
        Runtime rt = Runtime.getRuntime(); // Runtime objekt initialisiren

        // Freier Speicher bevor der gc gelaufen ist
        System.out.println("Free Memory: " + rt.freeMemory());

        rt.gc(); // gc Speicher aufräumen lassen

        // Freier speicher nachdem der gc gelaufen ist
        System.out.println("Free Memory after running gc: " + rt.freeMemory());
    }
}
