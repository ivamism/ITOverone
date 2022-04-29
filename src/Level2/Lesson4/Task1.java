package Level2.Lesson4;

import java.util.Arrays;
import java.util.Random;

/*
Написать метод, который принимает массив и число, метод должен найти это число в массиве и вернуть его индекс,
если такого числа нет, то метод должен вернуть -1.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random numGen = new Random();
        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = i;
            numbers [i] = numGen.nextInt(20);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(findIndex(5, numbers));

    }
    static int findIndex (int num, int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }
        return index;
    }
}
