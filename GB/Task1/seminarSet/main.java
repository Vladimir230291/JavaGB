package GB.Task1.seminarSet;

import java.util.*;


public class main {
    public static void main(String[] args) {
        Set<Cat> cats = new TreeSet<Cat>();
        cats.add(new Cat("Мурзик","Белый"));
        cats.add(new Cat("Шурка","Серый"));
        cats.add(new Cat("Турка","Черный"));

        System.out.println(cats);
    }


}
