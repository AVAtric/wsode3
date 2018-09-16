import java.util.Random;

/**
 * EnumSample dient zur veranschaulichung der Benutzung von Enums.
 *
 * @author Adnan Vatric
 * @version v 1.0
 */
public class EnumSample {
    /**
     * Ein Farben-Enum
     */
    enum Color {
        White, Yellow, Red
    }

    /**
     * Temporäres Array um Zufällige Farben zu generieren
     */
    private static Color[] tmpArray;

    /**
     * Temporäres Farb-Array initialisieren
     */
    private static void initColors(){
        int i = 0; // Position im Array
        tmpArray = new Color[Color.values().length]; // Array initialisieren

        // Alle Farben im Enum durchlaufen und im Array speichern
        for (Color col : Color.values())
            tmpArray[i++] = col;
    }

    /**
     * Zufällige Farbe auswählen
     *
     * @return Zufällige Farbe
     */
    private static Color getRandomColor(){
        return tmpArray[new Random().nextInt(tmpArray.length)];
    }

    /**
     * Überprüfugt die gewählte Farbe und gibt diese auf der Console aus.
     *
     * @param args Zuzeit werden keine Argumente verwendet.
     */
    public static void main(String[] args) {
        EnumSample.initColors(); // Farben initialisieren
        Color c = EnumSample.getRandomColor(); // Zufällige Farbe wählen

        // Gewählte Farbe prüfen
        if (c == Color.Yellow) {
            System.out.println("Gelb");
        } else if (c == Color.Red) {
            System.out.println("Rot");
        } else if (c == Color.White) {
            System.out.println("Weiß");
        }
    }
}