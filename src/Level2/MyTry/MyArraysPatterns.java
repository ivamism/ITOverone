package Level2.MyTry;

import java.util.Arrays;
import java.util.Random;

public class MyArraysPatterns {
    public static int [] createRandomArray (int length) {
        int[] numbers = new int[length];
        Random numGen = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = numGen.nextInt();
        }

        return numbers;
    }
    public static int [] createRandomArray (int length, int bound) {
        int[] numbers = new int[length];
        Random numGen = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = numGen.nextInt(bound);
        }

        return numbers;
    }
    public static int [] createRandomArray (int length, int bound, int shiftBound) {
        int[] numbers = new int[length];
        Random numGen = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = shiftBound + numGen.nextInt(bound-shiftBound+1);
        }

        return numbers;
    }

//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(createRandomArray(10)));
//    }
}
