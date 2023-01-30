package task3;
//Задан целочисленный список ArrayList.
//Найти минимальное, максимальное и среднее арифметичское этого списка.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task3_3 {

    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();
        arrayFilling(numbersList,10,10);
        System.out.println("Созданный список содержит: " + numbersList);
        System.out.println("Максимальное число в списке: " + maxIndexInList(numbersList));
        System.out.println("Минимальное число в списке: " + minIndexInList(numbersList));
        System.out.println("Среднее арифметическое: " + arithmeticMean(numbersList));
    }

    /**
     * Наполнение массива рандомными числами
     * @param arr Массив.
     * @param sizeArray Размер массива.
     * @param sizeRandom Какое максимальное число рандома записывать.
     */
    private static void arrayFilling(List<Integer> arr,int sizeArray,int sizeRandom) {
        Random random = new Random();
        for (int i = 0; i < sizeArray; i++) {
            arr.add(random.nextInt(1,sizeRandom));
        }
    }
    //  нахождение максимального значения в списке
    static int maxIndexInList(List<Integer> arr) {
        int maxIndexNumber = arr.get(0);
        for (Integer integer : arr) {
            if (maxIndexNumber < integer) {
                maxIndexNumber = integer;
            }
        }
        return maxIndexNumber;
        }
//  нахождение минимального значения в списке
    static int minIndexInList (List<Integer> arr){
        int minIndexNumber = arr.get(0);
        for (Integer integer : arr) {
            if (minIndexNumber > integer) {
                minIndexNumber = integer;
            }
        }
        return minIndexNumber;
    }
//    Среднее арифметическое число списка
    static int arithmeticMean (List<Integer> arr){
        int sum = 0;
        for (int num:arr) {
            sum +=num;
        }
        return sum/arr.size();
    }
}
