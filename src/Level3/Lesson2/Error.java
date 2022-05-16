package Level3.Lesson2;
/*
Создайте класс Error, определите в нем три поля: boolean isActive, int statusCode, String message.
 Добавьте в этом классе 2 конструктора: конструктор по умолчанию, конструктор с тремя параметрами,
 который будет инициализировать поля переданными значениями.
 Создайте метод printInfo, который выводит в консоль содержимое полей.
 Добавьте метод main(), в котором будете создавать объект с помощью конструктора по умолчанию,
 а также несколько объектов с помощью конструктора с параметрами. Вызовите на со
зданных объектах метод printInfo зданных объектах метод printInfo.
 */

public class Error {
    boolean isActive;
    int statusCode;
    String message;

     Error(boolean isActive, int statusCode, String message) {
        this.isActive = isActive;
        this.statusCode = statusCode;
        this.message = message;
    }

     Error(){}

    void printInfo (){
        System.out.println(isActive);
        System.out.println(statusCode);
        System.out.println(message);
        System.out.println("");
    }


    public static void main(String[] args) {
         Error err1 = new Error(true,   1, "Error I/O");
         Error err2 = new Error();
         err2.isActive = false;
         err2.statusCode = 0;
         err2.message = "Out Of Disk Space";
        err1.printInfo();
        err2.printInfo();
    }
}
