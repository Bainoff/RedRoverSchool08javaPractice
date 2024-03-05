package homework.HW10;

// TODO Необходимо создать класс Manager в который нужно добавить следующие методы:
//  getNumberOfSubordinates - получить количество подчиненных
//  setNumberOfSubordinates
//  в классе, метод getSalary будет возвращать значение по формуле
//  - <базовая ставка> * (<количество подчиненных> / 100 * 3).
//  Если количество подчиненных 0, то результат как у обычного рабочего.

public class Manager extends Worker{
    private int numberOfSubordinates;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary(){
        return getSalary() + getSalary() * getNumberOfSubordinates() / 100 * 3;
    }
}
