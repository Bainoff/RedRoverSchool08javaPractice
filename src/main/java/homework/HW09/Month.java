package homework.HW09;

//TODO Задача №1
// Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
// Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования
// (объекты класса Month).
public class Month {
    private String monthName;
    private int daysNumber;
    private int workDaysNumber;

    public Month(String monthName, int daysNumber, int workDaysNumber) {
        this.monthName = monthName;
        this.daysNumber = daysNumber;
        this.workDaysNumber = workDaysNumber;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getDaysNumber() {
        return daysNumber;
    }

    public int getWorkDaysNumber() {
        return workDaysNumber;
    }
}
