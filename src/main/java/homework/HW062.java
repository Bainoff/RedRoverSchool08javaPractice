package homework;

public class HW062 {
    //TODO Необходимо написать 4 метода:
    // сложение 2х чисел
    // вычитание 2х чисел
    // умножение 2х чисел
    // деление 2х чисел
    public static int sumFunc(int x, int y) {
        return x + y;
    }

    public static int subtractionFunc(int x, int y) {
        return x - y;
    }

    public static int multiplicationFunc(int x, int y) {
        return x * y;
    }


    public static int divisionFunc(int x, int y) {
        return x / y;
    }

    public static void main(String[] args) {
    }

    //TODO https://www.codewars.com/kata/53ee5429ba190077850011d4/train/java
    class Java {
        public static int doubleInteger(int i) {
            return i *= 2;
        }
    }

    //TODO https://www.codewars.com/kata/555086d53eac039a2a000083/train/java
    public class OppositesAttract {
        public static boolean isLove(final int flower1, final int flower2) {
            if (flower1 % 2 != flower2 % 2) return true;
            else return false;
        }
    }

    //TODO https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/java
    class Kata {
        public static String numberToString(int num) {
            return Integer.toString(num);
        }
    }

    //TODO https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
    public class SmallestIntegerFinder {
        public static int findSmallestInt(int[] args) {
            int min = Integer.MAX_VALUE;
            for (int el : args) {
                if (el < min) {
                    min = el;
                }
            }
            return min;
        }
    }

    //TODO https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java
    class Kata2 {
        public static String countingSheep(int num) {
            String murmur = "";
            for (int i = 1; i <= num; i++) {
                murmur += i + " sheep...";
            }
            return murmur;
        }
    }
}
