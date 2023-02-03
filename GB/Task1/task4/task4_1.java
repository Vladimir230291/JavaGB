package task4;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class task4_1 {
    static Random random = new Random();
    public static void main(String[] args) {
        LinkedList<Integer> list = fillListRandom(10);
        System.out.printf("Созданный список: %s\n",list);
        System.out.printf("Перевернутный список: %s\n", reverseList(list));
    }
    private static LinkedList fillListRandom(int size){
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            result.add(i,random.nextInt(20));
        }
        return result;
    }
    private static LinkedList reverseList (LinkedList<Integer> list){
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            result.add(i,list.get(list.size()-i-1));
        }
        return result;
    }

}
