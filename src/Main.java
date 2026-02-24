import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Задача 1
        int[] firstArray = new int[]{1, 2, 3};
        double[] secondArray = {1.57, 7.654, 9.986};
        String[] myFriends = {"Влада", "Иван", "Анна", "Алексей"};

        // Задача 2
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i]);
            if (i < firstArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i]);
            if (i < secondArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < myFriends.length; i++) {
            System.out.print(myFriends[i]);
            if (i < myFriends.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Задача 3
        for (int i = firstArray.length - 1; i >= 0; i--) {
            System.out.print(firstArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = secondArray.length - 1; i >= 0; i--) {
            System.out.print(secondArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

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
        System.out.println(Arrays.toString(firstArray));
    }
}