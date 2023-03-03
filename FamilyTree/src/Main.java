import mainMenu.CLI;
import model.FamilyPerson;
import model.FamilyTree;
import others.SaveAndLoad;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        CLI cli = new CLI();
        FamilyPerson person1 = new FamilyPerson("Владимир", "Ващенко", "Мужской",
                1991, 12, 11);
        FamilyPerson person2 = new FamilyPerson("Невладимир", "Ващенко", "Мужской",
                1991, 12, 11);
        person1.setChildren(person2);
        System.out.println(person1.getChildren());




    }
}
