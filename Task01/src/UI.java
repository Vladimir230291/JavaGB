package Task01.src;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class UI {

    public static Scanner input = new Scanner(System.in);
    public static Family family = new Family();

    public static void startProgram() {
        System.out.println("""
                ___________________________FamilyThee___________________________
                                
                1. - Добавить нового члена семьи
                2. - Показать полный список семьи
                3. - Показать родствеников по старшеству
                5. - Загрузить последнее древо
                6. - Сохранить текущее древо
                0. - Выйти из программы""");
    }

    public static void UserChose(int chose) throws IOException {

        while (true) {

            if (chose == 1) {
                System.out.println("Введите: Имя, Фамилия, Год рождения, Месяц рождения, День рождения");
                Person person = new Person(input.next(), input.next(), input.nextInt(),
                        input.nextInt(), input.nextInt());
                family.addPerson(person);
                startProgram();
                UserChose(input.nextInt());

            } else if (chose == 2) {
                family.PrintFamily();
                startProgram();
                UserChose(input.nextInt());

            } else if (chose == 3) {
                List<Person> f = family.getFamilyList();
                f.sort(Comparator.comparing(Person::getBirthDay));
                f.forEach(System.out::println);
                startProgram();
                UserChose(input.nextInt());

            } else if (chose == 4) {
                List<Person> familyList = new ArrayList<>(SaveAndLoad.Load());
                family.LoadFamily(familyList);
                System.out.println("Загруженно!");
                startProgram();
                UserChose(input.nextInt());

            } else if (chose == 5) {
                SaveAndLoad.Save(family.getFamilyList());
                System.out.println("Сохранено!");
                startProgram();
                UserChose(input.nextInt());

            } else if (chose == 0) {
                System.out.println("Выход из программы");
                break;

            } else {
                System.out.println("Такого пункта нет");
                startProgram();
            }
        }
    }
}



