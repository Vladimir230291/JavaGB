package model;

import java.util.ArrayList;
import java.util.List;

public class FamilyPerson extends Human {

    private List<FamilyPerson> parents;
    private List<FamilyPerson> children;



    public FamilyPerson(String firstname, String lastname, String gender,
                        int ageBrith, int monthBirth, int dayBirth) {
        super(firstname, lastname, gender, ageBrith, monthBirth, dayBirth);
    }

    public FamilyPerson(String firstname, String lastname, String gender) {
        super(firstname, lastname, gender);
    }
    public List<FamilyPerson> getParents() {
        return parents;
    }
    public List<FamilyPerson> getChildren() {
        return children;
    }
    public void setParents(FamilyPerson parents) {
        parents.add(parents);
    }
    public void setChildren(FamilyPerson children) {
        children.add(children);
    }

    public void add(FamilyPerson parent) {
        this.parents.add(parent);
    }

    @Override
    public String toString() {
        return "FamilyPerson{" +
                "parents=" + parents +
                ", children=" + children +
                '}';
    }
}











