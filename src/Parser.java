import java.io.IOException;

public class Parser {
    private String command = "netstat -nb > c:\\Users\\Admin\\Desktop\\NetstatLog.txt";

    public void cmdPrint() {
        try {
            Process process = Runtime.getRuntime().exec(new String[] {"cmd.exe", "/c", command});
            if(process != null) {
                process.waitFor();
            }
        } catch (Exception e) {
            System.out.println("something went wrong...");
        }
    }
}
