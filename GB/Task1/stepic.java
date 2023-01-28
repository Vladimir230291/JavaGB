import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stepic {
    public static void main(String[] args) {
        final String regex = "[A-z]";
        final String string = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Полное соответствие: " + matcher.group(0));

            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Группа " + i + ": " + matcher.group(i));
            }
        }
    }
}
