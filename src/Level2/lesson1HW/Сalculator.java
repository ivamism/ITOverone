package Level2.lesson1HW;
/*
Создать класс Калькулятор, в нём 4 метода для арифметических операций:
сложение, вычитание, умножение и деление. Каждый метод должен принимать
2 параметра типа double и возвращать значение типа double.
 */

public class Сalculator {
    public static void main(String[] args) {
        double arg1 = 8.0;
        double arg2 = 2.0;
        System.out.println("Аргумент 1 = " + arg1 +", "+ "Аргумент 2 = "+ arg2);
        System.out.println("Сумма аргументов - " + sum(arg1,arg2));
        System.out.println("Разность аргументов - " + subtract(arg1,arg2));
        System.out.println("Произведение аргументов - " + multiply(arg1,arg2));
        System.out.println("Деление аргументов - " + divide(arg1,arg2));

    }
    static double sum (double arg1, double arg2) {
              return arg1 + arg2;
    }
static double subtract (double arg1, double arg2) {
        return arg1 - arg2;
    }
static double multiply (double arg1, double arg2) {
        return arg1 * arg2;
    }
static double divide (double arg1, double arg2) {
        return arg1 / arg2;
    }

}
