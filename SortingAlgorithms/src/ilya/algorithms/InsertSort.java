package ilya.algorithms;

public class InsertSort extends SortingAlgorithms {
    @Override
    public int[] sort(int[] array) {
        int leng = array.length;
        int element;
        int indexEle;
        for (int i = 1; i < leng; i++) {
            element = array[i];
            indexEle = i;
            while (indexEle > 0 && array[indexEle] < array[indexEle - 1]) {
                array[indexEle] = array[indexEle - 1];
                indexEle--;
                array[indexEle] = element;
            }
        }
        return array;
    }
}
