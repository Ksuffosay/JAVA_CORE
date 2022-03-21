package Lesson_2;

public class MyArraySizeException extends Throwable {

    MyArraySizeException(String message) {

        System.out.println("Ошибка размера массива.\n" + " " + message);

    }
}
