package task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
public class task3_2 {
    static Random random = new Random();
    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numbersList.add(random.nextInt(20));
        }
        System.out.println("Созданный список содержит: " + numbersList);

        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) % 2 ==0){
                numbersList.remove(i);
                i--;
            }

        }
        System.out.println("После удаления чётных чисел: " + numbersList);
    }
}
