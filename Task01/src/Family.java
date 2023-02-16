package Task01.src;

import java.time.LocalDate;
import java.util.*;

public class Family extends Person {
    private String firstName, secondName;
    private LocalDate birthDay;

    private List<Person> familyList = new LinkedList<>();

    private Person person = new Person();


    public void addPerson(Person person) {
        familyList.add(person);
        System.out.println("Добавлен новый член");

    }

    public LocalDate getBirthDay() {
        return this.birthDay;
    }

    public List<Person> getFamilyList() {
        return this.familyList;
    }

    public void LoadFamily(List<Person> familyList) {
        this.familyList = familyList;
    }

    @Override
    public String toString() {
        return "{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }


    public void PrintFamily() {
        if (familyList.isEmpty()) System.out.println("Пуcто");
        familyList.forEach(System.out::println);
    }


}




