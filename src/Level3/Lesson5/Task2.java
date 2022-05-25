package Level3.Lesson5;
/*
В методе main создайте объект HashSet с именем “список дел” с типом String.
Добавьте в него ваши дела на день, например: “сделать зарядку”, “поесть”, “поехать в офис”, “поработать”, “поесть”,
“поработать”, “приехать домой”, “обнять мужа/жену/детей”, “поесть”, “умыться”, “лечь спать”.
В списке дел должно быть как минимум 2 раза “поесть”. Далее выведите все элементы на консоль,
вначале через цикл for-each, затем просто передайте множество в System.out.println().
 */

import java.util.Set;
import java.util.HashSet;

public class Task2 {
    public static void main(String[] args) {
        Set <String> schedule = new HashSet();
        schedule.add("сделать зарядку");
        schedule.add("поесть");
        schedule.add("поехать в офис");
        schedule.add("поесть");
        schedule.add("приехать домой");
        schedule.add("обнять жену/детей");
        schedule.add("поесть");
        schedule.add("умыться");
        schedule.add("лечь спать");

        for (String currentTask : schedule) {
            System.out.println(currentTask);
        }
        System.out.println("=========");
        System.out.println(schedule);
    }
}
