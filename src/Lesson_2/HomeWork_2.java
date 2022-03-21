package Lesson_2;

public class HomeWork_2 {

    public static void main(String[] args) {

        String[][] stringArray0 = new String[][]{
                {"6", "next", "8", "5"},
                {"5", "5", "7", "3"},
                {"4", "7", "8", "2"},
                {"8", "9", "6", "1"}
        };
        String[][] stringArray1 = new String[][]{
                {"6", "1", "8", "5"},
                {"5", "5", "7", "3"},
                {"4", "7", "8", "2"},
                {"8", "9", "6", "1"}
        };
        String[][] stringArray2 = new String[][]{
                {"6", "next", "8"},
                {"5", "5", "7", "3"},
                {"4", "7", "8", "2"},
                {"8", "9", "6", "1"}
        };
        String[][] stringArray3 = new String[][]{
                {"6", "1", "8", "5"},
                {"5", "5", "7", "3"},
                {"4", "7", "8", "2"}
        };
        try {
            System.out.println("Сумма массива равна " + transformAndSum(stringArray0));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма массива равна " + transformAndSum(stringArray1));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма массива равна " + transformAndSum(stringArray2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма массива равна " + transformAndSum(stringArray3));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
    }

    private static int transformAndSum(String[][] in) throws MyArraySizeException, MyArrayDataException {
        int arr = 4;
        int sum = 0;


        if (in.length != 4) {
            throw new MyArraySizeException(String.format("Размер массива должен быть:", arr, arr));
        }

        for (int i = 0; i < in.length; i++) {
            if (in[i].length != 4) {
                throw new MyArraySizeException(String.format("Размер массива должен быть:", arr, arr));
            }
        }

        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in[i].length; j++) {
                try {
                    sum = valueOf(in[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("В массиве находится не целое число:", i, j, in[i][j]));
                }
            }
        }
        return sum;
    }

    private static int valueOf(String s) {

        return 0;
    }



}



