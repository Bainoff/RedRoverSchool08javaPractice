package homework.HW112;

//TODO Необходимо создать базовый абстрактный класс BaseEmployee как общего родителя

public abstract class BaseEmployee {

    public BaseEmployee(String name, int age, char gender, int dailySalary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dailySalary = dailySalary;
    }

    private String name;
    private int age;
    private char gender;
    private int dailySalary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(int dailySalary) {
        this.dailySalary = dailySalary;
    }
}
