package GB.Task1.seminarSet.semTask1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task {
    public static void main(String[] args) {
        int[] arr = createRandomArray(1000, 0, 25);

        System.out.println(uniquePercent(arr));
    }

    /**
     * Создание массива случайных чисел
     *
     * @param size   размер массива
     * @param origin нижняя граница значений
     * @param bound  верхняя граница значений
     * @return массив случайных чисел
     */
    static int[] createRandomArray(int size, int origin, int bound) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(origin, bound);
        }
        return arr;
    }

    /**
     * Процент уникальных значений в массиве
     * @param arr массив
     * @return процент уникальных значений
     */
    static float uniquePercent(int[] arr) {
        Set<Integer> nums = new HashSet<>();
        for (int num : arr) {
            nums.add(num);
        }
        return nums.size() * 100f / arr.length;
    }
}
