package Lesson_5;

import java.io.File;
import java.util.Arrays;

public class HomeWork_5 {
    public static void main(String[] args) {

        File file = new File ("src/Lesson_5/hw5.csv");
        File file2 = new File("src/Lesson_5/hw5_1.csv");

        AppData appData = new AppData();
        appData.read(file);

        System.out.println(Arrays.toString(appData.getHeaders()));
        System.out.println(Arrays.toString(appData.getData()[0]));

        appData.write(file2);


    }
}
