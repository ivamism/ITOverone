package Level3.Lesson1;
/*
Создайте класс Student, создайте метод “петь песню”.
Этот метод должен выводить на консоль слова "I believe I can fly".
Также у вас должен быть метод playMusic, который выводит на экран “tra-tra-tra”.
В методе main попросите Петю три раза сыграть на баяне и три раза спеть.
 */
public class Student {
    public static void main(String[] args) {
      Student petya = new Student();
      petya.playMusic();
      petya.playMusic();
      petya.playMusic();

      petya.singSong();
      petya.singSong();
      petya.singSong();
    }
    private void singSong() {
        System.out.println("I believe I can fly");
    }
    void playMusic() {
        System.out.println("tra-tra-tra");
    }
}
