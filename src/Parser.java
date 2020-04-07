import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Parser {
    Scanner s = new Scanner(new File("C:\\Users\\Admin\\Desktop\\NetstatLog.txt"));
    ArrayList<String> FileInList = new ArrayList<>();

    public Parser() throws FileNotFoundException {
    }


    /**
     * this function copies the file content to a list
     */
    public void fileToList() {
        while(s.hasNextLine()) {
            FileInList.add(s.nextLine());
        }

        s.close();
    }


    /**
     * this function removes any duplicates from the list
     */
    public void removeDuplicate() {
        LinkedHashSet<String> hashSet = new LinkedHashSet<>(FileInList);
        ArrayList<String> listWithoutDuplicates = new ArrayList<>(hashSet);

        System.out.println(listWithoutDuplicates);
            }
        }

