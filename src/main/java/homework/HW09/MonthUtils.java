package homework.HW09;

//TODO Задача №1
// Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
// Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования
// (объекты класса Month).

import org.w3c.dom.ls.LSOutput;

public class MonthUtils {

    public static Month JANUARY = new Month("january", 31, 20);
    public static Month FEBRUARY = new Month("february", 29, 20);
    public static Month MARCH = new Month("march", 31, 21);
    public static Month APRIL = new Month("april", 30, 20);
    public static Month MAY = new Month("may", 31, 21);
    public static Month JUNE = new Month("june", 30, 21);
    public static Month JULY = new Month("july", 31, 20);
    public static Month AUGUST = new Month("august", 31, 22);
    public static Month SEPTEMBER = new Month("september", 30, 20);
    public static Month OCTOBER = new Month("october", 31, 21);
    public static Month NOVEMBER =  new Month("november", 30, 20);
    public static Month DECEMBER = new Month("december", 31, 19);
    static Month[] monthArray = {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};
    static Month[] workingMonth = {SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER, JANUARY, FEBRUARY, MARCH, APRIL, MAY};

    public static void main(String[] args) {
        Manager man = new Manager("vasaMan", 55, 'm', 100, 10);
        Employee emp = new Employee("vasaEmp", 33, 'm', 100);

        System.out.println(man.getSalary(workingMonth));
        System.out.println(emp.getSalary(workingMonth));
        LicensePlate prezca = new LicensePlate("CA");
        LicensePlate prezca2 = new LicensePlate("CA");
        LicensePlate prezca3 = new LicensePlate("CA");
        LicensePlate prezny = new LicensePlate("NY");
        System.out.println(prezca.getPlate());
        System.out.println(prezca2.getPlate());
        System.out.println(prezca3.getPlate());
        System.out.println(prezny.getPlate());
    }
}
