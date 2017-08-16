package ilya;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] newMas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 5};
        int[] newMas1 = {2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3};
        System.out.println(Arrays.toString(bubbleSort(newMas)));
        System.out.println(Arrays.toString(bubbleSort1(newMas)));
        System.out.println(Arrays.toString(sampleSort(newMas)));
        System.out.println(Arrays.toString(insertSort(newMas)));
    }

    private static int[] bubbleSort(int[] arr) {
        int[] array = Arrays.copyOf(arr, arr.length);
        long start = System.nanoTime();
        int leng = array.length;
        for (int i = leng - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        long stop = System.nanoTime();
        System.out.println("bubbleSort " + (stop - start));
        return array;
    }

    private static int[] bubbleSort1(int[] arr) {
        int[] array = Arrays.copyOf(arr, arr.length);
        long start = System.nanoTime();
        int leng = array.length;
        int check;
        do {
            check = 0;
            for (int index = 0; index < leng - 1; index++) {
                if (array[index] > array[index + 1]) {
                    int temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                    check++;
                }
            }
        } while (check > 0);
        long stop = System.nanoTime();
        System.out.println("bubbleSort " + (stop - start));
        return array;
    }

    private static int[] sampleSort(int[] arr) {
        int[] array = Arrays.copyOf(arr, arr.length);
        long start = System.nanoTime();
        int leng = array.length;
        for (int i = 0; i < leng - 1; i++) {
            int minIndex = i;
            for (int j = i; j < leng; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        long stop = System.nanoTime();
        System.out.println("sampleSort " + (stop - start));
        return array;
    }

    private static int[] insertSort(int[] arr) {
        int[] array = Arrays.copyOf(arr, arr.length);
        long start = System.nanoTime();
        int leng = array.length;
        int element;
        int indexEle;
        for (int i = 1; i < leng; i++) {
            element = array[i];
            indexEle = i;
            while (indexEle > 0 && array[indexEle] < array[indexEle - 1]) {
                array[indexEle] = array[indexEle - 1];
                indexEle--;
                array[indexEle] = element;
            }
        }
        long stop = System.nanoTime();
        System.out.println("insertSort " + (stop - start));
        return array;
    }
}
