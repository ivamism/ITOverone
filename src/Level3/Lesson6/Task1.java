package Level3.Lesson6;
/*
Создать map с именем dictionary(словарь), одно слово на русском, 2ое это описание/определение
 */

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map <String, String> dictionary = new HashMap<>();
        dictionary.put ("яблоко", "фрукт");
        dictionary.put ("огурец", "овощь");
        dictionary.put ("картофель", "корнеплод");
        System.out.println(dictionary);
        for (Map.Entry<String,String> pair: dictionary.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + ": " + value);
        }

    }
}
