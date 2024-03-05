package homework.HW112;

//TODO Задача №1
// Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
// Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования
// (объекты класса Month).
// HW11 Статические поля с объектами месяцев должны быть финальными
// Создать статические методы возвращающие кварталы (массивы по 3 месяца соответственно), полугодия и год.

public class MonthUtils {

    public final static Month JANUARY = new Month("january", 31, 20);
    public final static Month FEBRUARY = new Month("february", 29, 20);
    public final static Month MARCH = new Month("march", 31, 21);
    public final static Month APRIL = new Month("april", 30, 20);
    public final static Month MAY = new Month("may", 31, 21);
    public final static Month JUNE = new Month("june", 30, 21);
    public final static Month JULY = new Month("july", 31, 20);
    public final static Month AUGUST = new Month("august", 31, 22);
    public final static Month SEPTEMBER = new Month("september", 30, 20);
    public final static Month OCTOBER = new Month("october", 31, 21);
    public final static Month NOVEMBER =  new Month("november", 30, 20);
    public final static Month DECEMBER = new Month("december", 31, 19);

    public static Month[] getQuarter(int numQuarter){
        Month[] quarter = null;
        switch (numQuarter){
            case 1: quarter = new Month[]{JANUARY, FEBRUARY, MARCH};
            case 2: quarter = new Month[]{APRIL, MAY, JUNE};
            case 3: quarter = new Month[]{JULY, AUGUST, SEPTEMBER};
            case 4: quarter = new Month[]{OCTOBER, NOVEMBER, DECEMBER};
            default: quarter = new Month[]{};
        }
        return quarter;
    }

    public static Month[] getHalfYear(int numHalfYear){
        Month[] halfYear = null;
        switch (numHalfYear){
            case 1: halfYear = new Month[]{JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE};
            case 2: halfYear = new Month[]{APRIL, MAY, JUNE, OCTOBER, NOVEMBER, DECEMBER};
            default: halfYear = new Month[]{};
        }
        return halfYear;
    }

    public static Month[] getYear(){
        return new Month[] {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};
    }
}
