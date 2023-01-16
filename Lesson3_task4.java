import java.util.Arrays;
import java.util.Random;

public class Lesson3_task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int []array = new int[10];
        int rand;

        for (int i = 0; i < array.length; i++) {
            rand = random.nextInt(10);
            array[i] = rand;
        }

        System.out.println(Arrays.toString(array));

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
