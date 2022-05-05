package Level2.Exam2;

//6*. Написать метод, который принимает 2 числа и возвращает наибольший общий делитель для обоих чисел.

public class Task6 {
    public static void main(String[] args) {
        int number1 = 999577838;
        int number2 = 966;
        System.out.println("Наибольший общий делитель чисел " + number1 + " и " + number2 + " равен " + findMaxDivisor (number1, number2));
    }

    private static int findMaxDivisor(int number1, int number2) {
        int maxDivisor;
        int tmpbox;

        int min = Math.min(number1, number2);
        int max = Math.max(number1, number2);
        while (true) {
            if (max % min != 0) {
                tmpbox = min;
                min = max % min;
                max = tmpbox;
            }
            else {
                maxDivisor = min;
                break;
            }
        }
        return maxDivisor;
    }
}
