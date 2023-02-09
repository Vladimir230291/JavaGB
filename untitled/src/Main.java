/*

    Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
    отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:

    “Введите цифру, соответствующую необходимому критерию:
    1 - ОЗУ
    2 - Объем ЖД
    3 - Операционная система
    4 - Цвет …

    Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

    Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<noteBook> noteBooks = new ArrayList<>();
        noteBook noteBook = new noteBook("Windows", "ASUS", 8,
                "SSD", 512, "Intel");
        noteBooks.add(noteBook);
        noteBook = new noteBook("Linux", "HP", 4,
                "SSD", 256, "Intel");
        noteBooks.add(noteBook);
        noteBook = new noteBook("Windows", "HP", 8,
                "HDD", 1024, "AMD");
        noteBooks.add(noteBook);
        noteBook = new noteBook("Windows", "ASUS", 4,
                "SSD", 512, "Intel");
        noteBooks.add(noteBook);
        noteBook = new noteBook("Linux", "Samsung", 4,
                "SSD", 256, "AMD");
        noteBooks.add(noteBook);
        
        System.out.println("""
                Введите цифру, соответствующую необходимому критерию:
                1 - ОЗУ
                2 - Объём ЖД
                3 - Операционная система
                4 - Модель процессора
                """);
        int inputSearch = scanner.nextInt();



    }

}