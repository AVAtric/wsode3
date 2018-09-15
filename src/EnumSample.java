public class EnumSample {
    enum Color {
        White, Yellow, Red
    }

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