package Level2.lesson1HW;
//Курс валют. Создать класс с 2 методами: перевода рублей в доллары и
//        долларов в рубли.
public class RateCalculator {

    public static void main(String[] args) {
        double rate = 2.5;
        double rublsAmount =100;
        double dollarsAmount =100;
        System.out.println("При курсе " + rate + ", " + rublsAmount + " рублей равно " +
                convertToDollars(rate, rublsAmount) + " долларов.");
        System.out.println("При курсе " + rate + ", " + dollarsAmount + " долларов равно " +
                convertToRubls (rate, rublsAmount) + " рублей.");

    }
    static double convertToDollars (double rate, double rublsAmount){

        return rublsAmount/rate;
    }
static double convertToRubls (double rate, double dollarsAmount){

        return dollarsAmount * rate;
    }

}
