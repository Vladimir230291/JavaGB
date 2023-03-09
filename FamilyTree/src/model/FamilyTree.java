package model;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree implements IFamilyTree {

    List<FamilyPerson> familyList;

    public FamilyTree(FamilyPerson person){
        familyList = new ArrayList<>();
        familyList.add(person);
    }
    public FamilyTree(){
        familyList = new ArrayList<>();
    }
    public void FamilyTreePrint(){
        familyList.forEach(System.out::println);
    }

    @Override
    public void FamilyTreeAdd(FamilyPerson person) {
        familyList.add(person);
    }
}
