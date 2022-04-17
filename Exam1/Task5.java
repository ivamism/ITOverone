package Exam1;
//Даны два целых числа A и B (A < B).
// Найти сумму всех целых чисел от A до B включительно.
public class Task5 {
    public static void main(String[] args) {
        int a =2;
        int b = 6;
        int sum= 0;
        for (int i =a; i <= b; i++) {
            sum +=a;
            a++;

        }
        System.out.println(sum);
    }
}
