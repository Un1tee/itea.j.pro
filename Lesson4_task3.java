package Lesson4_tasks;

import java.util.Scanner;

public class Lesson4_task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть перший рядок: ");
        String firstString = scanner.nextLine();


        System.out.print("Введіть другий рядок: ");
        String secondString = scanner.nextLine();


        int result = firstString.compareToIgnoreCase(secondString);


        if (result < 0) {
            System.out.println(firstString + " і " + secondString + " не лексикографічні");
        } else {
            System.out.println(firstString + " і " + secondString + " рівні лексикографічно");
        }

        scanner.close();
    }
}
