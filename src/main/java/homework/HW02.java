//TODO Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным
// на ваш выбор и вывести результаты следующих операций с этими переменными:
// сложение;
// умножение;
// вычитание;
// деление;
// остаток от деления.
// Так же сделать проверку на четность этих переменных и вывести результат.

package homework;

public class HW02 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        System.out.println("addition a + b = " + (a + b));
        System.out.println("multiplication a * b = " + (a * b));
        System.out.println("subtraction a - b = " + (a - b));
        System.out.println("division a / b = " + (a / b));

        if (a % 2 == 0) System.out.println("a is odd number");
        else System.out.println("a is even number");

        if (b % 2 == 0) System.out.println("a is odd number");
        else System.out.println("a is even number");
    }
}
