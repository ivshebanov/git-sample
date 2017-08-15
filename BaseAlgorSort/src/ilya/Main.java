package ilya;

import java.util.Arrays;

public class Main {0

    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 6, 7, 4, 9, 8, 0};
        int[] array = {0, 1, 2, 3, 4, 5, 7, 6, 9, 8};

        System.out.println(Arrays.toString(bubbleSortI(arr)));
        System.out.println(Arrays.toString(bubbleSortI(array)));

        System.out.println(Arrays.toString(bubbleSortII(arr)));
        System.out.println(Arrays.toString(bubbleSortII(array)));

        System.out.println(Arrays.toString(sampleSort(arr)));
        System.out.println(Arrays.toString(sampleSort(array)));

        System.out.println(Arrays.toString(insertSort(arr)));
        System.out.println(Arrays.toString(insertSort(array)));
    }


    private static int[] bubbleSortI(int[] arr) {
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
        System.out.println("bubbleSortI " + (stop - start));
        return array;
    }

    private static int[] bubbleSortII(int[] arr) {
        int[] array = Arrays.copyOf(arr, arr.length);
        long start = System.nanoTime();
        int leng = array.length;
        int check;
        do {
            check = 0;
            for (int i = 0; i < leng - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    check++;
                }
            }
        } while (check > 0);
        long stop = System.nanoTime();
        System.out.println("bubbleSortII " + (stop - start));
        return array;
    }

    private static int[] sampleSort(int[] arr) {
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
        System.out.println("sampleSort " + (stop - start));
        return array;
    }

    private static int[] insertSort(int[] arr) {
        int[] array = Arrays.copyOf(arr, arr.length);
        long start = System.nanoTime();
        int leng = array.length;
        int element;
        int indexElement;
        for (int insert = 1; insert < leng; insert++) {
            element = array[insert];
            indexElement = insert;
            while (indexElement > 0 && array[indexElement] < array[indexElement - 1]) {
                array[indexElement] = array[indexElement - 1];
                indexElement--;
                array[indexElement] = element;
            }
        }
        long stop = System.nanoTime();
        System.out.println("insertSort " + (stop - start));
        return array;
    }
}
