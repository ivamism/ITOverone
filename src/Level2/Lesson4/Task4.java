package Level2.Lesson4;
/*
Необходимо создать программу, которая будет заполнять массив числами, возведенными в квадрат.
В методе передаётся параметр bound. Он определяет, до какого  числа нужно записывать числа. Например, если задается bound = 3,
нужно возвести в квадрат числа 0, 1 и 2 и записать в массив числа 0, 1, 4.
 */

import java.util.Arrays;

public class Task4 {
    static int [] squaring (int bound) {
        int [] pow2Arr =new int[bound];
               for (int i = 0; i < pow2Arr.length; i++) {
            pow2Arr [i] = (int) Math.pow(i, 2);
        }
               return pow2Arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(squaring(10)));
    }
}
