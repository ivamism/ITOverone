package Level2.Lesson5;
/*
Написать 3 метода, которые подсчитывают количество всех точек, запятых и восклицательных знаков в строке.
 */

public class Task4 {
    public static void main(String[] args) {
        String string =
                "Написать 3 метода, которые подсчитывают количество всех точек(..), запятых(,,,) и восклицательных знаков (!!!!) в этой строке.";
        System.out.println(string);
        countOfDots(string);
        countOfCommas(string);
        countOfExclamations(string);
    }

    private static void countOfCommas(String s) {
        char[] chars = s.toCharArray();
        int commaQuantity = 0;
        for (int ch : chars) {
            if (ch == ',') {
                commaQuantity++;
            }
        }
        System.out.println("В этой строке " + commaQuantity + " запятых");
    }

    private static void countOfExclamations(String s) {
        char[] chars = s.toCharArray();
        int exclamationQuantity = 0;
        for (int ch : chars) {
            if (ch == '!') {
                exclamationQuantity++;
            }
        }
        System.out.println("В этой строке " + exclamationQuantity + " восклицательных знаков");
    }

    private static void countOfDots(String s) {
        char[] chars = s.toCharArray();
        int dotQuantity = 0;
        for (int ch : chars) {
            if (ch == '.') {
                dotQuantity++;
            }
        }
        System.out.println("В этой строке " + dotQuantity + " точек");
    }
}
