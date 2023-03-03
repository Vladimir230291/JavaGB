package model;

import java.time.LocalDate;

public abstract class Human {
    private final String firstname;
    private final String lastname;
    private final String gender;
    private final LocalDate dateOfBirth;

    public Human(String firstname, String lastname, String gender, int ageBrith, int monthBirth, int dayBirth) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.dateOfBirth = CheckDate(dayBirth, monthBirth, ageBrith);

    }

    public Human(String firstname, String lastname, String gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.dateOfBirth = null;
    }

    public String toString() {
        return String.format("Имя: %s \nФамилия:%s \nпол:(%s) \nДата рождения: %s",
                this.firstname, this.lastname, this.gender, this.dateOfBirth);
    }

    public String toSave() {
        return String.format("%s %s %s %s\n",
                this.firstname, this.lastname, this.gender, this.dateOfBirth);
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGender() {
        return gender;
    }


    private LocalDate CheckDate(int day, int month, int year) {
        if (day < 1 || day > 31) {
            return null;
        } else if (month < 1 || month > 12) {
            return null;
        } else if (year < 1900 || year > LocalDate.now().getYear()) {
            return null;
        } else {
            return LocalDate.of(year, month, day);
        }
    }
}
