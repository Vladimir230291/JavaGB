import mainMenu.CLI;
import model.FamilyPerson;
import model.FamilyTree;
import model.Human;
import others.SaveAndLoad;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        FamilyTree familyTree = new FamilyTree();
        FamilyPerson person = new FamilyPerson("Иван", "Иванов", "Мужской",
                1985,12,11);
        FamilyPerson person2 = new FamilyPerson("Петр", "Иванов", "Мужской",
                2014,10,15);
        FamilyPerson person3 = new FamilyPerson("Елизвета", "Иванова", "ж",
                1986,3,1);
        person.setChildren(person2);
        person3.setChildren(person2);
        person2.setParents(person, person3);
        familyTree.FamilyTreeAdd(person);
        familyTree.FamilyTreeAdd(person2);
        familyTree.FamilyTreeAdd(person3);

        person.getParents();
        person2.getChildren();






    }
}
