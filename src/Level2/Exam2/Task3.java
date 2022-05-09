package Level2.Exam2;

//3. Написать метод, который получает 2 числа и возвращает разницу между ними.

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Разница между числами 25 и 7 равна " + findDifference(25,7));
    }

    private static int findDifference(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return max-min;
    }
}
