package homework.HW111;

//TODO  Необходимо создать класс Director с теми же методами, что и Manager,
//  но метод getSalary должен возвращать результат по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9).
//  Если количество подчиненных 0, то результат как у обычного рабочего.
// HW11 Классы Manager и Director должны быть финальными

public class Director extends Employee {
    private int numberOfSubordinates;

    final private double COEFF = 0.09;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        return getSalary() + getSalary() * (getNumberOfSubordinates() / COEFF);
    }
}
