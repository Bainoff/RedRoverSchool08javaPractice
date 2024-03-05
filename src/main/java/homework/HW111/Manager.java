package homework.HW111;

// TODO Необходимо создать класс Manager в который нужно добавить следующие методы:
//  getNumberOfSubordinates - получить количество подчиненных
//  setNumberOfSubordinates
//  в классе, метод getSalary будет возвращать значение по формуле
//  - <базовая ставка> * (<количество подчиненных> / 100 * 3).
//  Если количество подчиненных 0, то результат как у обычного рабочего.
//  HW11 Классы Manager и Director должны быть финальными

final public class Manager extends Worker {
    private int numberOfSubordinates;

    final private double COEFF = 0.03;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary(){
        return getSalary() + getSalary() * getNumberOfSubordinates() * COEFF;
    }
}
