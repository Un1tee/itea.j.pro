import java.util.Arrays;
import java.util.Random;

public class Lesson3_task3 {
    public static void main(String[] args) {

        Random random = new Random();
        int []array = new int[4];
        int rand;
        String answer;

        for (int i = 0; i < array.length; i++) {
            rand = random.nextInt(10, 99);
            array[i] = rand;
        }
        System.out.println(Arrays.toString(array));

        boolean sequence = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] < array[j]){
                    sequence = true;
                } else {
                    sequence = false;
                }
            }
        }
        if (sequence == false) {
            answer = "No";
        } else {
            answer = "Yes";
        }
        System.out.println("Is an array an ascending sequence? " + answer);
    }
}
