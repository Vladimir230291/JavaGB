import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CLI cli = new CLI();
    List<FamilyPerson> familyList = new ArrayList<>();
    familyList.add(cli.CreateNewPerson());
    SaveAndLoad.Save(familyList);
    familyList.forEach(System.out::println);
    }
}
