package GB.Task1.task5;
import java.util.HashMap;
import java.util.Map;

/*
Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.
 */
public class task5_1 {
    public static void main(String[] args) {
        Map<String,String> telNumber = new HashMap<>();
        telNumber.put("8-966-564-56-56 "," Петров");
        telNumber.put("8-926-564-52-77 "," Сидиров");
        telNumber.put("8-955-564-56-11 "," Николаев");
        telNumber.put("8-946-564-56-13 "," Иванов");
        telNumber.put("8-966-512-31-56 "," Петров");
        telNumber.put("8-969-522-31-34 "," Николаев");
        System.out.print(telNumber);
    }


}
