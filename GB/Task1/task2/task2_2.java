package task2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.*;

public class task2_2 {
    public static void main(String[] args) throws IOException {
        int[] array = createIntArray(15, 20);
        sortedArrayBuble(array);
        printArray(array);
    }
    /**
     * @param size размер массива
     * @param max  макс целое число
     */
    //Создание случайного целочисленного массива
    static int[] createIntArray(int size, int max) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max);
        }
        return array;
    }
    //вывод массива
    static Object printArray(int[] arg) {
        for (int item : arg) {
            System.out.printf("%d ", item);
        }
        return null;
    }
    //Пузырьковая сортировка массива с логированием
    static int[] sortedArrayBuble(int[] arr) {
        try {
            Logger logger = Logger.getLogger(task2_2.class.getName());
            FileWriter fr = new FileWriter("task2\\log.txt", false);
            FileHandler fileInfo = new FileHandler("task2\\log.txt");
            logger.addHandler(fileInfo);
            SimpleFormatter sFormatrer = new SimpleFormatter();
            fileInfo.setFormatter(sFormatrer);

            boolean isSorted = false;
            int temp, count = 0;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] > arr[i + 1]) {
                        count++;
                        isSorted = false;
                        temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        logger.log(Level.INFO, "Выполнен цикл сортировки");
                        fr.write(Arrays.toString(arr));
                        fr.write("\n");
                    }
                }
            }
            fr.close();
        }
        catch (IOException ex) {
            System.out.println("Не удалось создать или считать файл");
        }
        return arr;
    }

}


