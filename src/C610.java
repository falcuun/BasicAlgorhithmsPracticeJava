import java.util.Arrays;
import java.util.Random;

public class C610 {
    public static void main(String[] arg)
    {
        int[] values = new int[10];
        Random random = new Random();
        for(int i = 0; i < values.length; i++){
            values[i] = random.nextInt(100);
        }
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(values));
        for(int i = 0; i < values.length; i++){
            if(values[i] % 3 == 0){
                values[i] += 5;
            }
        }
        System.out.println("Modified Array: ");
        System.out.println(Arrays.toString(values));
    }
}

/*
10. Write a program that stores integer values to an array whose size is 10.
In addition increment by five the integers that are divisible by 3.
 */
