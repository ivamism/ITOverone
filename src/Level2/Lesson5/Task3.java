package Level2.Lesson5;

/*
Дана строка “1, 25, 32, 100, 15, 7”. Написать 2 метода, которые принимают в качестве аргумента строку.
1й метод возвращает минимальное число из этой строки, а 2й метод возвращает сумму чисел в этой строке.
 */
public class Task3 {
    public static void main(String[] args) {
        String numbers = "10, 1, 25, 32, 100, 15, 7";
        System.out.println(numbers);
        System.out.println("Минимальное значение = " + findMin(numbers));
        System.out.println("Сумма чисел = " + findtSum(numbers));
    }

    private static int findtSum(String s) {
        int sum = 0;
        String [] sToArray = s.split(", ");

        for (String value : sToArray) {
            sum += Integer.parseInt(value);
        }
        return sum;
    }

    private static int findMin(String s) {
        String [] sToArray = s.split(", ");
        int min = Integer.parseInt(sToArray [0]);

        for (String value : sToArray) {
            int x = Integer.parseInt(value);
            if (x < min) {
                min = x;
            }
        }
        return min;
    }
}


