package Level2.Lesson5;

import java.util.Arrays;

/*
Дана строка “1, 25, 32, 100, 15, 7”. Написать 2 метода, которые принимают в качестве аргумента строку.
1й метод возвращает минимальное число из этой строки, а 2й метод возвращает сумму чисел в этой строке.
 */
public class Task3 {
    public static void main(String[] args) {
        String numbers = "1, 25, 32, 100, 15, 7";
        System.out.println(numbers);
        printMin (numbers);
        printSum (numbers);
    }

    private static void printSum(String s) {
        int sum = 0;
        String [] sToArray = s.split(", ");

        for (String value : sToArray) {
            sum += Integer.parseInt(value);
        }
        System.out.println("Сумма чисел = " + sum);
        }

    private static void printMin(String s) {
        String [] sToArray = s.split(", ");
        int [] sringsToIntArr = new int[sToArray.length];

        for (int i = 0; i < sToArray.length; i++) {
            sringsToIntArr [i] = Integer.parseInt(sToArray [i]);
        }
        int min = sringsToIntArr[0];
        for (int number:sringsToIntArr) {
            if (min > number) {
                min = number;
            }
        }
        System.out.println("Минимальное значение = " + min);
    }
}


