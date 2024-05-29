public class TestPrint {

    public static void main(String[] args) {
        int[] array = {5, 3, 1, 2, 4};
        imprimir(array, array.length - 1);
    }

    public static void imprimir(int[] array, int index) {
        if (index == 0) {
            System.out.println(array[index]);
        } else {
            imprimir(array, index - 1);
            System.out.println(array[index]);
        }
    }
}
