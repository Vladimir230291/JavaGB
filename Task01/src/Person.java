package Task01.src;

import java.time.LocalDate;


public class Person {
    private String firstName, secondName;
    private LocalDate birthDay;

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

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return birthDay.equals(person.birthDay);
    }



    public String toSave() {
        return String.format("%s %s %s", this.firstName, this.secondName, this.birthDay);
    }

    @Override
    public String toString() {
        return "Член семьи {" +
                "Имя " + firstName + '\'' +
                ", Фамилия " + secondName + '\'' +
                ", Дата рождения " + birthDay +
                '}';
    }
}
