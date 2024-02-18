package homework;

import homework.HW07.Employee;
import homework.HW07.Person;
import homework.HW07.Salary;

import java.util.Arrays;

public class Work {
    public static void main(String[] args) {
        Person alex = new Person();
        alex.name = "Alex";
        alex.age = 65;
        alex.gender = "Male";

        Person jane = new Person();
        jane.name = "Jane";
        jane.age = 33;
        jane.gender = "female";

        Person alien = new Person();
        alien.name = "Woozy";
        alien.age = 666;
        alien.gender = "not identified";

        Employee john = new Employee();
        john.name = "John";
        john.age = 42;
        john.gender = "male";
        john.salary = 3000;

        Employee bill = new Employee();
        bill.name = "Bill";
        bill.age = 24;
        bill.gender = "male";
        bill.salary = 300;

        Employee billy = new Employee();
        billy.name = "Billy";
        billy.age = 24;
        billy.gender = "male";
        billy.salary = 500;
        System.out.println(billy.isSameName(bill));

        Employee[] empArr = {john, bill, billy};
        System.out.println(Salary.getSum(empArr));
    }
    }

