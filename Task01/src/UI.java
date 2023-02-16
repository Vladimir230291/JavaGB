package Task01.src;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class UI {
    private int chose;
    public Scanner input = new Scanner(System.in);
    public Family family = new Family();

    public void startProgram() {
        System.out.println("""
                ___________________________FamilyThee___________________________
                                
                1. - Добавить нового члена семьи
                2. - Показать полный список семьи
                3. - Показать родствеников по старшеству
                4. - Вополнять какие-то действия с родствениками...(не придумал)
                5. - Загрузить последнее древо
                6. - Сохранить текущее древо
                0. - Выйти из программы""");
    }

    public void UserChooce() throws IOException {
        chose = input.nextInt();
        while (true) {
            switch (chose) {
                case 1:
                    System.out.println("Введите имя члена семьи: ");
                    String firstName = input.nextLine();
                    System.out.println("Введите фамилию члена семьи: ");
                    String secondName = input.nextLine();
                    System.out.println("Введите год рождения члена семьи: ");
                    String year = input.nextLine();
                    System.out.println("Введите месяц рождения члена семьи: ");
                    String mouth = input.nextLine();
                    System.out.println("Введите день рождения члена семьи: ");
                    String day = input.nextLine();

                    if (year.length() == 4 && mouth.length() <= 2 && day.length() <= 2) {
                        family.addPerson(new Person(firstName, secondName, Integer.parseInt(year),
                                Integer.parseInt(mouth), Integer.parseInt(day)));
                    } else System.out.println("Вы ввели не коректную дату рождения...\n");

                    startProgram();

                case 2:
                    family.PrintFamiles();
                    startProgram();


                case 3:
                    System.out.println("3");
                    List<Family> f = this.family.getFamilyList();
                    f.sort(Comparator.comparing(Family::getBirthDay));
                    f.forEach(System.out::println);


                case 4:
                    System.out.println("4");
                    break;

                case 5:
                    List<Family> familes = new ArrayList<>(SaveAndLoad.Load());
                    this.family.LoadFamilies(familes);
                    System.out.println("Загруженно!");
                    startProgram();


                case 6:
                    SaveAndLoad.Save(family.getFamilyList());

                    System.out.println("Сохранено!");
                    startProgram();
                case 0:
                    System.out.println("Bay!");
                    break;
            }
        }
    }

}

