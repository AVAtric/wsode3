import java.util.Locale;
import java.util.TimeZone;

/**
 * LokaleEinstellungen dient zur veranschaulichung der Benutzung der Localization
 * von Java.
 *
 * @author Adnan Vatric
 * @version v 1.0
 */
public class LokaleEinstellungen {
    /**
     * Gibt das Land, die Sprache sowie die Zeitzone und Sommerzeit aus.
     *
     * @param args Es werden keine Paramaeter verwendet.
     */
    public static void main(String[] args){
        Locale locale = Locale.getDefault(); // Localizationseinstellungen abrufen

        // Einstellungen ausgeben
        System.out.println("Country: " + locale.getCountry());
        System.out.println("Language: " + locale.getLanguage());

        TimeZone tz = TimeZone.getDefault(); // Zeitzonen Einstellungen abrufen

        // Einstellungen ausgeben
        System.out.println("Timezone: " + tz.getDisplayName());
        System.out.println("Sommerzeit: " + tz.useDaylightTime());

        // Programm beenden
        System.exit(0);
    }
}