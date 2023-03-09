package Task01.src;

import java.time.LocalDate;
import java.util.*;

public class Family extends Person {


    private List<Person> familyList = new LinkedList<>();

    public void addPerson(Person person) {
        familyList.add(person);
        System.out.println("Добавлен новый член");

    }

    public List<Person> getFamilyList() {
        return this.familyList;
    }

    public void LoadFamily(List<Person> familyList) {
        this.familyList = familyList;
    }

    public void PrintFamily() {
        if (familyList.isEmpty()) System.out.println("Пуcто");
        familyList.forEach(System.out::println);
    }


}




