public class RecursiveSum {
    public static void main(String[] args) {
        int[] array = {5, 3, 1, 2, 4};
        System.out.println("The sum (sum1) of elements of array is: " + sum1(array, array.length - 1));
        System.out.println("The sum (sum2) of elements of array is: " + sum2(array, 0));
    }

    public static int sum1(int[] array, int index) {
        if (index == 0) {
            return array[index];
        } else {
            return array[index] + sum1(array, index - 1);
        }
    }

    public static int sum2(int[] array, int index) {
        if (index == array.length) {
            return 0;
        } else {
            return array[index] + sum2(array, index + 1);
        }
    }
}