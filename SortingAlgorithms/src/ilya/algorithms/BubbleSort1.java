package ilya.algorithms;

public class BubbleSort1 extends SortingAlgorithms {
    @Override
    public int[] sort(int[] array) {
        int leng = array.length;
        int check;
        do {
            check = 0;
            for (int index = 0; index < leng - 1; index++) {
                if (array[index] > array[index + 1]) {
                    int temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                    check++;
                }
            }
        } while (check > 0);
        return array;
    }
}
