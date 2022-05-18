package Level3.Lesson4;
/*
Создать интерфейсы «летать», «передвигаться» и «есть пищу».
Создайте классы и добавьте интерфейсы к ним, классы: собака, утка, автомобиль и самолёт.
Руководствуйтесь фантазией и здравым смыслом.
 */

public class Task2 {
}

interface Fly {
    void fly();
}

interface Move {
    void move();
}

interface Eat {
    void eat();
}

class Dog implements Move, Eat {

    @Override
    public void move() {}

    @Override
    public void eat() {}
}

class Duck implements Fly, Move, Eat {

    @Override
    public void fly() {}

    @Override
    public void move() {}

    @Override
    public void eat() {}
}

class Car implements Move {

    @Override
    public void move() {}
}

class AirPlane implements Move, Fly {

    @Override
    public void fly() {}

    @Override
    public void move() {}
}