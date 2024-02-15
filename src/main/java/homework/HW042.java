package homework;

import java.util.Arrays;

public class HW042 {
    public static void main(String[] args) {
        //TODO Дан массив:        
        // int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        // необходимо вывести все нечетные числа из массива.
        System.out.println("\nTask 1--------------------------\n");
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i : array) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        //TODO Дан массив:
        // int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        // необходимо вывести все значения массива больше 5.
        System.out.println("\nTask 2--------------------------\n");
        for (int i : array) {
            if (i > 5){
                System.out.print(i + " ");
            }
        }

        //TODO Дан массив:
        // int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        // необходимо увеличить все значения массива на 15.
        System.out.println("\nTask 3------------------------\n");
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 15;
        }
        System.out.println(Arrays.toString(array));
    }
}
