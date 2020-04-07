import java.io.IOException;

public class Gianna {
    public static void main(String[] args) throws IOException {
        CreateFile createFile = new CreateFile();
        Parser parser = new Parser();

        createFile.getNetstat();
        parser.fileToList();
        parser.removeDuplicate();
    }
}
