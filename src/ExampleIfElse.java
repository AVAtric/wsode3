public class ExampleIfElse {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No parameters found !");
        } else {
            System.out.println("Found " + args.length + " parameters.");
        }
    }
}
