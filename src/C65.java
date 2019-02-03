import java.util.Scanner;

public class C65 {
    public static void main(String[] arg) {
        int[] userInput = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < userInput.length; i++) {
            System.out.print("Input the number at position: " + i + ": ");
            userInput[i] = scanner.nextInt();
        }

        int maxValue = userInput[0];
        int secondToMaxValue = userInput[0];

        for (int i = 0; i < userInput.length; i++) {
            if (userInput[i] > maxValue) {
                secondToMaxValue = maxValue;
                maxValue = userInput[i];
            }

            if (userInput[i] > secondToMaxValue && userInput[i] < maxValue){
                secondToMaxValue = userInput[i];
            }

        }

        System.out.println("Second to max number is: " + secondToMaxValue);
    }
}


/*
5. Write a program in Java using one dimensional array that will ask the user to give five numbers
and then the program will determine which of the five number is the second to the highest number.
 */