import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class task2 {
    public static void main(String[] args) throws Exception {
        try (FileReader fr = new FileReader("fileJSON.txt")) {
            Scanner scan = new Scanner(fr);
            String json = scan.nextLine();

            printRequest(stringParsing(json));

        } catch (IOException ex) {
            System.out.println("Невозможно считать файл");
        }
    }

    // Разбивает строку на Массив
    static String[] stringParsing(String str) {
        String[] result = str.substring(1, str.length() - 1)
                .replace(":", " ")
                .replace(",", "")
                .split(" ");
        return result;
    }
    // формирование строки
    static void printRequest(String[] arg) {
        StringBuilder request = new StringBuilder();


        request.append("SELECT * FROM students WHERE");
        request.append(" name = " + arg[1])
                .append(" AND country = " + arg[3])
                .append(" AND city = " + arg[5]);
        System.out.println(arg[7]);
        if (!arg[7].contains("null") ) request.append(" AND age = ").append(arg[7]);


        System.out.println(request);
    }
}



