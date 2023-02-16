package Task01.src;

import java.time.LocalDate;
import java.util.*;

public  class Family {
    private String firstName, secondName;
    private LocalDate birthDay;

    private List<Family> familyList = new LinkedList<>();

    Family(String firstName, String secondName,int year,int mouth,int day) {
            this.firstName = firstName;
            this.secondName = secondName;
        if (year < LocalDate.now().getYear() + 1 && mouth <= 12 && day <= 31)
            this.birthDay = LocalDate.of(year, mouth, day);
        else {System.out.println("Вы ввели не коректную дату рождения...\n");

        }

        }
    Family(){
    }

    public void addPerson (Family family){
        this.familyList.add(family);
    }

    public LocalDate getBirthDay() {
        return this.birthDay;
    }

    public List<Family> getFamilyList(){
        return this.familyList;
    }

    public void LoadFamilies(List<Family> families){
        this.familyList = families;
    }
    @Override
    public String toString() {
        return "Family{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }

    public String toSave(){
        return String.format("%s %s %s", this.firstName, this.secondName, this.birthDay);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family family)) return false;
        return birthDay.equals(family.birthDay);
    }

    public void PrintFamiles(){
        if (familyList.isEmpty()) System.out.println("Пуфто");
        familyList.forEach(System.out::println);
    }

    public List getCollection(){
        return familyList;
    }

}





