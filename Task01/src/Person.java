package Task01.src;

import javax.swing.plaf.nimbus.State;

public class Person extends Family{
    private static State On;

    Person(String firstName, String secondName, int year, int mouth, int day) {
        super(firstName, secondName, year, mouth, day);
    }

}
