package Exam1;
/*Дано целое число N (> 0).
        Используя операции деления нацело и взятия остатка от деления,
        найти количество и сумму его цифр.*/
public class Task7 {
    public static void main(String[] args) {
        int n = 1234567890;
        int numQuantity = 0;
        int numSum = 0;
        while (n !=0) {
            numSum += n % 10;
            numQuantity++;
            n /= 10;
            }
        System.out.println("Количество цифр в числе N: " + numQuantity);
        System.out.println("Сумма цифр в числе N: " + numSum);




    }
}
