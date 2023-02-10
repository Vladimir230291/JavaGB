import java.util.*;


public class Main {
    public static void main(String[] args) {
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
                "HDD", 256, "AMD");
        noteBooks.add(noteBook);
        noteBook = new noteBook("Linux", "Samsung", 16,
                "HDD", 1024, "AMD");
        noteBooks.add(noteBook);

        searchNoteBook(noteBooks);
    }


    static void searchNoteBook(List<noteBook> inputList){
        ArrayList<noteBook> noteBooksForSearch = new ArrayList<>(inputList);
        Scanner input = new Scanner(System.in);
        System.out.println("""
                Введите цифру, соответствующую необходимому критерию:
                1 - ОЗУ.
                2 - Объём ЖД.
                3 - Операционная система.
                4 - Модель процессора.
                5 - Вывести весь список.
                """);
        int originSearch = input.nextInt();
        if (originSearch == 1) {
            System.out.print("Введите какой минимальный объем памяти необходим: ");
            int secondSearch = input.nextInt();
            for (noteBook nb:noteBooksForSearch){
                if (nb.getMemorySize() >= secondSearch){
                    System.out.println(nb);
                }
            }
        } else if (originSearch == 2) {
            System.out.print("Какой минимальный обьем необходим: ");
            int secondSearch = input.nextInt();
            for (noteBook nb: noteBooksForSearch) {
                if (nb.getDiskCapacity() >= secondSearch){
                    System.out.println(nb);
                }
            }
        } else if (originSearch == 3) {
            System.out.println("Какую операционную систему искать: ");
            String secondSearch = input.next().toLowerCase();
            for (noteBook nb: noteBooksForSearch){
                if (nb.getOS().toLowerCase().equals(secondSearch)){
                    System.out.println(nb);
                }

            }
        } else if (originSearch == 4) {
            System.out.println("Введите модель процессора(AMD,Intel): ");
            String secondSearch = input.next().toLowerCase();
            for (noteBook nb:noteBooksForSearch) {
                if (nb.getModelCPU().toLowerCase().equals(secondSearch)){
                    System.out.println(nb);
                }
            }
        } else if (originSearch == 5) {
            noteBooksForSearch.forEach(System.out::println);
        }
        else System.out.println("Нет такого поля");


    }


}