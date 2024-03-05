package homework.HW10;

//TODO  Необходимо создать класс Director с теми же методами, что и Manager,
//  но метод getSalary должен возвращать результат по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9).
//  Если количество подчиненных 0, то результат как у обычного рабочего.

public class Director extends Manager{
    @Override
    public double getSalary() {
        return getSalary() + getSalary() * (getNumberOfSubordinates() / 100 * 9);
    }
}
