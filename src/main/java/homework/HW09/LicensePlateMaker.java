package homework.HW09;

//TODO Для выдачи номеров создать класс LicensePlateMaker, который хранит в себе неизменяемый префикс
// (например, CA для Калифорнии или NY для Нью-Йорка)  и имеет метод makeNextPlate(),
// который создает новые номера формата “CA-1”, “CA-2”, “CA-123” по порядку. Или “NY-300”, “NY-301” и т. д.
// Номера, конечно же, повторяться не должны, хотя бы на период существования данного экземпляра класса LicensePlateMaker.
// (обращаю внимание, эта задача — со звездочкой)

public class LicensePlateMaker {
    final public String PREFIX;

    public LicensePlateMaker(String prefix) {
        PREFIX = prefix;
    }

    static int nextNumber = 0;
    public static String makeNextPlate(String PREFIX){
        nextNumber++;
        return PREFIX + "-" + nextNumber;

    }
}
