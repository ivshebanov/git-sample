package ilya.algorithms;

import java.util.Arrays;

public abstract class SortingAlgorithms {

    public void timeMeasurement(int[] array) {
        long start = System.nanoTime();
        int[] arr = this.sort(array);
        long stop = System.nanoTime();
        System.out.println(Arrays.toString(array));
        System.out.println(this.getClass().getName() + " - " + (stop - start));
    }

    abstract int[] sort(int[] array);
}
