import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 3, 1, 2, 5, 4, 6};
        countingSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void countingSort(int[] array) {
        int maxValue = array[0];
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        int[] countArray = new int[maxValue - minValue + 1];

        for (int i = 0; i < array.length; i++) {
            countArray[array[i] - minValue]++;
        }

        int j = 0;
        for (int i = minValue; i <= maxValue; i++) {
            while (countArray[i - minValue] > 0) {
                array[j] = i;
                j++;
                countArray[i - minValue]--;
            }
        }
    }

}