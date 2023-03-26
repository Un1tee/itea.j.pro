package Lesson10_tasks;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Lesson10_task2 {


    @Retention(RetentionPolicy.RUNTIME)
    @interface Repeat {
        int value();

        String text() default "Running!";
    }

    interface Running {
        void run();
    }

    class Runner {
        public static void run(Running running) throws IllegalAccessException, InstantiationException {
            Repeat repeat = running.getClass().getAnnotation(Repeat.class);
            if (repeat == null) {
                throw new IllegalArgumentException("Class must be annotated with @Repeat");
            }
            for (int i = 0; i < repeat.value(); i++) {
                System.out.println(repeat.text());
                running.run();
            }
        }
    }

    @Repeat(3)
    class MyRunnable implements Running {
        public void run() {
            System.out.println("Running");
        }
    }

    @Repeat(value = 2, text = "Hello!")
    class MyHelloRunnable implements Running {
        public void run() {
            System.out.println("Hello");
        }
    }

    public class Main {
        public void main(String[] args) throws IllegalAccessException, InstantiationException {
            Runner.run(new MyRunnable());
            System.out.println();
            Runner.run(new MyHelloRunnable());
        }
    }
}
