import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class Reader {
    private final String path = "../resources/data.csv";
    private final String delimiter = ",";

    public Dictionary<String, String> GetData() {
        Dictionary<String, String> result = new Hashtable<>();

        try {
            File file = new File(path);

            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {

            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }

        return result;
    }
}
