package Task01.src;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class SaveAndLoad {

    public static List<Person> Load() throws FileNotFoundException {
        List<Person> familyList = new ArrayList<>();//Работает только со строками!!!!
        FileReader fileReader = new FileReader("Task01/src/FamilyList.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] params = line.split(" ");
            String[] bday = params[2].split("-");
            Person person = new Person(params[0], params[1], Integer.parseInt(bday[0]),
                    Integer.parseInt(bday[1]), Integer.parseInt(bday[2]));
            familyList.add(person);
        }

        return familyList;
    }

    public static void Save(List<Person> arr) {
        try (FileWriter fileWriter = new FileWriter("Task01/src/FamilyList.txt")) {
            for (Person f : arr) {
                fileWriter.write(f.toSave() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
