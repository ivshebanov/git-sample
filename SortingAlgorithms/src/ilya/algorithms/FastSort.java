package ilya.algorithms;

import java.util.Arrays;

public class FastSort extends SortingAlgorithms {

    private static int[] array;

    @Override
    public int[] sort(int[] array) {
        FastSort.array = Arrays.copyOf(array, array.length);
        fastSort(0, FastSort.array.length - 1);
        return FastSort.array;
    }

    private static void fastSort(int start, int end) {
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
        fastSort(start, cur);
        fastSort(cur + 1, end);
    }
}
