package ilya.algorithms;

public class SampleSort extends SortingAlgorithms {
    @Override
    public int[] sort(int[] array) {
        int leng = array.length;
        for (int i = 0; i < leng - 1; i++) {
            int minIndex = i;
            for (int j = i; j < leng; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
