package Lesson4_tasks;

public class Lesson4_task5 {
    public class User {
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void main(String[] args) {
            User user = new User("Іvan", 16);
            System.out.println("Name: " + user.name);
            System.out.println("Age: " + user.age);
        }
    }
}
