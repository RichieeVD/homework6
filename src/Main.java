public class Main {
    public static void main(String[] args) {
// Задача 1

// 1. Целочисленный массив через ключевое слово new
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;

// 2. Массив дробных чисел, заполненный сразу
        double[] secondArray = {1.57, 7.654, 9.986};

// 3. Произвольный массив (типо имена)
        String[] myFriends = {"Влада", "Иван", "Анна", "Алексей"};

        // Задача 2

// int
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i]);
            if (i < firstArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(); // Перенос на новую строку

// double
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i]);
            if (i < secondArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

// String
        for (int i = 0; i < myFriends.length; i++) {
            System.out.print(myFriends[i]);
            if (i < myFriends.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Задача 3

// Печать первого массива в обратном порядке
        for (int i = firstArray.length - 1; i >= 0; i--) {
            System.out.print(firstArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

// Печать второго массива в обратном порядке
        for (int i = secondArray.length - 1; i >= 0; i--) {
            System.out.print(secondArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

// Печать третьего массива в обратном порядке
        for (int i = myFriends.length - 1; i >= 0; i--) {
            System.out.print(myFriends[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Задача 4

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 != 0) {
                firstArray[i] += 1;
            }
        }

        System.out.print("[");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i]);

            if (i < firstArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}