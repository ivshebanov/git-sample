package ilya.algorithms;

public class BubbleSort extends SortingAlgorithms {
    @Override
    public int[] sort(int[] array) {
        int leng = array.length;
        for (int i = leng - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
