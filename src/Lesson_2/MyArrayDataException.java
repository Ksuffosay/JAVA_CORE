package Lesson_2;

public class MyArrayDataException extends Throwable {

    MyArrayDataException(String message) {

        System.out.println("Ошибка преобразования элемента массива в целое число.\n" + " " + message);

    }
}
