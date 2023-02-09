import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

/*
1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
Можно записать в текстовом виде, не обязательно реализовывать в java.
 */
public class Cat {
    private String name;
    private String breed;
    private LocalDate birthDay;
    private String ownerName;
    private List<Vaccination> vaccinations = new ArrayList<>();

    public Cat(String name, String breed, LocalDate birthDay, String ownerName) {
        this.name = name;
        this.breed = breed;
        this.birthDay = birthDay;
        this.ownerName = ownerName;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getOwnerName() {
        return ownerName;
    }
//    Добавление какой то "колекции"
    public void addVaccination(Vaccination vaccination){
        this.vaccinations.add(vaccination);
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name ='" + name + '\'' +
                ", breed ='" + breed + '\'' +
                ", birthDay =" + birthDay +
                ", ownerName ='" + ownerName + '\'' +
                ", vaccinations =" + vaccinations +
                '}';
    }



}
