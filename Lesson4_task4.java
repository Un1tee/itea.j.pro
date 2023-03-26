package Lesson4_tasks;

import java.util.Scanner;

public class Lesson4_task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть рядок: ");
        String inputString = scanner.nextLine();

        StringBuilder evenChars = new StringBuilder();
        for (int i = 0; i < inputString.length(); i += 2) {
            evenChars.append(inputString.charAt(i));
        }

        System.out.println("Рядок, складений зі символів парних позицій: " + evenChars.toString());
    }
}

