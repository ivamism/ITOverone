package Level3.Lesson3;
/*
Создать класс автомобиль, в нём открытый метод “запуск” и закрытые методы: “взять ток с аккумулятора”,
 “передать ток на стартер”, “соединить шерстень и маховик”, “запустить двигатель”.
  В открытом методе должны быть вызваны закрытые методы,
  в закрытых методах должен быть вывод на экран информации о том, что делает этот метод.
  Создать класс “использование автомобиля”, в методе main создать объект автомобиля,
попытаться вызвать закрытые методы, после этого вызвать открытый метод.
 */

public class Car {
    public void start () {
        takePower();
        supplyPowerToStarter();
        joinGearFlywhil();
        startEngin();
    }

    private void startEngin() {
        System.out.println("запустить двигатель");
    }

    private void joinGearFlywhil() {
        System.out.println("передать ток на стартер");
    }

    private void supplyPowerToStarter() {
        System.out.println("передать ток на стартер");
    }

    private void takePower() {
        System.out.println("взять ток с аккумулятора");
    }

    public static void main(String[] args) {

    }
}
