package homework.HW112;

//TODO Задача №2
// Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
// Все поля сделать приватными и для каждого поля добавить методы set и get.
// Класс должен иметь метод - getSalary(Month[] monthArray),
// метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
// HW11 Классы Employee и Manager должны быть финальными


public final class Employee extends BaseEmployee {
    public Employee(String name, int age, char gender, int dailySalary) {
        super(name, age, gender, dailySalary);
    }

    private String name;
    private int age;
    private char gender;
    private int dailySalary;

    public int getSalary(Month[] monthArray){
        int salary = 0;
        for (int i = 0; i < monthArray.length; i++) {
            salary += this.getDailySalary() * monthArray[i].getWorkDaysNumber();
        }
        return salary;
    }
}
