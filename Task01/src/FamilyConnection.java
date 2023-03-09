package Task01.src;

import java.util.List;

public class FamilyConnection {
    Person person;
    FamilyTies familyTies;
    List<FamilyConnection> familyConnections;

    FamilyConnection(Person person, FamilyTies familyTies) {
        this.person = person;
        this.familyTies = familyTies;
    }

    public void add(FamilyConnection familyConnection) {
        familyConnections.add(familyConnection);
    }

    @Override
    public String toString() {
        return String.format("%s %s\n", person, familyTies);

    }
}
