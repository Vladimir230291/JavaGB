package Task01.src;

import java.io.Console;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UI {
    private static int chose;
    public static Scanner input = new Scanner(System.in);
    public static void startProgram() {
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

    public static void UserChooce() throws IOException {

        while (true) {
            chose = input.nextInt();
            if (chose == 1) {
                System.out.println("Введите через пробел: Имя, Фамилию, год рождения, месяц, день");
                Family person = new Family(input.next(),input.next(), input.nextInt(), input.nextInt(), input.nextInt());
                Family.families.add(person); // Кастыль!!!!
                System.out.println("член семьи добавлен");
                startProgram();

            } else if (chose == 2) {
                Family.PrintFamiles();
                startProgram();


            } else if (chose == 3) {
                System.out.println("3");
                break;

            } else if (chose == 4) {
                System.out.println("4");
                break;

            } else if (chose == 5) {
                List<String> familes = new ArrayList<>(SaveAndLoad.Load());
                System.out.println("Загруженно!");
                startProgram();

            } else if (chose == 6) {
                SaveAndLoad.Save(Family.getCollection());
                System.out.println("Сохранено!");
                startProgram();

            } else break;
        }
    }

}

