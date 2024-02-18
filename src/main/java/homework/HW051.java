package homework;

public class HW051 {
    //TODO Дан массив:
    // int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    // необходимо вывести сумму всех значений массива.
    public static void main(String[] args) {
        System.out.println("\nTask 1-------------------------\n");
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int el : array) {
            sum += el;
        }
        System.out.println("Sum of elements is " + sum);

        //TODO Дан массив:
        // int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        // необходимо вывести максимальное значение массива.
        System.out.println("\nTask 2------------------------\n");
        int max = Integer.MIN_VALUE;
        for (int el : array) {
            if (el > max){
                max = el;
            }
        }
        System.out.println("Max array value is " + max);

        //TODO Дан массив:
        // int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        // необходимо вывести минимальное значение массива.
        System.out.println("\nTask 3-----------------------\n");
        int min = Integer.MAX_VALUE;
        for (int el : array) {
            if (el < min){
                min = el;
            }
        }
        System.out.println("Min array value is " + min);

        //TODO Дан массив:
        // int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // необходимо вывести среднее арифметическое всех значений массива.
        System.out.println("\nTask 4-----------------------\n");
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int avg = 0;
        sum = 0;
        for (int el : array2) {
            sum += el;
        }
        avg = sum / array2.length;
        System.out.println("Average array value is " + avg);

        //TODO Дан массив:
        // int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        // необходимо вывести сумму элементов массива.
        System.out.println("\nTask 5-----------------------\n");
        int[][] array3 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        sum = 0;
        for (int[] value : array3) {
            for (int i : value) {
                sum += i;
            }
        }
        System.out.println("Sum of elements is " + sum);

        //TODO Дан массив:
        // int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        // необходимо вывести максимальное значение массива.
        System.out.println("\nTask 6-----------------------\n");
        max = Integer.MIN_VALUE;
        sum = 0;
        for (int[] ints : array3) {
            for (int anInt : ints) {
                if (max < anInt) {
                    max = anInt;
                }
            }
        }
        System.out.println("Max 2D array element is " + max);

        //TODO Дан массив:
        // int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        // необходимо вывести количество элементов в массиве.
        System.out.println("\nTask 7-----------------------\n");
        int count = 0;
        for (int[] ints : array3) {
            for (int anInt : ints) {
                count++;
            }
        }
        System.out.println("Number of array's elements is " + count);
    }
}
