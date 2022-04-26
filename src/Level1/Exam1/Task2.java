package Level1.Exam1;
/*
Дано целое число.
 Если оно является положительным, то прибавить к не му 1;
 в противном случае не изменять его. Вывести полученное число.
 */
public class Task2 {
    public static void main(String[] args) {
        int num = 5;
        if (num > 0) {
            num +=1;
        }
        System.out.println(num);
    }
}
