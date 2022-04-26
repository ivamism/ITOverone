package Level2.lesson2;

//import java.util.Arrays;
import java.util.Random;

/*
Создать массив размером 15, заполнить его случайными числами. Затем вывести массив на экран.
Запустить несколько раз и увидеть, что каждый раз массив заполнен разными значениями.
 */
public class Task4 {
    public static void main(String[] args) {
    int[] numbers = new int[15];
        Random numGen = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] =  -20 + numGen.nextInt(51);
        }
        for (int j : numbers) {
            System.out.println(j);
        }

    }
}
