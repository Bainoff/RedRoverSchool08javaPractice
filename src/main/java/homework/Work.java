package homework;

import java.util.Arrays;

public class Work {
    public class AbbreviateTwoWords {

        public static String abbrevName(String name) {
            String[] arr = name.toUpperCase().split(" ");
            name = arr[0].charAt(0) + "." + arr[1].charAt(0);
            return name;
        }
    }
        public static void main(String[] args) {
            System.out.println(AbbreviateTwoWords.abbrevName("stanlet sgsdgsg"));
        }
    }

