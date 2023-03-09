package Task01.src;

import java.io.IOException;

import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Person person = new Person("Иван", "Иванов", 2000, 11, 15);
        Person person2 = new Person("Степан", "Иванов", 1987, 10, 22);
        Person person3 = new Person("Елена", "Иванова", 1985, 2, 1);
        person.setFamilyConnections(person2, FamilyTies.PERENS);
        person.setFamilyConnections(person3, FamilyTies.PERENS);
        person.getFamilyConnections();
    }
}