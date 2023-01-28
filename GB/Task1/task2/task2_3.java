package task2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class task2_3 {
    public static void main(String[] args) {
        String path = "task2/fileForTask2_3.txt";
        String[] result = getStringArray(getStringFromFile(path));
        for (String text:result) {
            System.out.println(text);
        }
    }

    /**
     * Считывает фаил и возвращает StringBuilder
     *
     * @param path - Путь к файлу.
     * @return - StringBuilder.
     */
    private static String getStringFromFile(String path) {
        StringBuilder data = null;
        String res = "";
        try (FileReader fr = new FileReader(path)) {
            Scanner sc = new Scanner(fr);
            data = new StringBuilder();
            while (sc.hasNext()) {
                data.append(sc.nextLine());
            }
        } catch (IOException ex) {
            System.out.println("Невозможно считать файл");
        }
        if (data != null) res = data.toString();
        return res;
    }
// Сборка массива строк, согласно условию задачи
    private static String[] getStringArray(String arg) {
        StringBuilder temp = new StringBuilder(arg);

        String[] parseJsonToArray = temp.substring(1,temp.length()-1)
                .replace("{","")
                .replace("}","")
                .replace(":", " ")
                .replace(", ", "%")
                .replace(","," ")
                .replace("\"", "")
                .split("%");
        int size = parseJsonToArray.length;
        for (int i = 0; i < size; i++) {
            parseJsonToArray[i] = parseJsonToArray[i].replace("фамилия","Студент")
                    .replace("оценка", "получил")
                    .replace("предмет", "по предмету");
        }
        return parseJsonToArray;
    }
}
