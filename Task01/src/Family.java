import java.time.LocalDate;
import java.util.Objects;

public class Family {
    private String firstName, secondName, birthDay;

    public void setMember(String firstName, String secondName) {
        if (!firstName.isEmpty() && !secondName.isEmpty()) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.birthDay = null;

        } else System.out.println("Не корректный ввод");
    }

    public void setBirthDay(int year, int mouth, int day) {
        if (year <= LocalDate.now().getYear() + 1 && mouth <= 12 && day <= 31)
            this.birthDay = LocalDate.of(year, mouth, day).toString();
        else System.out.println("проверьте коректность введеной даты");

    }


    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    @Override
    public String toString() {
        return "Family{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family family)) return false;
        return firstName.equals(family.firstName) && secondName.equals(family.secondName)
                && birthDay.equals(family.birthDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, birthDay);
    }
}
