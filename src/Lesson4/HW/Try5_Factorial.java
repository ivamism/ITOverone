package Lesson4.HW;

//Создать программу, вычисляющую факториал числа.

import java.util.Scanner;

public class Try5_Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int factorial;
        System.out.println("Введите чило, факториал которого необходимо вычислить");
        factorial = in.nextInt();


        int factorial_res = 1;

        for (int i = 1; i <= factorial; i++) {

            factorial_res *= i;

        }
        System.out.println(factorial_res);

    }
}
