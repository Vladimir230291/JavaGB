import java.util.ArrayList;
import java.util.List;

public class seminar02_2 {
    public static void main(String[] args) {
        List stringAndNumbers = new ArrayList<String>();
        stringAndNumbers.add("Москва");
        stringAndNumbers.add("Казань");
        stringAndNumbers.add(123);
        stringAndNumbers.add(134);
        stringAndNumbers.add(1234);
        stringAndNumbers.add(12);

        for (int i = 0; i < stringAndNumbers.size(); i++) {
            if (stringAndNumbers.get(i) instanceof Integer){
                stringAndNumbers.remove(i);
                i--;
            }

        }
        System.out.println(stringAndNumbers);

    }
}
