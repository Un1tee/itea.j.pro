import java.util.Arrays;
import java.util.Random;

public class Lesson3_task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int []array = new int[8];
        int rand;

        for (int i = 0; i < array.length; i++) {
            rand = random.nextInt(1,10);
            array[i] = rand;
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0){
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

