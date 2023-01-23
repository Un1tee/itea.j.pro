package Lesson2_tasks;

import java.util.Scanner;

public class Lesson2_task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "Тролейбус";
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Введіть відповідь: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(answer)) {
                System.out.println("Правильно!");
                break;
            } else if (userAnswer.equalsIgnoreCase("Здаюсь")) {
                System.out.println("Правильна відповідь: " + answer);
                break;
            } else {
                System.out.println("Подумайте ще.");
                attempts--;
            }
        }
    }
}
