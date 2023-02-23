import java.time.LocalDate;

abstract class Human {
    private final String firstname;
    private final String lastname;
    private final String gender;
    private final LocalDate birthDate;

    public Human(String firstname, String lastname, String gender, LocalDate birthDate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public String toString() {
        return String.format("Имя: %s \nФамилия:%s \nпол:(%s) \nДата рождения: %s",
                this.firstname, this.lastname, this.gender, this.birthDate);
    }
    public String toSave() {
        return String.format("%s %s %s %s\n", this.firstname, this.lastname, this.gender, this.birthDate);
    }



}
