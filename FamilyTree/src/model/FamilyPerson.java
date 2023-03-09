package model;

import java.util.ArrayList;
import java.util.List;

public class FamilyPerson extends Human {

    private final List<FamilyPerson> parents = new ArrayList<>();
    private final List<FamilyPerson> children = new ArrayList<>();



    public FamilyPerson(String firstname, String lastname, String gender,
                        int ageBrith, int monthBirth, int dayBirth) {
        super(firstname, lastname, gender, ageBrith, monthBirth, dayBirth);
    }

    public FamilyPerson(String firstname, String lastname, String gender) {
        super(firstname, lastname, gender);
    }
    public FamilyPerson(){

    }

    public void getChildren() {
        for (FamilyPerson person : children) {
            System.out.println(person.getFirstname() + " " + person.getLastname());
        }
    };
    public void getParents() {
        for (FamilyPerson person : parents) {
            System.out.println(person.getFirstname() + " " + person.getLastname());
        }
    }

    public void setParents(FamilyPerson parents) {
        this.parents.add(parents);
    }
    public void setParents(FamilyPerson parents, FamilyPerson parents2) {
        this.parents.add(parents);
        this.parents.add(parents2);
    }
    public void setChildren(FamilyPerson children) {
        this.children.add(children);
    }
    @Override
    public String toString() {
        return String.format("Имя: %s \nФамилия:%s \nпол:(%s) \nДата рождения: %s",
                super.getFirstname(), super.getLastname(), super.getGender(), super.getDateOfBirth());
        }
}











