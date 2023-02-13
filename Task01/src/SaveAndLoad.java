package Task01.src;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;
import java.util.*;


public class SaveAndLoad {
    public static List<String> Load() throws FileNotFoundException {
        List<String> families = new ArrayList<>();
        FileReader fileReader = new FileReader("tree.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            families.add(scanner.nextLine());
        }

        return families;
    }

    public static void Save(List<Family> arr) throws IOException {
        try (FileWriter fileWriter = new FileWriter("tree.txt", false)) {
            for (Family f : arr) {
                fileWriter.write(f.toString() + "\n");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }


}
