package Level2.Exam2;
//  Вариант Ангелины
//  Проверка работы

public class Task6_2 {
    public static void main(String[] args) {
        System.out.println(numbers(999577838, 966));
    }

    private static int numbers(int a, int b) {
        int n = 1;
        for (int i = 1; i <=a  && i<=b; i++) {
            if (a % i == 0 && b % i == 0) {
                n = i;
            }
        }
        return n;
    }
}
