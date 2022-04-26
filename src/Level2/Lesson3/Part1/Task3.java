package Level2.Lesson3.Part1;
/*
Создать массив размером 10, заполнить его случайными числами в диапазоне от 0 до 20.
Затем в зависимости от чётности/нечётности индекса поменять значение у числа,
если индекс четный до число поменять значение на отрицательное.
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] numb = new int[10];
        Random numGen = new Random();
        for (int i = 0; i < numb.length; i++) {
            numb [i] = numGen.nextInt(20);
            }
        System.out.println(Arrays.toString(numb));

        for (int i = 0; i < numb.length; i++) {
            if (i % 2 == 0) {
                numb [i] *= (-1);
            }

        }
        System.out.println(Arrays.toString(numb));


//        for (int j : numb) {
//            System.out.println(j);
        }
}
