package Level1.Lesson3_HW;
/*
Месяцы
- создать программу, с переменной “месяц” и значением от 1 до 12. Использовать
конструкцию “if else if”. Сделать проверку числа и вывести соответствующий
месяц, для 1 - январь, для 2 - февраль и так далее.
Месяцы, версия 2
- переделать предыдущую программу, используя конструкцию “switch”.
 */

public class Months {
    public static void main(String[] args) {
        int month = 3;
        switch (month) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Вы ввели некорректное число: нет соответствия месяцу");

        }

    }
}
