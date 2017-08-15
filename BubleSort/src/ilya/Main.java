package ilya;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] newMas = {4, 3, 6, 8, 2, 9, 12, 3, 5};
        bubleSotrt(newMas);
        bubbleSortWhile(newMas);
        viborSort(newMas);
        vSort(newMas);
    }

    private static void bubleSotrt(int[] arr) {
        int[] array = Arrays.copyOf(arr, arr.length);
        long start = System.nanoTime();
        int leng = array.length;
        for (int i = leng - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        long stop = System.nanoTime();
        System.out.println(stop - start);
        System.out.println(Arrays.toString(array));
    }

    private static void viborSort(int[] arr) {
        int[] array = Arrays.copyOf(arr, arr.length);
        long start = System.nanoTime();
        int leng = array.length;
        for (int i = 0; i < leng; i++) {
            for (int j = i; j < leng - 1; j++) {
                if (array[i] > array[j + 1]) {
                    int temp = array[i];
                    array[i] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        long stop = System.nanoTime();
        System.out.println(stop - start);
        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSortWhile(int[] arr) {
        int[] array = Arrays.copyOf(arr, arr.length);
        long start = System.nanoTime();
        int count;
        int leng = array.length;
        do {
            count = 0;
            for (int i = 0; i < leng - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                }
            }
        } while (count > 0);
        long stop = System.nanoTime();
        System.out.println(stop - start);
        System.out.println(Arrays.toString(array));
    }

    private static void vSort(int[] arr) {
        long start = System.nanoTime();
        int[] array = Arrays.copyOf(arr, arr.length);
        int element;
        int indexToInsert;
        for (int index = 1; index < array.length; index++) {
            element = array[index];
            indexToInsert = index;
            while (indexToInsert > 0 && array[indexToInsert - 1] > element) {
                array[indexToInsert] = array[indexToInsert - 1];
                indexToInsert--;
                array[indexToInsert] = element;
            }

        }
        long stop = System.nanoTime();
        System.out.println(stop - start);
        System.out.println(Arrays.toString(array));
    }
}
