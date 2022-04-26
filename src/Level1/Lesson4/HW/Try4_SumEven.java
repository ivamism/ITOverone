package Level1.Lesson4.HW;

public class Try4_SumEven {
    public static void main(String[] args) {
        int start;
        int finish = 5;
        int sum_even = 0;

        for (start = 0; start <= finish; start++) {
            if (start % 2 != 0) {
                continue;
            }

            sum_even += start;

        }
        System.out.println(sum_even);
    }
}
