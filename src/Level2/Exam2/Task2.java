package Level2.Exam2;

//2. Написать метод, который возвращает среднее арифметическое от 1 до 9.

public class Task2 {
    public static void main(String[] args) {

        System.out.println("Среднее арифметическое чисел от 1 до 9 равно - " + findAverage());
    }

    private static double findAverage() {
        int sum = 0;
        for (int i = 1; i <= 9; i++) {
            sum += i;
        }
        return 1.0 * sum/9;
    }
}
