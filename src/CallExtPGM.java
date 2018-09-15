public class CallExtPGM {
    public static void main(String[] args) throws Exception {
        Runtime rt = Runtime.getRuntime();
        String pfadPgm = "C:\\Program Files\\Microsoft Office\\root\\Office16\\";
        String namePgm = "excel.exe";

        rt.exec(pfadPgm + namePgm);

        System.out.println("Das Programm " + namePgm + " wurde gestartet");
    }
}
