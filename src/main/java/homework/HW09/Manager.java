package homework.HW09;

//TODO Задача №3
// Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество подчиненных.
// Все поля сделать приватными и для каждого поля добавить методы set и get.
// Класс должен иметь метод - getSalary(Month[] monthArray),
// метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
// К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.


public class Manager extends Employee{
    private int numberOfSubordinates;

    public Manager(String name, int age, char gender, int dailySalary, int numberOfSubordinates) {
        super(name, age, gender, dailySalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary(Month[] monthArray){
        int salary = 0;
        for (int i = 0; i < monthArray.length; i++) {
            salary += this.getDailySalary() * monthArray[i].getWorkDaysNumber()
                    + monthArray[i].getWorkDaysNumber() * (double)((100 + getNumberOfSubordinates())/100);
        }
        return salary;
    }
}
