package GB.Task1.task5;
/*
Реализовать алгоритм пирамидальной сортировки (HeapSort).
 */
public class task5_3 {
    public static void main(String[] args){
        int[] arr = { 12, 11, 13, 5, 6, 7 };

        task5_3 task = new task5_3();
        task.sort(arr);

        System.out.println("Массив отсортирован");
        printArray(arr);
    }

    public void sort(int[] arr){
        int N = arr.length;
        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(arr, N, i);

        for (int i = N - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    void heapify(int[] arr, int N, int i){

        int max = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < N && arr[l] > arr[max])
            max = l;

        if (r < N && arr[r] > arr[max])
            max = r;

        if (max != i) {
            int swap = arr[i];
            arr[i] = arr[max];
            arr[max] = swap;
            heapify(arr, N, max);
        }
    }

    static void printArray(int[] arr){
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
}
