import java.util.Scanner;

public class C610 {
    public static void main(String[] arg) {
        int[] values = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < values.length; i++) {
            System.out.print("Enter " + i + " value");
            values[i] = scanner.nextInt();
        }
        System.out.println("Original Array: ");
        for (int i = 0; i < values.length; i++) {
            System.out.print(" " + values[i]);
        }
        System.out.println();
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 3 == 0) {
                values[i] += 5;
            }
        }
        System.out.println("Modified Array: ");
        for (int i = 0; i < values.length; i++) {
            System.out.print(" " + values[i]);
        }
    }
}

/*
10. Write a program that stores integer values to an array whose size is 10.
In addition increment by five the integers that are divisible by 3.
 */
