
import java.time.LocalDate;
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
//        String gender = inputCheck.CheckGender(genderTemp);
        System.out.println("Введите дату рождения(В формате ГГГГ-ММ-ДД)");
        String dateTemp = scanner.nextLine();  //корректно отрабатывает только в таком виде... иначе нет проверки
//        LocalDate date = inputCheck.CheckBirthDate(dateTemp.trim());
        return new FamilyPerson(firstname, lastname,
                inputCheck.CheckGender(genderTemp), inputCheck.CheckBirthDate(dateTemp));
    }
}
