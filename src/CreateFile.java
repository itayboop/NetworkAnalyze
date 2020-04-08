import java.io.File;
import java.io.IOException;

public class CreateFile {
    File file = new File("C:\\Users\\Admin\\Desktop\\NetstatLog.txt");
    private String command = "netstat -nb | find \"[\" | find /V \"::\" > c:\\Users\\Admin\\Desktop\\NetstatLog.txt";

    public void fileCreation() {
        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void getNetstat() {
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
