package Task01.src;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Person {
    private String firstName, secondName;
    private LocalDate birthDay;
    private List<FamilyConnection> familyConnetions = new ArrayList<>();

    public Person(String firstName, String secondName, int year, int mouth, int day) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthDay = LocalDate.of(year, mouth, day);
    }

    public Person() {
        this.firstName = "";
        this.secondName = "";
        this.birthDay = LocalDate.now();
    }

    public LocalDate getBirthDay() {
        return this.birthDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName)
                && Objects.equals(secondName, person.secondName)
                && Objects.equals(birthDay, person.birthDay)
                && Objects.equals(familyConnetions, person.familyConnetions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, birthDay, familyConnetions);
    }

    public String toSave() {
        return String.format("%s %s %s", this.firstName, this.secondName, this.birthDay);
    }

    @Override
    public String toString() {
        return "Член семьи {" +
                "Имя: " + firstName  +
                ", Фамилия: " + secondName  +
                ", Дата рождения: " + birthDay +
                '}';
    }

    public void setFamilyConnections(Person person, FamilyTies familyTies) {
        FamilyConnection familyConnection = new FamilyConnection(person, familyTies);
        this.familyConnetions.add(familyConnection);
    }

    public void getFamilyConnections() {
        System.out.println(this.familyConnetions);
    }

}
