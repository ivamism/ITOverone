package Level1.Exam1;
/*
Дано целое число N (> 0).
 Используя операции деления нацело и взятия остатка от деления,
 найти число, полученное при прочтении числа N  справа налево.
 */

public class Task6 {
    public static void main(String[] args) {
        int n = 71225;
        int modulo;

        do     {
            modulo = n % 10;
            System.out.print(modulo);
            n = n / 10;
        }
        while (n != 0) ;


    }
}
