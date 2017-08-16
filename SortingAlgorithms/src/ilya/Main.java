package ilya;

import ilya.algorithms.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<SortingAlgorithms> list = new ArrayList<SortingAlgorithms>();
        list.add(new BubbleSort());
        list.add(new BubbleSort1());
        list.add(new SampleSort());
        list.add(new InsertSort());
        list.add(new FastSort());

        list.forEach(SortingAlgorithms::timeMeasurement);
    }
}
