package ilya;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] newMas = {4, 3, 6, 8, 2, 9, 12, 3, 5};
//        bubleSotrt(newMas);
        bubbleSortWhile(newMas);

    }

    private static void bubleSotrt(int[] arr) {
        int leng = arr.length - 1;
        for (int i = leng; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSortWhile(int[] arr) {
        int count;
        int leng = arr.length;
        do {
            count = 0;
            for (int i = 0; i < leng - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    count++;
                }
            }
        } while (count > 0);
        System.out.println(Arrays.toString(arr));
    }
}
