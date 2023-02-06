package GB.Task1.task5;

import java.util.*;
/*
Пусть дан список сотрудников: Иван, Пётр, Антон и так далее.
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности.
 */
public class task5_2 {
    public static void main(String[] args) {
        int count;
        List<String> list = new LinkedList<>();
        Map<String, Integer> result = new HashMap<>();
        Map<Integer,String> sortedResult = new TreeMap<>(Comparator.reverseOrder());
        list.add("Ivan");
        list.add("Anton");
        list.add("Ivan");
        list.add("Egor");
        list.add("Anton");
        list.add("Ivan");

        for (int i = 0; i < list.size(); i++) {
            count = 0;
            for (String s : list) {
                if (list.get(i).equals(s))
                    count++;
            }
            result.putIfAbsent(list.get(i), count);
        }
        result.forEach((key,value) -> sortedResult.put(value,key));
        sortedResult.forEach((key,value) -> System.out.println(key + " : " + value));
    }
}






