package Level2.Exam2;
//1. Написать метод, который возвращает 1. Написать метод, который возвращает сумму чисел от 1 до 5..

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Сумма чисел от 1 до 5 равна - " + findSum());
    }

    private static int findSum() {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        return sum;
    }
}
