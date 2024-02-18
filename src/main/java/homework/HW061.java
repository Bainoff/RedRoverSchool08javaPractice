package homework;

public class HW061 {
    public static void main(String[] args) {
        //TODO Дана строка:
        // String s = “Перестановочный алгоритм быстрого действия”;
        // необходимо вывести все буквы “о” из этой строки.
        // Для указанной строки ответ будет “ооооо” (или в столбик)
        System.out.println("\nTask 1--------------------------------\n");
        String s = "Перестановочный алгоритм быстрого действия";
        System.out.println("result is " + s.replaceAll("[^о]", ""));

        //TODO Дана строка:
        // String s = “Перевыборы выбранного президента”;
        // необходимо подсчитать количество букв “е” в строке.
        // Для указанной строки ответ будет 4.
        System.out.println("\nTask 2--------------------------------\n");
        String s2 = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == 'е'){
                count++;
            }
        }
        System.out.println("number of \"е\" letters in string is " + count);

        //TODO Дан массив:
        // String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
        // необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
        System.out.println("\nTask 3--------------------------------\n");
        count = 0;
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                    if (!array[i][j].contains("е")){
                        count++;
                    }
            }
        }
        System.out.println("number of strings not containing \"е\" is " + count);

        //TODO Дана строка:
        // String s = “Посмотрите как Рите нравится ритм”;
        // необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
        // Для указанной строки ответ будет 6, 15, 29.
        System.out.println("\nTask 4--------------------------------\n");
        String s3 = "Посмотрите как Рите нравится ритм";
        int index = 0;
        System.out.print("indexes of \"рит\" are ");
        while (s3.toLowerCase().indexOf("рит", index + 1) > 0){
            index = s3.toLowerCase().indexOf("рит", index + 1);
            System.out.print(index + " ");
        }
    }
}
