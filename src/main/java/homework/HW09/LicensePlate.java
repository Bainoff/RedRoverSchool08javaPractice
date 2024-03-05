package homework.HW09;

//TODO Задача №4 (*)
// Для учета автомобилей на дороге важно, чтобы номера не повторялись.
// Необходимо создать класс LicensePlate, в котором есть неизменяемое строковое поле plate.
// Запретить создавать экземпляры этого класса кому попало (т.е. классам за пределами того пакета/package,
// в котором находится класс LicensePlate).

class LicensePlate {
    private final String PLATE;

    LicensePlate(String prefix) {
        PLATE = LicensePlateMaker.makeNextPlate(prefix);
    }

    public String getPlate(){
        return this.PLATE;
    }
}
