package model;

import java.util.ArrayList;
import java.util.List;

public class FamilyPerson extends Human {

    private List<FamilyPerson> parents = new ArrayList<>();
    private List<FamilyPerson> children = new ArrayList<>();



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
        System.out.println(String.format("Список детей: %s", children));
    };
    public void getParents() {
        System.out.println(String.format("Родители: %s", parents));
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











