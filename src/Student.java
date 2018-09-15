/**
 * Student dient zur veranschaulichung der Benutzung von primitiven Datentypen.
 *
 * @author Adnan Vatric
 * @version v 1.0
 */
public class Student {
    /**
     * Verschiedene primitive Datentypen (ausser String)
     * werden erstellt und auf der Konsole ausgegeben.
     *
     * @param args Es werden keine Parameter verwendet.
     */
    public static void main(String[] args) {
        String name = "Franz L. Kopica";
        int age = 53;
        double income = 100000;
        char sex = 'm';
        boolean isStudent = false;
        System.out.println("String : " + name);
        System.out.println("Int : " + age);
        System.out.println("Double : " + income);
        System.out.println("Char : " + sex);
        System.out.println("Boolean: " + isStudent);
    }
}
