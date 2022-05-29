package Level3.Lesson2;
/*
По картинке создать класс с полями и методами.
В main создать объекты этого класса также по картинке и присвоить полям значения с картинки.
В методах выводить что делает метод, например для метода “eat” выводить “я ем”, либо по английски “I eat”
https://www.guru99.com/images/java/052016_0704_ObjectsandC6.jpg
 */
public class Dog {
    String breed;
    String size;
    int age;
    String color;
    Dog (String breed, String size, int age, String color){
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }
    void eat() {
        System.out.println("I eat");
    }
    void sleep() {
        System.out.println("I sleep");
    }
    void sit() {
        System.out.println("I sit");
    }
    void run() {
        System.out.println("I run");
    }
    void printInfo(){
        System.out.println("Порода: " + breed);
        System.out.println("Размер: "  + size);
        System.out.println("Возраст: " + age + "года");
        System.out.println("Масть: " + color);
        System.out.println("");
    }
    void doAllActions () {
        eat();
        sleep();
        sit();
        run();
    }
    public static void main(String[] args) {
        Dog mastiff = new Dog("Mastiff", "Large", 5, "Black");
        Dog maltese = new Dog("Maltese","Small", 2, "White");
        Dog chowCow = new Dog("ChowChow", "Medium", 3, "Brown");

        maltese.printInfo();
        mastiff.printInfo();
        chowCow.printInfo();
//        chowCow.doAllActions();

    }
}
