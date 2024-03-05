package homework.HW09;

//TODO Задача №2
// Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
// Все поля сделать приватными и для каждого поля добавить методы set и get.
// Класс должен иметь метод - getSalary(Month[] monthArray),
// метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.


public class Employee {
    public Employee(String name, int age, char gender, int dailySalary) {
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

    public int getSalary(Month[] monthArray){
        int salary = 0;
        for (int i = 0; i < monthArray.length; i++) {
            salary += this.getDailySalary() * monthArray[i].getWorkDaysNumber();
        }
        return salary;
    }
}
