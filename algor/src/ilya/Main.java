package ilya;

import java.util.Arrays;

public class Main {

    static int[] array = {3, 4, 10, 1, 19};

    public static void main(String[] args) {
//        System.out.println(divide(17, 4));
//        bubbleSort(array);

        Arrays.sort(array);//используется алгоритм быстрой сортировки
//        Collections.sort(array);//использует алгоритм сортировки слиянием
        quicSort();
        System.out.println(Arrays.toString(array));
        doSort(0, array.length - 1);
        System.out.println(Arrays.toString(array));
        String s = "java";
        String s1 = new String(s);
        System.out.println(s == s1);
        System.out.println(s.equals(s1));

        String d = 2 + 2 + " = v";
        System.out.println(d);

    }

    public static int divide(int a, int b) {
        if (b == 0) return a;
        int c = a % b;
        return divide(b, c);
    }


    //сортировка пузырьком
    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void quicSort() {
        int start = 0;
        int end = array.length - 1;
    }

    //быстрая сортировка
    private static void doSort(int start, int end) {
        if (start >= end) return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur) {
                    cur = j;
                } else if (j == cur) {
                    cur = i;
                }
            }
        }
        doSort(start, cur);
        doSort(cur + 1, end);
    }
}
