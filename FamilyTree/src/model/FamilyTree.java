package model;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {

    List<FamilyPerson> familyList;

    public FamilyTree(FamilyPerson person){
        familyList = new ArrayList<>();
        familyList.add(person);
    }
    public FamilyTree(List<FamilyPerson> familyList){
        this.familyList = familyList;
    }
    public void FamilyTreePrint(){
        familyList.forEach(System.out::println);
    }
}
