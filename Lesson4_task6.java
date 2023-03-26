package Lesson4_tasks;

import java.util.Scanner;


public class Lesson4_task6 {
    public class Area {
        private int length;
        private int width;

        public Area(int l, int w) {
            length = l;
            width = w;
        }

        public int returnArea() {
            return length * width;
        }

        public void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введіть довжину прямокутника: ");
            int l = scanner.nextInt();
            System.out.print("Введіть ширину прямокутника: ");
            int w = scanner.nextInt();

            Area area = new Area(l, w);
            int rectangleArea = area.returnArea();

            System.out.println("Площа прямокутника: " + rectangleArea);
        }
    }
}

