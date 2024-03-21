package homework;

import java.util.*;


public class HW12 {
    public static void main(String[] args) {

//TODO Задача №1
// Создать лист и добавить в него следующие слова:
// White. Tan. Yellow. Orange. Red. Pink. Purple. Blue.
// Затем удалить из этого списка все цвета в которых встречается буква “L”

        List<String> colors = new ArrayList<>(List.of("White", "Tan", "Yellow", "Yellow", "Orange", "Red", "Pink", "Purple", "Blue"));
        colors.removeIf(color -> color.toLowerCase().contains("l"));
        System.out.println(colors);

//TODO Задача №2
// Создать лист со значениями от 100 до 1000.

        List<Integer> hundreds = new ArrayList<>();
        for (int i = 100; i <= 1000; i += 100) {
            hundreds.add(i);
        }
        System.out.println(hundreds);

//TODO Задача №3
// Удалить из листа, созданного в предыдущей задаче, все элементы раыные четным сотням.

        hundreds.removeIf(hundred -> hundred % 200 == 0);

        System.out.println(hundreds);

//TODO Задача со звездочкой
// Создать список из 30 или более случайных слов (например, можно воспользоваться https://randomwordgenerator.com/ ).
// Напечатать из этого списка самые длинные слова, начинающиеся на каждую букву.
// Т.е. если, к примеру, в списке есть слова, начинающиеся на a, b, d, f, то надо напечатать самое длинное слово на a,
// самое длинное на b, на d и нa f.

        List<String> list = new ArrayList<>(Arrays.asList(("Lorem Ipsum is simply dummy text of the printing " +
                "and typesetting industry Lorem Ipsum has been the industry's standard dummy text ever since " +
                "the 1500s when an unknown printer took a galley of type and scrambled it to make a type " +
                "specimen book").split(" ")));

        Map<Character, String> longWords = new HashMap<>();
        for (String word : list) {
            char letter = word.toLowerCase().charAt(0);
            if (!longWords.keySet().contains(letter) || longWords.get(letter).length() < word.length()) {
                longWords.put(letter, word);
            }
        }
        System.out.println(longWords.toString());
    }
}
