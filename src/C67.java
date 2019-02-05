import java.util.Scanner;

public class C67 {
    public void start() {
        int[] temperatures = new int[7];
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < days.length; i++) {
            System.out.print("Enter Temperature Value for " + days[i] + ": ");
            temperatures[i] = scanner.nextInt();
        }
        System.out.print("Days: ");
        System.out.format("%10s", " ");
        for (int i = 0; i < days.length; i++) {

            System.out.format("%4s", days[i]);
        }
        System.out.println();
        System.out.print("Temperatures: ");
        for (int i = 0; i < temperatures.length; i++){
            System.out.format("%4d", temperatures[i]);
        }
    }
}

/*
7. Write a program in Java using one dimensional array which assigns values into array temperature.
   The program should then display the array with appropriate column and row headings.
 */
