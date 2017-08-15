package ilya;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 6, 7, 4, 9, 8, 0};

        System.out.println(Arrays.toString(bubbleSortI(arr)));
        System.out.println(Arrays.toString(bubbleSortII(arr)));
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
}
