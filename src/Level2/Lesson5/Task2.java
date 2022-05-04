package Level2.Lesson5;
/*
Написать метод, принимающий в качестве параметров имя, фамилию и отчество и возвращающую инициалы в формате "Ф.И.О".
Учесть, что входные параметры могут быть в любом регистре, а результирующая строка должна быть в верхнем.
 */

public class Task2 {
    public static void main(String[] args) {
        String surname = "мочалов";
        String name = "Иван";
        String fathersName = "станиславович";
        System.out.println("Ф.И.О. - " + createInitials(surname, name, fathersName));
    }
    private static String createInitials(String sn, String nm, String fn) {
        char s = sn.charAt(0);
        char n = nm.charAt(0);
        char f = fn.charAt(0);
        String initials =  s + "." + n + "."+ f +".";
        return initials.toUpperCase();
    }
}
