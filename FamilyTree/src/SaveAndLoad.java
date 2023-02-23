import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class SaveAndLoad {

    public static List<FamilyPerson> Load() throws FileNotFoundException {
        List<FamilyPerson> familyList = new ArrayList<>();
        FamilyPerson person;
        FileReader fileReader = new FileReader("FamilyTree/src/FamilyList.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] params = line.split(" ");
            if (params[3]!= null){
                person = new FamilyPerson(params[0], params[1], params[2], LocalDate.parse(params[3]));

            }else{
                person = new FamilyPerson(params[0], params[1], params[2], null);
                            }
            familyList.add(person);
            }

        return familyList;
        }




    public static void Save(List<FamilyPerson> arr) {
        try (FileWriter fileWriter = new FileWriter("FamilyTree/src/FamilyList.txt")) {
            for (FamilyPerson f : arr) {
                fileWriter.write(f.toSave() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

