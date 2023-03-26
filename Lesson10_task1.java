package Lesson10_tasks;

public class Lesson10_task1 {
    public enum Weekday {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        public boolean isWeekDay() {
            return this != SATURDAY && this != SUNDAY;
        }

        public boolean isHoliday() {
            return !isWeekDay();
        }
    }

    public class Main {
        public static void main(String[] args) {
            for (Weekday weekday : Weekday.values()) {
                if (weekday.isWeekDay()) {
                    System.out.println(weekday.toString() + " is a workday.");
                } else {
                    System.out.println(weekday.toString() + " is a holiday.");
                }
            }
        }
    }
}
