import java.util.Arrays;
import java.util.Random;

public class Lesson3_task2 {
    public static void main(String[] args) {

        Random random = new Random();
        int []array = new int[12];
        int rand;

        for (int i = 0; i < array.length; i++) {
            rand = random.nextInt(-15,15);
            array[i] = rand;
        }
        System.out.println(Arrays.toString(array));

        int maxNumber = array[0];

        for (int i = 1; i < array.length; i++){
            maxNumber = Math.max(maxNumber, array[i]);
        }
        System.out.println("Max number: "+maxNumber);

        for (int i = 0; i < array.length; i++) {
            if(maxNumber == array[i]){
                System.out.println("Index: "+i);
            }
        }
    }
}
