package Level2.Lesson3.Part1;

import java.util.Random;

/*
Создать массив размером 20, заполнить случайными числами. Написать 2 метода,
которые принимают массив и
1 метод возвращает минимальное,
2 метод возвращает максимальное число этого массива.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] numb = new int[10];
        Random numGen = new Random();
        for (int i = 0; i < numb.length; i++) {
            numb [i] = numGen.nextInt(50);
            }
        for (int j : numb) {
            System.out.print(j);
        }

        System.out.println("Minimum = " + min(numb));
        System.out.println("Maximum = " + max(numb));

    }
    static int min(int[] numb) {
        int minimum = numb[0];
        for (int i:numb) {
            if (numb [i] < minimum) {
                numb[i] = minimum;
            }
        }
        return minimum;
    }
    static int max (int[] numb) {
        int maximum = numb[0];

        for (int i:numb) {
            if (numb [i] < maximum) {
                numb[i] = maximum;
            }

        }
        return maximum;
    }
    }


