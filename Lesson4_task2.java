package Lesson4_tasks;

import java.util.Scanner;

public class Lesson4_task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть перший рядок: ");
        String str1 = scanner.nextLine();


        System.out.print("Введіть другий рядок: ");
        String str2 = scanner.nextLine();


        String result = str1.concat(str2.substring(str2.lastIndexOf(" ") + 1));

        System.out.println("Результат: " + result);
    }
}


