import java.lang.reflect.Array;
import java.util.*;

public class stepic {

    public static void main(String[] args) {
        List<String> listPlanets = Arrays.asList("Mars", "Jupiter", "Pluton", "Earth", "Pluton", "Mars", "Pluton");
        List<Integer> counts = new ArrayList<>();
        List<String> planetsName = new ArrayList<>();
        for (String planet : listPlanets) {
            if (!planetsName.contains(planet)){
                planetsName.add(planet);
                counts.add(1);
            }
            else {
                int index = planetsName.indexOf(planet);
                counts.set(index, counts.get(index)+1);
            }
        }
        for (int i = 0; i < counts.size(); i++) {
            System.out.printf("%s : %d\n",planetsName.get(i),counts.get(i));

        }


    }


}

