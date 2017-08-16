package ilya;

import java.util.Arrays;

public class Main {

    private static int[] array1 = {2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3};
    private static int[] array2 = {2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3};
    private static int[] array3 = {2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3};
    private static int[] array4 = {2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3};
    private static int[] array5 = {2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3};

    public static void main(String[] args) {
        int[] newMas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 5};

        long start1 = System.nanoTime();
        bubbleSort();
        long stop1 = System.nanoTime();
        System.out.println("bubbleSort " + (stop1 - start1));
        System.out.println(Arrays.toString(array1));

        long start2 = System.nanoTime();
        bubbleSort1();
        long stop2 = System.nanoTime();
        System.out.println("bubbleSort1 " + (stop2 - start2));
        System.out.println(Arrays.toString(array2));

        long start3 = System.nanoTime();
        sampleSort();
        long stop3 = System.nanoTime();
        System.out.println("sampleSort " + (stop3 - start3));
        System.out.println(Arrays.toString(array3));

        long start4 = System.nanoTime();
        insertSort();
        long stop4 = System.nanoTime();
        System.out.println("insertSort " + (stop4 - start4));
        System.out.println(Arrays.toString(array4));


        long startTime = System.nanoTime();
        fastSort(0, array5.length - 1);
        long stopTime = System.nanoTime();
        System.out.println("fastSort " + (stopTime - startTime));
        System.out.println(Arrays.toString(array5));
    }

    private static void bubbleSort() {

        int leng = array1.length;
        for (int i = leng - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array1[j] > array1[j + 1]) {
                    int temp = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = temp;
                }
            }
        }
    }

    private static void bubbleSort1() {
        int leng = array2.length;
        int check;
        do {
            check = 0;
            for (int index = 0; index < leng - 1; index++) {
                if (array2[index] > array2[index + 1]) {
                    int temp = array2[index];
                    array2[index] = array2[index + 1];
                    array2[index + 1] = temp;
                    check++;
                }
            }
        } while (check > 0);
    }

    private static void sampleSort() {
        int leng = array3.length;
        for (int i = 0; i < leng - 1; i++) {
            int minIndex = i;
            for (int j = i; j < leng; j++) {
                if (array3[minIndex] > array3[j]) {
                    minIndex = j;
                }
            }
            int temp = array3[minIndex];
            array3[minIndex] = array3[i];
            array3[i] = temp;
        }
    }

    private static void insertSort() {
        int leng = array4.length;
        int element;
        int indexEle;
        for (int i = 1; i < leng; i++) {
            element = array4[i];
            indexEle = i;
            while (indexEle > 0 && array4[indexEle] < array4[indexEle - 1]) {
                array4[indexEle] = array4[indexEle - 1];
                indexEle--;
                array4[indexEle] = element;
            }
        }
    }

    //быстрая сортировка
    private static void fastSort(int start, int end) {
        if (start >= end) return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array5[i] <= array5[cur])) {
                i++;
            }
            while (j > cur && (array5[cur] <= array5[j])) {
                j--;
            }
            if (i < j) {
                int temp = array5[i];
                array5[i] = array5[j];
                array5[j] = temp;
                if (i == cur) {
                    cur = j;
                } else if (j == cur) {
                    cur = i;
                }
            }
        }
        fastSort(start, cur);
        fastSort(cur + 1, end);
    }
}
