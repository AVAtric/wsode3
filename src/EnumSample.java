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
     * Überprüfugt die gewählte Farbe und gibt diese auf der Console aus.
     *
     * @param args Zuzeit werden keine Argumente verwendet.
     */
    public static void main(String[] args) {
        Color c = Color.Red;

        if (c == Color.Yellow) {
            System.out.println("Gelb");
        } else if (c == Color.Red) {
            System.out.println("Rot");
        } else if (c == Color.White) {
            System.out.println("Weiß");
        }
    }
}