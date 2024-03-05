package homework.HW111;

//TODO Задача №3
// Необходимо создать утилитарный класс со следующими методами:
//  - поиск сотрудника в массиве по его имени
//  - поиск сотрудника в массиве по вхождению указанной строки в его имени
//  - подсчет зарплатного бюджета для всех сотрудников в массиве
//  - поиск наименьшей зарплаты в массиве
//  - поиск наибольшей зарплаты в массиве
//  - поиск наименьшего количества подчиненных в массиве менеджеров
//  - поиск наибольшего количества подчиненных в массиве менеджеров
//  - поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
//  - поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

public class Utils {
    public Employee getEmployeeByName(Employee[] employees, String name){
        Employee emp = null;
        for (int i = 0; i < employees.length; i++) {
            if(name.equals(employees[i].getName())){
                emp = employees[i];
            }
        }
        return emp;
    }

    public Employee getEmployeeByPartName(Employee[] employees, String partName){
        Employee emp = null;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getName().contains(partName)){
                emp = employees[i];
            }
        }
        return emp;
    }

    public int getTotalSalary(Employee[] employees){
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    public double getMinSalary(Employee[] employees){
        double min = Double.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
            }
        }
        return min;
    }

    public double getMaxSalary(Employee[] employees){
        double max = Double.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < max) {
                max = employees[i].getSalary();
            }
        }
        return max;
    }

    public String getMinSubordinatesNumberManager(Manager[] managers){
        Manager min = managers[0];
        for (int i = 0; i < managers.length; i++) {
            if (managers[i].getNumberOfSubordinates() < min.getNumberOfSubordinates()) {
                min = managers[i];
            }
        }
        return min.getName();
    }

    public String getMaxSubordinatesNumberManager(Manager[] managers){
        Manager max = managers[0];
        for (int i = 0; i < managers.length; i++) {
            if (managers[i].getNumberOfSubordinates() < max.getNumberOfSubordinates()) {
                max = managers[i];
            }
        }
        return max.getName();
    }

    public String getMaxBonusManager(Manager[] managers){
        double max = Double.MIN_VALUE;
        Manager maxMan = managers[0];
        for (int i = 0; i < managers.length; i++) {
            if ((managers[i].getSalary() - managers[i].getBaseSalary()) > max){
                maxMan = managers[i];
                max = managers[i].getSalary() - managers[i].getBaseSalary();
            }
        }
        return maxMan.getName();
    }

    public String getMinBonusManager(Manager[] managers){
        double min = Double.MAX_VALUE;
        Manager minMan = managers[0];
        for (int i = 0; i < managers.length; i++) {
            if ((managers[i].getSalary() - managers[i].getBaseSalary()) < min){
                minMan = managers[i];
                min = managers[i].getSalary() - managers[i].getBaseSalary();
            }
        }
        return minMan.getName();
}}