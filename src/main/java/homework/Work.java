package homework;

import homework.HW07.Employee;
import homework.HW07.Person;
import homework.HW07.Salary;
import homework.HW08.Block;
import homework.HW08.Fighter;
import homework.HW08.Kata;

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

        Block bl = new Block(new int[]{2, 4, 6});
        System.out.println(bl.getWidth());
        System.out.println(bl.getLength());
        System.out.println(bl.getHeight());
        System.out.println(bl.getVolume());
        System.out.println(bl.getSurfaceArea());
        System.out.println(Kata.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Lew"));


        class Kata {
            public static String stringMerge(String s1, String s2, char letter) {
                String s3 = "";
                String s4 = "";
                for (int i = 0; i < s1.length(); i++) {
                    if (s1.charAt(i) == letter) {
                        s3 = s1.substring(0, i + 1);
                        break;
                    }
                }
                for (int i = 0; i < s2.length(); i++) {
                    if (s2.charAt(i) == letter) {
                        s4 = s2.substring(i + 1);
                        break;
                    }
                }
                System.out.println();
                return s3 + s4;
            }
        }
    }

}

