package ilya;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] newMas = {4, 3, 6, 8, 2, 9, 12, 3, 5};
        bubleSotrt(newMas);
    }

    private static void bubleSotrt(int[] arr) {
        int leng = arr.length;
        for (int i = leng - 1; i >= 0; i--) {
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
}
