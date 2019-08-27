import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Jacob
 * @date 2018/6/28
 */
public class Sorting {

    public static void main(String[] args) {
        int[] array = new int[] {45, 73, 9, 12, 63, 99, 45, 95, 23, 11, 46};

        //bubbleSorting(array);
        //selectSorting(array);
        insertSorting(array);

        System.out.print("[ ");
        for (int i: array) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    public static void bubbleSorting(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void selectSorting(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    public static void insertSorting(int[] array) {

        for (int i = 1; i < array.length; i++) {

            for (int j = i; j > 0; j--) {

                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

    }


}
