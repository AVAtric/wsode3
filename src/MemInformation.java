public class MemInformation {
    public static void main(String[] args) throws Exception {

        Runtime rt = Runtime.getRuntime();
        System.out.println("Max memory: " + rt.maxMemory());
        System.out.println("Total memory: " + rt.totalMemory());
        System.out.println("Free memory: " + rt.freeMemory());
    }
}