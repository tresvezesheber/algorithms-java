import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        Integer[] array = {30, 12, 66, 47, 64, 14, 29, 54, 33, 61, 6, 74, 75, 95, 60, 31, 82, 89, 25, 76, 4, 55, 51, 96, 49, 1, 36, 97, 63, 20, 3, 27, 40, 48, 50, 56, 72, 39, 35, 88, 21, 32, 19, 58, 38, 45, 43, 68, 73, 17, 79, 15, 99, 69, 37, 5, 13, 90, 81, 18, 87, 77, 52, 98, 84, 10, 11, 46, 24, 92, 86, 93, 57, 23, 9, 100, 94, 44, 53, 22, 41, 71, 59, 70, 62, 2, 85, 78, 91, 80, 67, 65, 42, 28, 83, 16, 8, 26, 7, 34};
        System.out.println(quicksort(Arrays.asList(array)));
    }

    public static List<Integer> quicksort(List<Integer> array) {
        if (array.size() < 2) {
            return array;
        } else {
            int pivot = array.get(0);
            List<Integer> less = new ArrayList<>();
            List<Integer> greater = new ArrayList<>();
            for (int i = 1; i < array.size(); i++) {
                if (array.get(i) <= pivot) {
                    less.add(array.get(i));
                } else {
                    greater.add(array.get(i));
                }
            }
            List<Integer> sorted = quicksort(less);
            sorted.add(pivot);
            sorted.addAll(quicksort(greater));
            return sorted;
        }
    }
}
