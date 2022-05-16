package Level3.Lesson3;
/*
Создать класс Человек, Танцор, Певец, Доктор.
У класса Человек есть метод зарабатывать деньги,
в нём выводить “работаю на обычной работе”.
Классы Танцор, Певец и Доктор наследуют класс Человек и переопределяют метод зарабатывать деньги,
 переопределяет метод по своему, написать свою реализацию,
 например для доктора вывод на экран “Лечу людей, помогаю быть здоровыми”.
  методе main создать массив с типом Человек, туда записать несколько объектов разных типов Человека.
Пройтись по массиву через цикл вызвать у каждого объекта метод зарабатывания денег.
 */

public class Human {
   void earnMoney () {
       System.out.println("Pаботаю на обычной работе");
    }
    public static void main(String[] args) {
       Human [] humans = new Human[4];
       humans [0] = new Human ();
       humans [1] = new Dancer ();
       humans [2] = new Singer ();
       humans [3] = new Doctor ();
        for (Human human : humans) {
            human.earnMoney();
        }
    }
}
class Dancer extends Human {
    @Override
    void earnMoney() {
        System.out.println("Tанцую в шоу");
    }
}
class Singer extends Human {
    @Override
    void earnMoney() {
        System.out.println("Пою в ресторане");
    }
}
class Doctor extends Human {
    @Override
    void earnMoney() {
        System.out.println("Лечу людей, помогаю быть здоровыми");
    }
}
