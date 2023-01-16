import java.util.Arrays;
import java.util.Scanner;

public class Lesson3_task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flag1 = "Yes";
        String flag2 = "No";

        System.out.println("Wanna use my code?");

        String flag = scanner.nextLine();

        if (flag.equals(flag1)){

            System.out.println("Size of array 1: ");                      // arrays
            int sizeArray1 = scanner.nextInt();

            System.out.println("Size of array 2: ");
            int sizeArray2 = scanner.nextInt();

            int []array1 = new int[sizeArray1];
            int []array2 = new int[sizeArray2];


            for (int i = 0; i < sizeArray1; i++) {
                System.out.println("Write "+i+"-th number in array1: ");
                array1[i] = scanner.nextInt();
            }
            for (int i = 0; i < sizeArray2; i++) {
                System.out.println("Write "+i+"-th number in array2: ");
                array2[i] = scanner.nextInt();
            }
            System.out.println("Array 1: " + Arrays.toString(array1));
            System.out.println("Array 2: " + Arrays.toString(array2));


            double arithmeticArray1 = 0, arithmeticArray2 = 0;            // arithmetic
            double sumArray1 = 0, sumArray2 = 0;

            for (int i = 0; i < array1.length; i++) {
                sumArray1 += array1[i];
            }
            for (int i = 0; i < array2.length; i++) {
                sumArray2 += array2[i];
            }

            if (array1.length == 0){                                    // division by zero
                System.out.println("Division by zero in array 1");

            }else{
                arithmeticArray1 = sumArray1 / array1.length;
            }
            if (array2.length == 0){
                System.out.println("Division by zero in array 2");
            }else {
                arithmeticArray2 = sumArray2 / array2.length;
            }
        }
    }
}
