package Task01.src;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class SaveAndLoad {

    public static List<Family> Load() throws FileNotFoundException {
        List<Family> families = new ArrayList<>();//Работает только со строками!!!!
        FileReader fileReader = new FileReader("Task01/src/Family.java");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] params = line.split(" ");
            String[] bday = params[2].split("-");
            Family family = new Family(params[0], params[1], Integer.parseInt(bday[0]),
                    Integer.parseInt(bday[1]), Integer.parseInt(bday[2]));
            families.add(family);
        }

        return families;
    }

    public static void Save(List<Family> arr) {
        try (FileWriter fileWriter = new FileWriter("Task01/src/Family.java")) {
            for (Family f : arr) {
                fileWriter.write(f.toSave() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
