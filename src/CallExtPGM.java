/**
 * Die Klasse CallExtPGM dient zum Aufruf von externen Programmen.
 *
 * @author Adnan Vatric
 * @version v 1.0
 */
public class CallExtPGM {
    /**
     * Für das Programm Excel aus.
     *
     * @param args Zurzeit vewerden keine Parameeter verwendet.
     */
    public static void main(String[] args){
        Runtime rt = Runtime.getRuntime();
        String pfadPgm = "C:\\Program Files\\Microsoft Office\\root\\Office16\\";
        String namePgm = "excel.exe";

        try {
            rt.exec(pfadPgm + namePgm);
        } catch (Exception ex){
            System.out.println("Das Programm " + namePgm + " konnte nicht gestartet werden! MSG: " + ex.getMessage());
        } finally {
            System.out.println("Das Programm " + namePgm + " wurde gestartet");
        }
    }
}
