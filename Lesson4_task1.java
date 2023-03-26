package Lesson4_tasks;

import java.util.Scanner;

public class Lesson4_task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or sentence: ");
        String input = scanner.nextLine();


        String reversedInput = new StringBuilder(input).reverse().toString();
        if (input.equals(reversedInput)) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("The input is not a palindrome.");
        }
    }
}
