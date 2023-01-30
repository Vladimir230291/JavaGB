package task3;

import java.util.Arrays;


public class task3_1 {
    public static void main(String args[]) {
    int[] sortArr = {12,45,48,4,55,96,22,13,20,69,71,15,64,79,10,5,31};
    int[] result = mergeSort(sortArr);
    System.out.println(Arrays.toString(result));

}
    public static int[] mergeSort(int[] sortArr) {
        int[] temp1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] temp2 = new int[sortArr.length];
        int[] result = mergeSortInner(temp1, temp2, 0, sortArr.length);
        return result;
    }

    /**
     *
     * @param buf1 - 1ый временный массив
     * @param buf2 - 2й временный массив
     * @param startIndex - начало среза
     * @param endIndex - конец среза
     * @return
     */

    public static int[] mergeSortInner(int[] buf1, int[] buf2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buf1;
        }

        //отсортированый массив
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buf1, buf2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buf1, buf2, middle, endIndex);

        //слияние массива
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buf1 ? buf2 : buf1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}