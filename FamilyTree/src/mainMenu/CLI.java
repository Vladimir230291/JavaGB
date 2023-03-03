package mainMenu;

import model.FamilyPerson;
import others.InputCheck;

import java.util.Scanner;

public class CLI {

    Scanner scanner = new Scanner(System.in);
    InputCheck inputCheck = new InputCheck();
    public FamilyPerson CreateNewPerson() {
        System.out.println("Введите имя");
        String firstname = scanner.next();
        System.out.println("Введите фамилию");
        String lastname = scanner.next();
        System.out.println("Введите пол");
        String genderTemp = scanner.next();
        String gender = inputCheck.CheckGender(genderTemp);
        System.out.print("Введите год рождения");
        int ageBrith = scanner.nextInt();
        System.out.print("Введите месяц рождения");
        int monthBirth = scanner.nextInt();
        System.out.print("Введите день рождения");
        int dayBirth = scanner.nextInt();
        return new FamilyPerson(firstname, lastname, gender, ageBrith, monthBirth, dayBirth);
    }
}
