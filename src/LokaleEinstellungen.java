import java.util.Locale;
import java.util.TimeZone;

public class LokaleEinstellungen {
    public static void main(String[] args) throws Exception {
        Locale locale = Locale.getDefault();
        System.out.println("Country: " + locale.getCountry());
        System.out.println("Language: " + locale.getLanguage());
        TimeZone tz = TimeZone.getDefault();
        System.out.println("Timezone: " + tz.getDisplayName());
        System.out.println("Sommerzeit: " + tz.useDaylightTime());
        System.exit(0);
    }
}