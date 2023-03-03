package others;

import model.FamilyPerson;

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
                String[] age = params[3].split("-");
                person = new FamilyPerson(params[0], params[1], params[2],
                        Integer.parseInt(age[0]), Integer.parseInt(age[1]), Integer.parseInt(age[2]));

            }else{
                person = new FamilyPerson(params[0], params[1], params[2]);
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

