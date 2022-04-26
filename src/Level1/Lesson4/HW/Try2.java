package Level1.Lesson4.HW;
/*
Написать программу, которая будет подсчитывать сумму чисел от start до finish.
Например, start = 0, finish = 5. Нужно сложить числа: 0, 1, 2, 3, 4, 5. Ответ будет
15. В конце программы сделать вывод суммы.
 */
public class Try2 {
    public static void main(String[] args) {
        int start =0;
        int finish = 5;
        int sum = 0;

        for (start = 0; start <= finish; start++) {

            sum += start;

        }
        System.out.println(sum);
    }
}
