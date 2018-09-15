public class RateMal {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int zahl = (int) (1 + Math.random() * 9);
        System.out.println("Welche Zahl denke ich mir zwischen 1 und 9?");
        int raten = new java.util.Scanner(System.in).nextInt();
        if (zahl == raten)
            System.out.println("Glück gehabt!");
        else
            System.out.printf("Sorry, ich habe mir die %s ausgedacht!", zahl);
    }
}