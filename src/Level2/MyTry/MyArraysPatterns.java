package Level2.MyTry;

import java.util.Random;

public class MyArraysPatterns {
    public static int [] createRandomArray (int arrLength) {
        int[] numbers = new int[arrLength];
        Random numGen = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = numGen.nextInt();
        }
        return numbers;
    }

    public static int [] createRandomArray (int arrLength, int bound) {
        int[] numbers = new int[arrLength];
        Random numGen = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = numGen.nextInt(bound);
        }
        return numbers;
    }

    public static int [] createRandomArray (int arrLength, int upperBound, int lowerBound) {
        int[] numbers = new int[arrLength];
        Random numGen = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = lowerBound + numGen.nextInt(upperBound-lowerBound+1);
        }
        return numbers;
    }

    public static int [] createSequenceArray (int arrLength) {
        int[] numbers = new int[arrLength];
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = i;
        }
        return numbers;
    }

    public static int [] createSequenceArray (int arrLength, int startFrom) {
        int[] numbers = new int[arrLength];

        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = i + startFrom;
        }
        return numbers;
    }
   public static int [] createReverseArray (int startFrom) {
        int arrLength = startFrom + 1;
        int[] numbers = new int[arrLength];

        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = startFrom;
            startFrom--;
        }
        return numbers;
    }
public static int [] createReverseArray(int startFrom, int endOfRange) {
        int arrLength = startFrom + 1 - endOfRange;
        int[] numbers = new int[arrLength];

        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = startFrom;
            startFrom--;
        }
        return numbers;
    }
}
