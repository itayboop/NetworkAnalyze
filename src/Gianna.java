import java.io.IOException;

/**
 * this class runs the program (the main)
 *
 * @version 1
 *
 * ++ approved by blue_bird - 07.04.2020
 */

public class Gianna {
    public static void main(String[] args) throws IOException {
        CreateFile createFile = new CreateFile();
        Parser parser = new Parser();

        createFile.getNetstat();
        parser.fileToList();
        parser.removeDuplicate();
    }
}
