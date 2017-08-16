package ilya;

import ilya.algorithms.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<SortingAlgorithms> list = new ArrayList<>();
        list.add(new BubbleSort());
        list.add(new BubbleSort1());
        list.add(new SampleSort());
        list.add(new InsertSort());
        list.add(new FastSort());

        for (SortingAlgorithms e: list){
            int[] array = {2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3};
            int[] newMas = {1, 2, 3, 4, 5, 6, 7, 2, 5};
            e.timeMeasurement(array);
        }
//        list.forEach(SortingAlgorithms::timeMeasurement(array));
    }
}
