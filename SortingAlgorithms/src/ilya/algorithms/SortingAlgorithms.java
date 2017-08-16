package ilya.algorithms;

import java.util.Arrays;

public abstract class SortingAlgorithms {

    public void timeMeasurement() {
        int[] newMas = {1, 2, 3, 4, 5, 6, 7, 2, 5};
        int[] array = {2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3};
        long start = System.nanoTime();
        int[] arr = this.sort(array);
        long stop = System.nanoTime();
        System.out.println(Arrays.toString(arr));
        System.out.println(this.getClass().getName() + " - " + (stop - start));
    }

    abstract int[] sort(int[] array);
}
