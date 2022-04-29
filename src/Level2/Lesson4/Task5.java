package Level2.Lesson4;
/*
Создать метод, который принимает 2 массива символов. Этот метод проверяет, что слово начинается c определенной последовательности.
Например:
char[] word = {‘П’,’р’,’и’,’в’,’е’,’т’};
char[] firstPrefix = {‘П’,’р’,’и’}
char[] secondPrefix = {‘П’,’р’,’е’}
	Для вызова метода (word, firstPrefix) должно вернуться true, для вызова метода(word, secondPrefix) - false.
 */

public class Task5 {
    public static void main(String[] args) {
        char[] word = {'I', 'v', 'a', 'n'};
        char [] firstPrefix = {'I', 'v'};
        char[] secondPrefix = {'i','v'};
        System.out.println(checkPrefix(word, firstPrefix));
        System.out.println(checkPrefix(word, secondPrefix));

    }
    static boolean checkPrefix(char[] word, char[] prefix) {
        boolean checkresult = true;
        for (int i = 0; i < prefix.length; i++) {
            if (word[i] != prefix[i]) {
                checkresult = false;
                break;
            }
        }

        return checkresult;
    }

}
