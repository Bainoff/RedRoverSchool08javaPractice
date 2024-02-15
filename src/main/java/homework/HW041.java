package homework;

public class HW041 {
    public static void main(String[] args) {
        //TODO Необходимо вывести числа от 0 до 15.
        System.out.println("Task 1----------------------\n");
        for (int i = 0; i <= 15; i++) {
            System.out.print(i + " ");
        }

        //TODO Необходимо вывести все положительные степени числа 5 которые меньше 10000,
        // вывести результат возведения в степень.
        System.out.println("\nTask 2------------------------\n");
        int i = 5;
        while (i < 10_000) {
            System.out.print(i + " ");
            i = i * 5;
        }

        //TODO Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
        // Реализовать 2 варианта:
        // использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
        // без использования конструкции if (шаг цикла на ваше усмотрение).
        System.out.println("\nTask 3------------------------\n");
        for (int j = 40; j <= 60; j++) {
            if (j % 4 == 0){
                System.out.print(j + " ");
            }
        }

        System.out.println();

        for (int j = 40; j <= 60; j = j + 4) {
            System.out.print(j + " ");
        }
    }
}
