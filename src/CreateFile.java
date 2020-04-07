public class CreateFile {
    private String command = "netstat -nb | find \"[\" | find /V \"::\" > c:\\Users\\Admin\\Desktop\\NetstatLog.txt";

    /**
     * this function is streaming a log file with the "netstat -nb" command
     */
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
