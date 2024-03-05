package homework.HW111;

//TODO Задача №1
// Необходимо создать класс Employee со следующими методами:
// getBaseSalary - получить базовую ставку
// setBaseSalary
// getName - получить имя
// setName
// getSalary - получить зарплату
// HW11 Employee.getSalary должен быть абстрактный

public abstract class Employee {

    int baseSalary;
    String name;

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return getBaseSalary();
    }
}
