package homework.HW07;

public class Person {
    //TODO Необходимо создать класс Person с полями: имя, возраст, пол.
    // Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr. ” если пол указан как мужской
    // и префикс “Mrs. ” если женский.

    public String name;
    public int age;
    public String gender;

    public String getName(){
        return switch (gender.toLowerCase()) {
            case "male" -> "Mr. " + name;
            case "female" -> "Mrs. " + name;
            default -> "enter valid gender";
        };
    }
}
