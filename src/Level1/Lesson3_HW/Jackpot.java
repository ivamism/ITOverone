package Level1.Lesson3_HW;

/*Джекпот
- создать программу, со строковой переменной “комбинация”, в строку записать
от “000” до “777”. Если “комбинация” равняется строке “777”, вывести
“Поздравляем, у вас джекпот!”. В конце программы должен быть вывод “Играем
дальше”.

 */

public class Jackpot {
    public static void main(String[] args) {
        int slot_length = 3;



        int combination = 777;
        if (combination == 777) {
            System.out.println("Поздравляем, у Вас джекпот!");
        }
        System.out.println("Играем дальше");
    }
}
